package com.uilover.project2112.Activity

import android.content.Intent
import android.os.Bundle
import com.uilover.project2112.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            startBtn.setOnClickListener {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            }

        }

    }
}