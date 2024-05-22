package mau.example.billeteravirtualkotlin.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mau.example.billeteravirtualkotlin.model.UserModel
import mau.example.billeteravirtualkotlin.model.UserProvider

class UsersViewModel: ViewModel() {
    private val _users = MutableLiveData<List<UserModel>>()
    val usersLVD: LiveData<List<UserModel>>// observer
    get() = _users

    init {
        loadUsers()

    }
    private fun loadUsers() {
        _users.value = UserProvider.getUsers()
    }

    fun showUsers() {
        val users = UserProvider.getUsers()
        _users.value = users
    }

    /*private val users = mutableListOf<User>()
    fun addUser(user: User) {
        users.add(user)
    }
    fun getUsers(): List<User> {
        return users*/


}