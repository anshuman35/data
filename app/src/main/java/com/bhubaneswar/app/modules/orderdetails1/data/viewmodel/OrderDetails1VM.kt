package com.bhubaneswar.app.modules.orderdetails1.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.bhubaneswar.app.modules.orderdetails1.`data`.model.OrderDetails1Model
import com.bhubaneswar.app.modules.orderdetailstotalprice.`data`.model.OrderDetailsTotalPriceModel

public class OrderDetails1VM : ViewModel() {
  public val orderDetails1Model: OrderDetails1Model? = null

  public var includedModel: OrderDetailsTotalPriceModel? = null
}
