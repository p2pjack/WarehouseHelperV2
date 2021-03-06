package com.uk.umf_solutions.warehousehelperv2.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Eaun-Ballinger on 28/01/2017.
 *
 */

public class Notes extends RealmObject{
    @PrimaryKey
    private long noteId;
    private String messageTitle;
    private String messageActions;
    private String messageDescription;
    private String imagePath;
    private long dateAdded;

    public long getNoteId() {
        return noteId;
    }

    public void setNoteId(long noteId) {
        this.noteId = noteId;
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

    public String getMessageActions() {
        return messageActions;
    }

    public void setMessageActions(String messageActions) {
        this.messageActions = messageActions;
    }
}
