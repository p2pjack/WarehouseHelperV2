package com.uk.umf_solutions.warehousehelperv2.core.listeners;

import com.uk.umf_solutions.warehousehelperv2.Model.Notes;

/**
 * Created by Eaun-Ballinger on 20/02/2017.
 *
 *
 */

public interface OnNoteSelectedListener {

    void OnSelectedNote(Notes selectedNote);
    boolean OnLongClickNote(Notes clickedNote);
}
