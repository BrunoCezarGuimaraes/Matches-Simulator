package me.start.simulator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import me.start.simulator.databinding.ActivityDetailBinding
import me.start.simulator.domain.Match

class DetailActivity : AppCompatActivity() {

    object Extras {
        const val MATCH = "EXTRA_MATCH"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadMatchFromExtra()
    }

    private fun loadMatchFromExtra() {
        intent?.extras?.getParcelable<Match>(Extras.MATCH)?.let {
            Glide.with(this).load(it.place.image).into(binding.ivPlace)
            supportActionBar?.title = it.place.name

            binding.tvDescription.text = it.descripton

            Glide.with(this).load(it.TeamOne.image).into(binding.ivTeamOne)
            binding.tvTeamOneName.text = it.TeamOne.name
            binding.rbTeamOneStar.rating = it.TeamOne.stars.toFloat()
            if (it.TeamOne.score != null) {
                binding.tvTeamOneScore.text = it.TeamOne.score.toString()
            }

            Glide.with(this).load(it.TeamTwo.image).into(binding.ivTeamTwo)
            binding.tvTeamTwoName.text = it.TeamTwo.name
            binding.rbTeamTwoStar.rating = it.TeamTwo.stars.toFloat()
            if (it.TeamTwo.score != null) {
                binding.tvTeamTwoScore.text = it.TeamTwo.score.toString()
            }
        }
    }
}