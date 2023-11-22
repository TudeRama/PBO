package id.ac.undiksha.ais.people;

public class Lecturer {
	private String name = "Pak Yudi";
	private String lecturerId = "123456789";
	private boolean gender = true;
	private String adddres = "Singaraja";
	private String bithDate = "November";
	private String faculty = "FTK";
	private String departement ="Undiksha";
	private String studyProgram ="Ilmu Komputer";
	
	public String getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
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
	public String getAdddres() {
		return adddres;
	}
	public void setAdddres(String adddres) {
		this.adddres = adddres;
	}
	public String getBithDate() {
		return bithDate;
	}
	public void setBithDate(String bithDate) {
		this.bithDate = bithDate;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	
	public void printAll() {
		System.out.println(this.name);
		System.out.println(this.adddres);
		System.out.println(this.bithDate);
		System.out.println(this.departement);
		System.out.println(this.faculty);
		System.out.println(this.lecturerId);
		if (this.gender) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
		System.out.println(this.studyProgram);
		
	}
	
}
