package com.example.midka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private var idNew:Int? = null
    private var title:String? = null
    private var description:String? = null
    private var status:String? = null
    private var category:String? = null
    private var durations:String? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toDoList:MutableList<listItem> = mutableListOf()
        var id = 0;
        toDoList.add(listItem(id++,"Task1","desc1", "Done", "Urgent", "1"))
        toDoList.add(listItem(id++,"Task2","desc2", "Done", "Urgent", "2"))
        toDoList.add(listItem(id++,"Task3","desc3", "Done", "Urgent", "3"))
        toDoList.add(listItem(id++,"Task4","desc4", "Done", "Urgent", "4"))
        toDoList.add(listItem(id++,"Task5","desc5", "Done", "Urgent", "5"))






    }
}