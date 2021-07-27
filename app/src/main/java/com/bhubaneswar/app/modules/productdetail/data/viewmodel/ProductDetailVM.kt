package com.bhubaneswar.app.modules.productdetail.`data`.viewmodel

import androidx.lifecycle.ViewModel
import com.bhubaneswar.app.modules.productdetail.`data`.model.ProductDetailModel
import com.bhubaneswar.app.modules.reviewproduct.`data`.model.ReviewProductModel

public class ProductDetailVM : ViewModel() {
  public val productDetailModel: ProductDetailModel? = null

  public var includedModel: ReviewProductModel? = null
}
