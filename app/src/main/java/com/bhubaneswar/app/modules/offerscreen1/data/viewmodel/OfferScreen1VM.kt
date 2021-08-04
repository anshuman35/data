package com.bhubaneswar.app.modules.offerscreen1.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.bhubaneswar.app.modules.choosecreditordebitcard.`data`.model.ChooseCreditOrDebitCardModel
import com.bhubaneswar.app.modules.offerscreen.`data`.model.OfferScreenModel
import com.bhubaneswar.app.modules.offerscreen1.`data`.model.OfferScreen1Model

public class OfferScreen1VM : ViewModel() {
  public val offerScreen1Model: OfferScreen1Model? = null

  public var includedModel: ChooseCreditOrDebitCardModel? = null

  public var included1Model: OfferScreenModel? = null
}
