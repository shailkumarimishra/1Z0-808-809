package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MyAccount implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int id;
	private String username;
	private transient String pwd;

	public MyAccount(int id,String username, String pwd) {
		super();
		this.id=id;
		this.username = username;
		this.pwd = pwd;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String newPwd = pwd;
		oos.writeObject(newPwd);
		int newId=id;
		oos.writeInt(newId);
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String newPwd = (String) ois.readObject();
		pwd = newPwd;
		int newId = ois.readInt();
		id=newId;
	}

	public String getUsername() {
		return username;
	}

	public String getPwd() {
		return pwd;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		MyAccount.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
