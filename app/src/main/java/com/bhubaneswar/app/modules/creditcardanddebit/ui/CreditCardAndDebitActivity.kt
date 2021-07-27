package com.bhubaneswar.app.modules.creditcardanddebit.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bhubaneswar.app.R
import com.bhubaneswar.app.databinding.ActivityCreditCardAndDebitBinding
import com.bhubaneswar.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebit1RowModel
import com.bhubaneswar.app.modules.creditcardanddebit.`data`.viewmodel.CreditCardAndDebitVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class CreditCardAndDebitActivity : AppCompatActivity() {
  private lateinit var binding: ActivityCreditCardAndDebitBinding

  private val viewModel: CreditCardAndDebitVM by viewModels<CreditCardAndDebitVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: CreditCardAndDebit1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_credit_card_and_debit)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
            object : RecyclerViewAdapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item :
        CreditCardAndDebit1RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    binding.lifecycleOwner = this
    binding.creditCardAndDebitVM = viewModel
  }

  public companion object {
    public const val TAG: String = "CREDIT_CARD_AND_DEBIT_ACTIVITY"
  }
}
