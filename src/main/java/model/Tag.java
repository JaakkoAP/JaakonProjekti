package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="tag")
@NamedQuery(name="Tag.findAll", query="SELECT t FROM Tag t")
public class Tag
{
	@Id
	@SequenceGenerator(name="TAG_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAG_ID_GENERATOR")
	private int id;
	private String tag_name;
	
	public void setId(int extId)
	{
		id = extId;
	}
	public void setName(String name)
	{
		tag_name = name;
	}

	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return tag_name;
	}
}