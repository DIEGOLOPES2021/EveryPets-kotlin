package br.senai.sp.jandira.everypetspp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CadastroEmail : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_email)

        button = findViewById(R.id.btn_login_cadastro_email)
        button.setOnClickListener {
           Trocartela()
       }
    }
    private fun Trocartela(){
      val intent = Intent(this, Cadastro::class.java)
      startActivity(intent)
   }
}
