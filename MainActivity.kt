package com.example.imageviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imgs = arrayOf(R.drawable.car,R.drawable.giraffe,R.drawable.edward)
        val imgName = arrayOf("car","Giraffe","Edward")
        var img: ImageView = findViewById(R.id.imgV)

        img.setImageResource(imgs[randNumber(imgs.size)])
        var text: TextView = findViewById(R.id.textView)
        text.setText(imgName[randNumber(imgs.size)])
        val button: Button = findViewById(R.id.Btn)

        button.setOnClickListener {
            var n: Int = randNumber(imgs.size)
            img.setImageResource(imgs[n])
            text.setText(imgName[n])
        }
    }
}

private fun randNumber(imgs: Int): Int{
    return Random.nextInt(imgs)
}