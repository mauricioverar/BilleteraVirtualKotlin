package mau.example.billeteravirtualkotlin.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mau.example.billeteravirtualkotlin.model.UserModel

class UserViewModel : ViewModel() {
    private val userModel = MutableLiveData<UserModel>()
}