package com.bhubaneswar.app.modules.shortby.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityShortByBinding
import com.bhubaneswar.app.modules.shortby.`data`.viewmodel.ShortByVM
import kotlin.String
import kotlin.Unit

public class ShortByActivity : AppCompatActivity() {
  private lateinit var binding: ActivityShortByBinding

  private val viewModel: ShortByVM by viewModels<ShortByVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_short_by)
    binding.lifecycleOwner = this
    binding.shortByVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SHORT_BY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShortByActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
