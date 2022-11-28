package com.codingstuff.loginandsignup

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TransactionHist : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transaction_hist)

        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val transaction =findViewById<TextView>(R.id.item)
        var amount3 = sharedPref.getString("amount", null)
        transaction.setText(amount3)
    }
}