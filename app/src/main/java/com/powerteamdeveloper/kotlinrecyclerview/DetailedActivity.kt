package com.powerteamdeveloper.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detailed.*

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        var title =intent.getStringExtra("title")
        var description =intent.getStringExtra("description")


        tvTitle.text =title.toString()
        tvDescription.text =description.toString()
    }
}