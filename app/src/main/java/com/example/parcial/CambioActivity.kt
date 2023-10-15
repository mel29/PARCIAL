package com.example.parcial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CambioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambio)

        val txtCambio = findViewById<EditText>(R.id.txtCambio)
        val txtMonto = findViewById<EditText>(R.id.txtMonto)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val cambioStr = txtCambio.text.toString()
            val montoStr = txtMonto.text.toString()

            val cambio = cambioStr.toDoubleOrNull()
            val monto = montoStr.toDoubleOrNull()

            if (cambio != null && monto != null) {
                val resultado = cambio * monto
                txtResultado.text = resultado.toString()
            } else {
                txtResultado.text = "Entrada inválida"
            }
        }
    }
}
