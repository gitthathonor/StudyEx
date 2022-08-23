package json.domain;

public class Item {
	
	private int UC_SEQ;
	private String MAIN_TITLE;
	private String GUGUN_NM;
	private double LAT;
	private double LNG;
	private String PLACE;
	private String TITLE;
	private String SUBTITLE;
	private String ADDR1;
	private String CNTCT_TEL;
	private String HOMEPAGE_URL;
	private String TRFC_INFO;
	private String USAGE_DAY;
	private String HLDY_INFO;
	private String USAGE_DAY_WEEK_AND_TIME;
	private String USAGE_AMOUNT;
	private String MIDDLE_SIZE_RM1;
	private String MAIN_IMG_NORMAL;
	private String MAIN_IMG_THUMB;
	private String ITEMCNTNTS;
	
	public Item() {
		
	}

	public Item(int uC_SEQ, String mAIN_TITLE, String gUGUN_NM, double lAT, double lNG, String pLACE, String tITLE,
			String sUBTITLE, String aDDR1, String cNTCT_TEL, String hOMEPAGE_URL, String tRFC_INFO, String uSAGE_DAY,
			String hLDY_INFO, String uSAGE_DAY_WEEK_AND_TIME, String uSAGE_AMOUNT, String mIDDLE_SIZE_RM1,
			String mAIN_IMG_NORMAL, String mAIN_IMG_THUMB, String iTEMCNTNTS) {
		super();
		UC_SEQ = uC_SEQ;
		MAIN_TITLE = mAIN_TITLE;
		GUGUN_NM = gUGUN_NM;
		LAT = lAT;
		LNG = lNG;
		PLACE = pLACE;
		TITLE = tITLE;
		SUBTITLE = sUBTITLE;
		ADDR1 = aDDR1;
		CNTCT_TEL = cNTCT_TEL;
		HOMEPAGE_URL = hOMEPAGE_URL;
		TRFC_INFO = tRFC_INFO;
		USAGE_DAY = uSAGE_DAY;
		HLDY_INFO = hLDY_INFO;
		USAGE_DAY_WEEK_AND_TIME = uSAGE_DAY_WEEK_AND_TIME;
		USAGE_AMOUNT = uSAGE_AMOUNT;
		MIDDLE_SIZE_RM1 = mIDDLE_SIZE_RM1;
		MAIN_IMG_NORMAL = mAIN_IMG_NORMAL;
		MAIN_IMG_THUMB = mAIN_IMG_THUMB;
		ITEMCNTNTS = iTEMCNTNTS;
	}

	public int getUC_SEQ() {
		return UC_SEQ;
	}

	public void setUC_SEQ(int uC_SEQ) {
		UC_SEQ = uC_SEQ;
	}

	public String getMAIN_TITLE() {
		return MAIN_TITLE;
	}

	public void setMAIN_TITLE(String mAIN_TITLE) {
		MAIN_TITLE = mAIN_TITLE;
	}

	public String getGUGUN_NM() {
		return GUGUN_NM;
	}

	public void setGUGUN_NM(String gUGUN_NM) {
		GUGUN_NM = gUGUN_NM;
	}

	public double getLAT() {
		return LAT;
	}

	public void setLAT(double lAT) {
		LAT = lAT;
	}

	public double getLNG() {
		return LNG;
	}

	public void setLNG(double lNG) {
		LNG = lNG;
	}

	public String getPLACE() {
		return PLACE;
	}

	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getSUBTITLE() {
		return SUBTITLE;
	}

	public void setSUBTITLE(String sUBTITLE) {
		SUBTITLE = sUBTITLE;
	}

	public String getADDR1() {
		return ADDR1;
	}

	public void setADDR1(String aDDR1) {
		ADDR1 = aDDR1;
	}

	public String getCNTCT_TEL() {
		return CNTCT_TEL;
	}

	public void setCNTCT_TEL(String cNTCT_TEL) {
		CNTCT_TEL = cNTCT_TEL;
	}

