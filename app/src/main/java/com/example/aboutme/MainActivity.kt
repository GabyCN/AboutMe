package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        /*findViewById<Button>(R.id.btnDone).setOnClickListener {
            addNickname(it)
        }*/

        binding.btnDone.setOnClickListener {
            addNickname(it)
        }
    }

   /* private fun addNickname (view: View) {
        val editText= findViewById<EditText>(R.id.etNickname)
        val nicknameTextView= findViewById<TextView>(R.id.tvNickname)

            nicknameTextView.text=editText.text
            editText.visibility=View.GONE
            view.visibility=View.GONE
            nicknameTextView.visibility=View.VISIBLE


        val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }*/

    private fun addNickname (view: View){
        binding.apply {
           tvNickname.text = binding.etNickname.text
           invalidateAll()
           etNickname.visibility = View.GONE
           btnDone.visibility = View.GONE
           tvNickname.visibility = View.VISIBLE

        }

        val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }

}
