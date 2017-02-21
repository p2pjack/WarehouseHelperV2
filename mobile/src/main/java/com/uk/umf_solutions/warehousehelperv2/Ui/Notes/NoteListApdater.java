package com.uk.umf_solutions.warehousehelperv2.Ui.Notes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Notes;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnNoteSelectedListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Eaun-Ballinger on 20/02/2017.
 *
 *
 */

public class NoteListApdater extends RecyclerView.Adapter<NoteListApdater.NoteViewHolder> {
    private ThreadLocal<List<Notes>> mNotes;
    private Context mContext;
    private final OnNoteSelectedListener mListener;

    public NoteListApdater(List<Notes> NOTES, Context mContext, OnNoteSelectedListener mListener) {
        this.mContext = mContext;
        this.mListener = mListener;
        this.mNotes = new ThreadLocal<>();
        this.mNotes.set(NOTES);
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View NoteView;
        NoteView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_view_items,parent,false);
        return new NoteViewHolder(NoteView);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        if (mNotes != null) {
            Notes notes = mNotes.get().get(position);
            holder.BKtitle.setText(notes.getMessageTitle());
            holder.BKaction.setText(notes.getMessageActions());
            holder.BKdiscription.setText(notes.getMessageDescription());
        }
    }

    @Override
    public int getItemCount() {
        return mNotes.get().size();
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener {
        @BindView(R.id.title)
        TextView BKtitle;
        @BindView(R.id.action) TextView BKaction;
        @BindView(R.id.message) TextView BKdiscription;

        public NoteViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void onClick(View view) {
            Notes selected = mNotes.get().get(getLayoutPosition());
            mListener.OnSelectedNote(selected);
        }

        @Override
        public boolean onLongClick(View view) {
            Notes longSelected = mNotes.get().get(getLayoutPosition());
            mListener.OnLongClickNote(longSelected);
            return false;
        }
    }
}
