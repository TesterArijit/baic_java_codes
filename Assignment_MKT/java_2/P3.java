package test.one;

public class P3 {
	public int hashCode()
	{
		return 100;
	}

	public static void main(String[] args) {
		P3 p=new P3();
		System.out.println(p.hashCode());// explicitly come.---->>1159190947
		

	}

}
