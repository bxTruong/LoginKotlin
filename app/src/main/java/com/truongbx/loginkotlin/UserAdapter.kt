package com.truongbx.loginkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.truongbx.loginkotlin.databinding.ItemUserBinding

class UserAdapter(private val userList: List<User>, private val context: Context) :
    RecyclerView.Adapter<UserAdapter.UserHolder>() {

    lateinit var binding: ItemUserBinding

    class UserHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_user,
            parent,
            false
        )
        return UserHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        val user = userList[position]
        binding.user = user
        holder.itemView.setOnClickListener {
            Toast.makeText(
                context,
                "Click ${user.username}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

}


