package json.domain;

import java.util.ArrayList;

public class GetAttractionKr {

	private Header header;
	private ArrayList<Item> item = null;
	private int numOfRows;
	private int pageNo;
	private int totalCount;

	public GetAttractionKr() {

	}

	public GetAttractionKr(Header header, ArrayList<Item> item, int numOfRows, int pageNo, int totalCount) {
		this.header = header;
		this.item = item;
		this.numOfRows = numOfRows;
		this.pageNo = pageNo;
		this.totalCount = totalCount;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public ArrayList<Item> getItem() {
		return item;
	}

	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	@Override
	public String toString() {
		return "GetAttractionKr [header=" + header + ", item=" + item + ", numOfRows=" + numOfRows + ", pageNo="
				+ pageNo + ", totalCount=" + totalCount + "]";
	}
	
	

}
