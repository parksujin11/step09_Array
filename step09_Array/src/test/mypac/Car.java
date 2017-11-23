package test.mypac;

public class Car {
	//맴버필드
	public String name;
	public Car(String name) {
		this.name=name;
	}
	//맴버 메소드
	public void drive() {
		System.out.println(this.name+"이 달려요");
	}

}
