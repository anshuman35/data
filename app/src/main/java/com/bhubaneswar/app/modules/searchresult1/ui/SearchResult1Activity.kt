package com.bhubaneswar.app.modules.searchresult1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivitySearchResult1Binding
import com.bhubaneswar.app.modules.filter.ui.FilterActivity
import com.bhubaneswar.app.modules.offerscreenproduct01.`data`.model.OfferScreenProduct01Model
import com.bhubaneswar.app.modules.searchresult1.`data`.viewmodel.SearchResult1VM
import com.bhubaneswar.app.modules.shortby.ui.ShortByActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class SearchResult1Activity : AppCompatActivity() {
  private lateinit var binding: ActivitySearchResult1Binding

  private val viewModel: SearchResult1VM by viewModels<SearchResult1VM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: OfferScreenProduct01Model
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_search_result1)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item :
        OfferScreenProduct01Model)
            {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.searchResult1VM = viewModel
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
    public const val TAG: String = "SEARCH_RESULT1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResult1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
