package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_weather);

        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment).commit();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }
}