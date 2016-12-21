package com.example.android.preferencefragmentdemo;


import android.os.Bundle;
import android.preference.PreferenceActivity;

import java.util.List;

/**
 * Created by Chaker on 12/20/2016.
 */

public class preferences extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_headers, target);
    }

}
