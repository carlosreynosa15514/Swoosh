package cmoreno.example.swoosh.controller

import android.annotation.SuppressLint
import android.os.Bundle
import cmoreno.example.swoosh.EXTRA_PLAYER
import cmoreno.example.swoosh.Model.Player
import cmoreno.example.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player?.league} ${player?.skill} league near you ..."
    }
}