	public String getHOMEPAGE_URL() {
		return HOMEPAGE_URL;
	}

	public void setHOMEPAGE_URL(String hOMEPAGE_URL) {
		HOMEPAGE_URL = hOMEPAGE_URL;
	}

	public String getTRFC_INFO() {
		return TRFC_INFO;
	}

	public void setTRFC_INFO(String tRFC_INFO) {
		TRFC_INFO = tRFC_INFO;
	}

	public String getUSAGE_DAY() {
		return USAGE_DAY;
	}

	public void setUSAGE_DAY(String uSAGE_DAY) {
		USAGE_DAY = uSAGE_DAY;
	}

	public String getHLDY_INFO() {
		return HLDY_INFO;
	}

	public void setHLDY_INFO(String hLDY_INFO) {
		HLDY_INFO = hLDY_INFO;
	}

	public String getUSAGE_DAY_WEEK_AND_TIME() {
		return USAGE_DAY_WEEK_AND_TIME;
	}

	public void setUSAGE_DAY_WEEK_AND_TIME(String uSAGE_DAY_WEEK_AND_TIME) {
		USAGE_DAY_WEEK_AND_TIME = uSAGE_DAY_WEEK_AND_TIME;
	}

	public String getUSAGE_AMOUNT() {
		return USAGE_AMOUNT;
	}

	public void setUSAGE_AMOUNT(String uSAGE_AMOUNT) {
		USAGE_AMOUNT = uSAGE_AMOUNT;
	}

	public String getMIDDLE_SIZE_RM1() {
		return MIDDLE_SIZE_RM1;
	}

	public void setMIDDLE_SIZE_RM1(String mIDDLE_SIZE_RM1) {
		MIDDLE_SIZE_RM1 = mIDDLE_SIZE_RM1;
	}

	public String getMAIN_IMG_NORMAL() {
		return MAIN_IMG_NORMAL;
	}

	public void setMAIN_IMG_NORMAL(String mAIN_IMG_NORMAL) {
		MAIN_IMG_NORMAL = mAIN_IMG_NORMAL;
	}

	public String getMAIN_IMG_THUMB() {
		return MAIN_IMG_THUMB;
	}

	public void setMAIN_IMG_THUMB(String mAIN_IMG_THUMB) {
		MAIN_IMG_THUMB = mAIN_IMG_THUMB;
	}

	public String getITEMCNTNTS() {
		return ITEMCNTNTS;
	}

	public void setITEMCNTNTS(String iTEMCNTNTS) {
		ITEMCNTNTS = iTEMCNTNTS;
	}

	@Override
	public String toString() {
		return "Item [UC_SEQ=" + UC_SEQ + ", MAIN_TITLE=" + MAIN_TITLE + ", GUGUN_NM=" + GUGUN_NM + ", LAT=" + LAT
				+ ", LNG=" + LNG + ", PLACE=" + PLACE + ", TITLE=" + TITLE + ", SUBTITLE=" + SUBTITLE + ", ADDR1="
				+ ADDR1 + ", CNTCT_TEL=" + CNTCT_TEL + ", HOMEPAGE_URL=" + HOMEPAGE_URL + ", TRFC_INFO=" + TRFC_INFO
				+ ", USAGE_DAY=" + USAGE_DAY + ", HLDY_INFO=" + HLDY_INFO + ", USAGE_DAY_WEEK_AND_TIME="
				+ USAGE_DAY_WEEK_AND_TIME + ", USAGE_AMOUNT=" + USAGE_AMOUNT + ", MIDDLE_SIZE_RM1=" + MIDDLE_SIZE_RM1
				+ ", MAIN_IMG_NORMAL=" + MAIN_IMG_NORMAL + ", MAIN_IMG_THUMB=" + MAIN_IMG_THUMB + ", ITEMCNTNTS="
				+ ITEMCNTNTS + "]";
	}
	
	
	
	
}
