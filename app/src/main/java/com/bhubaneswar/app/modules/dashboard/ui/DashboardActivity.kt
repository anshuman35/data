package com.bhubaneswar.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityDashboardBinding
import com.bhubaneswar.app.modules.dashboard.`data`.model.Dashboard1RowModel
import com.bhubaneswar.app.modules.dashboard.`data`.model.Dashboard2RowModel
import com.bhubaneswar.app.modules.dashboard.`data`.model.Dashboard3RowModel
import com.bhubaneswar.app.modules.dashboard.`data`.model.DashboardRowModel
import com.bhubaneswar.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.bhubaneswar.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.bhubaneswar.app.modules.listcategory.ui.ListCategoryActivity
import com.bhubaneswar.app.modules.notification.ui.NotificationActivity
import com.bhubaneswar.app.modules.offerscreen.ui.OfferScreenActivity
import com.bhubaneswar.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class DashboardActivity : AppCompatActivity() {
  private lateinit var binding: ActivityDashboardBinding

  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: DashboardRowModel
  ): Unit {
    when(view.id) {
        }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Dashboard1RowModel
  ): Unit {
    when(view.id) {
        }
  }

  public fun onClickRecyclerView2(
    view: View,
    position: Int,
    item: Dashboard2RowModel
  ): Unit {
    when(view.id) {
        }
  }

  public fun onClickRecyclerView3(
    view: View,
    position: Int,
    item: Dashboard3RowModel
  ): Unit {
    when(view.id) {
        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_dashboard)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                    object : RecyclerViewAdapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : DashboardRowModel)
        {
                            onClickRecyclerView(view, position, item)
                        }
                    }
                    )
    val recyclerView1Adapter = RecyclerView1Adapter(arrayListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
                    object : RecyclerView1Adapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Dashboard1RowModel)
        {
                            onClickRecyclerView1(view, position, item)
                        }
                    }
                    )
    val recyclerView2Adapter = RecyclerView2Adapter(arrayListOf())
    binding.recyclerView2.adapter = recyclerView2Adapter
    recyclerView2Adapter.setOnItemClickListener(
                    object : RecyclerView2Adapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Dashboard2RowModel)
        {
                            onClickRecyclerView2(view, position, item)
                        }
                    }
                    )
    val recyclerView3Adapter = RecyclerView3Adapter(arrayListOf())
    binding.recyclerView3.adapter = recyclerView3Adapter
    recyclerView3Adapter.setOnItemClickListener(
                    object : RecyclerView3Adapter.OnItemClickListener {
                        override fun onItemClick(view:View, position:Int, item : Dashboard3RowModel)
        {
                            onClickRecyclerView3(view, position, item)
                        }
                    }
                    )
    binding.lifecycleOwner = this
    binding.dashboardVM = viewModel
    binding.image1.setOnClickListener {
          val destIntent = NotificationActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.txtSearchProduct.setOnClickListener {
          val destIntent = SearchActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.image.setOnClickListener {
          val destIntent = FavoriteProductActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.txtMoreCategory.setOnClickListener {
          val destIntent = ListCategoryActivity.getIntent(this, null)
          startActivity(destIntent)
        }
    binding.linear.setOnClickListener {
          val destIntent = OfferScreenActivity.getIntent(this, null)
          startActivity(destIntent)
        }
  }

  public companion object {
    public const val TAG: String = "DASHBOARD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
