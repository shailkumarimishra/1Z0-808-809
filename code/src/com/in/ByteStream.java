package com.in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 Object-> OutputStream ->ByteArrayOutputStream
 					   ->FileOutputStream
 					   ->FilterOutputStream->PrintStream
 					   					   ->DataOutputStream
 					   					   ->BufferedOutputStream
 					   ->ObjectOutputStream
 					   ->PipedOutputStream
 					   
 	   -> InputStream ->ByteArrayInputStream
 	   				  ->FileInputStream
 	   				  ->FilterInputStream->LineNumberInputStream
 	   				  					 ->DataInputStream
 	   				  					 ->PushBackInputStream
 	   				  					 ->BufferedInputStream
 	   				 ->ObjectInputStream
 	   				 ->PipedInputStream 
 	   				 ->SequenceInputStream
 	   				 ->StringBufferInputStream
#Definition:-

1.PipedInputStream and PipedOutputStream:-
These classes create a communication channel on which data can be send and received.
PipedOutputStream sends the data and PipedInputStream receives the data sent on the channel.

2.FileInputStream and FileOutputStream:-
FileInputStream receives a byte stream from a file, FileOutputStream writes a byte stream 
into a file.

3.FilterInputStream and FilterOutputStream:-
These filtered streams are used to add functionalities to plain streams. The output of an
InputStream can be filtered using FilterInputStream.The output of an OutputStream can be 
filtered using FilterOutputStream.

4.BufferedInputStream and BufferedOutputStream:-
BufferedInputStream add buffering capabilities to an InputStream.
BufferedOutputStream add buffering capabilities to an OutputStream.

5.PushBackInputStream:-A subclass of FilterInputStream,it adds PushBack functionalities to
an input stream.

6.DataInputStream and DataOutputStream:-
DataInputStream can be used to read java primitive data types from an input stream.
DataOutputStream can be used to write java primitive data types to an output stream. 
 */

//Reading a byte stream.

public class ByteStream {
	public static void main(String[] args) {
		try(FileInputStream fs=new FileInputStream("AddTwoNumbers.class")){
			int val=0;
			while((val=fs.read())!=-1) {
				System.out.print((char)val);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
