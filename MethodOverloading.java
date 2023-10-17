import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the flavour of chai ");
		String flavour = scan.nextLine();
		System.out.println("Enter number of chai want to order");
		int quantity = scan.nextInt();
		orderChai();
		orderChai(quantity);
		orderChai(flavour);
		orderChai(quantity,flavour);
		scan.close();

	}
	public static void orderChai(int quantity,String flavour) {
		System.out.println("Bill for "+flavour+"chai of"+quantity+"cups="+(quantity*15.0));
		
	}
	public static void orderChai(String flavour) {
		System.out.println("Bill for "+flavour+"chai is ="+15.0);
		
		
	}
	public static void orderChai(int quantity) {
		System.out.println("Bill for "+quantity+"cups="+(quantity*10.0));
		
	}
	public static void orderChai() {
		System.out.println("Bill for 1 cup of chai is ="+10.0);
	}

}
