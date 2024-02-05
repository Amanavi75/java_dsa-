
import java.util.*;
class employee{
String name;
int empid;
employee(String name,int empid)
{
this.name=name;
this.empid=empid;
}
public String toString()
{
return "Employee name is :- "+name+ " and employee id is:- "+empid+ ".";
}
}
class iterator
{
public static void main(String shruti[])
{
ArrayList<employee> arr=new ArrayList<>();
arr.add(new employee("Shruti",123));
arr.add(new employee("Surbhi",345));
arr.add(new employee("Sana",678));
arr.add(new employee("Heena",912));
Iterator<employee> itr=arr.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
arr.forEach(s->System.out.println(s));
}
}
