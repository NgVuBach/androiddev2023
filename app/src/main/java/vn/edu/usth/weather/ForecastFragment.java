package vn.edu.usth.weather;

import static vn.edu.usth.weather.R.*;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    public ForecastFragment() {
        // Required empty public constructor
    }
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create a vertical LinearLayout
        LinearLayout view = new LinearLayout(getActivity());
        view.setOrientation(LinearLayout.VERTICAL);
        view.setBackgroundColor(Color.parseColor("#20FF0000"));

        // Add image
        ImageView img = new ImageView(getActivity());
        img.setImageResource(drawable.sunny);
        img.setPivotY(Gravity.CENTER);
        img.setLayoutParams(new LinearLayout.LayoutParams(144, 144));

        // Add text
        TextView text = new TextView(getActivity());
        text.setText("Thursday");

        // Add text and image to linearlayout
        view.addView(text);
        view.addView(img);

        // Return view
        return view;
    }
}