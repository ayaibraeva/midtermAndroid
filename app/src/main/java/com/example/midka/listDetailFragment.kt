package com.example.midka
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
class listDetailFragment(list:MutableList<listItem>) {

    private var toDoAdapter: Adapter? = null
    private var toDoList = list
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.listdetail_frgment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toDoAdapter = Adapter(
            itemClickListener = {
                val intent = Intent(context, listDetail::class.java)
                intent.putExtra("id", toDoList[it].getId().toString())
                intent.putExtra("title", toDoList[it].getTitle())
                intent.putExtra("description", toDoList[it].getDescription())
                intent.putExtra("status", toDoList[it].getStatus())
                intent.putExtra("category", toDoList[it].getCategory())
                intent.putExtra("durations", toDoList[it].getDuration())
                startActivity(intent)
            }
        )

    }

}
