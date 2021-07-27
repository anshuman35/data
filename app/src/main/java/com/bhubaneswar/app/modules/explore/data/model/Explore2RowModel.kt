package com.bhubaneswar.app.modules.explore.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class Explore2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)

)
