package observer;

public  interface  Subject {
	public void addPerson(Person person);
	public void removePerson(Person person);
	public void notifyObserver();
	

}
