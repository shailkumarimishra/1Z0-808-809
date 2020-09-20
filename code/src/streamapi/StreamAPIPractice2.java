package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/*
 Q1.find all transactions in the year 2011 and sort them by value(asc)?
 Q2. what are all the unique cities where the traders work?
 Q3. find all traders from Cambridge and sort them by name?
 Q4. return a string of all the traders name sorted alphabetically?
 Q5. Are any traders based in Milan?
 Q6. print the values of all transaction from the traders living in Cambridge?
 Q7. what is the highest value of all transaction?
 Q8. find the transaction with the smallest value?
 */

public class StreamAPIPractice2 {
	private static List<Transaction> testData() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
		new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
		new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
		return transactions;
		}

	public static void main(String[] args) {
//		Q1.find all transactions in the year 2011 and sort them by value(asc)?
	/*	testData().stream().filter((t)->{return t.getYear()==2011;}).sorted(Comparator.comparing(Transaction::getValue)).
		collect(Collectors.toList()).forEach(System.out::println);*/
		
//		Q2. what are all the unique cities where the traders work?
		testData().stream().map((t)->t.getTrader().getCity()).collect(Collectors.toSet()).forEach(System.out::println);
		
//		Q3. find all traders from Cambridge and sort them by name?
		testData().stream().map(Transaction::getTrader).filter(t->"Cambridge".equals(t.getCity())).sorted(Comparator.comparing(Trader::getName)).
		collect(Collectors.toList()).forEach(System.out::println);
		
//		Q4. return a string of all the traders name sorted alphabetically?
		String collect = testData().stream().map(t->t.getTrader().getName()).distinct().sorted().collect(Collectors.joining(","));
		System.out.println(collect);
		
//		Q5. Are any traders based in Milan?
		boolean anyMatch = testData().stream().anyMatch(t->"Milan".equals(t.getTrader().getCity()));
		System.out.println(anyMatch);
		
//		Q6. print the values of all transaction from the traders living in Cambridge?
		testData().stream().filter(t->"Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue).collect(Collectors.toList()).
		forEach(System.out::println);
		
//		Q7. what is the highest value of all transaction?
		Transaction transaction = testData().stream().max(Comparator.comparing(Transaction::getValue)).get();
		System.out.println(transaction.getValue());
		Integer reduce = testData().stream().map(Transaction::getValue).reduce(Integer::max).get();
		System.out.println(reduce);
		
//		 Q8. find the transaction with the smallest value?
		Transaction transaction2 = testData().stream().min(Comparator.comparing(Transaction::getValue)).get();
		System.out.println(transaction2);
		
		Transaction transaction3 = testData().stream().sorted(Comparator.comparing(Transaction::getValue)).findFirst().get();
		System.out.println(transaction3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
