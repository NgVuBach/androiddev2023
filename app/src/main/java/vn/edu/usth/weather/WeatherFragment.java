package vn.edu.usth.weather;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherFragment extends Fragment {
    public WeatherFragment() {
        // Required empty public constructor
    }

    public static WeatherFragment newInstance(String city) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString("city", city);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(30, 30, 30, 30);
        RelativeLayout view = new RelativeLayout(getActivity());
        view.setBackgroundColor(Color.parseColor("#FFBFBF"));
        view.setLayoutParams(params);
        view.setPadding(140,35,150,35);

        // Initiate arrays
        Resources res = getResources();
        String[] weather = res.getStringArray(R.array.Weather);
        String[] degree = res.getStringArray(R.array.degree);

        TextView condition = new TextView(getActivity());
        condition.setTextSize(18);
        condition.setText(degree[2] + "\n" + weather[2]);
        condition.findViewById(R.id.condition);

        ImageView icon = new ImageView(getActivity());
        icon.setImageResource(R.drawable.night);

        view.addView(condition);
        view.addView(icon);

        return view;
    }
}