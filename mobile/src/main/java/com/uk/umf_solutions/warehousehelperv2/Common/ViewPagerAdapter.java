package com.uk.umf_solutions.warehousehelperv2.common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.uk.umf_solutions.warehousehelperv2.Ui.Cigma.CigmaListFragment;
import com.uk.umf_solutions.warehousehelperv2.Ui.Notes.NoteListFragment;
import com.uk.umf_solutions.warehousehelperv2.Ui.Suppliers.SupplierListFragment;
import com.uk.umf_solutions.warehousehelperv2.Ui.Wms.WmsListFragment;

/**
 * Created by Eaun-Ballinger on 19/02/2017.
 *
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment selectedFragment;
        switch (position){
            case 0: selectedFragment = new WmsListFragment();
                break;
            case 1: selectedFragment = new CigmaListFragment();
                break;
            case 2: selectedFragment = new NoteListFragment();
                break;
            case 3: selectedFragment = new SupplierListFragment();
                break;
            case 4: selectedFragment = new CigmaListFragment();
                break;
            default: selectedFragment = new WmsListFragment();
                break;
        }
        return selectedFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position){
            case    0:  title = "WMS";  break;
            case    1:  title = "CIGMA"; break;
            case    2:  title = "NOTES"; break;
            case    3:  title = "SUPPLIER"; break;
            case    4:  title ="CALCULATOR"; break;
        }
        return title;
    }
}
