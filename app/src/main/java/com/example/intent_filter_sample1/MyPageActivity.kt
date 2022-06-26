package com.example.intent_filter_sample1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)
    }

    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, MyPageActivity::class.java)
        }
    }
}