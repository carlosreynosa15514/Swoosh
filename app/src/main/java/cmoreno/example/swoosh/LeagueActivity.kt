package cmoreno.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        // para no hacer este paso, se puede crear una funcion publica o sea fuera del OnCreate
//        btn_next.setOnClickListener{
//                startActivity(Intent(this, PersonActivity::class.java))
//        }
    }

    // Para usar el onClick se debe poner su funcion afuera del OnCreate es decir hacerla publica.
    fun leagueNextClick(view: View) {
        val skillActivity = Intent(this, PersonActivity::class.java)
        startActivity(skillActivity)
    }
}