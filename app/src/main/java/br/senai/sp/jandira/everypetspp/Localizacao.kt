package br.senai.sp.jandira.everypetspp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Localizacao : AppCompatActivity() {
    lateinit var  proximaTela: Button
    lateinit var voltar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localizacao)

        proximaTela = findViewById(R.id.btn_localizacao)
        proximaTela.setOnClickListener {
            Trocartela()
        }
        voltar = findViewById(R.id.ed_sair)
        voltar.setOnClickListener {
            val intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
    }
    private fun Trocartela(){
        val intent = Intent(this, RegistrarPet::class.java)
        startActivity(intent)
    }
}

