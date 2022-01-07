package security.user.model;

public class Report {
private int id;
private int monthlyInwards;
private int monthlyDeliveries;
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