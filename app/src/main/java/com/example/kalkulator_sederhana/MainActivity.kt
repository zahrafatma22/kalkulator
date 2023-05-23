package com.example.kalkulator_sederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulator_sederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnPlus.setOnClickListener {
            tambah()
        }
        binding.btnMin.setOnClickListener {
            kurang()
        }
        binding.btnKali.setOnClickListener {
            kali()
        }
        binding.btnBagi.setOnClickListener {
            bagi()
        }
        binding.btnHapus.setOnClickListener {
            clear()
        }
        setContentView(binding.root)
    }
    private fun tambah(){
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var hasil  = angka1 + angka2
        binding.tvHasil.text = "${angka1} + ${angka2} = ${hasil}"
    }
    private fun kurang(){
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var hasil  = angka1 - angka2
        binding.tvHasil.text = "${angka1} - ${angka2} = ${hasil}"
    }
    private fun kali(){
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var hasil  = angka1 * angka2
        binding.tvHasil.text = "${angka1} * ${angka2} = ${hasil}"
    }
    private fun bagi(){
        var angka1 = binding.etAngka1.text.toString().toInt()
        var angka2 = binding.etAngka2.text.toString().toInt()
        var hasil  = (angka1 / angka2).toDouble()
        binding.tvHasil.text = "${angka1} / ${angka2} = ${hasil}"
    }
    private fun clear(){
        binding.etAngka1.text.clear()
        binding.etAngka2.text.clear()
        binding.tvHasil.text = "hasil"

    }
}