package com.example.mad_practical_7_21012011050

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button : FloatingActionButton = findViewById(R.id.floatingActionButton)
        button.setOnClickListener {
            Intent(this@MainActivity, YoutubeActivity::class.java).also {
                startActivity(it) }
        }
        val myVideoview : VideoView = findViewById(R.id.Video1)

        val mediaController = MediaController( this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoview)
        myVideoview.setVideoURI(uri)
        myVideoview.requestFocus()
        myVideoview.start()


    }


}
