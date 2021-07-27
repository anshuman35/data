package com.bhubaneswar.app.modules.offerscreen1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityOfferScreen1Binding
import com.bhubaneswar.app.modules.notification.ui.NotificationActivity
import com.bhubaneswar.app.modules.offerscreen1.`data`.viewmodel.OfferScreen1VM
import kotlin.String
import kotlin.Unit

public class OfferScreen1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityOfferScreen1Binding

  private val viewModel: OfferScreen1VM by viewModels<OfferScreen1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_offer_screen1)
    binding.lifecycleOwner = this
    binding.offerScreen1VM = viewModel
    binding.image.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN1ACTIVITY"
  }
}
