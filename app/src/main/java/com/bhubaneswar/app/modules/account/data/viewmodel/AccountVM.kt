package com.bhubaneswar.app.modules.account.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.bhubaneswar.app.modules.account.`data`.model.AccountModel
import com.bhubaneswar.app.modules.offerscreenbottombar.`data`.model.OfferScreenBottombarModel

public class AccountVM : ViewModel() {
  public val accountModel: AccountModel? = null

  public var includedModel: OfferScreenBottombarModel? = null
}
