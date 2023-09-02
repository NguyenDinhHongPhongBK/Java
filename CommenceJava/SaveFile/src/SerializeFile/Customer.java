package SerializeFile;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer implements Serializable
{
	private int Id;
	private String Name;
	public Customer(int id, String name) {
		super();
		Id = id;
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
