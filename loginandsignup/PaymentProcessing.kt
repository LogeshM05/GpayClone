package com.codingstuff.loginandsignup

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.codingstuff.loginandsignup.databinding.ActivityPaymentBinding

class PaymentProcessing : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_processing)
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val upi=findViewById<TextView>(R.id.upi1)
        val name=findViewById<TextView>(R.id.name1)
        val amount=findViewById<TextView>(R.id.amount1)

        var upi2 = sharedPref.getString("upi", null)
        var name2 = sharedPref.getString("name", null)
        var amount2 = sharedPref.getString("amount", null)

        upi.setText(upi2)
        name.setText(name2)
        amount.setText(amount2)

        var button= findViewById<Button>(R.id.button2)
            button.setOnClickListener {
                val intent = Intent(this, HomePage::class.java)
                startActivity(intent)
            }

    }
}