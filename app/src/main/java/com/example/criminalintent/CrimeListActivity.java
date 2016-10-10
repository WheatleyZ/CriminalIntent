package com.example.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by 毛毛龍 on 2016/10/10 0010.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
