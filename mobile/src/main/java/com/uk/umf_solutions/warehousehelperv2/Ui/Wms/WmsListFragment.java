package com.uk.umf_solutions.warehousehelperv2.Ui.Wms;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Wms;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnWmsSelectListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class WmsListFragment extends Fragment implements OnWmsSelectListener{

    private View mRootView;
    private WmsListAdapter mAdapter;
    @BindView(R.id.wms_list_recyclerview) RecyclerView mRecyclerView;
    @BindView(R.id.empty_text) TextView mEmptyText;
    @BindView(R.id.fab_wms) FloatingActionButton mFab;

    public WmsListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_wms_list, container, false);
        ButterKnife.bind(this,mRootView);

        //setup RecyclerView
        List<Wms> tempWms = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mAdapter = new WmsListAdapter(tempWms,getContext(),this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
//        if (tempWms.size() < 1){
//            ShowEmptyText();
//        }else{
//            EmptyTextShowGone();
//        }

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
    public void OnSelectedWMS(Wms selectedWMS) {

    }

    @Override
    public void OnLongClickWMS(Wms clickedWMS) {

    }
}
