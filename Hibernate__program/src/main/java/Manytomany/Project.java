package Manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	private String name;
	@ManyToMany(mappedBy = "projects")
	private List<Worker> workers;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Worker> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Worker> workers) {
		this.workers = workers;
	}
	public Project(int pid, String name, List<Worker> workers) {
		super();
		this.pid = pid;
		this.name = name;
		this.workers = workers;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
}
