package com.rahmat.intentsprojek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_baru.*

class activity_baru : AppCompatActivity() {

    private lateinit var view_nim  : TextView
    private lateinit var view_nama : TextView
    private lateinit var view_nilai: TextView
    private lateinit var view_grade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baru)

        view_nim= findViewById(R.id.hasil_nim)
        view_nama = findViewById(R.id.hasil_nama)
        view_nilai= findViewById(R.id.hasil_nilai)
        view_grade= findViewById(R.id.hasil_grade)

        supportActionBar?.title="Data Mahasiswa"

        view_nim.setText(intent.getStringExtra("data_nim"))
        view_nama.setText(intent.getStringExtra("data_nama"))
        view_nilai.setText(intent.getStringExtra("data_nilai"))
//        grade_nilai.setText(intent.getStringExtra("data_ket"))
        if (intent.getStringExtra("data_grade").toInt()>=80){
            hasil_grade.text = "A"
        }else if ((intent.getStringExtra("data_grade").toInt()>=60)){
            hasil_grade.text = "B"
        }else if((intent.getStringExtra("data_grade").toInt()>=40)){
            hasil_grade.text = "C"
        }else if((intent.getStringExtra("data_grade").toInt()>=20)){
            hasil_grade.text = "D"
        }else if((intent.getStringExtra("data_grade").toInt()>=0)){
            hasil_grade.text = "E"
        }
        button_back.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}