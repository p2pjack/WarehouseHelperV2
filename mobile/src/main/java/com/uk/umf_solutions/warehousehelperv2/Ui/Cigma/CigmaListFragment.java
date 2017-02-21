package com.uk.umf_solutions.warehousehelperv2.Ui.Cigma;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Cigma;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnSelectedCigmaListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CigmaListFragment extends Fragment implements OnSelectedCigmaListener {

    private View mRootView;
    private CigmaListAdapter mAdapter;
    @BindView(R.id.cigma_list_recyclerview)
    RecyclerView mRecyclerView;
    @BindView(R.id.cigma_empty_text)
    TextView mEmptyText;
    @BindView(R.id.fab_cigma)
    FloatingActionButton mFab;


    public CigmaListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_cigma_list, container, false);
        ButterKnife.bind(this,mRootView);

        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // call me a method
            }
        });

        //setup RecyclerView
        List<Cigma> tempcigma = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mAdapter = new CigmaListAdapter(tempcigma,getContext(),this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
        if (tempcigma.size() < 1){
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
    public void OnSelectedCigma(Cigma selectedCigma) {

    }

    @Override
    public void OnLongClickCigma(Cigma clickedCigma) {

    }
}
