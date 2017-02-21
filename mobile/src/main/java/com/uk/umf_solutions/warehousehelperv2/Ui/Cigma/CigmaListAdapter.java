package com.uk.umf_solutions.warehousehelperv2.Ui.Cigma;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Cigma;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnSelectedCigmaListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Eaun-Ballinger on 21/02/2017.
 *
 *
 */

public class CigmaListAdapter extends RecyclerView.Adapter<CigmaListAdapter.CigmaViewHolder> {
    private ThreadLocal<List<Cigma>> mCigma;
    private final OnSelectedCigmaListener mListener;
    private Context mContext;

    public CigmaListAdapter(List<Cigma> cigmaList, Context mContext, OnSelectedCigmaListener mListener) {
        this.mListener = mListener;
        this.mContext = mContext;
        this.mCigma = new ThreadLocal<>();
        this.mCigma.set(cigmaList);
    }


    @Override
    public CigmaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View CigmaView;
        CigmaView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_view_items,parent,false);
        return new CigmaViewHolder(CigmaView);
    }

    @Override
    public void onBindViewHolder(CigmaViewHolder holder, int position) {
        if (mCigma != null) {
            Cigma cigma = mCigma.get().get(position);
            holder.BKtitle.setText(cigma.getMessageTitle());
            holder.BKaction.setText(cigma.getMessageActions());
            holder.BKdiscription.setText(cigma.getMessageDescription());
        }
    }

    @Override
    public int getItemCount() {
        return mCigma.get().size();
    }

    public class CigmaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
        @BindView(R.id.title)
        TextView BKtitle;
        @BindView(R.id.action) TextView BKaction;
        @BindView(R.id.message) TextView BKdiscription;
        public CigmaViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void onClick(View view) {
            Cigma selected = mCigma.get().get(getLayoutPosition());
            mListener.OnSelectedCigma(selected);
        }

        @Override
        public boolean onLongClick(View view) {
            Cigma longSelected = mCigma.get().get(getLayoutPosition());
            mListener.OnLongClickCigma(longSelected);
            return false;
        }
    }
}
