package cmoreno.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Esta es una manera compacta de llamar a una actividad
        /*
        btnStart.setOnClickListener{
            startActivity(Intent(this,LeagueActivity::class.java))
        }
         */

        // Esta es una manera de llamar a una actividad usando una variable
        // 1. Se declara la variable tipo intent
        // 2. Se usa la variable tipo Intent en una funcion de startActivity
        btnStart.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}