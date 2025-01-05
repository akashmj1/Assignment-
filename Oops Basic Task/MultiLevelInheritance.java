class Animal{
	public void sound() {
		System.out.println("Animal make Sound....");
	}
}
class Dog extends Animal{
	public void make() {
		System.out.println("Dog make Bow Bow sound!!!");
	}
}
public class MultiLevelInheritance extends Dog {

	public static void main(String[] args) {
		MultiLevelInheritance mt =new MultiLevelInheritance();
		mt.sound();
		mt.make();
		// TODO Auto-generated method stub

	}

}
