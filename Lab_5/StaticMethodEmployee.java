package Lab_5;


public class StaticMethodEmployee {

  
   public static void createEmployee(int id,String EmpName,String Company){
    System.out.println("Id :"+id);
    System.out.println("Employee Name :"+EmpName);
    System.out.println("Company :"+Company);

   }

	 public static void main (String args[]) {
		 createEmployee(101,"Ben Tennyson","Omnitrix");
		
}
}


