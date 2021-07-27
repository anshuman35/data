package com.bhubaneswar.app.modules.order.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtSdg1345kjd: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_sdg1345kjd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtOrderAtECom: String? =
      MyApp.getInstance().resources.getString(R.string.msg_order_at_e_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtOrderStatus: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_order_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt1ItemsPurchas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_items_purchas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)

)
