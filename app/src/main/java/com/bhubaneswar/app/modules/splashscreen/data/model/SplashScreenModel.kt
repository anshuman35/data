package com.bhubaneswar.app.modules.splashscreen.`data`.model

import com.bhubaneswar.app.R
import com.bhubaneswar.app.appcomponents.di.MyApp
import kotlin.String

public data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  public val txtGetmapidandloca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_getmapidandloca)

)
