package com.example.actorpage.viewmodel

import ActorViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.actorpage.repository.ApiCall

class ActorViewModelFactory(
    private val repository: ApiCall
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T
    {
        return ActorViewModel(repository) as T
    }
}