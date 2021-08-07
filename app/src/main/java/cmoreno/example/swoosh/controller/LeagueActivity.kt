package cmoreno.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import cmoreno.example.swoosh.EXTRA_PLAYER
import cmoreno.example.swoosh.Model.Player
import cmoreno.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

//import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    //Varioables
    var player = Player("", "")

    // Se crea esta funcion para proteger los datos al cambiar de lado el telefono
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    } // Fin de onCreate

    // Aqui se reciben los datos de la instancia anterior
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }
    
    // Para usar el onClick se debe poner su funcion afuera del OnCreate es decir hacerla publica.

    fun onMensClicked(view: View) {
        btn_womens.isChecked = false
        btn_coEd.isChecked = false
        player.league = "mens"

    } // Fin de funcion onMensClicked

    fun onWomensClicked(view: View) {
        btn_mens.isChecked = false
        btn_coEd.isChecked = false
        player.league = "womens"

    } // Fin de funcion onWomensClicked

    fun onCoEdClicked(view: View) {
        btn_mens.isChecked = false
        btn_womens.isChecked = false
        player.league = "co-ed"

    } // Fin de funcion onCoEdClicked

    fun leagueNextClick(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else {
            // Usaremos un mensaje breve usando un TOAST
            Toast.makeText(this, "Please select a league",Toast.LENGTH_SHORT).show()
        }

    } // Fin de funcion leagueNextClick





} // Fin de Activity