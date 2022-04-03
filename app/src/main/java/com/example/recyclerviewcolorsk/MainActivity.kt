package com.example.recyclerviewcolorsk

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.stream.IntStream.range
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rv = findViewById<RecyclerView>(R.id.rview)
        val colorAdapter = ColorAdapter(LayoutInflater.from(this))
        val colors = generateColors(50)
        colorAdapter.submitList(colors)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = colorAdapter

    }

    private fun generateColors(count: Int): MutableList<Int> {
        val colors = mutableListOf<Int>()
        val rnd = Random(12)
        for (i in 0.rangeTo(count)) {
            colors.add(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)))
        }
        return colors
    }
}