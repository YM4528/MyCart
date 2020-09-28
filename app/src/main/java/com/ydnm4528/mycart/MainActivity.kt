package com.ydnm4528.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ydnm4528.mycart.adapter.CartAdapter
import com.ydnm4528.mycart.model.CartItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var CartList = ArrayList<CartItem>()
        CartList.add(CartItem("Find Grain Sugar", "$20.00", R.drawable.fgs, "1kg"))
        CartList.add(CartItem("Peanuts", "$20.00", R.drawable.p1, "2kg"))
        CartList.add(CartItem("Dawat Rice", "$20.00", R.drawable.dawat, "2kg"))

        var cartAdapter = CartAdapter(CartList)
        cartRecyvler.layoutManager = LinearLayoutManager(this)
        cartRecyvler.adapter = cartAdapter

//        cartRecyvler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

//        cartRecyvler.layoutManager = GridLayoutManager(this, 2)
//        cartRecyvler.adapter= cartAdapter


    }
}