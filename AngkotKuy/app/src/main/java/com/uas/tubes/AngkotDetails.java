package com.uas.tubes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AngkotDetails extends AppCompatActivity {

    ArrayList<AngkotDetails> angkotDipilih;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkot_details);
        TextView angkotDetail = (TextView) findViewById(R.id.place_detail);
        TextView angkotLocation = (TextView) findViewById(R.id.place_location);
        ImageView angkotGambar = (ImageView) findViewById(R.id.imageFoto);

        Intent intent = getIntent();
        String judul = intent.getStringExtra("judul");
        String deskripsi = intent.getStringExtra("deskripsi");
        String foto = intent.getStringExtra("foto");
        String detail = intent.getStringExtra("detail");
        angkotGambar.setImageURI(Uri.parse(foto));
        angkotDetail.setText(deskripsi);
        angkotLocation.setText(detail);

        setTitle(judul);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         if (item.getItemId() == android.R.id.home) {
            onBackPressed();
             return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
