package rahahleah.rahahleah.Beans;
import java.util.ArrayList;

public class OfferDateRange {

	private ArrayList<String> travelStartDate;
	private ArrayList<String> travelEndDate;
	private String lengthOfStay;

	public ArrayList<String> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(ArrayList<String> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public ArrayList<String> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(ArrayList<String> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public OfferDateRange() {
	}
}