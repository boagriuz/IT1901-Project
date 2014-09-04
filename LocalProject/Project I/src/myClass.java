
public class myClass {
	
	private String name;
	private int age; 
	
	public myClass(String name, int age){
		
		this.name = name;
		this.age = age; 
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		
		if(isAlpha(name)){
			this.name = name;
		}
	}
	//hjelpe metode
	private boolean isAlpha(String name) {
	    return name.matches("[a-zA-Z]+");
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age; 
	}
	
	public String toString(){
		return "Hello, my name is "+ name + " and I am " + age + " years old mofo!";
	}

}
