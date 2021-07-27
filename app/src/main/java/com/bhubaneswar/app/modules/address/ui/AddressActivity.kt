package com.bhubaneswar.app.modules.address.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityAddressBinding
import com.bhubaneswar.app.modules.address.`data`.viewmodel.AddressVM
import com.bhubaneswar.app.modules.addressaddress1selected.`data`.model.AddressAddress1SelectedModel
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AddressActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAddressBinding

  private val viewModel: AddressVM by viewModels<AddressVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: AddressAddress1SelectedModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_address)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
        AddressAddress1SelectedModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.addressVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ADDRESS_ACTIVITY"
  }
}
