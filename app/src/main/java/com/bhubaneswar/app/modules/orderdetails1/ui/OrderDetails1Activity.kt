package com.bhubaneswar.app.modules.orderdetails1.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityOrderDetails1Binding
import com.bhubaneswar.app.modules.orderdetails1.`data`.model.OrderDetails2RowModel
import com.bhubaneswar.app.modules.orderdetails1.`data`.viewmodel.OrderDetails1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OrderDetails1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityOrderDetails1Binding

  private val viewModel: OrderDetails1VM by viewModels<OrderDetails1VM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OrderDetails2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_order_details1)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : OrderDetails2RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.orderDetails1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "ORDER_DETAILS1ACTIVITY"
  }
}
