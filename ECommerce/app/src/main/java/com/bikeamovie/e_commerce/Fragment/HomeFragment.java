package com.bikeamovie.e_commerce.Fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bikeamovie.e_commerce.Adapter.BestAdapter;
import com.bikeamovie.e_commerce.Adapter.NotifikasiAdapter;
import com.bikeamovie.e_commerce.Model.NotifikasiModel;
import com.bikeamovie.e_commerce.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    RecyclerView rv_notifikasi, rv_com, rv_best;
    ArrayList<NotifikasiModel> notifikasiModelArrayList = new ArrayList<>();
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_notifikasi = view.findViewById(R.id.rv_nowplaying);
        rv_com = view.findViewById(R.id.rv_comingsoon);
        rv_best = view.findViewById(R.id.rv_best);
        NotifikasiModel model1 = new NotifikasiModel("Pasmina","8.5","11.30",1000000);
        NotifikasiModel model2 = new NotifikasiModel("natasha","8","10:08",1000000);
        NotifikasiModel model3 = new NotifikasiModel("Pasmina","9","11.30",100000);
        NotifikasiModel model4 = new NotifikasiModel("Pasmina","8","10:08",100000);
        NotifikasiModel model5 = new NotifikasiModel("Pasmina","8","11.30",100000);
        notifikasiModelArrayList.add(model1);
        notifikasiModelArrayList.add(model2);
        notifikasiModelArrayList.add(model3);
        notifikasiModelArrayList.add(model4);
        notifikasiModelArrayList.add(model5);
        NotifikasiAdapter adapter = new NotifikasiAdapter(getContext(),notifikasiModelArrayList);
        BestAdapter adapter1 = new BestAdapter(getContext(),notifikasiModelArrayList);
        rv_notifikasi.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_notifikasi.setAdapter(adapter);
        rv_com.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_com.setAdapter(adapter);
        rv_best.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rv_best.setAdapter(adapter1);
    }
}
