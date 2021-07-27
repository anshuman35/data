package com.bhubaneswar.app.modules.reviewproduct1.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class ReviewProduct2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtAirMaxAreAlw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_alw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public val txtDecember1020: String? =
      MyApp.getInstance().resources.getString(R.string.msg_december_10_20)

)
