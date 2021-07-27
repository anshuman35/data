package com.bhubaneswar.app.modules.order.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowOrderBinding
import com.bhubaneswar.app.modules.order.`data`.model.OrderRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<OrderRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowOrderVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOrderVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_order,parent,false)
    return RowOrderVH(view)
  }

  public override fun onBindViewHolder(holder: RowOrderVH, position: Int): Unit {
    val orderRowModel = OrderRowModel()
    // TODO uncomment following line after integration with data source
    // val orderRowModel = list[position]
    holder.binding.orderRowModel = orderRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: OrderRowModel
    ): Unit {
    }
  }

  public inner class RowOrderVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowOrderBinding = RowOrderBinding.bind(itemView)
  }
}
