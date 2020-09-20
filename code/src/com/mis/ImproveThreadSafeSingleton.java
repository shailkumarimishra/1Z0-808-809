package com.mis;

public class ImproveThreadSafeSingleton {
private static ImproveThreadSafeSingleton instance;
private ImproveThreadSafeSingleton() {
	throw new RuntimeException();
}
public static ImproveThreadSafeSingleton getInstance() {
	if(instance==null) {
		synchronized(ImproveThreadSafeSingleton.class) {
			if(instance==null) {
				instance=new ImproveThreadSafeSingleton();
			}
		}
	}
	return instance;
}


}
