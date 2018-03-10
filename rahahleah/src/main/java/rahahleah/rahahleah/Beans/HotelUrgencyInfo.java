package rahahleah.rahahleah.Beans;
import java.util.ArrayList;

public class HotelUrgencyInfo {
	private String airAttachRemainingTime;
	private String numberOfPeopleViewing;
	private String numberOfPeopleBooked;
	private String numberOfRoomsLeft;
	private String lastBookedTime;
	private String almostSoldStatus;
	private String link;
	private ArrayList<String> almostSoldOutRoomTypeInfoCollection;
	private String airAttachEnabled;
	public String getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	public void setAirAttachRemainingTime(String airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	public String getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	public void setNumberOfPeopleViewing(String numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	public String getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	public void setNumberOfPeopleBooked(String numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	public String getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	public void setNumberOfRoomsLeft(String numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	public String getLastBookedTime() {
		return lastBookedTime;
	}

	public void setLastBookedTime(String lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public ArrayList<String> getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}

	public void setAlmostSoldOutRoomTypeInfoCollection(ArrayList<String> almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	public String getAirAttachEnabled() {
		return airAttachEnabled;
	}

	public void setAirAttachEnabled(String airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

	

	public HotelUrgencyInfo() {
	}
}