package br.senai.sp.jandira.everypetspp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cadastro : AppCompatActivity() {

    lateinit var proximaTela: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        proximaTela = findViewById(R.id.btn_login_cadastro_usuario)
        proximaTela.setOnClickListener {
             Trocartela()
      }
    }
    private fun Trocartela(){
        val intent = Intent(this, Localizacao::class.java)
        startActivity(intent)
    }
}

