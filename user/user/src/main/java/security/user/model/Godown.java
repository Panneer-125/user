package security.user.model;

import java.util.Date;

public class Godown {
private int godownid;

private String godownlocation;

private int capacityquintals;

private String godownmanager;

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
