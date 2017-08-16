package observer;

import java.util.ArrayList;
import java.util.List;

public class DisplayPerson implements Subject{
   private List<Person>persons;
   private List<Observer>observers;
   
   
   public DisplayPerson(){
	   this.persons=new ArrayList<>();
	   this.observers=new ArrayList<>();
   }
   
   
	@Override
	public void addPerson(Person person) {
		this.persons.add(person);
		System.out.println("FirstName  "+person.getFirstName()+"lastName  "+person.getLastName());
		notifyObserver();
	}

	@Override
	public void removePerson(Person person) {
		for(Person p:persons){
			if(person.equals(p)){
					persons.remove(person);
			}
		}
		System.out.println("this person is no more Available "+person.getFirstName()+" "+person.getLastName());
		notifyObserver();
	}

	@Override
	public void notifyObserver() {
		for(Observer o:observers){
			o.update(persons);
			
		}
		
	}

}
