package com.uk.umf_solutions.warehousehelperv2.core.listeners;

import com.uk.umf_solutions.warehousehelperv2.Model.Cigma;

/**
 * Created by Eaun-Ballinger on 21/02/2017.
 */

public interface OnSelectedCigmaListener {

    void OnSelectedCigma(Cigma selectedCigma);
    void OnLongClickCigma(Cigma clickedCigma);
}
