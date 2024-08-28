package test.one;
// Hierarchical inheritance

class Father0{
	public void salary()
	{
		System.out.println("have salary!");
	}
}
class Son01 extends Father0{
	public void disco()
	{
		System.out.println("have disco!");
	}
}
class Girl01 extends Father0{
	public void makeup()
	{
		System.out.println("have makeup!");
	}
}

public class Inhart_3 {

	public static void main(String[] args) {
		 Girl01 g=new Girl01();
		 g.salary();
		 g.makeup();
		 Son01 s=new Son01();
		 s.salary();
		 s.disco();
	}

}
