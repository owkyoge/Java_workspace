package operators;

public class Employee1 {

	private String name;
	private int id;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(String nm, int id) {
	//	super();
		name = nm;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
