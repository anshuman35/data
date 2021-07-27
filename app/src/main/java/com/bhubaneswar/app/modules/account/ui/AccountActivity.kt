package com.bhubaneswar.app.modules.account.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityAccountBinding
import com.bhubaneswar.app.modules.account.`data`.model.AccountRowModel
import com.bhubaneswar.app.modules.account.`data`.viewmodel.AccountVM
import com.bhubaneswar.app.modules.notification.ui.NotificationActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AccountActivity : AppCompatActivity() {
  private lateinit var binding: ActivityAccountBinding

  private val viewModel: AccountVM by viewModels<AccountVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: AccountRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_account)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : AccountRowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.accountVM = viewModel
    binding.image.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "ACCOUNT_ACTIVITY"
  }
}
