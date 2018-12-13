package com.example.sarise.prova2_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingBar = findViewById<RatingBar>(R.id.rbFelicidade)
        if (ratingBar != null) {
            val button = findViewById<Button>(R.id.btSubmit)
            button?.setOnClickListener {
                if (rbFelicidade.rating <= 2F){

                    val msg = "Vai ficar tudo bem :)"
                    Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()

                    txtResultado.text = ratingBar.rating.toString()

                }

                else  if (rbFelicidade.rating > 4F) {
                    val msg = "Que bom que vc está bem!!! :)"
                    Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()

                    txtResultado.text = ratingBar.rating.toString()

                }
                else {
                    val msg = "Vc está + ou - ... O que vc poderia fazer pra estar melhor?"
                    Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()

                    txtResultado.text = ratingBar.rating.toString()
                }


            }
        }

    }




}
