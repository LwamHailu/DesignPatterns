package observer;

public class Client {
public static void main(String[] args) {
	Person person1= new Person("Lwam", "Hailu");
	Person person2= new Person("febu", "tekle");
	Person person3 = new Person("hailu", "Sami");
	DisplayPerson persons=new DisplayPerson();
	persons.addPerson(person1);
	persons.addPerson(person2);
	persons.addPerson(person3);
	persons.removePerson(person2);
	
}
}
