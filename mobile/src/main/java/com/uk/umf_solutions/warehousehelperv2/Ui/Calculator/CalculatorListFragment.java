package com.uk.umf_solutions.warehousehelperv2.Ui.Calculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uk.umf_solutions.warehousehelperv2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalculatorListFragment extends Fragment {
    private View rootView;

    public CalculatorListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_calculator, container, false);
        return rootView;
    }

}
