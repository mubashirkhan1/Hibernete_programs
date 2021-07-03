package Employe;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Employes")
public class Employe1 {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String city;
	@OneToMany
	private List<Employeorder> material;
	@Lob
	private byte[] image;

	public Employe1() 
	
	{
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}


	public List<Employeorder> getMaterial() {
		return material;
	}

	public void setMaterial(List<Employeorder> material) {
		this.material = material;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	
    
}
