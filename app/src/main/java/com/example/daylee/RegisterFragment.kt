package com.example.daylee

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class RegisterFragment : Fragment(R.layout.fragment_register) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.fragment_register, container, false)
        val btnFrag1 = v.findViewById<View>(R.id.btnLogRegister) as Button

        btnFrag1.setOnClickListener{
            val fragment = LoginFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.flFragment,fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        val btn = v.findViewById<View>(R.id.btnRegister) as Button

        btn.setOnClickListener {
            requireActivity().run{
                startActivity(Intent(this, Dashboard::class.java))
            }
        }

        return v
    }

}