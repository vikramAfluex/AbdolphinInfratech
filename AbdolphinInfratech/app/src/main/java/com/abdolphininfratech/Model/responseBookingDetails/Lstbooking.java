package com.abdolphininfratech.Model.responseBookingDetails;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lstbooking {
    @SerializedName("BranchName")
    @Expose
    private String branchName;
    @SerializedName("CustomerID")
    @Expose
    private String customerID;
    @SerializedName("AssociateID")
    @Expose
    private String associateID;
    @SerializedName("AssociateLoginID")
    @Expose
    private String associateLoginID;
    @SerializedName("AssociateName")
    @Expose
    private String associateName;
    @SerializedName("BookingStatus")
    @Expose
    private String bookingStatus;
    @SerializedName("PK_BookingId")
    @Expose
    private String pKBookingId;
    @SerializedName("BookingDate")
    @Expose
    private String bookingDate;
    @SerializedName("BookingAmount")
    @Expose
    private String bookingAmount;
    @SerializedName("PaymentPlanID")
    @Expose
    private String paymentPlanID;
    @SerializedName("BookingNumber")
    @Expose
    private String bookingNumber;
    @SerializedName("PaidAmount")
    @Expose
    private String paidAmount;
    @SerializedName("PlotArea")
    @Expose
    private String plotArea;
    @SerializedName("PlotAmount")
    @Expose
    private String plotAmount;
    @SerializedName("NetPlotAmount")
    @Expose
    private String netPlotAmount;
    @SerializedName("PK_PLCCharge")
    @Expose
    private String pKPLCCharge;
    @SerializedName("PlotRate")
    @Expose
    private String plotRate;
    @SerializedName("PlotNumber")
    @Expose
    private String plotNumber;
    @SerializedName("CustomerName")
    @Expose
    private String customerName;
    @SerializedName("CustomerLoginID")
    @Expose
    private String customerLoginID;
    @SerializedName("BranchID")
    @Expose
    private String branchID;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAssociateID() {
        return associateID;
    }

    public void setAssociateID(String associateID) {
        this.associateID = associateID;
    }

    public String getAssociateLoginID() {
        return associateLoginID;
    }

    public void setAssociateLoginID(String associateLoginID) {
        this.associateLoginID = associateLoginID;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getPKBookingId() {
        return pKBookingId;
    }

    public void setPKBookingId(String pKBookingId) {
        this.pKBookingId = pKBookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(String bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public String getPaymentPlanID() {
        return paymentPlanID;
    }

    public void setPaymentPlanID(String paymentPlanID) {
        this.paymentPlanID = paymentPlanID;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPlotArea() {
        return plotArea;
    }

    public void setPlotArea(String plotArea) {
        this.plotArea = plotArea;
    }

    public String getPlotAmount() {
        return plotAmount;
    }

    public void setPlotAmount(String plotAmount) {
        this.plotAmount = plotAmount;
    }

    public String getNetPlotAmount() {
        return netPlotAmount;
    }

    public void setNetPlotAmount(String netPlotAmount) {
        this.netPlotAmount = netPlotAmount;
    }

    public String getPKPLCCharge() {
        return pKPLCCharge;
    }

    public void setPKPLCCharge(String pKPLCCharge) {
        this.pKPLCCharge = pKPLCCharge;
    }

    public String getPlotRate() {
        return plotRate;
    }

    public void setPlotRate(String plotRate) {
        this.plotRate = plotRate;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLoginID() {
        return customerLoginID;
    }

    public void setCustomerLoginID(String customerLoginID) {
        this.customerLoginID = customerLoginID;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

}
