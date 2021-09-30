package serialization;

import java.io.Serializable;

public class Demo implements Serializable {

	private static final long serialVersionUID = 1L;
	private int a;
	private String s;

	public Demo(int a, String s) {
		super();
		this.a = a;
		this.s = s;
	}

	public int getA() {
		return a;
	}

	public String getS() {
		return s;
	}

}
