package com.sharvilshah.weather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sharvil Shah on 8/21/2016.
 */
public class ForecastFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray =
                {
                        "Today - Sunny - 88/63",
                        "Tomorrow - Foggy - 70/40",
                        "Wednesday - Rainy - 70/36",
                };

        return rootView;
    }
}
