package com.uk.umf_solutions.warehousehelperv2.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Eaun-Ballinger on 30/01/2017.
 *
 */

public class Search extends RealmObject {

    @PrimaryKey
    private long searchId;
    private String findQuery;

    public Search(){


    }

    public long getSearchId() {
        return searchId;
    }

    public void setSearchId(long searchId) {
        this.searchId = searchId;
    }

    public String getFindQuery() {
        return findQuery;
    }

    public void setFindQuery(String findQuery) {
        this.findQuery = findQuery;
    }



}
