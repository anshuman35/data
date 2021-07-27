package com.bhubaneswar.app.modules.notification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityNotificationBinding
import com.bhubaneswar.app.modules.notification.`data`.model.NotificationRowModel
import com.bhubaneswar.app.modules.notification.`data`.viewmodel.NotificationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class NotificationActivity : AppCompatActivity() {
  private lateinit var binding: ActivityNotificationBinding

  private val viewModel: NotificationVM by viewModels<NotificationVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: NotificationRowModel
  ): Unit {
    when(view.id) {
                        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_notification)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                                object : RecyclerViewAdapter.OnItemClickListener {
                                    override fun onItemClick(view:View, position:Int, item :
                    NotificationRowModel) {
                                        onClickRecyclerView(view, position, item)
                                    }
                                }
                                )
    binding.lifecycleOwner = this
    binding.notificationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "NOTIFICATION_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
