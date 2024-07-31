package com.example.capturadedatos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre: EditText = findViewById(R.id.etNombre)
        val etApellido: EditText = findViewById(R.id.etApellido)
        val etCorreo: EditText = findViewById(R.id.etCorreo)
        val btnGuardar: Button = findViewById(R.id.btnGuardar)


        btnGuardar.setOnClickListener {
            // Guardar los datos en un Intent
            val intent = Intent(this, VerDatosActivity::class.java).apply {
                putExtra("NOMBRE", etNombre.text.toString())
                putExtra("APELLIDO", etApellido.text.toString())
                putExtra("CORREO", etCorreo.text.toString())
            }
            startActivity(intent)
        }


    }
}