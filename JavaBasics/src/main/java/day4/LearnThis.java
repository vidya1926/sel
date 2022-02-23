package day4;

public class LearnThis {
  int num=10;
  
  
  public void add() {
	  int num=15;
	   System.out.println(this.num);
	   System.out.println(num);
	   
  }
	
  public void method1(int num)
  {
	 this.num=num;
	  System.out.println(num);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnThis x=new LearnThis();
	
	//	System.out.println(x.num);
		x.add();
		x.method1(15);
	}

}
