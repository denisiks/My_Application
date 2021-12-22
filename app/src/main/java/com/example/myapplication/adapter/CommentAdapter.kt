package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Comment


typealias OnCommentClickListener = (Comment)->Unit

class CommentAdapter(
        private val comments : List<Comment>,
        private val listener: OnCommentClickListener,
):RecyclerView.Adapter<CommentAdapter.CommentVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CommentVH(layoutInflater.inflate(R.layout.item_comment, parent, false), listener)
    }

    override fun onBindViewHolder(holder: CommentVH, position: Int) = holder.bind(comments[position])
    override fun getItemCount(): Int = comments.size

    class CommentVH(view: View, listener: OnCommentClickListener): RecyclerView.ViewHolder(view) {

        private val iconUser = view.findViewById<ImageView>(R.id.user_photo)
        private val nameUser = view.findViewById<TextView>(R.id.User_name)
        private val textComment = view.findViewById<TextView>(R.id.comments_text)
        private val dateComment = view.findViewById<TextView>(R.id.comment_date)

        private lateinit var comment: Comment

        init {
            view.setOnClickListener { listener(comment) }
        }

        fun bind(comment: Comment) {
            this.comment = comment
            iconUser.setImageResource(comment.user.userIconId)
            nameUser.text = comment.user.nickname
            textComment.text = comment.text
            dateComment.text = comment.date
        }
    }}