package com.powerteamdeveloper.kotlinrecyclerview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() ,RecyclerViewAdapter.onItemClickListener{
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val user = ArrayList<UserDataModel>()
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))
        user.add(UserDataModel("Hello GG","lorem akkdafikasjfasjkflaskjfl;kasjf;a  "))


        var adapter = RecyclerViewAdapter(user,this)

        recyclerView.adapter =adapter

    }

    override fun onItemClick(user: UserDataModel) {
        var intent= Intent(this@MainActivity,DetailedActivity::class.java)
        intent.putExtra("title",user.title)
        intent.putExtra("description",user.description)
        startActivity(intent)

    }
}