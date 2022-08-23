package json.domain;

public class Header {
	private String code;
	private String message;

	public Header() {

	}

	public Header(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Header [code=" + code + ", message=" + message + "]";
	}
	
	
}
