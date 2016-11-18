package builder;


//����
public class Test {
	public static void main(String[] args) {
		Direct direct = new Direct();
		Product product1 = new Product();
		Product product2 = new Product();
		
		Builder cb1 = new ConcreteBuilder1();
		direct.Construct(cb1);
		product1 = cb1.getProduct();
		product1.show();
//		��Ʒ ���� ---
//		����A����B
		
		Builder cb2 = new ConcreteBuilder2();
		direct.Construct(cb2);
		cb2.getProduct();
		product2 = cb2.getProduct();
		product2.show();
//		��Ʒ ���� ---
//		����C����D
	}
}
