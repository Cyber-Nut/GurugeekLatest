package com.deva.gurugeektutors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TutorAdapter.MyClickIterface{
    RecyclerView recyclerView;
    ArrayList<Tutor> tutors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylerView);
        tutors = new ArrayList<>();

        tutors.add(new Tutor("Akshat Aswal", R.drawable.gyf,"Iske poothe me dikkat hai"));
        tutors.add(new Tutor("Hiten Kala", R.drawable.gyf, "Ye chutiya hai"));
        tutors.add(new Tutor("Saurabh Kumar", R.drawable.gyf, "Ye dom hai"));
        tutors.add(new Tutor("Uma Chauhan", R.drawable.gyf, "Ye cute hai lekin choti hai"));
        tutors.add(new Tutor("Pranavi", R.drawable.gyf, " ye toh shanu bhai ki hai"));
        tutors.add(new Tutor("Manish Negi", R.drawable.gyf,"another sweet boy"));
        tutors.add(new Tutor("Ayush Bisht", R.drawable.gyf, "bdia londa hai"));
        tutors.add(new Tutor("Ayush Ghildiyal", R.drawable.gyf, "ye merse darta hai ptani kyu"));
        tutors.add(new Tutor("Sanjay Pimoli", R.drawable.gyf, "lodu"));
        tutors.add(new Tutor("Rajni Gupta", R.drawable.gyf, "lawdi"));

        TutorAdapter tutorAdapter = new TutorAdapter(tutors, this, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(tutorAdapter);
    }

    @Override
    public void onItemClick(int positonOfTheTutor) {
        Toast.makeText(this, "clicked" +tutors.get(positonOfTheTutor).getTutorName(),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TutorIInformation.class);
        intent.putExtra("image", tutors.get(positonOfTheTutor).getTutorImage());
        intent.putExtra("bio", tutors.get(positonOfTheTutor).getTutorBio());
        startActivity(intent);

    }
}