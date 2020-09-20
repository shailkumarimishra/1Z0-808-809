package lambdaexpression;

public class Student {
		private int sid;
		private String name;
		private int phone;
		public Student(int sid, String name,int phone) {
			super();
			this.sid = sid;
			this.name =name;
			this.phone = phone;
		}

		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
			
		}
		
		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}

		

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", name=" + name + ",phone=" + phone + "]";
		}

		
		


}
