package com.example.ppb_20102175_05_recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.ppb_20102175_05_recyclerview.databinding.ActivityDetail2Binding

class DetailActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityDetail2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetail2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val nim = intent.getStringExtra("nim")
        val nama = intent.getStringExtra("nama")
        val telepon = intent.getStringExtra("telepon")
        val foto = intent.getStringExtra("foto")

        binding.txtNim.text = nim
        binding.txtNama.text = nama
        binding.txtNotelp.text = telepon
        Glide.with(this).load(foto).into(binding.images)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed ()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}