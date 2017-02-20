package com.uk.umf_solutions.warehousehelperv2.Ui.Suppliers;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Suppliers;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnSupplierSelectedListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SupplierListFragment extends Fragment implements OnSupplierSelectedListener {

    private View mRootView;
    private SupplierListAdapter mAdapter;
    @BindView(R.id.supplier_list_recyclerview)
    RecyclerView mRecyclerView;
    @BindView(R.id.supplier_empty_text)
    TextView mEmptyText;
    @BindView(R.id.fab_supplier)
    FloatingActionButton mFab;


    public SupplierListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_supplier, container, false);


        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // call me a method
            }
        });

        //setup RecyclerView
        List<Suppliers> tempSuppliers = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mAdapter = new SupplierListAdapter(tempSuppliers,getContext(),this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
        if (tempSuppliers.size() < 1){
            ShowEmptyText();
        }else{
            EmptyTextShowGone();
        }

        return mRootView;
    }

    private void EmptyTextShowGone() {
        mEmptyText.setVisibility(View.GONE);
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void ShowEmptyText() {
        mRecyclerView.setVisibility(View.GONE);
        mEmptyText.setVisibility(View.VISIBLE);
    }

    @Override
    public void OnSelectedSupplier(Suppliers selectedSupplier) {

    }

    @Override
    public boolean OnLongClickSupplier(Suppliers clickedSupplier) {

    }
}
