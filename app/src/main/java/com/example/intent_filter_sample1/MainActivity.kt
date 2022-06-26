package com.example.intent_filter_sample1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.intent_filter_sample1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupButton()
    }

    private fun setupBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    private fun setupButton() {
        binding.myPageButton.setOnClickListener {
            val intent = MyPageActivity.createIntent(this)
            startActivity(intent)
        }

        binding.intentFilterButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).also {
                it.data = Uri.parse("hoge://test")
                it.addCategory(Intent.CATEGORY_BROWSABLE)
            }
            startActivity(intent)
        }
    }
}