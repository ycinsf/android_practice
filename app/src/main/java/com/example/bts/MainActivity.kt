package com.example.bts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. 화면이 클릭 되었다는 것을 알야야함(프로그램이)
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener{
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()
        }
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        //2. 다음화면으로 넘어가서 사진을 보여줌
    }
}