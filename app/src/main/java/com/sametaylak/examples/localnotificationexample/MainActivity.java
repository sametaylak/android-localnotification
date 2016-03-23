package com.sametaylak.examples.localnotificationexample;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNotify;
    Notification notification;
    NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotify = (Button)findViewById(R.id.btnNotify);

        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this);

        notification = builder.setContentTitle("Bildirim Başlığı")
                .setContentText("Bildirim İçeriği")
                .setTicker("Yeni mesajınız var!")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();

        notificationManager =
                (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        btnNotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationManager.notify(0, notification);
            }
        });
    }
}
