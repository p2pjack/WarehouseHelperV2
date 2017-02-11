package com.uk.umf_solutions.warehousehelperv2.Ui.Suppliers;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uk.umf_solutions.warehousehelperv2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SupplierFragment extends Fragment {

    private View mRootView;


    public SupplierFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_supplier, container, false);
        return mRootView;
    }

}
