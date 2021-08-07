package cmoreno.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import cmoreno.example.swoosh.EXTRA_PLAYER
import cmoreno.example.swoosh.Model.Player
import cmoreno.example.swoosh.R
// import kotlinx.android.synthetic.main.activity_finish.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    //var league = ""
    //r skill = ""
    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER) !! // Se inicializa la variable player
        Toast.makeText(this, player.skill, Toast.LENGTH_SHORT  ).show()

    }// Fin del OnCreate

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }

     fun onBeginnerClick(){
        btnBaller.isChecked = false
    }

    fun onBallerClick(view: View){
        btnCoEdBeg.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClick(view: View){
        btnBaller.isChecked = false
        player.skill = "beginner"

    }

    fun onClickedFinish(view: View){
        if (player.skill != ""){
            val finishActivity = Intent(this,  FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else {
            Toast.makeText(this, "Please Select Skill Level", Toast.LENGTH_SHORT).show()
        }
    }






}// Fin del Activity