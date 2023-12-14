package com.dicoding.mobilelegend

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class HeroAdapter(private val context: Context, private val hero: List<Hero>, val listener: (Hero) -> Unit)
    : RecyclerView.Adapter<HeroAdapter.HeroViewHolder>(){

    class HeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgHero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameHero = view.findViewById<TextView>(R.id.tv_item_name)
        val desHero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(hero: Hero,listener: (Hero) -> Unit){
            imgHero.setImageResource(hero.imgHero)
            nameHero.text = hero.nameHero
            desHero.text = hero.desHero
            itemView.setOnClickListener {
                listener(hero)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        return HeroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_row_hero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        holder.bindView(hero[position], listener)
    }

    override fun getItemCount(): Int = hero.size
    }