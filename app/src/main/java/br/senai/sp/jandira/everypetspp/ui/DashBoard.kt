package br.senai.sp.jandira.everypetspp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import androidx.core.text.isDigitsOnly
import androidx.fragment.app.Fragment
import br.senai.sp.jandira.everypetspp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashBoard : AppCompatActivity(), View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var  buttonHome: Button
    private lateinit var  buttonPerfil: Button
    private lateinit var  buttonCarrinho: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var perfilFragment: PerfilFragment
    private lateinit var carrinhoFragment: CarrinhoFragment

    //

    private lateinit var  bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dash_board)

        buttonHome= findViewById(R.id.button_home)
        buttonHome.setOnClickListener(this)

        buttonPerfil= findViewById(R.id.button_perfil)
        buttonPerfil.setOnClickListener(this)

        buttonCarrinho= findViewById(R.id.button_carrinho)
        buttonCarrinho.setOnClickListener(this)

        homeFragment = HomeFragment()
        perfilFragment = PerfilFragment()
        carrinhoFragment = CarrinhoFragment()

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemReselectedListener(this)
        //
        setFragment(homeFragment)

    }

    private fun setFragment(fragment: Fragment){

        val fragmentTrasaction = //gerencia os fragmentos/ transacoes
         supportFragmentManager.beginTransaction()
        fragmentTrasaction.replace(R.id.frame_fragments, fragment)
        //faz a acontecer
        fragmentTrasaction.commit()

    }

    override fun onClick(v: View) {
     when (v.id){
         R.id.button_home ->{
            setFragment(homeFragment)
         }
         R.id.button_perfil ->{
             setFragment(perfilFragment)
         }
         R.id.button_carrinho ->{
             setFragment(carrinhoFragment)
         }
     }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
      when(item.itemId){
          R.id.button_home ->{
              setFragment(homeFragment)
          }
          R.id.button_perfil ->{
              setFragment(perfilFragment)
          }
          R.id.button_carrinho ->{
              setFragment(carrinhoFragment)
          }
      }
        return true
    }


}