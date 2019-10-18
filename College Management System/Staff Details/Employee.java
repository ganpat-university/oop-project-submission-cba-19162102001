class Employees
{  
		int id;  
		String name;  
		String state;
		int contact_no;
		String qualification;
		float salary; 
		int bonus;  
		
		Employees(int i,String n,String s,int c,String q,float sa,int b)
	{  
		id=i;  
		name=n;  
		state=s;
		contact_no=c;
		qualification=q;
		salary=sa;
		bonus=b;  
	}  
		
		void display()
	{
	    	System.out.println(id+"   		"+name+"   		"+state+"   		"+contact_no+"   		"+qualification+"                "+salary+"                 "+bonus);
	}  
}  
  
class Employee
{  
		public static void main(String args[])
	{
		Employees e1=new Employees(1,"SpiderMan","Alaska",123456,"MBA",25000.98f,10000);  
		Employees e2=new Employees(2,"BenTen","California",216464,"MBA",30000f,9000);
		Employees e3=new Employees(3,"BobBuilder","Colorado",648999,"BA",15000.56f,8000);
		Employees e4=new Employees(4,"Iggle","Delaware",456974,"BBA",50000f,7000);
		Employees e5=new Employees(5,"BumbleBee","Florida",656487,"MA",30000.34f,6000);
		Employees e6=new Employees(6,"Mr.Maker","Alberta",456712,"BBA",70000.90f,5000);
		Employees e7=new Employees(7,"ElmoPeter","Manitoba",123475,"MTECH",14000f,4000);
		Employees e8=new Employees(8,"Yesha","Ontorio",457123,"PHD",100000f,15000);
		Employees e9=new Employees(9,"Zoonie","Quebec",789452,"BTECH",25000f,8000);
		Employees e0=new Employees(0,"BatMan","Nova Scotia",948756,"MA",17000.45f,3000); 
		
		e1.display();  
		e2.display(); 
		e3.display();
		e4.display();
		e5.display();
		e6.display();		
		e7.display(); 
		e8.display();
		e9.display();
		e0.display();
	}
} 