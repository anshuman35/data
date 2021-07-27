package com.bhubaneswar.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ComponentProductDetailProduct01Binding
import com.bhubaneswar.app.modules.productdetailproduct01.`data`.model.ProductDetailProduct01Model
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public val list: List<ProductDetailProduct01Model>
) : RecyclerView.Adapter<RecyclerView1Adapter.ComponentProductDetailProduct01VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      ComponentProductDetailProduct01VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.component_product_detail_product01,parent,false)
    return ComponentProductDetailProduct01VH(view)
  }

  public override fun onBindViewHolder(holder: ComponentProductDetailProduct01VH, position: Int):
      Unit {
    val productDetailProduct01Model = ProductDetailProduct01Model()
    // TODO uncomment following line after integration with data source
    // val productDetailProduct01Model = list[position]
    holder.binding.productDetailProduct01Model = productDetailProduct01Model
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ProductDetailProduct01Model
    ): Unit {
    }
  }

  public inner class ComponentProductDetailProduct01VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: ComponentProductDetailProduct01Binding =
        ComponentProductDetailProduct01Binding.bind(itemView)
  }
}
