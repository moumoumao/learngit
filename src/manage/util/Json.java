package manage.util;

public class Json {
	private int pageCount;
	private boolean success;
	private Object pageData = null;
	private String idCount;
	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getPageData() {
		return pageData;
	}

	public void setPageData(Object pageData) {
		this.pageData = pageData;
	}

	public String getIdCount() {
		return idCount;
	}

	public void setIdCount(String idCount) {
		this.idCount = idCount;
	}

	

}
