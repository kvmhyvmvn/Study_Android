package com.example.lastcloneappproject.coupon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lastcloneappproject.R;
import com.example.lastcloneappproject.databinding.FragmentCouponBinding;
import com.example.lastcloneappproject.home.HomeFragment;

public class CouponFragment extends Fragment {

    FragmentCouponBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCouponBinding.inflate(getLayoutInflater());
        binding.imgvBefore.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.ln_container, new HomeFragment()).commit();
        });

        binding.imgvHome.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.ln_container, new HomeFragment()).commit();
        });

        binding.btn1.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.coupon_container, new Coupon1Fragment()).commit();
        });

        binding.btn2.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.coupon_container, new Coupon2Fragment()).commit();
        });

        binding.btn3.setOnClickListener(v -> {
            FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.coupon_container, new Coupon3Fragment()).commit();
        });
        return binding.getRoot();
    }
}