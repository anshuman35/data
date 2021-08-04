package com.bhubaneswar.app.modules.offerscreen2.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.bhubaneswar.app.modules.offerscreen.`data`.model.OfferScreenModel
import com.bhubaneswar.app.modules.offerscreen2.`data`.model.OfferScreen2Model
import com.bhubaneswar.app.modules.offerscreenbottombar.`data`.model.OfferScreenBottombarModel

public class OfferScreen2VM : ViewModel() {
  public val offerScreen2Model: OfferScreen2Model? = null

  public var includedModel: OfferScreenModel? = null

  public var included1Model: OfferScreenBottombarModel? = null
}
