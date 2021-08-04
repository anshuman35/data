package com.bhubaneswar.app.modules.splashscreen.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivitySplashScreenBinding
import com.bhubaneswar.app.modules.login.ui.LoginActivity
import com.bhubaneswar.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

public class SplashScreenActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySplashScreenBinding

  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_splash_screen)
    binding.lifecycleOwner = this
    binding.splashScreenVM = viewModel
    binding.txtGetmapidandloca.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SPLASH_SCREEN_ACTIVITY"
  }
}
