package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    private Context context;
    public HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @Override
    public Fragment getItem(int page) {
// returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0: return WeatherAndForecastFragment.newInstance("HaNoi","VietNam");
            case 1: return WeatherAndForecastFragment.newInstance("Toulouse","VietNam");
            case 2: return WeatherAndForecastFragment.newInstance("Paris","VietNam");
        }
        return new EmptyFragment(); // failsafe
    }
    @Override
    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }
}

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_weather);

        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
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