package com.bhubaneswar.app.modules.shipto.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ComponentAddressAddress1SelectedBinding
import com.bhubaneswar.app.modules.addressaddress1selected.`data`.model.AddressAddress1SelectedModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<AddressAddress1SelectedModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.ComponentAddressAddress1SelectedVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      ComponentAddressAddress1SelectedVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.component_address_address_1_selected,parent,false)
    return ComponentAddressAddress1SelectedVH(view)
  }

  public override fun onBindViewHolder(holder: ComponentAddressAddress1SelectedVH, position: Int):
      Unit {
    val addressAddress1SelectedModel = AddressAddress1SelectedModel()
    // TODO uncomment following line after integration with data source
    // val addressAddress1SelectedModel = list[position]
    holder.binding.addressAddress1SelectedModel = addressAddress1SelectedModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: AddressAddress1SelectedModel
    ): Unit {
    }
  }

  public inner class ComponentAddressAddress1SelectedVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: ComponentAddressAddress1SelectedBinding =
        ComponentAddressAddress1SelectedBinding.bind(itemView)
  }
}
