package com.bhubaneswar.app.modules.shipto.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityShipToBinding
import com.bhubaneswar.app.modules.addressaddress1selected.`data`.model.AddressAddress1SelectedModel
import com.bhubaneswar.app.modules.shipto.`data`.viewmodel.ShipToVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ShipToActivity : AppCompatActivity() {
  private lateinit var binding: ActivityShipToBinding

  private val viewModel: ShipToVM by viewModels<ShipToVM>()

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
    binding = DataBindingUtil.setContentView(this,R.layout.activity_ship_to)
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
    binding.shipToVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SHIP_TO_ACTIVITY"
  }
}
