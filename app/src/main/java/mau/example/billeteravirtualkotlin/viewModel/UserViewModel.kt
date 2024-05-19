package mau.example.billeteravirtualkotlin.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//import mau.example.billeteravirtualkotlin.model.UserModel

interface ValidationListener {
    fun onValidationSuccess()
    fun onValidationFailed(message: String)
}

class UserViewModel : ViewModel(), ValidationListener {
    //private val userModel = MutableLiveData<UserModel>() // observer
    private val email = MutableLiveData<String>()
    //private val password = MutableLiveData<String>()
    //private val confirmPassword = MutableLiveData<String>()
    //private val validationListener = MutableLiveData<ValidationListener>()
    fun getEmail(): MutableLiveData<String> {
        return email
    }

    /*fun getPassword(): MutableLiveData<String> {
        return password
    }*/

    /*fun getConfirmPassword(): MutableLiveData<String> {
        return confirmPassword
    }*/

    /*fun getValidationListener(): MutableLiveData<ValidationListener> {
        return validationListener
    }*/

    /*fun validate() {
        if (email.value.isNullOrEmpty()) {
            validationListener.value?.onValidationFailed("Email is required")
            return
        }

    }*/

    /*fun validatePassword() {
        if (password.value.isNullOrEmpty()) {
            validationListener.value?.onValidationFailed("Password is required")
            return
        }
        if (password.value?.length ?: 0 < 6) {
            validationListener.value?.onValidationFailed("Password must be at least 6 characters")
            return
        }
        if (confirmPassword.value.isNullOrEmpty()) {
            validationListener.value?.onValidationFailed("Confirm Password is required")
            return
        }
        if (password.value != confirmPassword.value) {
            validationListener.value?.onValidationFailed("Password and Confirm Password must match")
            return
        }
        validationListener.value?.onValidationSuccess()
    }*/

    override fun onValidationSuccess() {
        TODO("Not yet implemented")
    }

    override fun onValidationFailed(message: String) {
        TODO("Not yet implemented")
    }
}