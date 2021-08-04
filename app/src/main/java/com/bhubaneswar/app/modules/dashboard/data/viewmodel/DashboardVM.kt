package com.bhubaneswar.app.modules.dashboard.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.bhubaneswar.app.modules.dashboard.`data`.model.DashboardModel
import com.bhubaneswar.app.modules.offerscreen.`data`.model.OfferScreenModel

public class DashboardVM : ViewModel() {
  public val dashboardModel: DashboardModel? = null

  public var includedModel: OfferScreenModel? = null
}
