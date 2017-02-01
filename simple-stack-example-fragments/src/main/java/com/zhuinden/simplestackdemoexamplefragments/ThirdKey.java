package com.zhuinden.simplestackdemoexamplefragments;

import android.support.v4.app.Fragment;

import com.google.auto.value.AutoValue;

/**
 * Created by Zhuinden on 2017.02.01..
 */

@AutoValue
public abstract class ThirdKey implements Key {
    @Override
    public Fragment createFragment() {
        return new ThirdFragment();
    }

    @Override
    public String getFragmentTag() {
        return "ThirdKey";
    }

    @Override
    public Class<? extends Fragment> getFragmentClass() {
        return ThirdFragment.class;
    }

    public static ThirdKey create() {
        return new AutoValue_ThirdKey();
    }
}