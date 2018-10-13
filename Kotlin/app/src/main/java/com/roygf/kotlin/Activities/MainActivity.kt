package com.roygf.kotlin.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.roygf.kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_recycler.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val intent = Intent(this, RecyclerActivity::class.java)
        startActivity(intent)

    }

}
