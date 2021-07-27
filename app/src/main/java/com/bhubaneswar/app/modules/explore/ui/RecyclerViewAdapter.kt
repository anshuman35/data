package com.bhubaneswar.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowExploreBinding
import com.bhubaneswar.app.modules.explore.`data`.model.ExploreRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ExploreRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowExploreVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExploreVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore,parent,false)
    return RowExploreVH(view)
  }

  public override fun onBindViewHolder(holder: RowExploreVH, position: Int): Unit {
    val exploreRowModel = ExploreRowModel()
    // TODO uncomment following line after integration with data source
    // val exploreRowModel = list[position]
    holder.binding.exploreRowModel = exploreRowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ExploreRowModel
    ): Unit {
    }
  }

  public inner class RowExploreVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowExploreBinding = RowExploreBinding.bind(itemView)
  }
}
