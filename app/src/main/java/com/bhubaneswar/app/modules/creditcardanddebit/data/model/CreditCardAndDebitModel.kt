package com.bhubaneswar.app.modules.creditcardanddebit.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class CreditCardAndDebitModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtAddCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_card)

)
