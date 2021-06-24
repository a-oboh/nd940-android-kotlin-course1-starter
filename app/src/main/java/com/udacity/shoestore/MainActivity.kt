package com.udacity.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfig: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        Timber.plant(Timber.DebugTree())

        val navController = this.findNavController(R.id.nav_host_fragment)

        // assigning ID of the toolbar to a variable
        val toolbar = binding.toolbar

        // using toolbar as ActionBar
        setSupportActionBar(toolbar)

        appBarConfig = AppBarConfiguration(navController.graph)

        NavigationUI.setupWithNavController(toolbar, navController)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = this.findNavController(R.id.nav_host_fragment)
//        return NavigationUI.navigateUp(navController, appBarConfig)
//    }
}
