package com.in;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
	public static void main(String[] args) {
		try (DataOutputStream ds = new DataOutputStream(new FileOutputStream("temp.data"))) {
			for (int i = 0; i < 10; i++) {
				ds.writeByte(i);
				ds.writeShort(i);
				ds.writeDouble(i);
				ds.writeChar(i);
				ds.writeFloat(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (DataInputStream di = new DataInputStream(new FileInputStream("temp.data"))) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d %d %g %c %g \n", di.readByte(), di.readShort(), di.readDouble(), di.readChar(),
						di.readFloat());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
