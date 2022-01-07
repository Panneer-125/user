package security.user.model;
import java.util.Date;

public class Return {
private int godownId;
private Date dateDelivery;
private int quanity;
private int invoiceNo;
private String returnedBy;
private int receiptNo;
private int billValue;
private String checkedBy;
public int getGodownId() {
	return godownId;
}
public void setGodownId(int godownId) {
	this.godownId = godownId;
}
public Date getDateDelivery() {
	return dateDelivery;
}
public void setDateDelivery(Date dateDelivery) {
	this.dateDelivery = dateDelivery;
}
public int getQuanity() {
	return quanity;
}
public void setQuanity(int quanity) {
	this.quanity = quanity;
}
public int getInvoiceNo() {
	return invoiceNo;
}
public void setInvoiceNo(int invoiceNo) {
	this.invoiceNo = invoiceNo;
}
public String getReturnedBy() {
	return returnedBy;
}
public void setReturnedBy(String returnedBy) {
	this.returnedBy = returnedBy;
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
public String getCheckedBy() {
	return checkedBy;
}
public void setCheckedBy(String checkedBy) {
	this.checkedBy = checkedBy;
}
}