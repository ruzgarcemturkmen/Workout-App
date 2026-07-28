package com.example.workoutapp.Activity;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.workoutapp.Adapter.WorkoutAdapter;
import com.example.workoutapp.Domain.Lession;
import com.example.workoutapp.Domain.Workout;
import com.example.workoutapp.R;
import com.example.workoutapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    binding.view1.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false));
    binding.view1.setAdapter(new WorkoutAdapter(getData()));
    }

    private ArrayList<Workout> getData(){
        ArrayList<Workout> list = new ArrayList<>();

        list.add(new Workout("Running","You just woke up. It is a brand new day. The canvas is blank. how do you begin? Take 21 minutes to cultivate a peaceful mind  and strong body","pic_1",160,"9 min",getLession_1()));
   list.add(new Workout("Strectching","You just woke up. It is a brand new day. The canvas is blank. how do you begin? Take 21 minutes to cultivate a peaceful mind  and strong body","pic_2",230,"85 min",getLession_2()));
    list.add(new Workout("Yoga","You just woke up. It is a brand new day. The canvas is blank. how do you begin? Take 21 minutes to cultivate a peaceful mind  and strong body","pic_3",180,"65 min",getLession_3()));
   return list;
    }

    private ArrayList<Lession> getLession_1(){
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("pic_1_1","HBPMvFkpNge","03:46","Lesson 1"));
        list.add(new Lession("pic_1_2","K6I24WgiiPw","03:41","Lesson 2"));
        list.add(new Lession("pic_1_3","Zc08v4YYOeA","01:47","Lesson 3"));
        return list;
    }

    private ArrayList<Lession> getLession_2(){
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("pic_3_1","L3eImBAXT7I","20:32","Lesson 1"));
        list.add(new Lession("pic_3_2","47Exqz07Flu","18:37","Lesson 2"));
        list.add(new Lession("pic_3_3","OmLxBtmaQ-4","16:46","Lesson 3"));
        list.add(new Lession("pic_3_4","w86EalEoFRY","07:52","Lesson 4"));

        return list;
    }

    private ArrayList<Lession> getLession_3(){
        ArrayList<Lession> list = new ArrayList<>();

        list.add(new Lession("pic_3_1","v7AYKMP6rOE","23:00","Lesson 1"));
    list.add(new Lession("pic_3_2","Eml2xnoLpYe","27:00","Lesson 2"));
    list.add(new Lession("pic_3_3","v7SN-d4qXx0","25:00","Lesson 3"));
    list.add(new Lession("pic_3_4","LqXZ628YNj4","21:00","Lesson 4"));

    return list;
    }
}