package com.codingstuff.loginandsignup

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.codingstuff.loginandsignup.databinding.ActivityPaymentBinding

class Payment : AppCompatActivity() {

    lateinit var binding: ActivityPaymentBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPref.edit()
        var load = findViewById<Button>(R.id.load)
        var pay2 = findViewById<Button>(R.id.pay2)


           load.setOnClickListener() {
                val upi = binding.upiid.text.toString()
                val name = binding.name.text.toString()
                val amount = binding.amount.text.toString()

                editor.apply {
                    putString("upi", upi)
                    putString("name", name)
                    putString("amount", amount)
                    apply()
                }


            pay2.setOnClickListener{
//                var upi = sharedPref.getString("upi", null)
//                var name = sharedPref.getString("name", null)
//                var amount = sharedPref.getString("amount", null)

//                binding.tvUpi.text= upi
//                upi = upi.toString()
//                binding.tvname.text = name
//                name = name.toString()
//                binding.tvamount.text = amount


                //amount = amount.toString()


                var intent = Intent(this,PaymentProcessing::class.java)
//                var bundle: Bundle = Bundle();
//                bundle.putString("upi",upi)
//                bundle.putString("name",name)
//                bundle.putString("amount",amount)
//                intent.putExtras(bundle)
                startActivity(intent)
            }


        }
    }
}
