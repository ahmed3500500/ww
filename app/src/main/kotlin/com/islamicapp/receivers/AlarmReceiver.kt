package com.islamicapp.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.islamicapp.services.AdhanService
import com.islamicapp.services.NotificationService

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val prayerName = intent.getStringExtra("prayer_name") ?: return
        val prayerTime = intent.getStringExtra("prayer_time") ?: return

        // إرسال إشعار
        val notificationService = NotificationService(context)
        notificationService.sendPrayerNotification(prayerName, prayerTime)

        // تشغيل الأذان
        val adhanIntent = Intent(context, AdhanService::class.java)
        context.startService(adhanIntent)
    }
}
