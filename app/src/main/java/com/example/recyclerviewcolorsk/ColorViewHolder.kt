package com.example.recyclerviewcolorsk

import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // получаем ссылку на текстовое поле в каждом элементе списка
    val tv = itemView.findViewById<TextView>(R.id.color)

    // TODO: добавить обработку нажатия на элемент списка (вывести Toast с кодом цвета)
    // совет: использовать блок init { }
    init {
        itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(itemView.context, tv.text, Toast.LENGTH_SHORT).show()
            }
        })
    }

    fun bindTo(color: Int) {
        tv.setBackgroundColor(color)
        // вывод кода цвета в 16-ричном виде
        tv.text = itemView.context.getString(R.string.template, color)
    }
}
