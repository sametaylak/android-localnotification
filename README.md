# Android Local Notification ( Bildirim )

Android cihazlarda bildirim servisinin nasıl kullanılacağını açıklayan basit bir örnek.

Bildirimimizi oluşturmak için şu kodları MainActivity.java dosyamıza ekliyoruz:
```sh
notification = builder.setContentTitle("Bildirim Başlığı")
                .setContentText("Bildirim İçeriği")
                .setTicker("Yeni mesajınız var!")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();
```
Servisi uygulamaya dahil etmek için MainActivity.java dosyamıza şu satırları ekliyoruz:
```sh
notificationManager =
                (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
```

Son olarak bildirimi tetiklememiz için çağırmamız gereken komut:
```sh
notificationManager.notify(0, notification);
```
