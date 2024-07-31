package com.example.capturadedatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class VerDatosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_datos)

        val tvNombre: TextView = findViewById(R.id.tvNombre)
        val tvApellido: TextView = findViewById(R.id.tvApellido)
        val tvCorreo: TextView = findViewById(R.id.tvCorreo)
        val btnRegresar: Button = findViewById(R.id.btnRegresar)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)

        val nombre = intent.getStringExtra("NOMBRE")
        val apellido = intent.getStringExtra("APELLIDO")
        val correo = intent.getStringExtra("CORREO")

        tvNombre.text = "Nombre: $nombre"
        tvApellido.text = "Apellido: $apellido"
        tvCorreo.text = "Correo Electrónico: $correo"

        btnRegresar.setOnClickListener {
            finish()  // Cierra la actividad actual y regresa a la anterior
        }

        btnBorrar.setOnClickListener {
            tvNombre.text = "Nombre:"
            tvApellido.text = "Apellido:"
            tvCorreo.text = "Correo Electrónico:"
        }
    }
}
