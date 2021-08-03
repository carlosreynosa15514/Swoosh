package cmoreno.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_person.*

class PersonActivity : BaseActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
        Toast.makeText(this, league, Toast.LENGTH_SHORT  ).show()

        // Accion del boton Co-Ed Beginner
        btnCoEdBeg.setOnClickListener{
                startActivity(Intent(this, CoEdLooking::class.java))
        }

        // Accion del boton Finish
        btnFinish.setOnClickListener {
            val finish = Intent(this, WelcomeActivity::class.java)
            startActivity(finish)
        }
    }
}