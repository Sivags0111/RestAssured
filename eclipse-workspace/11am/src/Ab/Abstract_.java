package Ab;

abstract class bike {
	abstract void run();
	class tvs extends bike{
		void run () {
			System.out.println("Bike is running");
		}
	public void main(String[] args) {
bike b= new tvs();
b.run();
	}
	}
}
