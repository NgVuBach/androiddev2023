package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class WeatherAndForecastFragment extends Fragment {

    public WeatherAndForecastFragment() {
        // Required empty public constructor

    }

    public static WeatherAndForecastFragment newInstance(String param1, String param2) {
        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout linearLayout = new LinearLayout(getActivity());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams( LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT ));
        linearLayout.setId(View.generateViewId());

        WeatherFragment weatherFragment = new WeatherFragment();
        ForecastFragment forecastFragment = new ForecastFragment();

        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(linearLayout.getId(), weatherFragment);
        fragmentTransaction.add(linearLayout.getId(), forecastFragment);
        fragmentTransaction.commit();

        return linearLayout;
    }
}