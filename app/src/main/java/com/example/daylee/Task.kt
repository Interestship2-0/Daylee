package com.example.daylee

import kotlin.random.Random

data class Task (
        val title : String,
        val text : String,
        val date : Int
        ) {

    companion object{

        @JvmField
        val TITLE_NAMES = arrayOf(
                "Task 1" , "Task 2" , "Task 3" , "Task 4" , "Task 5" , "Task 6",
                "Task 7" , "Task 8" )

        @JvmField
        val ITEMS = arrayOf(
                "description of task is okay","important to be done", "a book or other written or" +
                " printed work, regarded in terms of its content rather than its physical form.",
                "In literary theory, a text is any object that can be whether this object is a work of literature",
                "Not important to be done"
        )

        @JvmStatic
        fun getRandomTask(n : Int) : ArrayList<Task>{
            val fruitArray = ArrayList<Task>(n)
            for (i in 1..n){
                fruitArray.add(
                        Task(
                                TITLE_NAMES[Random.nextInt(8)],
                                ITEMS[Random.nextInt(5)],
                                Random.nextInt(10)*100
                        )
                )
            }
            return fruitArray
        }


    }
}