package com.example.gpsapp.ui.main;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.gpsapp.Piso4Fragment;
import com.example.gpsapp.Piso3Fragment;
import com.example.gpsapp.Piso1Fragment;
import com.example.gpsapp.Piso5Fragment;
import com.example.gpsapp.Piso6Fragment;
import com.example.gpsapp.R;
import com.example.gpsapp.Piso2Fragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4, R.string.tab_text_5, R.string.tab_text_6};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Piso1Fragment();
                break;
            case 1:
                fragment = new Piso2Fragment();
                break;
            case 2:
                fragment = new Piso3Fragment();
                break;
            case 3:
                fragment = new Piso4Fragment();
                break;
            case 4:
                fragment = new Piso5Fragment();
                break;
            case 5:
                fragment = new Piso6Fragment();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Nivel 1";
            case 1:
                return "Nivel 2";
            case 2:
                return "Nivel 3";
            case 3:
                return "Nivel 4";
            case 4:
                return "Nivel 5";
            case 5:
                return "Nivel -1";
        }
        return null;
    }

    @Override
    public int getCount() {
        // Show 6 total pages.
        return 6;
    }
}