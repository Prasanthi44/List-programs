package org.test.login;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Company {
public static void main(String[] args) {
 Map<Integer,EmpDetails>emp=new TreeMap<Integer,EmpDetails>	();
 EmpDetails c=new EmpDetails();
 c.setEmpId(01);
 c.setName("Prasanthi");
c.setAddress("Navoor");		
c.setPhone(91112425632l);		
c.setDoj("15/12/2017");		
c.setDob("16/06/1994");	
c.seteMail("santhi.p@gmail.com");
c.setGender('f');	
c.setSal(18000.054f);
emp.put(10, c);
Set<Entry<Integer,EmpDetails>> k=emp.entrySet();
for(Entry<Integer,EmpDetails>x:k) {
	System.out.println(x.getKey()+"s.no");
	System.out.println(x.getValue().getName());
	System.out.println(x.getValue().getEmpId());
	System.out.println(x.getValue().getAddress());
	System.out.println(x.getValue().getDob());
	System.out.println(x.getValue().getDoj());
	System.out.println(x.getValue().getGender());
	System.out.println(x.getValue().getPhone());
	System.out.println(x.getValue().getSal());
	System.out.println(x.getValue().geteMail());
}

}

}
