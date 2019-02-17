
public class Course {
	
	public final static int DEFAULT_STUDENT = 0;
	
	private String courseName; // course name
	private Student[] students = new Student[7]; 
	private int maxStudents;
	private int numberOfStudents;
	
	// default constructor
	public Course()
	{
		this.courseName = "";
	}
	
	public Course(String name, int maxStudent)
	{
		this.courseName = name;
		this.maxStudents = maxStudent;

	}
	
	// getters
	public String getName()
	{
		return courseName;
	}
	
	public int getMaxStudent()
	{
		return maxStudents;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	// setters
	public void setName(String theNewName)
	{
		this.courseName = theNewName;
	}
	
	public void setMaxStudent(int theNewMaxStudent)
	{
		this.maxStudents = theNewMaxStudent;
	}
	
	public void setNumberOfStudents(int theNewNumberOfStudents)
	{
		this.numberOfStudents = theNewNumberOfStudents;
	}
	
	// toString method
	public String toString()
	{
		String s = "Course name: " + courseName + "\nNumber of students enrolled in course "
				+ numberOfStudents + "\nMaximum number of students for enrollment: " + maxStudents
				+ "\nStudents: " + "\n" + students[0] + "\n" + students[1] + "\n" + students[2] + "\n"
				+ students[3] + "\n" + students[4] + "\n" + students[5] + "\n" + students[6] + "\n";
		return s;
	}
		
	// add student 
	public boolean addStudent(Student student) 
	{
		if (numberOfStudents < maxStudents && student.getTuitionPaid())
		{
			students[numberOfStudents] = student;
			numberOfStudents++;
			return true;
		} 
		return false;
	}
	
	// drop student
	public boolean dropStudent(Student student)
	{
		for (int i = 0; i < students.length; i++)
		{
			if (students[i] == student)
			{	
				students[i] = null;
				numberOfStudents--;
				return true;
			}
		}
		return false;
	}
	
}