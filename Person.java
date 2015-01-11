

public class Person {
	private String name;
	private String userid;
	
	public Person() {
		this("Fred", "xyz123");
	
	}
	
	public Person(String name, String userid) {
		super();
		this.name = name;
		this.userid = userid;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Class: " + this.getClass() + " Name: " + this.getName() + " User ID: " + this.getUserid();
	}
}
