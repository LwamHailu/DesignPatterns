package protoType;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
//		Employee employee1= new Employee(12,"lwam","hailu","1234","fairfield","IA","52556");
//		Employee supervisor= new Employee(13,"sami","gede","23455","fairfield","IA","52556");
//		Employee employee3= new Employee(13,"tesfay","Aregay","55","fairfield","IA","52556");
//		Employee staff1= new Employee(10,"abenu","hibi","76458736","fairfield","IA","52556");
//		Employee staff2= new Employee(15,"febu","enbaye","56363","fairfield","IA","52556");
//		
//		employee3.setSupervisor(supervisor);
//		Employee employee4= new Employee(11,"zaida","gebre","897455","fairfield","IA","52556");
//		
//		
//		Employee employee6= employee1.clone();
		Employee E1 = new Employee(1,  null, null);
        Employee E2 = new Employee(2, null, null);        
        Employee E3 = new Employee(3, null, null);
        
        Employee E4= new Employee(4,  null, null);
        Employee E5 = new Employee(5, null, null);        
        Employee E6 = new Employee(6, null, null);
        
        Employee[] E1S = new Employee[2] ;
        E1S[0] = E2;
        E1S[1] = E3;
        E1.setSupervisor(E3);
        E1.setStaff(E1S);

        Employee[] E2S = new Employee[3];
        E2S[0] = E1;
        E2S[1] = E3;
        E2S[2] = E4;
        E2.setSupervisor(E1);
        E2.setStaff(E2S);
        
        
        Employee[] E3S = new Employee[2];
        E3S[0] = E1;
        E3S[1] = E2;
        E3.setSupervisor(E2);
        E3.setStaff(E3S);
        
        E1.clone();
        System.out.println(E1.toString());
		
		
		
		
		

	}

}
