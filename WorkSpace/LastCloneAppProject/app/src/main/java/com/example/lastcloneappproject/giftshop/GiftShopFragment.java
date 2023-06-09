package com.example.lastcloneappproject.giftshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lastcloneappproject.R;
import com.example.lastcloneappproject.databinding.FragmentGiftShopBinding;
import com.example.lastcloneappproject.home.HomeFragment;
import com.example.lastcloneappproject.home.SliderAdapter;

import java.util.ArrayList;

public class GiftShopFragment extends Fragment {

    FragmentGiftShopBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentGiftShopBinding.inflate(getLayoutInflater());
        binding.recvDrink.setAdapter(new DrinkAdapter(getList()));
        binding.recvDrink2.setAdapter(new Drink2Adapter(getList()));
        binding.vpslider.setAdapter(new SliderAdapter(banArr));
        binding.recvDrink.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recvDrink2.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        binding.imgvBefore.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.ln_container, new HomeFragment()).commit();
        });

        binding.imgvHome.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.ln_container, new HomeFragment()).commit();
        });

        return binding.getRoot();
    }

    int[] banArr = {R.drawable.img_banner1, R.drawable.img_banner2, R.drawable.img_banner3};

    public ArrayList<DrinkDTO> getList() {
        ArrayList<DrinkDTO> list = new ArrayList<>();
        list.add(new DrinkDTO(R.drawable.drink1, "블랙 사파이어 포도 쥬얼리 밀크티"));
        list.add(new DrinkDTO(R.drawable.drink2, "블랙 사파이어 포도 쥬얼리 스무디"));
        list.add(new DrinkDTO(R.drawable.drink3, "블랙 사파이어 포도 얼그레이 티"));
        list.add(new DrinkDTO(R.drawable.drink4, "쫀득 약과 밀크티"));
        list.add(new DrinkDTO(R.drawable.drink5, "쫀득 약과 스무디"));
        list.add(new DrinkDTO(R.drawable.drink6, "초당옥수수 밀크티+펄"));
        list.add(new DrinkDTO(R.drawable.drink7, "초당옥수수 팝핑 스무디"));
        list.add(new DrinkDTO(R.drawable.drink8, "우롱티+코코넛+밀크폼L"));
        list.add(new DrinkDTO(R.drawable.drink9, "우롱티+코코넛+밀크폼J"));
        list.add(new DrinkDTO(R.drawable.drink10, "블랙 밀크티 + 펄L"));
        list.add(new DrinkDTO(R.drawable.drink11, "타로 밀크티 + 펄L"));
        list.add(new DrinkDTO(R.drawable.drink12, "망고 요구르트 + 화이트펄L"));
        list.add(new DrinkDTO(R.drawable.drink13, "하동 호지 밀크티 + 펄L"));
        list.add(new DrinkDTO(R.drawable.drink14, "하동 호지 밀크티 + 펄J"));
        list.add(new DrinkDTO(R.drawable.drink15, "자몽 그린티 + 알로에L"));
        list.add(new DrinkDTO(R.drawable.drink16, "자몽 그린티 + 알로에J"));
        return list;
    }
}