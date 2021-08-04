package com.bhubaneswar.app.modules.choosecreditordebitcard1.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityChooseCreditOrDebitCard1Binding
import com.bhubaneswar.app.modules.choosecreditordebitcard1.`data`.viewmodel.ChooseCreditOrDebitCard1VM
import kotlin.String
import kotlin.Unit

public class ChooseCreditOrDebitCard1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityChooseCreditOrDebitCard1Binding

  private val viewModel: ChooseCreditOrDebitCard1VM by viewModels<ChooseCreditOrDebitCard1VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding =
                   
        DataBindingUtil.setContentView(this,R.layout.activity_choose_credit_or_debit_card1)
    binding.lifecycleOwner = this
    binding.chooseCreditOrDebitCard1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "CHOOSE_CREDIT_OR_DEBIT_CARD1ACTIVITY"
  }
}
