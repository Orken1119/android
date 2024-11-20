import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.actorpage.models.FilmItems
import com.example.actorpage.models.ToShow
import com.example.actorpage.repository.ApiCall
import com.example.actorpage.models.MainData

public class ActorViewModel(private val repository: ApiCall): ViewModel() {

    val myResponse: MutableLiveData<ToShow> = MutableLiveData()

    fun fetchActorDetails(actorId: Int) {
        viewModelScope.launch {
            val response: ToShow = repository.fetchActorDetails(actorId)
        }
    }
    fun fetchMovieDetails(movieId: Int) {
        viewModelScope.launch {
            val response: FilmItems = repository.fetchFilmDetails(movieId)
        }
    }
    fun fetchFilmography(filmIds: List<Int>) {
        viewModelScope.launch {
            val response: List<FilmItems> = repository.fetchFilmography(filmIds)
        }
    }
    fun fetchMainData(actorId: Int) {
        viewModelScope.launch {
            val response: MainData = repository.fetchMainData(actorId)
        }
    }
}