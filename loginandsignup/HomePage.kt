package com.codingstuff.loginandsignup

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HomePage : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

         val pay = findViewById<ImageView>(R.id.pay1)
             pay.setOnClickListener {
               val intent = Intent(this, Payment::class.java)
                   startActivity(intent)
                 Toast.makeText(this, "You clicked on Payment.", Toast.LENGTH_SHORT).show()
               }
         val payment=findViewById<ImageView>(R.id.qrpay)
             payment.setOnClickListener{
                 val intent1= Intent(this,ScannerPay::class.java)
                 startActivity(intent1)
                 Toast.makeText(this,"You clicked on Qr scanner.",Toast.LENGTH_SHORT).show()
             }
        val contact=findViewById<ImageView>(R.id.contacts)
            contact.setOnClickListener{
                val intent2=Intent(this,Contacts::class.java)
                startActivity(intent2)
            }
        val transaction=findViewById<TextView>(R.id.history)
            transaction.setOnClickListener{
            val intent3=Intent(this,TransactionHist::class.java)
            startActivity(intent3)

            }
        val balance=findViewById<TextView>(R.id.bal)
        balance.setOnClickListener{
            val intent4=Intent(this,Balance::class.java)
            startActivity(intent4)
            
        }
      }
 }
