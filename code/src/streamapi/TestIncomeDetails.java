package streamapi;

import java.util.Arrays;
import java.util.List;

public class TestIncomeDetails {
	public static List<IncomeDetails> getIncomeTestData(){
		List<IncomeDetails> income=Arrays.asList(new IncomeDetails("IND","IND","M","INR",987.9),
				new IncomeDetails("Banglore","IND","F","INR",96.30),
				new IncomeDetails("New Delhi","IND","M","INR",56.00),
				new IncomeDetails("New Delhi","IND","F","INR",56.02),
				new IncomeDetails("England","UK","F","GBP",7861.31),
				new IncomeDetails("Scotland","UK","M","GBP",7862.62),
				new IncomeDetails("California","USA","F","USD",500.00),
				new IncomeDetails("New York","USA","M","USD",600.00));
		return income;
	}

	public static void main(String[] args) {

	}

}
