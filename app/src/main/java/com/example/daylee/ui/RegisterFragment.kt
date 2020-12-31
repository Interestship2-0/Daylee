package com.example.daylee

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.daylee.ui.MainActivity


class RegisterFragment : Fragment(R.layout.fragment_register) {

    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var password: EditText

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


        init(v)
        val btn = v.findViewById<View>(R.id.btnRegister) as Button

        btn.setOnClickListener {
            requireActivity().run{
                
                if (!validate()) {
                    
                    return@setOnClickListener
                }
                
                startActivity(Intent(this, MainActivity::class.java))
            }
        }

        return v
    }



    private fun validate(): Boolean {
        var isValid = true
        if (name.text.isBlank()) {
            name.error = "Name can't be blank!"
            isValid = false
        }
        if (email.text.isBlank()) {
            email.error = "email can't be blank!"
            isValid = false
        }
        if (password.length() < 8) {
            password.error = "Password should have should be atleast 8 characters!"
            isValid = false
        }


        return isValid
    }

    private fun init(v: View) {
        name = v.findViewById<EditText>(R.id.etName)
        email = v.findViewById<EditText>(R.id.etEmail)
        password = v.findViewById<EditText>(R.id.etPassword)
    }

}