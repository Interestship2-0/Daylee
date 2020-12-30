package com.example.daylee

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskListAdapter (val tasks : ArrayList<Task>
): RecyclerView.Adapter<TaskListAdapter.TaskViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
                R.layout.fragment_list_item, parent, false
        )
        return TaskViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {


        holder.tv_title.text = tasks[position].title
        holder.item_text.text = tasks[position].text

    }

    override fun getItemCount(): Int = tasks.size

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //view binding
        val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
        val item_text = itemView.findViewById<TextView>(R.id.item_text)

    }

}