package com.bhubaneswar.app.modules.orderdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowOrderDetailsBinding
import com.bhubaneswar.app.modules.orderdetails.`data`.model.OrderDetailsRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<OrderDetailsRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowOrderDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOrderDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_order_details,parent,false)
    return RowOrderDetailsVH(view)
  }

  public override fun onBindViewHolder(holder: RowOrderDetailsVH, position: Int): Unit {
    val orderDetailsRowModel = OrderDetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val orderDetailsRowModel = list[position]
    holder.binding.orderDetailsRowModel = orderDetailsRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: OrderDetailsRowModel
    ): Unit {
    }
  }

  public inner class RowOrderDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowOrderDetailsBinding = RowOrderDetailsBinding.bind(itemView)
  }
}
