package streamapi;

import java.math.BigDecimal;

public class IncomeDetails {
		private String city;
		private String country;
		private String gender;
		private Double amount;
		private String currency;
		public IncomeDetails(String city, String country, String gender,String currency, Double amount) {
			super();
			this.city = city;
			this.country = country;
			this.gender = gender;
			this.amount = amount;
			this.currency = currency;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		

}


