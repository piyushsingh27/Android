package com.example.notificationlab;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.NotificationChannel;

public class MainActivity extends Activity {
    Button b1;
    private final String CHANNEL_ID = "personal_notifications";
    private final int NOTIFICATION_ID = 001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotification();
            }
        });
    }



    private void addNotification() {
        createNotificationChannel();
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(this.getResources(),R.mipmap.ic_launcher))
                        .setContentTitle("1747243")
                        .setContentText("My first notification example..........")
                        .setStyle(new NotificationCompat.BigTextStyle()
                            .bigText("My first notification example.........."))
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        Intent notificationIntent = new Intent(this, NotificationView.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }

    private void createNotificationChannel()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            CharSequence name = "Personal Notifications";
            String description = "Include all the personal notifications";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, name, importance);

            notificationChannel.setDescription(description);

//            new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//                    .setLegacyStreamType(AudioManager.STREAM_NOTIFICATION)
//                    .setUsage(AudioAttributes.USAGE_NOTIFICATION_EVENT)
//                    .build();

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
//        {
//            String channelId = "YOUR CHANNEL_ID";
//            NotificationChannel channel = new NotificationChannel(channelId,
//                    "Channel human readable title",
//                    NotificationManager.IMPORTANCE_DEFAULT);
//
//            new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//                    .setLegacyStreamType(AudioManager.STREAM_NOTIFICATION)
//                    .setUsage(AudioAttributes.USAGE_NOTIFICATION_EVENT).build();
//            mNotificationManager.createNotificationChannel(channel);
//            mBuilder.setChannelId(channelId);
//        }
    }



}

