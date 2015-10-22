package MainPack;
public class Gorilla {
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	private int num;
	private String name;
	private int id;

	public Gorilla() {
	}

	public Gorilla(int num, String name, int id) {
		this.num = num;
		this.name = name;
		this.id = id;
	}
}
