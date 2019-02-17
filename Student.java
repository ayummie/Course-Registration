
public class Student {
	private String firstName;
	private String lastName;
	private String studentId;
	private boolean tuitionPaid;
	
	// constructor
	public Student()
	{
		firstName = "";
		lastName = "";
		studentId = "";
	}
	
	public Student(String firstName, String lastName, String studentId, boolean tuitionPaid)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.tuitionPaid = tuitionPaid;
	}
	
	// getters
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getStudentId()
	{
		return studentId;
	}
	
	public boolean getTuitionPaid()
	{
		return tuitionPaid;
	}
	
	// setters
	public void setFirstName(String theNewFirstName)
	{
		this.firstName = theNewFirstName;
	}
	
	public void setLastName(String theNewLastName)
	{
		this.lastName = theNewLastName;
	}
	
	public void setStudentId(String theNewStudentId)
	{
		this.studentId = theNewStudentId;
	}
	
	public void setTuitionPaid(boolean theNewTuition)
	{
		this.tuitionPaid = theNewTuition;
	}
	
	// toString method
	public String toString()
	{
		String s = firstName + " " + lastName + " " + "(" + studentId + ")";
		return s;
	}
}
