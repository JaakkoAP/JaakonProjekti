package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="project")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project
{
	@Id
	@SequenceGenerator(name="PROJECT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROJECT_ID_GENERATOR")
	private int id;
	private String company;
	private String email;
	private String description;
	private boolean open_for_students;
	
	public void setId(int extId)
	{
		id = extId;
	}
	public void setCorporation(String corp)
	{
		company = corp;
	}
	public void setEmail(String extEmail)
	{
		email = extEmail;
	}
	public void setDescription(String desc)
	{
		description = desc;
	}
	public boolean setAvailability()
	{
		return open_for_students;
	}
	
	public int getId()
	{
		return id;
	}
	public String getCorporation()
	{
		return company;
	}
	public String getEmail()
	{
		return email;
	}
	public String getDescription()
	{
		return description;
	}
	public boolean getAvailability()
	{
		return open_for_students;
	}
}