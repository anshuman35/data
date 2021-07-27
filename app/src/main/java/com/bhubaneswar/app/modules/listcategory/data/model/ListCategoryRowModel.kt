package com.bhubaneswar.app.modules.listcategory.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategoryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)

)
