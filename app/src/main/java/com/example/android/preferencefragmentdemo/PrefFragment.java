package com.example.android.preferencefragmentdemo;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Chaker on 12/20/2016.
 */

public class PrefFragment  extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int res=getActivity().getResources().getIdentifier(getArguments().getString("resource"), "xml", getActivity().getPackageName());
        addPreferencesFromResource(res);
    }
}
