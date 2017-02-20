package com.uk.umf_solutions.warehousehelperv2.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Eaun-Ballinger on 28/01/2017.
 *
 */

public class Wms extends RealmObject {
    @PrimaryKey
    private long wmsId;
    private String messageTitle;
    private String messageActions;
    private String messageDescription;

    public Wms(){
    }

    public Wms(Wms wms){
        this.wmsId = wms.getWmsId();
        this.messageTitle = wms.getMessageTitle();
        this.messageActions = wms.getMessageActions();
        this.messageDescription = wms.getMessageDescription();

    }

    public Wms(long wmsId,String messageTitle,String messageActions,String messageDescription){
            this.wmsId = wmsId;
            this.messageTitle = messageTitle;
            this.messageActions = messageActions;
            this.messageDescription = messageDescription;
    }

    public long getWmsId() {
        return wmsId;
    }

    public void setWmsId(long wmsId) {
        this.wmsId = wmsId;
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

    public String getMessageDescription() {
        return messageDescription;
    }

    public void setMessageDescription(String messageDescription) {
        this.messageDescription = messageDescription;
    }

}
