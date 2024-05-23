package mau.example.billeteravirtualkotlin.model

class UserProvider {
    companion object {
        fun getUsers(): UserModel {
            return user[1]
        }

        private val user = listOf<UserModel>(
            UserModel(
                userName = "John",
                userEmail = "John@gmail.com"
            ),
            UserModel(
                userName = "John",
                userEmail = "John@gmail.com"
            ),
            UserModel(
                userName = "John",
                userEmail = "John@gmail.com"
            ),
            UserModel(
                userName = "John",
                userEmail = "John@gmail.com"
            ),
            UserModel(
                userName = "John",
                userEmail = "John@gmail.com"
            )
        )
    }
}