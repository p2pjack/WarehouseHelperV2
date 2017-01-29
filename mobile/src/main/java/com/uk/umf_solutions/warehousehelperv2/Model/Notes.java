package com.uk.umf_solutions.warehousehelperv2.Model;

import io.realm.RealmObject;

/**
 * Created by Eaun-Ballinger on 28/01/2017.
 *
 */

public class Notes extends RealmObject{

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessageDescription() {
        return messageDescription;
    }

    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public long getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(long dateAdded) {
        this.dateAdded = dateAdded;
    }

    private long id;
    private String messageTitle;
    private String messageDescription;
    private String imagePath;
    private long dateAdded;

}
