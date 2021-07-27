package com.bhubaneswar.app.modules.address.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowAddressBinding
import com.bhubaneswar.app.modules.address.`data`.model.AddressRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<AddressRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowAddressVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAddressVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_address,parent,false)
    return RowAddressVH(view)
  }

  public override fun onBindViewHolder(holder: RowAddressVH, position: Int): Unit {
    val addressRowModel = AddressRowModel()
    // TODO uncomment following line after integration with data source
    // val addressRowModel = list[position]
    holder.binding.addressRowModel = addressRowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: AddressRowModel
    ): Unit {
    }
  }

  public inner class RowAddressVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAddressBinding = RowAddressBinding.bind(itemView)
  }
}
