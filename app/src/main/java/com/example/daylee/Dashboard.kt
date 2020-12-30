package com.example.daylee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Dashboard : AppCompatActivity() {
    private val newAddNoteRequestCode = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_dashboard)

        val tasks = Task.getRandomTask(50)
        val taskadapter = TaskListAdapter(tasks)
        val rvTask = findViewById<RecyclerView>(R.id.rv_tasks)

        rvTask.layoutManager = LinearLayoutManager(this)
        rvTask.adapter = taskadapter

        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
            intent = Intent(applicationContext, AddNote::class.java)
            startActivity(intent)
        }

    }
}