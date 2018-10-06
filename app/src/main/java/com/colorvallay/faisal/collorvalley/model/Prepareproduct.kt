package com.colorvallay.faisal.collorvalley.model

import java.util.ArrayList

object PrepareProduct {
    val prepareProductData: List<ProductDataItem>
        get() {

            val products = ArrayList<ProductDataItem>()     // list

            var product = ProductDataItem("Lilen Orange Short Long", "CV_635", "http://colorsvalley.com/back_admin/uploads/thumb/CV_635.png", 2080)
            products.add(product)
            product = ProductDataItem("Long Kurti", "CV_701", "http://colorsvalley.com/back_admin/uploads/thumb/KURTI_8048(2).jpg", 3500)
            products.add(product)
            product = ProductDataItem("Lilen Rose ambrodri", "CV_703", "http://colorsvalley.com/back_admin/uploads/thumb/CV_608.png", 2990)
            products.add(product)
            return products
        }
}
/*
 java equivalent class
* public class PrepareProduct {
    public static List<ProductDataItem> getPrepareProductData() {
        List<ProductDataItem> products= new ArrayList<>();

        ProductDataItem product= new ProductDataItem("Lilen Orange Short Long","CV_635","http://colorsvalley.com/back_admin/uploads/thumb/CV_635.png",2080);
        products.add(product);
        product= new ProductDataItem("Long Kurti","CV_701","http://colorsvalley.com/back_admin/uploads/thumb/KURTI_8048(2).jpg",3500);
        products.add(product);
        product= new ProductDataItem("Lilen Rose ambrodri","CV_703","http://colorsvalley.com/back_admin/uploads/thumb/CV_608.png",2990);
        products.add(product);
        return products;
    }
}
* */