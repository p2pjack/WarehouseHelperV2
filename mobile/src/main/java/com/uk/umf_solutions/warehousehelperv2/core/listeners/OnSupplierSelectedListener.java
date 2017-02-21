package com.uk.umf_solutions.warehousehelperv2.core.listeners;

import com.uk.umf_solutions.warehousehelperv2.Model.Suppliers;

/**
 * Created by Eaun-Ballinger on 20/02/2017.
 *
 *
 */

public interface OnSupplierSelectedListener {

    void OnSelectedSupplier(Suppliers selectedSupplier);
    void OnLongClickSupplier(Suppliers clickedSupplier);
}
