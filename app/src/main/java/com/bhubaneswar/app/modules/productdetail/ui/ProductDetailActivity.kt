package com.bhubaneswar.app.modules.productdetail.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityProductDetailBinding
import com.bhubaneswar.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.bhubaneswar.app.modules.productdetailproduct01.`data`.model.ProductDetailProduct01Model
import com.bhubaneswar.app.modules.reviewproduct1.ui.ReviewProduct1Activity
import com.bhubaneswar.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProductDetailActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProductDetailBinding

  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: ProductDetailProduct01Model
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_product_detail)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
        ProductDetailProduct01Model) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.productDetailVM = viewModel
    binding.txtSeeMore.setOnClickListener {
      val destIntent = ReviewProduct1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.image.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"
  }
}
