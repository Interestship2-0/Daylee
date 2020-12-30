package com.example.daylee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class AuthenticationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        val logfrag = LoginFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.flFragment,logfrag)
        transaction.commit()

        val navController = Navigation.findNavController(this, R.id.flFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(
            Navigation.findNavController(this, R.id.flFragment),
            null
        )
    }
}