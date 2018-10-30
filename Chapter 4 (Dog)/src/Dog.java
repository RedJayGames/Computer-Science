
public class Dog {
	
	private String name;
	private int age;
	private int weight;
	private String owner;
	
	public Dog (String name, int age , int weight, String owner){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.owner = owner;
	}
	
	public void bark(){
		if(weight > 50){
			System.out.println("woof");
		}else{
			System.out.println("yep");
		}
	}
	
	public void changeOwner(String newOwner){
		owner = newOwner;
	}
	
	public String toString(){
		return (name + "\t" + age + "\t" + weight+ "\t" + owner);
	}
}
