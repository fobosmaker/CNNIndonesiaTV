package com.example.cnnindonesiatv;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.BrowseFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainFragment extends BrowseFragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Toast.makeText(getActivity().getApplicationContext(), "Activity created", Toast.LENGTH_SHORT).show();
        super.onActivityCreated(savedInstanceState);
    }

    private void setupUIElements(){
        setTitle("Hello from Android TV");
        setHeadersState(HEADERS_ENABLED);
        setHeadersTransitionOnBackEnabled(true);
        // set fastLane (or headers) background color
        setBrandColor(getResources().getColor(R.color.fastlane_background));
        // set search icon color
        setSearchAffordanceColor(getResources().getColor(R.color.search_opaque));
    }
}
