
public class DogTest {

	public static void main(String[] args) {
		
		Dog briannaDog = new Dog("Chanel", 10, 10, "Brianna");
		Dog kylerDog = new Dog("Chewy", 12, 130, "Kyler");
		
		briannaDog.bark();
		kylerDog.bark();
		
		kylerDog.changeOwner("Corbin");
		
		System.out.println(briannaDog);
		System.out.println(kylerDog);
	}

}
