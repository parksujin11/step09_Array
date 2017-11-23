package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * int type 을 담을 수 있는 방 3개 까지 배열객체를
		 * 생성하고 각각의 방에 순서대로 10, 20, 30 을 담아보기 
		 */
		
		//방3개짜리 int 배열객체 생성하고 참조값을 nums 에 담기
		int[] nums=new int[3];
		//각각의 방에 대입연산자로 int type 데이터 넣어주기
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		//nums[3]=40; 존재하지 않는 인덱스는 참조 불가 
		
		//위의 작업을 줄여서 아래와 같이 할 수 있다.
		int[] num2= {10, 20, 30};
		
	}
}
