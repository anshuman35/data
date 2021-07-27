package com.bhubaneswar.app.modules.searchresult.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class SearchResultRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtNikeAirMax27: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_27)
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
