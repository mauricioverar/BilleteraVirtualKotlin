package mau.example.billeteravirtualkotlin.model

class UserProvider {
    companion object {
        fun getUsers(): List<UserModel> {
            return user
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