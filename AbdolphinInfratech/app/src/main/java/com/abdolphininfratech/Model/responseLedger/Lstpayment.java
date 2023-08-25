package com.abdolphininfratech.Model.responseLedger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lstpayment {

    @SerializedName("PK_BookingDetailsId")
    @Expose
    private String pKBookingDetailsId;
    @SerializedName("PK_BookingId")
    @Expose
    private String pKBookingId;
    @SerializedName("InstallmentNo")
    @Expose
    private String installmentNo;
    @SerializedName("InstallmentDate")
    @Expose
    private String installmentDate;
    @SerializedName("PaymentDate")
    @Expose
    private String paymentDate;
    @SerializedName("PaidAmount")
    @Expose
    private String paidAmount;
    @SerializedName("InstallmentAmount")
    @Expose
    private String installmentAmount;
    @SerializedName("PaymentMode")
    @Expose
    private String paymentMode;
    @SerializedName("DueAmount")
    @Expose
    private String dueAmount;

    public String getPKBookingDetailsId() {
        return pKBookingDetailsId;
    }

    public void setPKBookingDetailsId(String pKBookingDetailsId) {
        this.pKBookingDetailsId = pKBookingDetailsId;
    }

    public String getPKBookingId() {
        return pKBookingId;
    }

    public void setPKBookingId(String pKBookingId) {
        this.pKBookingId = pKBookingId;
    }

    public String getInstallmentNo() {
        return installmentNo;
    }

    public void setInstallmentNo(String installmentNo) {
        this.installmentNo = installmentNo;
    }

    public String getInstallmentDate() {
        return installmentDate;
    }

    public void setInstallmentDate(String installmentDate) {
        this.installmentDate = installmentDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
    }
}
