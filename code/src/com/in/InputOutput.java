package com.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
/*
 Stream :- It an ordered sequence of data.
 
 Types of Stream:-
 1. Character stream(text based) e.g; text files, document files, csv files,Html files,Xml files
 2. Binary stream(data based) e.g; .class file, Zip file,images(jpg,png)
 
 Q1. How to read & write characters from txt file?
 Ans:- with the help of Reader and Writer Abstract class.
 Q2. How to read & write data(bytes) from binary class?
 Ans:- with the help of InputStream & OutPutStream.
 
  NOTE:-
  UTF-16(Unique code Text File) ->txt file
  UTF-8 ->binary file
 
#Hierarchy:-(* -> imp)
  Object->Reader
  				->BufferedReader*->LineNumberReader
  				->FilterReader->PushBackReader
  				->pipedReader
  				->InputStreamReader*->FileReader*
  				->StringReader
  		->Writer
  		        ->BufferedWriter
  		        ->PrintWriter*
  		        ->PipedWriter
  		        ->OutPutStreamWriter*->FileWriter*
  		        ->FilterWriter
  		        ->StringWriter
  		        
#Description:-
-> Reader

1.StringReader:-A character Stream that operates on a string.
2.InputStreamReader:-This class is a bridge b/w character Stream & byte stream.
3.FileReader:- It is derived class of InputStreamReader which provides support for reading 
               character files.
4.PipedReader:-PipedReader and PipedWriter classes form a pair for piped reading/writing of
			   characters.
5.FilterReader:-It supports a filtering operation applied on a data as characters are read 
				from the stream.
6.PushBackReader:-It is derived class of FileReader that allows on read characters to be pushed
 				  back into stream.
7.BufferedReader:-Adds buffering to the underlying characters stream so that their is no need
 				  to access the underlying file system for each read and write operation.
8.LineNumberReader:-It is derived class of BufferedReader that keeps track of Line numbers
                    as the characters are read from the underlying character stream.

-> Writer

1.StringWriter:-A character stream that collects the output in a string buffer which can be 
			    used for creating a string.
2.FileWriter:-It is a derived class of OutputStreamWriter that provides support for writing
 			  character file.
3.PipedWriter:-The PipedReader and PipedWriter classed form a pair for piped reading/writing of
			   characters.
4.FilterWriter:-It supports a filtering operation applied on date as characters when writing
 				them to a character stream.
5.PrintWriter:-It supports formatting printing of characters to the output character stream.
6.BufferedWriter:-Add buffering to the underlying character stream. so that their is no need 
 				  to access the underlying file system for read and write operation.
 */

public class InputOutput {
	public static void main(String[] args) throws IOException {
		/*System.out.println("Please enter a character: ");
		int value = System.in.read();
		System.out.println((char)value);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String readLine = br.readLine();
		System.out.println(readLine);*/
		PrintStream ps=new PrintStream("log.txt");
		System.setOut(ps);
		System.out.println("Iam shail and i have enrolled in java course.");

	}
}
