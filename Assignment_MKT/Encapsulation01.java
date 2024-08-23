package Assignment_MKT;
class amazon{
	private int otp=1234;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	
}
public class Encapsulation01 {
	
	public static void main(String[] args) {
		amazon	a=new amazon();
		System.out.println(a.getOtp());
		a.setOtp(2525);
		System.out.println(a.getOtp());

	}

}
