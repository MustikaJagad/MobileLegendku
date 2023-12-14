package com.dicoding.mobilelegend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar!!.title = "Deskripsi Hero"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val hero =intent.getParcelableExtra<Hero>(MainActivity.INTENT_PARCELABLE)

        val imgHero = findViewById<ImageView>(R.id.img_item_photo)
        val nameHero = findViewById<TextView>(R.id.tv_item_name)
        val desHero = findViewById<TextView>(R.id.tv_item_description)

        imgHero.setImageResource(hero?.imgHero!!)
        nameHero.text = hero.nameHero
        desHero.text = hero.desHero


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}