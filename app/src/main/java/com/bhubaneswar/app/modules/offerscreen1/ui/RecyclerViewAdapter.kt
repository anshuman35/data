package com.bhubaneswar.app.modules.offerscreen1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ComponentOfferScreenProduct01Binding
import com.bhubaneswar.app.modules.offerscreenproduct01.`data`.model.OfferScreenProduct01Model
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<OfferScreenProduct01Model>
) : RecyclerView.Adapter<RecyclerViewAdapter.ComponentOfferScreenProduct01VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      ComponentOfferScreenProduct01VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.component_offer_screen_product01,parent,false)
    return ComponentOfferScreenProduct01VH(view)
  }

  public override fun onBindViewHolder(holder: ComponentOfferScreenProduct01VH, position: Int):
      Unit {
    val offerScreenProduct01Model = OfferScreenProduct01Model()
    // TODO uncomment following line after integration with data source
    // val offerScreenProduct01Model = list[position]
    holder.binding.offerScreenProduct01Model = offerScreenProduct01Model
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: OfferScreenProduct01Model
    ): Unit {
    }
  }

  public inner class ComponentOfferScreenProduct01VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: ComponentOfferScreenProduct01Binding =
        ComponentOfferScreenProduct01Binding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, OfferScreenProduct01Model())
      }
    }
  }
}
