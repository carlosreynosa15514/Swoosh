package cmoreno.example.swoosh.controller

import android.os.Bundle
import cmoreno.example.swoosh.EXTRA_LEAGUE
import cmoreno.example.swoosh.EXTRA_SKILL
import cmoreno.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for $league $skill league near you ..."
    }
}