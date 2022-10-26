package app.curso.banco.entidad;

public class Persona {

	protected Long id;
	protected String name;
	protected Integer age;
	protected String phone;

	Persona(Long id, String name, Integer age, String phone) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
