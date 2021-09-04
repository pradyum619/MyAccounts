package dev.sharmaji.myaccounts.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import dev.sharmaji.myaccounts.databinding.ActivityCustomerDetailBinding
import dev.sharmaji.myaccounts.R
import android.view.MenuInflater
import androidx.appcompat.app.ActionBar


class CustomerDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomerDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomerDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val actionBar = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        lowerActionBarElevation()
    }
    fun lowerActionBarElevation(){
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.elevation = 0f
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.cust_del_menu, menu)
        return true
    }

}