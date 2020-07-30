class Product
{
	
	public Product(String Productcode,String ProductName,double ProductPrize)
	{
	System.out.println("Productcode:" +Productcode+ "\n" +" "+ProductName + " " +ProductPrize);	
	}
}
public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("Abx","cft",5.78);
		//Product p1=new Product()

	}

}
//Product p1=new Product("Abx","cft",5.78);