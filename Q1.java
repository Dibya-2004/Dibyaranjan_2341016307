package polimorphism;
class Animal{
	void makeSound() {
		System.out.println("Sound of animal");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Sound of Dog bho bho");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Sound of Cat meo meo");
	}
}
public class Q1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Dog d=new Dog();
		Cat c=new Cat();
		a.makeSound();
		d.makeSound();
		c.makeSound();
	}
}