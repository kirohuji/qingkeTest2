package t20170720;

public class Client {
	public static void main(String[] args) {
		IFactory factory =new Factory();
		IProduct prodect=factory.createProduct();
		prodect.productMethod();
	}

}
interface IProduct{
	public void productMethod();
}
class Product implements IProduct{
	public void productMethod(){
		System.out.println("²úÆ·");
	}
}
interface IFactory{
	public IProduct createProduct();
}
class Factory implements IFactory{
	public IProduct createProduct(){
		return new Product();
	}
}