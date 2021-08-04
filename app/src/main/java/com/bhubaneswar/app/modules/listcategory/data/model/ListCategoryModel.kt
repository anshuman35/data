package com.bhubaneswar.app.modules.listcategory.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class ListCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtHighHeels: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_high_heels)

)
