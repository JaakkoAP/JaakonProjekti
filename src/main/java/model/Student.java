package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student
{
	@Id
	@SequenceGenerator(name="STUDENT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_ID_GENERATOR")
	private int id;
	private String first_name;
	private String last_name;
	private String student_id;
	private String email;
	private float grade;
	private int credits;
	private boolean available;
	
	public void setId(int extId)
	{
		id = extId;
	}
	public void setFirstName(String firstname)
	{
		first_name = firstname;
	}
	public void setLastName(String lastname)
	{
		last_name = lastname;
	}
	public void setStudentId(String extStudentId)
	{
		student_id = extStudentId;
	}
	public void setEmail(String extEmail)
	{
		email = extEmail;
	}
	public void setGrade(float extGrade)
	{
		grade = extGrade;
	}
	public void setScore(int extScore)
	{
		credits = extScore;
	}
	public void setAvailability(boolean availability)
	{
		available = availability;
	}
	
	public int getId()
	{
		return id;
	}
	public String getFirstName()
	{
		return first_name;
	}
	public String getLastName()
	{
		return last_name;
	}
	public String getStudentId()
	{
		return student_id;
	}
	public String getEmail()
	{
		return email;
	}
	public float getGrade()
	{
		return grade;
	}
	public int getScore()
	{
		return credits;
	}
	public boolean getAvailability()
	{
		return available;
	}
}