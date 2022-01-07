package security.user.model;
import java.util.Date;

public class Deliveries {
private int godownId;

private String itemName;

private int invoiceNo;

private Date supplyDate;

private Date deliveryDate;

private String deliveredTo;

private int quantity;

private String purpose;

private int receiptNo;

private int billValue;

public int getGodownId() {
	return godownId;
}
public void setGodownId(int godownId) {
	this.godownId = godownId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getInvoiceNo() {
	return invoiceNo;
}
public void setInvoiceNo(int invoiceNo) {
	this.invoiceNo = invoiceNo;
}
public Date getSupplyDate() {
	return supplyDate;
}
public void setSupplyDate(Date supplyDate) {
	this.supplyDate = supplyDate;
}
public Date getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(Date deliveryDate) {
	this.deliveryDate = deliveryDate;
}
public String getDeliveredTo() {
	return deliveredTo;
}
public void setDeliveredTo(String deliveredTo) {
	this.deliveredTo = deliveredTo;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getPurpose() {
	return purpose;
}
public void setPurpose(String purpose) {
	this.purpose = purpose;
}
public int getReceiptNo() {
	return receiptNo;
}
public void setReceiptNo(int receiptNo) {
	this.receiptNo = receiptNo;
}
public int getBillValue() {
	return billValue;
}
public void setBillValue(int billValue) {
	this.billValue = billValue;
}

}
