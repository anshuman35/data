package com.bhubaneswar.app.modules.dashboard.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class Dashboard2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)

)
