package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="student_tag")
@NamedQuery(name="StudentTag.findAll", query="SELECT s FROM StudentTag s")
public class StudentTag {
	
	@Id
	@SequenceGenerator(name="STUDENT_TAG_ID_GENERATOR")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_TAG_ID_GENERATOR")
	private int id;
	private int student_id;
	private int tag_id;
	
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
	public int getTagId() {
		return tag_id;
	}
	public void setTagId(int tag_id) {
		this.tag_id = tag_id;
	}
}
