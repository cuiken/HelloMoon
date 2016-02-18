package com.stud.hellomoon.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * @autor Ken.Cui
 */
public class HelloMoonFragment extends Fragment {

    private Button mPlayButton;
    private Button mStopButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
        mPlayButton = (Button) v.findViewById(R.id.hellomoon_playButton);
        mStopButton = (Button) v.findViewById(R.id.hellomoon_stopButton);
        return v;
    }
}
