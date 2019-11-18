package com.kkw.displayjokeslibrary;

import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DisplayActivityFragment extends Fragment {
    public static final String JOKE = "joke";

    public DisplayActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display, container, false);
        Intent intent = getActivity().getIntent();
        if (intent.hasExtra(JOKE)){
            TextView tvJoke =  view.findViewById(R.id.tv_joke);
            String jokeToDisplay = intent.getStringExtra(JOKE);
            tvJoke.setText(jokeToDisplay);
            Log.d("JOKE", jokeToDisplay);
        }
        return view;
    }
}
