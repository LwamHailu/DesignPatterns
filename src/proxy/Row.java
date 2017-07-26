package proxy;

public class Row  implements IRow{
	
	private String name;
	private String Id;
	public Row(String name, String id, String age) {
		super();
		this.name = name;
		Id = id;
		this.age = age;
	}
	private String age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		Id = id;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return Id;
	}
	public String getAge() {
		return age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Row other = (Row) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Row [name=" + name + ", Id=" + Id + ", age=" + age + "]";
	}
	
   public Row deepColon(){
	   return new Row(this.name,this.Id,this.age);
   }
   public Row shalowColon(){
	   return this;
   }
}
