package com.snm.persistence.po;

public class BContentWithBLOBs extends BContent {
    private String brief;

    private String purchaseNote;

    private String otherDetails;

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getPurchaseNote() {
        return purchaseNote;
    }

    public void setPurchaseNote(String purchaseNote) {
        this.purchaseNote = purchaseNote == null ? null : purchaseNote.trim();
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails == null ? null : otherDetails.trim();
    }
}