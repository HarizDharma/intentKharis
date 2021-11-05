package com.example.intentkharis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity() {
//    private lateinit var btnMoveActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

//        btnMoveActivity = findViewById(R.id.btn_move_activity)
//        btnMoveActivity.setOnClickListener(this)
    }

//    override fun onClick(v: View?) {
//        if (v != null) {
//            when(v.id) {
//                R.id.btn_move_activity -> run {
//                    val intent = Intent(this, MoveActivity::class.java)
//                    startActivity(intent)
//                }
//            }
//        }
//    }
}