package com.bhubaneswar.app.modules.addaddress.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityAddAddressBinding
import com.bhubaneswar.app.modules.addaddress.`data`.viewmodel.AddAddressVM
import kotlin.String
import kotlin.Unit

public class AddAddressActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAddAddressBinding

  private val viewModel: AddAddressVM by viewModels<AddAddressVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_add_address)
    binding.lifecycleOwner = this
    binding.addAddressVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ADD_ADDRESS_ACTIVITY"
  }
}
