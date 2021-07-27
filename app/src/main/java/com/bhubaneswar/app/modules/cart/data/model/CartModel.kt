package com.bhubaneswar.app.modules.cart.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class CartModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtEnterCuponCod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_cupon_cod)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtApply: String? = MyApp.getInstance().resources.getString(R.string.lbl_apply)

)
