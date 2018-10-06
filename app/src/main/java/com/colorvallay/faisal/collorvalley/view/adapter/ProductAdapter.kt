package com.colorvallay.faisal.collorvalley.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.colorvallay.faisal.collorvalley.R
import com.colorvallay.faisal.collorvalley.model.ProductDataItem
import kotlinx.android.synthetic.main.list_row_product.view.*


class ProductAdapter(val items: MutableList<ProductDataItem>, val context: Context?) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivThumbnail = view.lr_product_thumbnail!!
        val tvProductTitle = view.lr_tv_product_title!!
        val tvProductCode = view.lr_tv_productCode!!
        val tvProductPrice = view.lr_tv_productPrice!!
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_row_product,parent,false))
    }

    // Gets the number of product in the list
    override fun getItemCount(): Int {
        return items.size
    }
    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Holds the TextView that will add each product to
        holder?.tvProductTitle?.text=items.get(position).productTitle
        holder?.tvProductCode?.text = items.get(position).productCode
        holder?.tvProductPrice?.text= items.get(position).price.toString()

        Glide.with(context).load(items.get(position).imageUrl).into(holder?.ivThumbnail)
    }

}