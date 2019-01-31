package com.mca.majorl3oat.lab11;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.NotificationChannel;

public class MainActivity extends AppCompatActivity {

    private NotificationCompat.Builder mNotiBuilder;
    private NotificationManager mNotiManager;
    private static final int NOTI_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notiBTClicked(View view) {
        Intent notiIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                NOTI_ID, notiIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","pongrapee.attasaranya@mca.christuniverisy.in", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Greeting Pongrapee!");
        PendingIntent emailPendingIntent = PendingIntent.getActivity(this, NOTI_ID,
                emailIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "9538183799"));
        PendingIntent callPendingIntent = PendingIntent.getActivity(this, NOTI_ID,
                callIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        mNotiManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        mNotiBuilder = new NotificationCompat.Builder(this)
                .setContentTitle("Pongrapee Attasaranya")
                .setContentText("1747244, 4MCA")
                .setContentIntent(pendingIntent)
                .addAction(R.drawable.sms, getResources().getString(R.string.text_str), emailPendingIntent)
                .addAction(R.drawable.like, getResources().getString(R.string.like_str), callPendingIntent)
                .setSmallIcon(R.drawable.logo)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            String channelId = "YOUR_CHANNEL_ID";
//            NotificationChannel channel = new NotificationChannel(channelId,
//                    "Channel human readable title",
//                    NotificationManager.IMPORTANCE_DEFAULT);
//            //channel.setSound(Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.mocking_whistle),
//            new AudioAttributes.Builder().setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//                    .setLegacyStreamType(AudioManager.STREAM_NOTIFICATION)
//                    .setUsage(AudioAttributes.USAGE_NOTIFICATION_EVENT).build());
//            mNotificationManager.createNotificationChannel(channel);
//            mBuilder.setChannelId(channelId);
//
//        }

        Notification myNotification = mNotiBuilder.build();
        mNotiManager.notify(NOTI_ID, myNotification);
    }
}
