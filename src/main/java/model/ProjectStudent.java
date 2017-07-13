package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="project_student")
@NamedQuery(name="ProjectStudent.findAll", query="SELECT s FROM ProjectStudent s")
public class ProjectStudent {
	
	@Id
	@SequenceGenerator(name="PROJECT_STUDENT_ID_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROJECT_STUDENT_ID_GENERATOR")
	private int id;
	private int student_id;
	private int project_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return student_id;
	}
	public void setStudentId(int student_id) {
		this.student_id = student_id;
	}
	public int getProjectId() {
		return project_id;
	}
	public void setProjectId(int project_id) {
		this.project_id = project_id;
	}
}
