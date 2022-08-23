package json.dto;

import json.domain.GetAttractionKr;

public class RespDto {
	private GetAttractionKr getAttractionKr;

	public RespDto() {

	}

	public RespDto(GetAttractionKr getAttractionKr) {
		this.getAttractionKr = getAttractionKr;
	}

	public GetAttractionKr getGetAttractionKr() {
		return getAttractionKr;
	}

	public void setGetAttractionKr(GetAttractionKr getAttractionKr) {
		this.getAttractionKr = getAttractionKr;
	}

	@Override
	public String toString() {
		return "RespDto [getAttractionKr=" + getAttractionKr + "]";
	}

}
