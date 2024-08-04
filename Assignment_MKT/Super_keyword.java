package Assignment_MKT;
class Override1{
	public void Whatsup()
	{
		System.out.println("Verson one-->supports only text");
	}
}
class Override2 extends Override1{
	public void Whatsup()
	{
		System.out.println("Verson two-->supports  text,audio,emoji");
		super.Whatsup();
	}
}
class Override3 extends Override2{
	public void Whatsup()
	{
		System.out.println("Verson three-->supports  text,audio,emoji,iamge,video");
		super.Whatsup();
	}
}

public class Super_keyword extends Override3 {

	public static void main(String[] args) {
		
		Super_keyword  s =new Super_keyword();
		s.Whatsup();
	}

}
