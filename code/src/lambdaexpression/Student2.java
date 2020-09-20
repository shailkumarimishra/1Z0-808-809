package lambdaexpression;

public class Student2 {
		private int sid;
		private String firstName;
		private String lastName;
		private int phone;
		public Student2(int sid, String firstName,String lastName,int phone) {
			super();
			this.sid = sid;
			this.firstName =firstName;
			this.lastName=lastName;
			this.phone = phone;
		}

		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getfirstName() {
			return firstName;
		}
		public void setfirstName(String name) {
			this.firstName = name;
			
		}
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getPhone() {
			return phone;
		}
		public void setPhone(int phone) {
			this.phone = phone;
		}

		

		@Override
		public String toString() {
			return "Student2 [sid=" + sid + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + sid;
			return 0;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student2 other = (Student2) obj;
			if (sid != other.sid)
				return false;
			return true;
		}

		
		

}
