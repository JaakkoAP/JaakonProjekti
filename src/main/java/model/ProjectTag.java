package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="project_tag")
@NamedQuery(name="ProjectTag.findAll", query="SELECT p FROM ProjectTag p")
public class ProjectTag {
	
	@Id
	@SequenceGenerator(name="PROJECT_TAG_ID_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROJECT_TAG_ID_GENERATOR")
	private int id;
	private int project_id;
	private int tag_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProjectId() {
		return project_id;
	}
	public void setProjectId(int project_id) {
		this.project_id = project_id;
	}
	public int getTagId() {
		return tag_id;
	}
	public void setTagId(int tag_id) {
		this.tag_id = tag_id;
	}
}
