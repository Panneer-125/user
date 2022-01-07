package security.user.model;

import java.util.Date;

public class Inwards {
private int godownId;

private String supplierName;

private int invoiceNo;

private Date supplyDate;

private String itemName;

private int quantity;

private String receivedBy;

private int receiptNo;

public int getGodownId() {
	return godownId;
}
public void setGodownId(int godownId) {
	this.godownId = godownId;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
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
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getReceivedBy() {
	return receivedBy;
}
public void setReceivedBy(String receivedBy) {
	this.receivedBy = receivedBy;
}
public int getReceiptNo() {
	return receiptNo;
}
public void setReceiptNo(int receiptNo) {
	this.receiptNo = receiptNo;
}

}
