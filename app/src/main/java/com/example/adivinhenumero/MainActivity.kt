package com.example.adivinhenumero
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val numero = Random.nextInt(1,100);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verificar(view: View) {
        val palpite :Int = ed_palpite.text.toString().toInt()
        if(palpite ==numero){
            Toast.makeText(this,"Acertou!",Toast.LENGTH_SHORT).show();
        }else if(palpite > numero){
            Toast.makeText(this,"Está acima!",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Está abaixo!",Toast.LENGTH_SHORT).show();
        }
    }
}