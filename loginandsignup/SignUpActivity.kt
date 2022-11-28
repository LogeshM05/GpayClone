package com.codingstuff.loginandsignup

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val buttonclick= findViewById<Button>(R.id.button)
            buttonclick.setOnClickListener {
                val email=findViewById<TextInputEditText>(R.id.email2).text.toString()
                val pass= findViewById<TextInputEditText>(R.id.pass2).text.toString()
                val confirmPass= findViewById<TextInputEditText>(R.id.confirmPass1).text.toString()

                if(email.isEmpty() && pass.isEmpty() && confirmPass.isEmpty() ) {
                    Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
                }  else {
                        val intent2 = Intent(this, SignInActivity::class.java)
                        startActivity(intent2)
                    }
                }

        val textclick= findViewById<TextView>(R.id.textView)
        textclick.setOnClickListener{
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
            }
        }


