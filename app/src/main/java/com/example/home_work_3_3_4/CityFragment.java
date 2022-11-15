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


public class CityFragment extends Fragment {

    private ArrayList cityList = new ArrayList();
    private RecyclerView rvCity;
    private RecyclerView.Adapter cityAdapter = new CityAdapter(cityList);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCity = requireActivity().findViewById(R.id.rv_city);
        loadData();
        rvCity.setAdapter(cityAdapter);
    }

    private void loadData() {
        cityList.add("Bishkek");
        cityList.add("Ош");
        cityList.add("Каракол");
        cityList.add("Токмак");
        cityList.add("Москва");
        cityList.add("Питер");
        cityList.add("Лондон");
        cityList.add("Париж");
        cityList.add("Кипр");
        cityList.add("Астана");
        cityList.add("Алматы");
        cityList.add("Нью-Йорк");
        cityList.add("Лос-Анджелес");
        cityList.add("Мексика");
    }
}