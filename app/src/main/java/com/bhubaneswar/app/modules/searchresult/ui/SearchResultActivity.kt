package com.bhubaneswar.app.modules.searchresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivitySearchResultBinding
import com.bhubaneswar.app.modules.filter.ui.FilterActivity
import com.bhubaneswar.app.modules.searchresult.`data`.model.SearchResultRowModel
import com.bhubaneswar.app.modules.searchresult.`data`.viewmodel.SearchResultVM
import com.bhubaneswar.app.modules.shortby.ui.ShortByActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchResultActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySearchResultBinding

  private val viewModel: SearchResultVM by viewModels<SearchResultVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: SearchResultRowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_search_result)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : SearchResultRowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.searchResultVM = viewModel
    binding.image.setOnClickListener {
      val destIntent = ShortByActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.image1.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SEARCH_RESULT_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
