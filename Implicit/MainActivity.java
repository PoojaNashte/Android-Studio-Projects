package com.example.implicit;  // ⚠️ change to your package name

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnDial, btnAmazon, btnMaps, btnGallery, btnLinkedIn, btnYoutube, btnInstagram, btnSnapchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // ✅ Correct Layout

        btnDial = findViewById(R.id.btnDial);
        btnAmazon = findViewById(R.id.btnAmazon);
        btnMaps = findViewById(R.id.btnMaps);
        btnGallery = findViewById(R.id.btnGallery);
        btnLinkedIn = findViewById(R.id.btnLinkedIn);
        btnYoutube = findViewById(R.id.btnYoutube);
        btnInstagram = findViewById(R.id.btnInstagram);
        btnSnapchat = findViewById(R.id.btnSnapchat);

        // 📞 Dial with number already filled
        btnDial.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:97305566695"));
            startActivity(intent);
        });

        // 🌐 Amazon
        btnAmazon.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.amazon.in"));
            startActivity(intent);
        });

        // 🗺 Google Maps
        btnMaps.setOnClickListener(v -> {
            Uri mapUri = Uri.parse("geo:0,0?q=Kolhapur");
            Intent intent = new Intent(Intent.ACTION_VIEW, mapUri);
            startActivity(intent);
        });

        // 🖼 Gallery
        btnGallery.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK,
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivity(intent);
        });

        // 💼 LinkedIn
        btnLinkedIn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com"));
            startActivity(intent);
        });

        // ▶ YouTube
        btnYoutube.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com"));
            startActivity(intent);
        });

        //Instagram
        btnInstagram.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com"));
            startActivity(intent);
        });

        //Snapchat
        btnSnapchat.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.snapchat.com"));
            startActivity(intent);
        });
    }
}