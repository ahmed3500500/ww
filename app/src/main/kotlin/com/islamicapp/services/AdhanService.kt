package com.islamicapp.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import com.islamicapp.R

class AdhanService : Service() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        playAdhan()
        return START_NOT_STICKY
    }

    private fun playAdhan() {
        try {
            mediaPlayer = MediaPlayer.create(this, R.raw.adhan)
            mediaPlayer?.setOnCompletionListener {
                stopSelf()
            }
            mediaPlayer?.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onDestroy() {
        mediaPlayer?.release()
        mediaPlayer = null
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
