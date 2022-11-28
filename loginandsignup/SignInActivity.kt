package com.codingstuff.loginandsignup

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val buttonclick = findViewById<Button>(R.id.button1)
        buttonclick.setOnClickListener {
            var email = findViewById<TextInputEditText>(R.id.email1).text.toString()
            var pass = findViewById<TextInputEditText>(R.id.pass1).text.toString()

            if(email.isEmpty()&& pass.isEmpty()) {
                Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()

            } else {
                val intent = Intent(this, HomePage::class.java)
                startActivity(intent)
            }
        }

        val textclick = findViewById<TextView>(R.id.textView)
        textclick.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
