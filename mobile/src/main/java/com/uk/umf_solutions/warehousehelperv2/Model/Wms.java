package com.uk.umf_solutions.warehousehelperv2.Model;

import io.realm.RealmObject;

/**
 * Created by Eaun-Ballinger on 28/01/2017.
 *
 */

public class Wms extends RealmObject {

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

    public String getMessageActions() {
        return messageActions;
    }

    public void setMessageActions(String messageActions) {
        this.messageActions = messageActions;
    }

    public String getMessageDiscription() {
        return messageDiscription;
    }

    public void setMessageDiscription(String messageDiscription) {
        this.messageDiscription = messageDiscription;
    }

    private long id;
    private String messageTitle;
    private String messageActions;
    private String messageDiscription;
}
