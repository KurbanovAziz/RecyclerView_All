package com.example.home_work_3_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class HeroFragment extends Fragment {

    private ArrayList heroList = new ArrayList();
    private RecyclerView rvHero;
    private RecyclerView.Adapter heroAdapter = new HeroAdapter(heroList);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hero, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvHero = requireActivity().findViewById(R.id.rv_hero);
        loadData();
        rvHero.setAdapter(heroAdapter);
    }

    private void loadData() {
        heroList.add("Ник Фьюри");
        heroList.add("Доктор Стрендж");
        heroList.add("Тор");
        heroList.add("Человек-Паук");
        heroList.add("Соколинный глаз");
        heroList.add("Ракета");
        heroList.add("Грут");
        heroList.add("Железный человек");
        heroList.add("Халк");
        heroList.add("Капитан Америка");
        heroList.add("Ртуть");
        heroList.add("Черная Вдова");
        heroList.add("Черная Пантера");
    }
}