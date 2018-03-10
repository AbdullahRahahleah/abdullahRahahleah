package rahahleah.rahahleah.Beans;
public class HotelScores {
	public String getRawAppealScore() {
		return rawAppealScore;
	}
	public void setRawAppealScore(String rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}
	public String getMovingAverageScore() {
		return movingAverageScore;
	}
	public void setMovingAverageScore(String movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}
	private String rawAppealScore;
	private String movingAverageScore;

}
