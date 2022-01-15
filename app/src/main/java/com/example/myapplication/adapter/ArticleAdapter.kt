
package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Article


typealias OnArticleClickListener = (Article)->Unit

class ArticleAdapter(
        private val articles : List<Article>,
private val listener: OnArticleClickListener,
):RecyclerView.Adapter<ArticleAdapter.ArticleVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ArticleVH(layoutInflater.inflate(R.layout.item_article, parent, false), listener)
    }

    override fun onBindViewHolder(holder: ArticleVH, position: Int) = holder.bind(articles[position])
    override fun getItemCount(): Int = articles.size

    class ArticleVH(view: View, listener: OnArticleClickListener): RecyclerView.ViewHolder(view) {


        private val nameArticle = view.findViewById<TextView>(R.id.Article_name)
        private val textArticle = view.findViewById<TextView>(R.id.article_text)
        private val dateArticle = view.findViewById<TextView>(R.id.article_date)
        private val authorName = view.findViewById<TextView>(R.id.Author)

        private lateinit var article: Article

        init {
            view.setOnClickListener { listener(article) }
        }

        fun bind(article: Article) {
            this.article = article
            nameArticle.text = article.name
            textArticle.text = article.text
            dateArticle.text = article.date
            authorName.text = article.author.name + article.author.lastname
        }
    }}
