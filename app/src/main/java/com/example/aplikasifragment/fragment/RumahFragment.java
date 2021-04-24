package com.example.aplikasifragment.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aplikasifragment.R;
import com.example.aplikasifragment.adapter.AdapterElemen;
import com.example.aplikasifragment.model.DataElemen;
import com.example.aplikasifragment.model.ModelElemen;


import java.util.ArrayList;

public class RumahFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rumah, container, false);
    }

    public RecyclerView rvGroup;
    public ArrayList<ModelElemen> listElemen = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //isi codingan disini

        rvGroup = view.findViewById(R.id.activitymain_rv);
        rvGroup.setHasFixedSize(true);
        listElemen.addAll(DataElemen.getGroup());

        rvGroup.setLayoutManager(new LinearLayoutManager(getContext()));
        AdapterElemen adapterElemen = new AdapterElemen(getContext(), DataElemen.getGroup());
        rvGroup.setAdapter(adapterElemen);

    }

}