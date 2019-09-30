package com.example.appbiodata;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mail_btn,telp_btn,map_btn,ikuti_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail_btn = (TextView) findViewById(R.id.mail);
        telp_btn = (TextView) findViewById(R.id.telp);
        map_btn = (TextView) findViewById(R.id.map);
        ikuti_btn = (TextView) findViewById(R.id.ikut);

        mail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, "irfandanisyahputra@gmail.com");
                startActivity(Intent.createChooser(intent, "Send Mail..."));

            }
        });

        telp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(android.content.Intent.ACTION_DIAL);
                Intent.setData(Uri.parse("tel:+6289668856705"));
                startActivity(Intent);

            }
        });

        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("https://www.google.co.id/maps/place/Jl.+Parang+Barong+II+No.2,+Tlogosari+Kulon,+Kec.+Pedurungan,+Kota+Semarang,+Jawa+Tengah+50196/@-6.9824193,110.4567728,17z/data=!3m1!4b1!4m5!3m4!1s0x2e708ccf0a0bdf15:0x4af22ccca6042947!8m2!3d-6.9824193!4d110.4589615"));
                startActivity(Intent);

            }
        });

        ikuti_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("https://steamcommunity.com/id/Rimry/"));
                startActivity(Intent);

            }
        });
    }
}
