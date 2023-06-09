package com.example.and09_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.and09_fragmentadapter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    // FrameLayout container;
    // Button btn_menu1, btn_menu2, btn_adapter;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot()); // getRoot ==> 디자인 xml파일의 최상단의 레이아웃

        // Fragment를 붙이기 위한 공간, Fragment, FragmentManager 3가지의 요소가 필요하다.

        // container = findViewById(R.id.container); <= FragmentManager에서는 객체로 초기화 된 위젯이 필요 x, 디자인 파일에 있는 id만 명시해주면 O
//        btn_menu1 = findViewById(R.id.btn_menu1);
//        btn_menu2 = findViewById(R.id.btn_menu2);
//        btn_adapter = findViewById(R.id.btn_adapter);

        FragmentManager manager = getSupportFragmentManager(); // FragmentManager 초기화 식

        binding.btnMenu1.setOnClickListener(v -> {
            Log.d("버튼", "메뉴1");
            // 트랜잭션 : Oracle 작업 최소 단위   <=>   세트 : Commit & Rollback
            // manager.beginTransaction().add(R.id.container, new HomeFragment(), "A").commit();
            manager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        });

        binding.btnMenu2.setOnClickListener(v -> {
            Log.d("버튼", "메뉴2");
            manager.beginTransaction().replace(R.id.container, new SubFragment()).commit();
        });

        binding.btnAdapter.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AdapterActivity.class);
            startActivity(intent);
        });
    }
}