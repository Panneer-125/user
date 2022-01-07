package security.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Inwards")
@Entity
public class InwardsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="godown_id")
	private int godownId;
	
    @Column(name="supplier_name")
    private String supplierName;
    
    @Column(name="invoice_no")
    private int invoiceNo;
    
    @Column(name="supply_date")
    private Date supplyDate;
    
    @Column(name="item_name")
    private String itemName;
    
    @Column(name="quantity")
    private int quantity;
    
    @Column(name="received_by")
    private String receivedBy;
    
    @Column(name="receipt_no")
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
