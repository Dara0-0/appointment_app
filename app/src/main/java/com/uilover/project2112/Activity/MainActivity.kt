package com.uilover.project2112.Activity

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.uilover.project2112.Adapter.NearDoctorsAdapter
import com.uilover.project2112.R
import com.uilover.project2112.ViewModel.MainViewModel
import com.uilover.project2112.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNearByDoctor()

    }

    private fun initNearByDoctor() {
       binding.apply {
           progressBar.visibility=View.VISIBLE
           viewModel.loadDoctors().observe(this@MainActivity, Observer {
               topView.layoutManager=
                   LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
               topView.adapter=NearDoctorsAdapter(it)
               progressBar.visibility=View.GONE

           })
       }
    }
}