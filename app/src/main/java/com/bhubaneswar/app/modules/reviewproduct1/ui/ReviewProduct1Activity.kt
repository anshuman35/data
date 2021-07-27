package com.bhubaneswar.app.modules.reviewproduct1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityReviewProduct1Binding
import com.bhubaneswar.app.modules.reviewproduct1.`data`.model.ReviewProduct2RowModel
import com.bhubaneswar.app.modules.reviewproduct1.`data`.viewmodel.ReviewProduct1VM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ReviewProduct1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityReviewProduct1Binding

  private val viewModel: ReviewProduct1VM by viewModels<ReviewProduct1VM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ReviewProduct2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_review_product1)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : ReviewProduct2RowModel)
        {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.reviewProduct1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "REVIEW_PRODUCT1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewProduct1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
