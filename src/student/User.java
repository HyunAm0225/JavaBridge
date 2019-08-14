package student;

public class User {
	private String name;
	private Search_Type search_type;
	public User(String name, Search_Type search_type) {
		this.name=name;
		this.search_type=search_type;
	}
	public String getName() {
		return name;
	
	}
	public void setName(String name) {
		this.name = name;
	}
	public Search_Type getSearch_Type() {
		return search_type;
	}
	public void setSearch_Type(Search_Type search_type) {
		this.search_type=search_type;
	}
}
