package com.bhubaneswar.app.modules.orderdetails1.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class OrderDetails1Model(
  /**
   * TODO Replace with dynamic value
   */
  public val txtShippingDetail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDateShipping: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_date_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtJanuary16202: String? =
      MyApp.getInstance().resources.getString(R.string.msg_january_16_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtPosReggular: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pos_reggular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtNoResi: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_resi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt000192848573: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_000192848573)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt2727NewOwerr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2727_new_owerr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtPaymentDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)

)
