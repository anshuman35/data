package com.bhubaneswar.app.modules.listcategory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowListCategoryBinding
import com.bhubaneswar.app.modules.listcategory.`data`.model.ListCategoryRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ListCategoryRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowListCategoryVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListCategoryVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list_category,parent,false)
    return RowListCategoryVH(view)
  }

  public override fun onBindViewHolder(holder: RowListCategoryVH, position: Int): Unit {
    val listCategoryRowModel = ListCategoryRowModel()
    // TODO uncomment following line after integration with data source
    // val listCategoryRowModel = list[position]
    holder.binding.listCategoryRowModel = listCategoryRowModel
  }

  public override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ListCategoryRowModel
    ): Unit {
    }
  }

  public inner class RowListCategoryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowListCategoryBinding = RowListCategoryBinding.bind(itemView)
  }
}
