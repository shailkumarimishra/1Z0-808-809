package api;

public class QBasedOnString {
public static String reverseWord(String s) {
//	char arr[]=new char[s.length()];
	String reverse="";
	StringBuilder sb=new StringBuilder();//capacity of StringBuilder is 16 bytes
	System.out.println(sb.capacity());
//	int j=0;
	for(int i=s.length()-1;i>=0;i--) {
		//System.out.println(s.charAt(i));
//		arr[j++]=s.charAt(i);
//		reverse=reverse+s.charAt(i);
		sb.append(s.charAt(i));
	}
	sb.trimToSize();
	System.out.println(sb.capacity());
	return sb.toString();	
}
public static String reverseSentence(String source) {
String[] words = source.split(" ");
String reverse="";
for(int i=words.length-1;i>=0;i--) {
	reverse=reverse.concat(words[i]).concat(" ");
}


return reverse;
}
	public static void main(String[] args) {
	String result=reverseWord("SHAIL");
	String outcome=reverseSentence("My Name Is Shail kumari s mishra");
	System.out.println(result);
	System.out.println(outcome);

	}

}
