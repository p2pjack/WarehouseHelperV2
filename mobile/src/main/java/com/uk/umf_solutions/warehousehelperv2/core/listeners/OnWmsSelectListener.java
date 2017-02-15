package com.uk.umf_solutions.warehousehelperv2.core.listeners;

import com.uk.umf_solutions.warehousehelperv2.Model.Wms;

/**
 * Created by Eaun-Ballinger on 15/02/2017.
 *
 *
 */

public interface OnWmsSelectListener {

    void OnSelectedWMS(Wms selectedWMS);
    void OnLongClickWMS(Wms clickedWMS);
}
