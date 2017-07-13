package model;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

public class ProjectBean {
	private Project bean;
	private EntityManager entityManager;
	
	public Project getBean()
	{
		return bean;
	}
	public void setBean(Project bean)
	{
		this.bean = bean;
	}
	
	public void init()
	{
		entityManager = Persistence.createEntityManagerFactory("JaakonProjekti").createEntityManager();
	}
	
	public List<Project> getProjectBeans()
	{
		entityManager.getTransaction().begin();
		Query query = entityManager.createNamedQuery("Project.findAll");
		List<Project> result = query.getResultList();
		entityManager.getTransaction().commit();
		return result;
	}
	
	public int persist(Project bean)
	{
		entityManager.getTransaction().begin();
		entityManager.persist(bean);
		entityManager.getTransaction().commit();
		return bean.getId();
	}
	
	public void initialize(int beanNumber)
	{
		bean = entityManager.find(Project.class, beanNumber);
		if(bean == null) throw new IllegalStateException("Bean number " + beanNumber + " not found.");
	}
	
}
