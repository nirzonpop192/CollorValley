package com.colorvallay.faisal.collorvalley.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.colorvallay.faisal.collorvalley.R
import com.colorvallay.faisal.collorvalley.model.ProductDataItem
import kotlinx.android.synthetic.main.list_row_product.view.*


class ProductAdapter(val items: MutableList<ProductDataItem>, val context: Context?) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    //    class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivThumbnail = view.lr_product_thumbnail!!
        val tvProductTitle = view.lr_tv_product_title!!
        val tvProductCode = view.lr_tv_productCode!!
        val tvProductPrice = view.lr_tv_productPrice!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_row_product,parent,false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvProductTitle?.text=items.get(position).productTitle
        holder?.tvProductCode?.text = items.get(position).productCode
        holder?.tvProductPrice?.text= items.get(position).price.toString()

        Glide.with(context).load(items.get(position).imageUrl).into(holder?.ivThumbnail)
    }




    /*
    *
    * class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalType = view.tv_animal_type
}*/
}