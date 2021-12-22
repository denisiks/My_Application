package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Food

typealias OnFoodClickListener = (Food)->Unit

class FoodAdapter(
    private val foods : List<Food>,
    private val listener: OnFoodClickListener,
    ):RecyclerView.Adapter<FoodAdapter.FoodVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FoodVH(layoutInflater.inflate(R.layout.item_pizza, parent, false), listener)
    }

    override fun onBindViewHolder(holder: FoodVH, position: Int) = holder.bind(foods[position])
    override fun getItemCount(): Int = foods.size

    class FoodVH(view: View, listener: OnFoodClickListener): RecyclerView.ViewHolder(view) {

        private val iconFood = view.findViewById<ImageView>(R.id.imageView2)
        private val nameFood = view.findViewById<TextView>(R.id.textView)
        private val compositionFood = view.findViewById<TextView>(R.id.textView6)

        private lateinit var food: Food

        init {
            view.setOnClickListener { listener(food) }
        }

        fun bind(food: Food) {
            this.food = food
            nameFood.text = food.title
            compositionFood.text = food.composition
            iconFood.setImageResource(food.coverResId)
        }
    }}



