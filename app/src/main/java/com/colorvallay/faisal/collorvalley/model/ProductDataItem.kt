package com.colorvallay.faisal.collorvalley.model

import android.os.Parcel
import android.os.Parcelable

data class ProductDataItem(val productTitle: String, val productCode: String, val imageUrl: String, val price: Int) : Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt()


    )

    override fun writeToParcel(parcel: Parcel, flag: Int) {
        parcel.writeString(productTitle)
        parcel.writeString(productCode)
        parcel.writeString(imageUrl)
        parcel.writeInt(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProductDataItem> {
        override fun createFromParcel(parcel: Parcel): ProductDataItem {
            return ProductDataItem(parcel)
        }

        override fun newArray(size: Int): Array<ProductDataItem?> {
            return arrayOfNulls(size)
        }
    }
}
