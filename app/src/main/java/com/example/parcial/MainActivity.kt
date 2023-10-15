package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val password = findViewById<EditText>(R.id.password)
        val btnSignin = findViewById<Button>(R.id.btnSignin)

        btnSignin.setOnClickListener {
            val email = txtEmail.text.toString()
            val pass = password.text.toString()

            if (email == "admin@multiapp.com" && pass == "multiapp123") {

                val intent = Intent(this, CambioActivity::class.java)
                startActivity(intent)
            } else {

                Toast.makeText(this, "Credenciales inválidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
