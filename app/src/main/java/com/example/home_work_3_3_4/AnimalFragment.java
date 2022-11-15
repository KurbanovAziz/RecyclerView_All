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


public class AnimalFragment extends Fragment {

    private ArrayList animalList = new ArrayList();
    private RecyclerView rvAnimal;
    private RecyclerView.Adapter animalAdapter = new AnimalAdapter(animalList);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvAnimal = requireActivity().findViewById(R.id.rv_animal);
        loadData();
        rvAnimal.setAdapter(animalAdapter);
    }

    private void loadData() {
        animalList.add("Сокол");
        animalList.add("Пантера");
        animalList.add("Кошка");
        animalList.add("Собака");
        animalList.add("Лев");
        animalList.add("Тигр");
        animalList.add("Орел");
        animalList.add("Олень");
        animalList.add("Барс");
        animalList.add("Волк");
        animalList.add("Заяц");
        animalList.add("Баран");
        animalList.add("Корова");
        animalList.add("Петух");
        animalList.add("Курица");

    }
}