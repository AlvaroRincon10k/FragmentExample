package com.example.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRed.setOnClickListener{ replaceFragment(RedFragment())}
        btnBlue.setOnClickListener{ replaceFragment(BlueFragment())}
    }

    override fun onClickFragmentButton() {
        Toast.makeText(this, "El boton azul ha sido pulsado", Toast.LENGTH_SHORT).show()
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentConatiner, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}