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

public class WmsListAdapter extends RecyclerView.Adapter<WmsListAdapter.WMSViewHolder> {

    private ThreadLocal<List<Wms>> mWMS;
    private final Context mContext;
    private final OnWmsSelectListener mListener;

    public WmsListAdapter(List<Wms> wms,
                          Context mContext,
                          OnWmsSelectListener mListener) {
        this.mWMS = new ThreadLocal<>();
        this.mWMS.set(wms);
        this.mContext = mContext;
        this.mListener = mListener;
    }

    @Override
    public WMSViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View wmsView;
        wmsView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.row_view_items,parent,false);
        return new WMSViewHolder(wmsView);
    }

    @Override
    public void onBindViewHolder(WMSViewHolder holder, int position) {
        Wms wms = mWMS.get().get(position);
        holder.BKtitle.setText(wms.getMessageTitle());
        holder.BKaction.setText(wms.getMessageActions());
        holder.BKdiscription.setText(wms.getMessageDescription());
    }

    @Override
    public int getItemCount() {

            return mWMS.get().size();

    }

    public class WMSViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener,View.OnLongClickListener{
        @BindView(R.id.title) TextView BKtitle;
        @BindView(R.id.action) TextView BKaction;
        @BindView(R.id.message) TextView BKdiscription;

        public WMSViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void onClick(View view) {
            Wms selected = mWMS.get().get(getLayoutPosition());
            mListener.OnSelectedWMS(selected);

        }

        @Override
        public boolean onLongClick(View view) {
            Wms longSelected = mWMS.get().get(getLayoutPosition());
            mListener.OnLongClickWMS(longSelected);
            return false;
        }
    }
}
