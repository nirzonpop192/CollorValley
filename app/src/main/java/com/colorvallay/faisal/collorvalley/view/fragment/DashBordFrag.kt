package com.colorvallay.faisal.collorvalley.view.fragment

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.colorvallay.faisal.collorvalley.R
import com.colorvallay.faisal.collorvalley.model.ProductDataItem
import com.colorvallay.faisal.collorvalley.view.adapter.ProductAdapter
import kotlinx.android.synthetic.main.frag_dash_bord.view.*


class DashBordFrag : BaseFragment() {

    // wait for api response  text data
    val mProducts: MutableList<ProductDataItem> =
            mutableListOf(
                    ProductDataItem("Lilen Orange Short Long", "CV_635", "http://colorsvalley.com/back_admin/uploads/thumb/CV_635.png", 2080)
                    , ProductDataItem("Long Kurti", "CV_701", "http://colorsvalley.com/back_admin/uploads/thumb/KURTI_8048(2).jpg", 3500)
                    , ProductDataItem("Lilen Rose ambrodri", "CV_703", "http://colorsvalley.com/back_admin/uploads/thumb/CV_608.png", 2990))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rowView: View = inflater!!.inflate(R.layout.frag_dash_bord, container, false)
        val activity = activity
        val rvProducts = rowView.findViewById(R.id.rvProduct) as RecyclerView
        rvProducts.layoutManager = GridLayoutManager(activity, 2)
        rvProducts.adapter = ProductAdapter(mProducts, context)
        val ivBanner: ImageView = rowView.ivBanner

        Glide.with(context).load("http://colorsvalley.com/back_admin/uploads/banner-1.jpg").into(ivBanner)
        return rowView
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)

    }


}
