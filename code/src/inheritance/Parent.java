package inheritance;

public class Parent {
	private String surname;
	private int houseprop;
	private double dadsal;
	


	public Parent(String surname, int houseprop, double dadsal) {
		super();
		this.surname = surname;
		this.houseprop = houseprop;
		this.dadsal = dadsal;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getHouseprop() {
		return houseprop;
	}

	public void setHouseprop(int houseprop) {
		this.houseprop = houseprop;
	}

	public double getDadsal() {
		return dadsal;
	}

	public void setDadsal(double dadsal) {
		this.dadsal = dadsal;
	}
    }
