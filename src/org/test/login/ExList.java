package org.test.login;

import java.util.LinkedList;

public class ExList {
public static void main(String[] args) {
LinkedList<Integer>	k=new LinkedList<>();	
LinkedList<Integer>	k1=new LinkedList<>();	
k.add(10);
k.add(20);
k.add(20);
k.add(30);
k.add(40);		
k.add(50);	
//k.remove(2);
System.out.println(k);
/*for (int i = 0; i <k.size(); i++) {
	System.out.println(k.get(i));	
}
k1.add(20);
k1.add(20);
k1.add(40);
int x=k.get(2);
System.out.println(x);
//k1.removeAll(k);
k1.clear();
//System.out.println(k);
System.out.println(k1);
boolean b = k.contains(100);
System.out.println(b);
k.clear();*/
int i = k.indexOf(50);
int j=k.lastIndexOf(20);
System.out.println(j);
k.set(2, 200);
Integer e = k.get(4);
System.out.println(e);
System.out.println(k);




		
		
	}

}
