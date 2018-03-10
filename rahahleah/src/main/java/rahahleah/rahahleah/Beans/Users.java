package rahahleah.rahahleah.Beans;
import java.util.Map;
public class Users {
	private Map<String, String> offerInfo;
	private UserInfo userInfo;
	private Offers offers;

	public Map<String, String> getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(Map<String, String> offerInfo) {
		this.offerInfo = offerInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}
	public Users() {
	}
}