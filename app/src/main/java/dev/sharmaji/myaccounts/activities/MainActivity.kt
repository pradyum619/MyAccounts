package dev.sharmaji.myaccounts.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import dev.sharmaji.myaccounts.databinding.ActivityMainBinding
import dev.sharmaji.myaccounts.models.Customer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        lowerActionBarElevation()

    }

    fun lowerActionBarElevation(){
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.elevation = 0f
    }


    fun populateCustomers(customerArr:Array<Customer>){

    }

    fun addCustomerActivityLaunch(view: android.view.View) {
        intent = Intent(this, AddCustomerActivity::class.java)
//        intent.putExtra("id_value", id)
//        intent.putExtra("language_value", language)
        startActivity(intent)
    }
}