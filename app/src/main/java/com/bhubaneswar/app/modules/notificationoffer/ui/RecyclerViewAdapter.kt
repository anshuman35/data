package com.bhubaneswar.app.modules.notificationoffer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ComponentNotificationActivityActivityList01Binding
import com.bhubaneswar.app.modules.notificationactivityactivitylist01.`data`.model.NotificationActivityActivityList01Model
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<NotificationActivityActivityList01Model>
) : RecyclerView.Adapter<RecyclerViewAdapter.ComponentNotificationActivityActivityList01VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      ComponentNotificationActivityActivityList01VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.component_notification_activity_activity_list01,parent,false)
    return ComponentNotificationActivityActivityList01VH(view)
  }

  public override fun onBindViewHolder(holder: ComponentNotificationActivityActivityList01VH,
      position: Int): Unit {
    val notificationActivityActivityList01Model = NotificationActivityActivityList01Model()
    // TODO uncomment following line after integration with data source
    // val notificationActivityActivityList01Model = list[position]
    holder.binding.notificationActivityActivityList01Model = notificationActivityActivityList01Model
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: NotificationActivityActivityList01Model
    ): Unit {
    }
  }

  public inner class ComponentNotificationActivityActivityList01VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: ComponentNotificationActivityActivityList01Binding =
        ComponentNotificationActivityActivityList01Binding.bind(itemView)
  }
}
