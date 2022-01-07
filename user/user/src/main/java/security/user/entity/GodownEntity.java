package security.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Godown")
public class GodownEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="godown_id")
	private int godownid;
	
	@Column(name="godown_location")
	private String godownlocation;
	
	@Column(name="capacity_quintals")
	private int capacityquintals;
	
	@Column(name="godown_manager")
    private String godownmanager;
	
	@Column(name="start_date")
    private Date startdate;
	
	public int getGodownid() {
		return godownid;
	}
	public void setGodownid(int godownid) {
		this.godownid = godownid;
	}
	public String getGodownlocation() {
		return godownlocation;
	}
	public void setGodownlocation(String godownlocation) {
		this.godownlocation = godownlocation;
	}
	public int getCapacityquintals() {
		return capacityquintals;
	}
	public void setCapacityquintals(int capacityquintals) {
		this.capacityquintals = capacityquintals;
	}
	public String getGodownmanager() {
		return godownmanager;
	}
	public void setGodownmanager(String godownmanager) {
		this.godownmanager = godownmanager;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}


}
