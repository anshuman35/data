package com.bhubaneswar.app.modules.listcategory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityListCategoryBinding
import com.bhubaneswar.app.modules.listcategory.`data`.model.ListCategoryRowModel
import com.bhubaneswar.app.modules.listcategory.`data`.viewmodel.ListCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ListCategoryActivity : AppCompatActivity() {
  private lateinit var binding: ActivityListCategoryBinding

  private val viewModel: ListCategoryVM by viewModels<ListCategoryVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ListCategoryRowModel
  ): Unit {
    when(view.id) {
        }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_list_category)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : ListCategoryRowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.listCategoryVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LIST_CATEGORY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ListCategoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
