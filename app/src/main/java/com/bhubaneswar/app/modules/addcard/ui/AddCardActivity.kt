package com.bhubaneswar.app.modules.addcard.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityAddCardBinding
import com.bhubaneswar.app.modules.addcard.`data`.viewmodel.AddCardVM
import kotlin.String
import kotlin.Unit

public class AddCardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAddCardBinding

  private val viewModel: AddCardVM by viewModels<AddCardVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_add_card)
    binding.lifecycleOwner = this
    binding.addCardVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ADD_CARD_ACTIVITY"
  }
}
