package br.senai.sp.jandira.everypetspp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrarPet : AppCompatActivity() {
    lateinit var  proximaTela: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar_pet)

        proximaTela = findViewById(R.id.btn_registrar_pet)
        proximaTela.setOnClickListener {
            Trocartela()
        }
    }
    private fun Trocartela(){
        val intent = Intent(this, CadastroComAnimalSalvo::class.java)
        startActivity(intent)
    }
}

//class MainActivity : AppCompatActivity() {
//
//    lateinit var edCrieSuaConta: TextView btn_registrar_pet
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        edCrieSuaConta = findViewById(R.id.ed_criar_conta)
//
////        edCrieSuaConta.setOnClickListener {
//            Trocartela()
//        }
//
//    }
//
//    private fun Trocartela(){
//        val intent = Intent(this, CadastroEmail::class.java)
//        startActivity(intent)
//    }
//}