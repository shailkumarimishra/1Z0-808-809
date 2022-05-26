package serialization;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

import javax.xml.bind.DatatypeConverter;

public class CorrelationMatrixTable {
	public String decodeString(String dataSerialized, String toReplace, String replacement) throws IOException {
		byte[] decodedStr = Base64.getDecoder().decode(dataSerialized.getBytes());
		InputStream in = new ByteArrayInputStream(decodedStr);
		System.out.println("Deserialised data: \n" + in.read());

        System.out.println("Original String: " + new String(decodedStr, "utf-8"));
		String dStr = new String(decodedStr);
		
		System.out.println(dStr);
		String newDStr = dStr.replaceFirst(toReplace, replacement);
		System.out.println(newDStr);
		byte[] encodedNewStr = Base64.getEncoder().encode(newDStr.getBytes());
		return new String(encodedNewStr);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		String dataSerialized = "rO0ABXNyADpjb20uYWxzdG9tLnBvd2VyLnR0dC5yZC5jb3JyZWxhdGlvbi5Db3JyZWxhdGlvbK1hdHJpeFRhYmxlraHFJLY3qxQCAAFbAAttYXRyaXhUYWJsZXQAFFtbTGphdmEvbGFuZy9PYmplY3Q7eHB1cgAUW1tMamF2YS5sYW5nLK9iamVjdDsYv/tT5GvbyglAAHhwAAAAAA==";
		String newDataSerialized = new CorrelationMatrixTable().decodeString(dataSerialized, "com.alstom", "uk.rugby");
		System.out.println(newDataSerialized);
		byte[] decoded = DatatypeConverter.parseBase64Binary(dataSerialized);
		ByteArrayInputStream bais=new ByteArrayInputStream(decoded);
		System.out.println(new String(decoded));
		System.out.println();
		int k=0;
		String s="";
		while((k=bais.read())!=-1) {
			char c=(char)k;
			s+=c;
		}
		System.out.println(s);
		System.out.println();
		ObjectInputStream ois=new ObjectInputStream(bais);
		for(int i=0;i<ois.available();) {
			System.out.print(""+(char)ois.read());
			
		}
//		Object readObject = ois.readObject();
//		System.out.println(readObject);
	}
}
