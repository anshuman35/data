package com.bhubaneswar.app.modules.offerscreen1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityOfferScreen1Binding
import com.bhubaneswar.app.modules.offerscreen1.`data`.viewmodel.OfferScreen1VM
import com.bhubaneswar.app.modules.offerscreenproduct01.`data`.model.OfferScreenProduct01Model
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class OfferScreen1Activity : AppCompatActivity() {
  private lateinit var binding: ActivityOfferScreen1Binding

  private val viewModel: OfferScreen1VM by viewModels<OfferScreen1VM>()

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
    binding = DataBindingUtil.setContentView(this,R.layout.activity_offer_screen1)
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
    binding.offerScreen1VM = viewModel
  }

  public companion object {
    public const val TAG: String = "OFFER_SCREEN1ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OfferScreen1Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
