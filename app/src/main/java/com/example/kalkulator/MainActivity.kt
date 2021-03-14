package com.example.kalkulator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Double


class MainActivity : AppCompatActivity() {
    var angka_pertama: EditText? = null
    var angka_kedua: EditText? = null
    var tambah: Button? = null
    var kurang: Button? = null
    var kali: Button? = null
    var bagi: Button? = null
    var bersihkan: Button? = null
    var hasil: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        angka_pertama = findViewById<View>(R.id.angka_pertama) as EditText
        angka_kedua = findViewById<View>(R.id.angka_kedua) as EditText
        tambah = findViewById<View>(R.id.tambah) as Button
        kurang = findViewById<View>(R.id.kurang) as Button
        kali = findViewById<View>(R.id.kali) as Button
        bagi = findViewById<View>(R.id.bagi) as Button
        bersihkan = findViewById<View>(R.id.bersihkan) as Button
        hasil = findViewById<View>(R.id.hasil) as TextView
        tambah!!.setOnClickListener {
            if (angka_pertama!!.text.length > 0 && angka_kedua!!.text.length > 0) {
                val angka1 = angka_pertama!!.text.toString().toDouble()
                val angka2 = angka_kedua!!.text.toString().toDouble()
                val result = angka1 + angka2
                hasil!!.text = Double.toString(result)
            } else {
                val toast = Toast.makeText(
                    this@MainActivity,
                    "Mohon masukkan Angka pertama & Kedua",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }
        }
        kurang!!.setOnClickListener {
            if (angka_pertama!!.text.length > 0 && angka_kedua!!.text.length > 0) {
                val angka1 = angka_pertama!!.text.toString().toDouble()
                val angka2 = angka_kedua!!.text.toString().toDouble()
                val result = angka1 - angka2
                hasil!!.text = Double.toString(result)
            } else {
                val toast = Toast.makeText(
                    this@MainActivity,
                    "Mohon masukkan Angka pertama & Kedua",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }
        }
        kali!!.setOnClickListener {
            if (angka_pertama!!.text.length > 0 && angka_kedua!!.text.length > 0) {
                val angka1 = angka_pertama!!.text.toString().toDouble()
                val angka2 = angka_kedua!!.text.toString().toDouble()
                val result = angka1 * angka2
                hasil!!.text = Double.toString(result)
            } else {
                val toast = Toast.makeText(
                    this@MainActivity,
                    "Mohon masukkan Angka pertama & Kedua",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }
        }
        bagi!!.setOnClickListener {
            if (angka_pertama!!.text.length > 0 && angka_kedua!!.text.length > 0) {
                val angka1 = angka_pertama!!.text.toString().toDouble()
                val angka2 = angka_kedua!!.text.toString().toDouble()
                val result = angka1 / angka2
                hasil!!.text = Double.toString(result)
            } else {
                val toast = Toast.makeText(
                    this@MainActivity,
                    "Mohon masukkan Angka pertama & Kedua",
                    Toast.LENGTH_LONG
                )
                toast.show()
            }
        }
        bersihkan!!.setOnClickListener {
            angka_pertama!!.setText("")
            angka_kedua!!.setText("")
            hasil!!.text = "0"
            angka_pertama!!.requestFocus()
        }
    }
}