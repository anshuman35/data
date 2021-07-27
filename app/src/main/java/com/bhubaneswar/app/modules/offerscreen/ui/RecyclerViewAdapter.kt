package com.bhubaneswar.app.modules.offerscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowOfferScreenBinding
import com.bhubaneswar.app.modules.offerscreen.`data`.model.OfferScreenRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<OfferScreenRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowOfferScreenVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOfferScreenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_offer_screen,parent,false)
    return RowOfferScreenVH(view)
  }

  public override fun onBindViewHolder(holder: RowOfferScreenVH, position: Int): Unit {
    val offerScreenRowModel = OfferScreenRowModel()
    // TODO uncomment following line after integration with data source
    // val offerScreenRowModel = list[position]
    holder.binding.offerScreenRowModel = offerScreenRowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: OfferScreenRowModel
    ): Unit {
    }
  }

  public inner class RowOfferScreenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowOfferScreenBinding = RowOfferScreenBinding.bind(itemView)
    init {
      binding.linear.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, OfferScreenRowModel())
      }
    }
  }
}
