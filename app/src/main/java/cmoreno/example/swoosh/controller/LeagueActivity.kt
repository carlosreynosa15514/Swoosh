package cmoreno.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import cmoreno.example.swoosh.EXTRA_LEAGUE
import cmoreno.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

//import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    //Varioables
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    } // Fin de onCreate

    // Para usar el onClick se debe poner su funcion afuera del OnCreate es decir hacerla publica.

    fun onMensClicked(view: View) {
        btn_womens.isChecked = false
        btn_coEd.isChecked = false
        selectedLeague = "mens"

    } // Fin de funcion onMensClicked

    fun onWomensClicked(view: View) {
        btn_mens.isChecked = false
        btn_coEd.isChecked = false
        selectedLeague = "womens"

    } // Fin de funcion onWomensClicked

    fun onCoEdClicked(view: View) {
        btn_mens.isChecked = false
        btn_womens.isChecked = false
        selectedLeague = "co-ed"

    } // Fin de funcion onCoEdClicked

    fun leagueNextClick(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else {
            // Usaremos un mensaje breve usando un TOAST
            Toast.makeText(this, "Please select a league",Toast.LENGTH_SHORT).show()
        }

    } // Fin de funcion leagueNextClick





} // Fin de Activity