package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = mutableListOf<Movie>()
        movies.add(Movie("A", "1"))
        movies.add(Movie("B", "2"))
        movies.add(Movie("C", "3"))
        movies.add(Movie("D", "4"))

        val adapter = MovieAdapter(movies) {
            Toast.makeText(applicationContext, it.title, Toast.LENGTH_SHORT).show()
        }
        recyclerView.adapter = adapter

    }
}