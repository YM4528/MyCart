package com.ydnm4528.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ydnm4528.mycart.R
import com.ydnm4528.mycart.model.CartItem
import kotlinx.android.synthetic.main.item_cart.view.*


class CartAdapter (var cartList : ArrayList<CartItem>):
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(cartitem: CartItem) {
            itemView.txtName.text = cartitem.name
            itemView.txtPrice.text = cartitem.price
            itemView.imgcart.setImageResource(cartitem.itemimage)

//        itemView.plusImage.setImageResource(cartitem.plusimage)
//        itemView.minusImage.setImageResource(cartitem.minusimage)

            itemView.txtKg.text = cartitem.kg
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_cart, parent, false)
        return CartViewHolder(view)

    }

    override fun getItemCount(): Int = cartList.size

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {


        holder.bind(cartList[position])

    }


}