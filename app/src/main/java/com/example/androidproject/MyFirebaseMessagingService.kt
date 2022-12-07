package com.example.androidproject

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.androidproject.activity.MainActivity
import com.example.androidproject.activity.detailta
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

val CHANNEL_ID = "channelID"
val CHANNEL_NAME = "com.example.androidproject"
val NOTIFICATION_ID = 0

class MyFirebaseMessagingService : FirebaseMessagingService(){


    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        if(remoteMessage.getNotification() != null){
            generateNotification(remoteMessage.notification!!.title!!,remoteMessage.notification!!.body!!)
    }
    }

    @SuppressLint("RemoteViewLayout")
    fun getRemoteView(title: String, message: String) : RemoteViews{
        val remoteView = RemoteViews("com.example.androidproject", R.layout.activity_maincontent)
        remoteView.setTextViewText(R.id.tvWhat,title)
        remoteView.setTextViewText(R.id.deskripsi,message)
        remoteView.setImageViewResource(R.id.ivEmoji, R.drawable.ic_baseline_notifications_24)

        return remoteView
    }

    fun generateNotification(title: String, message :String){
        val intent = Intent(this, MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
        }

        var builder : NotificationCompat.Builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(androidx.core.R.drawable.notification_icon_background)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)

        builder = builder.setContent(getRemoteView(title,message))

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationChannel = NotificationChannel(CHANNEL_ID,CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT)
            notificationManager.createNotificationChannel(notificationChannel)

            }


        notificationManager.notify(0, builder.build())
        }


    }
