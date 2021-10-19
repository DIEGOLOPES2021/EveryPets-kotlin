package br.senai.sp.jandira.everypetspp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Localizacao : AppCompatActivity() {
    lateinit var  proximaTela: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localizacao)

        proximaTela = findViewById(R.id.btn_localizacao)
        proximaTela.setOnClickListener {
            Trocartela()
        }
    }
    private fun Trocartela(){
        val intent = Intent(this, RegistrarPet::class.java)
        startActivity(intent)
    }
}

