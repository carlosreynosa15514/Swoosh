package cmoreno.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.Toast
import cmoreno.example.swoosh.EXTRA_LEAGUE
import cmoreno.example.swoosh.EXTRA_SKILL
import cmoreno.example.swoosh.R
// import kotlinx.android.synthetic.main.activity_finish.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
        Toast.makeText(this, league, Toast.LENGTH_SHORT  ).show()

    }// Fin del OnCreate

    fun onBeginnerClick(){
        btnBaller.isChecked = false
    }

    fun onBallerClick(view: View){
        btnCoEdBeg.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View){
        btnBaller.isChecked = false
        skill = "beginner"

    }

    fun onClickedFinish(view: View){
        if (skill != ""){
            val finishActivity = Intent(this,  FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,  league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }else {
            Toast.makeText(this, "Please Select Skill Level", Toast.LENGTH_SHORT).show()
        }

    }






}// Fin del Activity