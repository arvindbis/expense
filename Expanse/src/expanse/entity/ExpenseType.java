package expanse.entity;

public class ExpenseType {
	private long id;
	private String name;
	public ExpenseType(long id, String name) {
		setId(id);
		setName(name);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
