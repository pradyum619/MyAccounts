package dev.sharmaji.myaccounts.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.sharmaji.myaccounts.databinding.ActivityAddCustomerBinding

class AddCustomerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddCustomerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddCustomerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addcustomerEdttxtNameCustomer.requestFocus()
    }

    fun ContinueBtnClicked(view: android.view.View) {
        //TODO create new customer with default balance
        intent = Intent(this, CustomerDetailActivity::class.java)
//        intent.putExtra("id_value", id)
//        intent.putExtra("language_value", language)
        startActivity(intent)
    }
}