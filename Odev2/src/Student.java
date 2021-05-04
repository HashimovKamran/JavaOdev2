
public class Student extends User{
	private String myCourse;
	private String numberOfHomework;
	private String attendance;

	public String getMyCourse() {
		return myCourse;
	}

	public void setMyCourse(String myCourse) {
		this.myCourse = myCourse;
	}

	public String getNumberOfHomework() {
		return numberOfHomework;
	}

	public void setNumberOfHomework(String numberOfHomework) {
		this.numberOfHomework = numberOfHomework;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
}
