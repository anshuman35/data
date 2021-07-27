package com.bhubaneswar.app.modules.orderdetails1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowOrderDetails2Binding
import com.bhubaneswar.app.modules.orderdetails1.`data`.model.OrderDetails2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<OrderDetails2RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowOrderDetails2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOrderDetails2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_order_details2,parent,false)
    return RowOrderDetails2VH(view)
  }

  public override fun onBindViewHolder(holder: RowOrderDetails2VH, position: Int): Unit {
    val orderDetails2RowModel = OrderDetails2RowModel()
    // TODO uncomment following line after integration with data source
    // val orderDetails2RowModel = list[position]
    holder.binding.orderDetails2RowModel = orderDetails2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: OrderDetails2RowModel
    ): Unit {
    }
  }

  public inner class RowOrderDetails2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowOrderDetails2Binding = RowOrderDetails2Binding.bind(itemView)
  }
}
