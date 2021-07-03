package Employe;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Employeorder")
public class Employeorder {

	@Id
	private int orderid;
	@Temporal(TemporalType.DATE)
	private Date orderdate;
	private String ordermaterial;
	@ManyToOne
    private Employe1 emplye;
	public Employeorder() {

		super();

	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public String getOrdermaterial() {
		return ordermaterial;
	}

	public void setOrdermaterial(String ordermaterial) {
		this.ordermaterial = ordermaterial;
	}
	public Employe1 getEmplye() {
		return emplye;
	}

	public void setEmplye(Employe1 emplye) {
		this.emplye = emplye;
	}
}
