package com.example.intent_filter_sample1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.intent_filter_sample1.databinding.ActivityMyPageBinding

class MyPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        setupBinding()
        val from = intent.getSerializableExtra(FROM) as String
        binding.tvFrom.text = from
    }

    private fun setupBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_page)
    }


    companion object {
        const val FROM = "from"

        fun createIntent(context: Context, from: String): Intent {
            val intent =  Intent(context, MyPageActivity::class.java)
            intent.putExtra(FROM, from)
            return intent
        }
    }
}