package com.deva.gurugeektutors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TutorIInformation extends AppCompatActivity {
    ImageView img;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_iinformation);
        img = findViewById(R.id.imgcircledtutor);
       txt = findViewById(R.id.tutorBio);
        Intent intent = getIntent();

        img.setImageResource(intent.getIntExtra("image", R.drawable.ic_launcher_background));
        txt.setText((intent.getStringExtra("bio")));


    }
}