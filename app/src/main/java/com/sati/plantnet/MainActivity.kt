package com.sati.plantnet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickCamera (view: View) {
        val intent = Intent((MediaStore.ACTION_IMAGE_CAPTURE))
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}