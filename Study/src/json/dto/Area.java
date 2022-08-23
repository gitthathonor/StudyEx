package json.dto;

public class Area {
	private int seq;
	private String place;
	private String title;
	private String subtitle;
	private String addr;
	private String tel;
	
	public Area() {
		
	}

	public Area(int seq, String place, String title, String subtitle, String addr, String tel) {
		this.seq = seq;
		this.place = place;
		this.title = title;
		this.subtitle = subtitle;
		this.addr = addr;
		this.tel = tel;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Area [seq=" + seq + ", place=" + place + ", title=" + title + ", subtitle=" + subtitle + ", addr="
				+ addr + ", tel=" + tel + "]";
	}
}
