package com.bhubaneswar.app.modules.dashboard.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class Dashboard1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtMsNikeAirM: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ms_nike_air_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt29943: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt53433: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txt24Off: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
