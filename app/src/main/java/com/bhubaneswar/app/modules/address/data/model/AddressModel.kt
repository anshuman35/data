package com.bhubaneswar.app.modules.address.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class AddressModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtAddAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_address)

)
