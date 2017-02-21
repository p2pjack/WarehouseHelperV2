package com.uk.umf_solutions.warehousehelperv2.Ui.Suppliers;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uk.umf_solutions.warehousehelperv2.Model.Suppliers;
import com.uk.umf_solutions.warehousehelperv2.R;
import com.uk.umf_solutions.warehousehelperv2.core.listeners.OnSupplierSelectedListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * Created by Eaun-Ballinger on 20/02/2017.
 *
 *
 */

public class SupplierListAdapter extends
        RecyclerView.Adapter<SupplierListAdapter.SupplierViewHolder> {

    private ThreadLocal<List<Suppliers>> mSupplier;
    private Context mContext;
    private final OnSupplierSelectedListener mListner;

    public SupplierListAdapter(List<Suppliers> supplier, Context mContext, OnSupplierSelectedListener mListner) {
        this.mListner = mListner;
        this.mSupplier = new ThreadLocal<>();
        this.mSupplier.set(supplier);
        this.mContext = mContext;
    }

    @Override
    public SupplierViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View SupplierView;
        SupplierView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_view_suppliers,parent,false);
        return new SupplierViewHolder(SupplierView);
    }

    @Override
    public void onBindViewHolder(SupplierViewHolder holder, int position) {
        if (mContext != null) {
            Suppliers suppliers = mSupplier.get().get(position);
            holder.BKplanner_name.setText(suppliers.getPlanner());
            holder.BKemail.setText(suppliers.getPlannerEmail());
            holder.BKphone.setText(suppliers.getPlannerNumber());
            holder.BKsupplier_code.setText(suppliers.getSupplierCode());
            holder.BKsupplier.setText(suppliers.getSupplier());
            holder.BKplanner_backup.setText(suppliers.getBackupPlanner());
            holder.BKpnone_number_backup.setText(suppliers.getBackupPlannerNumber());
            holder.BKcountry.setText(suppliers.getCountry());
            holder.BKnumber_of_parts.setText((int) suppliers.getNumberOfParts());
        }
    }

    @Override
    public int getItemCount() {
        return mSupplier.get().size();
    }

    class SupplierViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
        //@BindView(R.id.person_image) ImageView BKperson_image;
        @BindView(R.id.planner_name) TextView BKplanner_name;
        @BindView(R.id.email) TextView BKemail;
        @BindView(R.id.phone) TextView BKphone;
        @BindView(R.id.supplier_code) TextView BKsupplier_code;
        @BindView(R.id.supplier) TextView BKsupplier;
        @BindView(R.id.supplier_country) TextView BKcountry;
        @BindView(R.id.backup_planner) TextView BKplanner_backup;
        @BindView(R.id.backup_phone_number) TextView BKpnone_number_backup;
        @BindView(R.id.number_of_parts) TextView BKnumber_of_parts;
        public SupplierViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void onClick(View view) {
            Suppliers selected = mSupplier.get().get(getLayoutPosition());
            mListner.OnSelectedSupplier(selected);
        }

        @Override
        public boolean onLongClick(View view) {
            Suppliers selected = mSupplier.get().get(getLayoutPosition());
            mListner.OnLongClickSupplier(selected);
            return false;
        }
    }
}
