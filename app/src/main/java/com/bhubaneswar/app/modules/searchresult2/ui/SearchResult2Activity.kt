package com.bhubaneswar.app.modules.searchresult2.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivitySearchResult2Binding
import com.bhubaneswar.app.modules.searchresult2.`data`.viewmodel.SearchResult2VM
import kotlin.String
import kotlin.Unit

public class SearchResult2Activity : AppCompatActivity() {
  private lateinit var binding: ActivitySearchResult2Binding

  private val viewModel: SearchResult2VM by viewModels<SearchResult2VM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_search_result2)
    binding.lifecycleOwner = this
    binding.searchResult2VM = viewModel
  }

  public companion object {
    public const val TAG: String = "SEARCH_RESULT2ACTIVITY"
  }
}
