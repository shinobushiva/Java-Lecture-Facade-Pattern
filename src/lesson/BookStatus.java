package lesson;

public enum BookStatus {
	NOT_STORED("所蔵してません"), LENDED("貸出中です"), AVAILABLE("貸し出せます");

	private final String message;

	private BookStatus(final String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return message;
	}

}
