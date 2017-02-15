package com.uk.umf_solutions.warehousehelperv2.Ui.Wms;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Wms;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnWmsSelectListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Eaun-Ballinger on 13/02/2017.
 *
 *
 */

public class WmsListAdapter extends RecyclerView.Adapter<WmsListAdapter.ViewHolder> {

    private List<Wms> mWMS;
    private final Context mContext;
    private final OnWmsSelectListener mListener;

    public WmsListAdapter(List<Wms> wms, Context mContext, OnWmsSelectListener mListener) {
        this.mWMS = wms;
        this.mContext = mContext;
        this.mListener = mListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View wmsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_items,parent,false);
        ViewHolder viewHolder = new ViewHolder(wmsView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (mWMS != null) {
            Wms wms = mWMS.get(position);
            holder.BKtitle.setText(wms.getMessageTitle());
            holder.BKaction.setText(wms.getMessageActions());
            holder.BKdiscription.setText(wms.getMessageDescription());
        }
    }

    @Override
    public int getItemCount() {
        if (mWMS != null) {
            return mWMS.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
        @BindView(R.id.title) TextView BKtitle;
        @BindView(R.id.action) TextView BKaction;
        @BindView(R.id.message) TextView BKdiscription;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void onClick(View view) {
            Wms selected = mWMS.get(getLayoutPosition());
            mListener.OnSelectedWMS(selected);

        }

        @Override
        public boolean onLongClick(View view) {
            Wms longSelected = mWMS.get(getLayoutPosition());
            mListener.OnLongClickWMS(longSelected);
            return true;
        }
    }
}
