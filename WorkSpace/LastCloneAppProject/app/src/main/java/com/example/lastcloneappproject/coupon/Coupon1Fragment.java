package com.example.lastcloneappproject.coupon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lastcloneappproject.R;
import com.example.lastcloneappproject.databinding.FragmentCoupon1Binding;
import com.example.lastcloneappproject.home.HomeFragment;

public class Coupon1Fragment extends Fragment {

    FragmentCoupon1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCoupon1Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}