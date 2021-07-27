package com.bhubaneswar.app.modules.reviewproduct1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowReviewProduct2Binding
import com.bhubaneswar.app.modules.reviewproduct1.`data`.model.ReviewProduct2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<ReviewProduct2RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowReviewProduct2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowReviewProduct2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_review_product2,parent,false)
    return RowReviewProduct2VH(view)
  }

  public override fun onBindViewHolder(holder: RowReviewProduct2VH, position: Int): Unit {
    val reviewProduct2RowModel = ReviewProduct2RowModel()
    // TODO uncomment following line after integration with data source
    // val reviewProduct2RowModel = list[position]
    holder.binding.reviewProduct2RowModel = reviewProduct2RowModel
  }

  public override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: ReviewProduct2RowModel
    ): Unit {
    }
  }

  public inner class RowReviewProduct2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowReviewProduct2Binding = RowReviewProduct2Binding.bind(itemView)
  }
}
