package security.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="returns")
public class ReturnEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="godown_Id")
	private int godownId;
	@Column(name="date_Delivery")
	private Date dateDelivery;
	@Column(name="quanity")
	private int quanity;
	@Column(name="invoice_no")
	private int invoiceNo;
	@Column(name="returned_By")
	private String returnedBy;
	@Column(name="receipt_no")
	private int receiptNo;
	@Column(name="bill_value")
	private int billValue;
	@Column(name="checked_by")
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