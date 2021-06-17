package com.udacity.shoestore.screens.shoelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : ViewModel() {
    val shoes: List<Shoe> = mutableListOf(
        Shoe("rr", 12.0, "balenciaga", "omoo", mutableListOf(""))
    )

    private val _shoeListLiveData = MutableLiveData<List<Shoe>>()
    val shoeListLiveData: LiveData<List<Shoe>>
        get() = _shoeListLiveData

    override fun onCleared() {
        super.onCleared()
    }
}