package com.sudhirtheindian4.tiktokclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.sudhirtheindian4.tiktokclone.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<Model> arrayList = new ArrayList<>();
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();
        this.getTheme().applyStyle(R.style.FullScreen,false);
//        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.video_file;));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.a, R.drawable.profile,"Sudhir the indian"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.b, R.drawable.profile,"Sudhir the indian"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.c, R.drawable.profile,"Sudhir the indian"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.d, R.drawable.profile,"Sudhir the indian"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.e, R.drawable.profile,"Sudhir the indian"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.b, R.drawable.profile,"Sudhir the indian"));
        arrayList.add(new Model("android.resource://" + getPackageName() + "/" + R.raw.c, R.drawable.profile,"Sudhir the indian"));


        adapter = new Adapter(MainActivity.this,arrayList);
        binding.viewPager.setAdapter(adapter);

    }
}