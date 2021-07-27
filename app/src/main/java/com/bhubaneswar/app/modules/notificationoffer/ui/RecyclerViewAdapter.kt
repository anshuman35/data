package com.bhubaneswar.app.modules.notificationoffer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.RowNotificationOfferBinding
import com.bhubaneswar.app.modules.notificationoffer.`data`.model.NotificationOfferRowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<NotificationOfferRowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowNotificationOfferVH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotificationOfferVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification_offer,parent,false)
    return RowNotificationOfferVH(view)
  }

  public override fun onBindViewHolder(holder: RowNotificationOfferVH, position: Int): Unit {
    val notificationOfferRowModel = NotificationOfferRowModel()
    // TODO uncomment following line after integration with data source
    // val notificationOfferRowModel = list[position]
    holder.binding.notificationOfferRowModel = notificationOfferRowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: NotificationOfferRowModel
    ): Unit {
    }
  }

  public inner class RowNotificationOfferVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowNotificationOfferBinding = RowNotificationOfferBinding.bind(itemView)
  }
}
