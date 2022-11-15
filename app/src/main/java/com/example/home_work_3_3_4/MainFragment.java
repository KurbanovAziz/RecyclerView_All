package com.example.home_work_3_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment {

    private Button btnCity;
    private Button btnHero;
    private Button btnAnimal;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findId();
        onClick();

    }

    private void findId() {
        btnCity = requireActivity().findViewById(R.id.btn_city_list);
        btnHero = requireActivity().findViewById(R.id.btn_hero_list);
        btnAnimal = requireActivity().findViewById(R.id.btn_animal_list);
    }

    private void onClick() {
        btnCity.setOnClickListener(view ->
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.container, new CityFragment()).addToBackStack(null)
                        .commit());

        btnHero.setOnClickListener(view ->
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new HeroFragment()).addToBackStack(null)
                        .commit());
        btnAnimal.setOnClickListener(view ->
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new AnimalFragment()).addToBackStack(null)
                        .commit());
    }

}