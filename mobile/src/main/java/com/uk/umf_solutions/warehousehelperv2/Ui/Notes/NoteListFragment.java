package com.uk.umf_solutions.warehousehelperv2.Ui.Notes;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Notes;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnNoteSelectedListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NoteListFragment extends Fragment implements OnNoteSelectedListener {

    private View mRootView;
    private NoteListApdater mAdapter;
    @BindView(R.id.note_list_recyclerview)
    RecyclerView mRecyclerView;
    @BindView(R.id.note_empty_text)
    TextView mEmptyText;
    @BindView(R.id.fab_note)
    FloatingActionButton mFab;

    public NoteListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_note_list, container, false);
        ButterKnife.bind(this,mRootView);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // call me a method
            }
        });

        List<Notes> tempnote = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mAdapter = new NoteListApdater(tempnote,getContext(),this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
        if (tempnote.size() < 1){
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
    public void OnSelectedNote(Notes selectedNote) {

    }

    @Override
    public void OnLongClickNote(Notes clickedNote) {

    }
}
