package com.bhubaneswar.app.modules.notificationfeed.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class NotificationFeedRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtNewProduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtNikeAirZoomP: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtJune320155: String? =
      MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5)

)
