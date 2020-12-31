package com.example.daylee

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.daylee.ui.MainActivity


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val vv = inflater.inflate(R.layout.fragment_login, container, false)

        val btnFrag2 = vv.findViewById<View>(R.id.btnRegLogin) as Button

        btnFrag2.setOnClickListener{
            val fragment = RegisterFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.flFragment,fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()


        }

        val btn = vv.findViewById<View>(R.id.btnLogin) as Button

        btn.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, MainActivity::class.java))
            }
        }

        return vv
    }

}