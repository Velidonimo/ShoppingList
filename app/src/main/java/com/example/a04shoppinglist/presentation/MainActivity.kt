package com.example.a04shoppinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.a04shoppinglist.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        var count = 0
        viewModel.shopList.observe(this){
            Log.d("MyMsg", it.toString())
            if (count++ == 0) {
                val item = it[0]
                viewModel.changeEnableStateShopItem(item)
            }
        }
    }
}