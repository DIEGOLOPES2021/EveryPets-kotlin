package br.senai.sp.jandira.everypetspp

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import java.util.*

class Cadastro : AppCompatActivity() {

    lateinit var proximaTela: Button
    lateinit var calendarioEdit: EditText
    lateinit var voltar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        calendarioEdit= findViewById(R.id.ed_data_nascimento)

        proximaTela = findViewById(R.id.btn_login_cadastro_usuario)
        proximaTela.setOnClickListener {
             Trocartela()
      }
        val calendario = Calendar.getInstance()//***************
        val ano = calendario.get(Calendar.YEAR)//***************
        val mes = calendario.get(Calendar.MONTH)//***************
        val dia = calendario.get(Calendar.DAY_OF_MONTH)//***************

        calendarioEdit.setOnClickListener {
    val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, _ano, _mes, _dia ->
                var diaZero = "$_dia"
                var mesZero = "$_mes"

                if (_dia < 10) {
                    diaZero = "0$_dia"
                }

                if (_mes < 9) {
                    mesZero = "0${_mes + 1}"
                }
                calendarioEdit.setText("$diaZero/$mesZero/$_ano")
            }, ano, mes, dia
    )
    dpd.show()
}
        voltar = findViewById(R.id.ed_sair)
        voltar.setOnClickListener {
            val intent = Intent(this, CadastroEmail::class.java)
            startActivity(intent)
        }
    }
    private fun Trocartela(){
        val intent = Intent(this, Localizacao::class.java)
        startActivity(intent)
    }
}

//val calendario = Calendar.getInstance()//***************
//val ano = calendario.get(Calendar.YEAR)//***************
//val mes = calendario.get(Calendar.MONTH)//***************
//val dia = calendario.get(Calendar.DAY_OF_MONTH)//***************
//
//// Abrir um componente DatePickerDialog
//et_data_nascimento.setOnClickListener {
//    val dpd = DatePickerDialog(
//            this,
//            DatePickerDialog.OnDateSetListener { view, _ano, _mes, _dia ->
//                var diaZero = "$_dia"
//                var mesZero = "$_mes"
//
//                if (_dia < 10) {
//                    diaZero = "0$_dia"
//                }
//
//                if (_mes < 9) {
//                    mesZero = "0${_mes + 1}"
//                }
//                et_data_nascimento.setText("$diaZero/$mesZero/$_ano")
//            }, ano, mes, dia
//    )
//    dpd.show()
//}
