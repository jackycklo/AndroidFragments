package com.jackylo.androidfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jackylo on 9/5/2017.
 */

public class FragmentLandscape extends Fragment {

       /*
     LayoutInflator takes the provided xml layout and puts it in a view
     container is the view the fragment should be attached to
     savedInstanceState is passed if the fragment is being re-constructed from a saved state

     inflate() is passed the layout xml to place, the optional view to attach to and
     true or false on whether to attach to the optional view named container
      */

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.landscape_fragment, container, false);

    }


}
