public class Exemplo {
	public static void sayHelloManyTimes(int times) {
		for (int i = 0; i < times; i++) {
			sayHello();
		}
	}
	
	public static void sayHello() {
		System.out.println("Olá mundo!");
	}
	
	public static void main(String[] args) {
		sayHelloManyTimes(4);
	}

}
