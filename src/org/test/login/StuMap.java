package org.test.login;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StuMap {
public static void main(String[] args) {
Map<Integer,StudentDetails>m=new TreeMap<Integer,StudentDetails>();
StudentDetails r1=new StudentDetails();
r1.setName("Ravi");
r1.setStuId(05);
r1.setPhno(9447895698l);
StudentDetails r=new StudentDetails();
r.setName("Subbu");
r.setStuId(10);
r.setPhno(9441091542l);
StudentDetails s2=new StudentDetails();
s2.setName("Madhavi");
s2.setPhno(9557896544l);
s2.setStuId(15);
m.put(1, r);
m.put(2, r1);
m.put(3, s2);
Set<Entry<Integer,StudentDetails>>k=m.entrySet();
for (Entry<Integer,StudentDetails>s:k) {
	System.out.println(s.getKey()+" S.NO ");
	System.out.println(s.getValue().getStuId());
	System.out.println(s.getValue().getName());
	System.out.println(s.getValue().getPhno());
	
}




	}

}
