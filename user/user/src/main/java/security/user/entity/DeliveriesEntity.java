package security.user.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Deliveries")
public class DeliveriesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="godown_id")
	private int godownId;
	
    @Column(name="item_Name")
	private String itemName;
    
    @Column(name="invoice_No")
    private int invoiceNo;
    
    @Column(name="supply_Date")
    private Date supplyDate;
    
    @Column(name="delivery_Date")
    private Date deliveryDate;
    
    @Column(name="delivered_To")
    private String deliveredTo;
    
    @Column(name="quantity")
    private int quantity;
    
    @Column(name="purpose")
    private String purpose;
    
    @Column(name="receipt_No")
    private int receiptNo;
    
    @Column(name="bill_Value")
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
