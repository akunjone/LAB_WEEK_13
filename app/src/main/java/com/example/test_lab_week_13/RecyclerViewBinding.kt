package com.example.test_lab_week_13

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.test_lab_week_13.model.Movie

class RecyclerViewBinding {
    companion object{
        @JvmStatic
        @BindingAdapter("list")
        fun bindMovies(view: RecyclerView, movies: List<Movie>?){
            val adapter = view.adapter as MovieAdapter
            adapter.addMovies(movies ?: emptyList())
        }
    }
}

