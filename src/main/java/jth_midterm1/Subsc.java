package jth_midterm1;

public class Subsc {
	String userId;
	String name;
	String channelId;
	String Title;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channalId) {
		this.channelId = channalId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	@Override
	public String toString() {
		return "Subsc [userId=" + userId + ", name=" + name + ", channalId=" + channelId + ", Title=" + Title + "]";
	}

}
