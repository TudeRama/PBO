package id.ac.undiksha.ais.people;

public class Student {

	private String studentId;
	private String name;
	private String birthDate;
	private boolean gender; //0 for female, 1 for male
	private String address;
	private String smtr;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isGender() {
		return gender;
	}

	public String setGender(boolean gender) {
		if (this.gender) {
			return "Male";
		} else {
			return "Female";
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSmtr() {
		return smtr;
	}

	public void setSmtr(String smtr) {
		this.smtr = smtr;
	}

	public String getStudentId() {
		return this.studentId;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
	
}
