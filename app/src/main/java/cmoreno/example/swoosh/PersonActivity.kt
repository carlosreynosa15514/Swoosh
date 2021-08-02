package cmoreno.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_person.*

class PersonActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

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