package com.bhubaneswar.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivitySearchBinding
import com.bhubaneswar.app.modules.search.`data`.viewmodel.SearchVM
import com.bhubaneswar.app.modules.searchresult1.ui.SearchResult1Activity
import kotlin.String
import kotlin.Unit

public class SearchActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySearchBinding

  private val viewModel: SearchVM by viewModels<SearchVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_search)
    binding.lifecycleOwner = this
    binding.searchVM = viewModel
    binding.txtNikeAirMax27.setOnClickListener {
              val destIntent = SearchResult1Activity.getIntent(this, null)
              startActivity(destIntent)
            }
  }

  public companion object {
    public const val TAG: String = "SEARCH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
