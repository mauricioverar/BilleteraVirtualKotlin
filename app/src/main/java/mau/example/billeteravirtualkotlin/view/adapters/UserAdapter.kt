package mau.example.billeteravirtualkotlin.view.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mau.example.billeteravirtualkotlin.databinding.ActivityUsersItemBinding
import mau.example.billeteravirtualkotlin.model.UserModel

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {


    lateinit var onItemClickListener: (UserModel) -> Unit

    var users = mutableListOf<UserModel>()
        set(value) {
            field = value
            //notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ActivityUsersItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserAdapter.UserViewHolder, position: Int) {
        val user = users[position]
        holder.bind(user)
    }

    inner class UserViewHolder(private val binding: ActivityUsersItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(user: UserModel) {
            binding.txtNombre.text = user.userName
            binding.txtEmail.text = user.userEmail

            // click listener
            binding.root.setOnClickListener {
                onItemClickListener(user)
                // do something
            }
        }

    }
}