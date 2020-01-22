package org.test.login;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
public static void main(String[] args) {
Set<Example>s=new HashSet<Example>();
Example v=new Example();
v.setName("Prasanthi");
v.setPhno(9784561234l);		
v.setStuId(12);		
Example v1=new Example();		
v1.setName("PK");		
v1.setPhno(7894561236l);		
v1.setStuId(13);
s.add(v);
s.add(v1);
for(Example r:s) {
	System.out.println(r.getName());
	System.out.println(r.getPhno());
	System.out.println(r.getStuId());
}
}
}
