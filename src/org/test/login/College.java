package org.test.login;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class College {
public static void main(String[] args) {
List<StudentDetails> l = new ArrayList<>();
StudentDetails s=new StudentDetails();
s.setStuId(20);
s.setName("santhi");
s.setPhno(9441061574l);
StudentDetails s1=new StudentDetails();
s1.setName("Latha");
s1.setStuId(10);
s1.setPhno(9441057895l);
StudentDetails s2=new StudentDetails();
s2.setName("Prasu");
s2.setStuId(5);
s2.setPhno(8991057895l);
l.add(s);
l.add(s1);
l.add(s2);
for (StudentDetails k:l) {
System.out.println(k.getStuId());
System.out.println(k.getName());
System.out.println(k.getPhno());	
}	
}
}
