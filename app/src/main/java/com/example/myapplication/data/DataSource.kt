package com.example.myapplication.data


import com.example.myapplication.R
import com.example.myapplication.model.*
import java.util.*

object DataSource {


    private val author1 = Author("AA","AAA")
        val foods = listOf(
        Food("Пепперони",  "Состав: Пикантная пепперони, увеличенная порция моцареллы, томатный соус", R.drawable.pizza_1,
                author1,"", comments = listOf()),
        Food("Маргарита",  "Состав: Увеличенная порция моцареллы, томаты, итальянские травы, томатный соус", R.drawable.pizza_3,
                author1,"", comments = listOf()),
        Food("Гавайская",  "Состав: Ветчина, ананасы, моцарелла, томатный соус", R.drawable.pizza_2,
                author1,"", comments = listOf()),
        Food("Цыпленок барбекю",  "Состав: Цыпленок, бекон, соус барбекю, красный лук, моцарелла, томатный соус", R.drawable.pizza_4,
                author1,"", comments = listOf()),
        Food("Четыре сыра",  "Состав: Сыр блю чиз, сыры чеддер и пармезан, моцарелла, соус альфредо", R.drawable.pizza_5,
                author1,"", comments = listOf()),
        Food("Мясная",  "Состав: Цыпленок, ветчина, пикантная пепперони, острая чоризо, моцарелла, томатный соус", R.drawable.pizza_6,
                author1,"", comments = listOf()),
        )
    val articles = listOf(
        Article("Кешбэк 10% за заказы навынос","Начислим двойные бонусы за заказ навынос в приложении, на сайте или по телефону. Акция действует по 18 апреля 2022 года.",
                "13.12.2021", author1),
        Article("Дарим пиццу Цыпленок Барбекю","Пицца Цыпленок Барбекю 25 см в подарок при заказе от 899 рублей по промокоду Bar899 Пицца Цыпленок Барбекю 30 см в подарок при заказе от 1399 рублей по промокоду Bar1399 Пицца Цыпленок Барбекю 35 см в подарок при заказе от 1899 рублей по промокоду Bar1899",
                "4.10.2021", author1),
        Article("Подарок в день рождения","Придите к нам в свой день рождения и получите бесплатную пиццу",
                "25.11.2021", author1)
    )
    val comments = listOf(
        Comment(User(R.drawable.ic_baseline_account_circle_24,"Azazin"),"20.12.2021","The best pizza in the world"),
        Comment(User(R.drawable.ic_baseline_account_circle_24,"Brawler2010"),"12.12.2021","FUUUUU"),
        Comment(User(R.drawable.ic_baseline_account_circle_24,"Capitan*****"),"4.11.2021","Top!")
    )

}