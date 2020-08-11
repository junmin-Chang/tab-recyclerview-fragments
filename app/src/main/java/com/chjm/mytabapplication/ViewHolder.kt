package com.chjm.mytabapplication

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item, parent, false)) {
    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null


    init {
        mTitleView = itemView.findViewById(R.id.list_name)
        mYearView = itemView.findViewById(R.id.list_number)
    }

    fun bind(movie: home) {
        mTitleView?.text = movie.name
        mYearView?.text = movie.number
    }

}
