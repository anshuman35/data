package com.bhubaneswar.app.modules.profile.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityProfileBinding
import com.bhubaneswar.app.modules.profile.`data`.model.Profile1RowModel
import com.bhubaneswar.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ProfileActivity : AppCompatActivity() {
  private lateinit var binding: ActivityProfileBinding

  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Profile1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_profile)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Profile1RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.profileVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PROFILE_ACTIVITY"
  }
}
