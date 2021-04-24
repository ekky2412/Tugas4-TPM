package com.example.aplikasifragment.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.aplikasifragment.Preferences;
import com.example.aplikasifragment.R;
import com.example.aplikasifragment.activity.MainActivity;

import java.util.Objects;

public class ProfilFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    String username;
    TextView tvUsername;
    Button btnLogout;

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tvUsername = view.findViewById(R.id.tvUsername);
        btnLogout = view.findViewById(R.id.btnlogout);

        username = Preferences.getRegisteredUser(getContext());

        tvUsername.setText("Halo, " + username);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferences.clearLoggedInUser(getContext());
                Intent intent = new Intent(getContext(), MainActivity.class);
                Objects.requireNonNull(getActivity()).finish();
                Objects.requireNonNull(getContext()).startActivity(intent);
            }
        });
    }
}