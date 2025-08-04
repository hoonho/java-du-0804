package p2025_08_04;

class MyDate2{   
  private int year;    
  private int month;    
  private int day;

  public MyDate2(){
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
  }  
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate2 end

public class ConstructorTest02 {     
  public static void main(String[] args) {
    MyDate2 d =  new MyDate2();	
    d.print();
//	System.out.println(d.year);
//	MyDate2 dd =  new MyDate2();
 }
} 