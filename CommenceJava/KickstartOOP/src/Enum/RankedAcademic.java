package Enum;

public enum RankedAcademic {
	Excellent ("Excellent"),
	VeryGood ("Very Good"),
	Good ("Good"),
	FairlyGood ("Fairly Good"),
	Average ("Average"),
	BelowAverage ("Below Average"),
	Week ("Week"),
	Fail ("Fail");
	
	private String msgString;
	private RankedAcademic(String msg) {
		this.msgString = msg;
	}
	public String Decription() {
		return this.msgString;
	}
}
