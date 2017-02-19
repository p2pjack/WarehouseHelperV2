package com.uk.umf_solutions.warehousehelperv2.Ui.Cigma;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uk.umf_solutions.warehousehelperv2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CigmaListFragment extends Fragment {

    private View mRootView;


    public CigmaListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_cigma_list, container, false);

        return mRootView;
    }

}
