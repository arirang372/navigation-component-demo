package com.navigationcomponent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MovieDetailsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.movie_details,
                container, false);

        TextView details_tv = view.findViewById(R.id.movie_details);
        details_tv.setText("Movie details of "+getArguments().getString("movieId"));

        return view;
    }
}