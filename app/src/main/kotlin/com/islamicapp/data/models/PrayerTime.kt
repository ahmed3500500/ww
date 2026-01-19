package com.islamicapp.data.models

data class PrayerTime(
    val name: String,
    val time: String,
    val timestamp: Long
)

data class PrayerTimes(
    val fajr: String,
    val sunrise: String,
    val dhuhr: String,
    val asr: String,
    val maghrib: String,
    val isha: String,
    val date: String,
    val hijriDate: String
)
