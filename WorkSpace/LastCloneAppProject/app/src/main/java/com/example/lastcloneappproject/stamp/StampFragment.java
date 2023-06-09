package com.example.lastcloneappproject.stamp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lastcloneappproject.R;
import com.example.lastcloneappproject.databinding.FragmentStampBinding;
import com.example.lastcloneappproject.home.HomeFragment;

public class StampFragment extends Fragment {

    FragmentStampBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentStampBinding.inflate(getLayoutInflater());
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
}