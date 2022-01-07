package security.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Report")
public class ReportEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private int id;
	
	@Column(name="monthly_Inwards")
	private int monthlyInwards;
	
	@Column(name="monthly_Deliveries")
	private int monthlyDeliveries;
	
	@Column(name="monthly_Returns")
	private int monthlyReturns;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMonthlyInwards() {
		return monthlyInwards;
	}

	public void setMonthlyInwards(int monthlyInwards) {
		this.monthlyInwards = monthlyInwards;
	}

	public int getMonthlyDeliveries() {
		return monthlyDeliveries;
	}

	public void setMonthlyDeliveries(int monthlyDeliveries) {
		this.monthlyDeliveries = monthlyDeliveries;
	}

	public int getMonthlyReturns() {
		return monthlyReturns;
	}

	public void setMonthlyReturns(int monthlyReturns) {
		this.monthlyReturns = monthlyReturns;
	}
}