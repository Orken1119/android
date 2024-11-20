import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.actorpage.R
import com.example.actorpage.viewmodel.ActorViewModelFactory
import com.example.actorpage.repository.ApiCall
import com.example.actorpage.models.MainData

class MainActivity : AppCompatActivity() {

    // Получаем экземпляр ActorViewModel с использованием фабрики
    private val actorViewModel: ActorViewModel by viewModels {
        ActorViewModelFactory(ApiCall()) // Передаем репозиторий ApiCall
    }

    // UI элементы
    private lateinit var actorIdEditText: EditText
    private lateinit var fetchDataButton: Button
    private lateinit var actorNameTextView: TextView
    private lateinit var actorProfessionTextView: TextView
    private lateinit var actorPosterUrlTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализация UI элементов
        actorIdEditText = findViewById(R.id.actorIdEditText)
        fetchDataButton = findViewById(R.id.fetchDataButton)
        actorNameTextView = findViewById(R.id.actorNameTextView)
        actorProfessionTextView = findViewById(R.id.actorProfessionTextView)
        actorPosterUrlTextView = findViewById(R.id.actorPosterUrlTextView)

        // Нажатие на кнопку
        fetchDataButton.setOnClickListener {
            val actorId = actorIdEditText.text.toString().toIntOrNull()
            if (actorId != null) {
                // Вызов метода ViewModel для получения данных
                actorViewModel.fetchMainData(actorId)

                // Наблюдаем за результатами
                actorViewModel.myResponse.observe(this, Observer { mainData ->
                    mainData?.let {
                        // Обновляем UI с полученными данными
                        actorNameTextView.text = "Name: ${it.nameRu}"
                        actorProfessionTextView.text = "Profession: ${it.profession}"
                        actorPosterUrlTextView.text = "Poster URL: ${it.posterUrl}"

                    } ?: run {
                        // В случае ошибки выводим сообщение
                        Toast.makeText(this, "Failed to fetch data", Toast.LENGTH_SHORT).show()
                    }
                })
            } else {
                Toast.makeText(this, "Please enter a valid actor ID", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
