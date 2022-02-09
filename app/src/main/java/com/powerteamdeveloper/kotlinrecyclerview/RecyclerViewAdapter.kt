package com.powerteamdeveloper.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*


class RecyclerViewAdapter(val userList: ArrayList<UserDataModel>, var itemClickListener: onItemClickListener) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var title = item.tvTitle
        var descriptions = item.tvDescription
        fun bind(user: UserDataModel, clickListener: onItemClickListener) {
            title.text = user.title
            descriptions.text=user.description
            itemView.setOnClickListener {
                clickListener.onItemClick(user)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var user: UserDataModel = userList[position]
        holder.title.text = user.title
        holder.descriptions.text = user.description
        holder.bind(user,itemClickListener)

    }

    interface onItemClickListener {
        fun onItemClick(user: UserDataModel)

    }


}