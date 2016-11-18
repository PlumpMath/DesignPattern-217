package builder;


//���彨����2
class ConcreteBuilder2 extends Builder {
	
	private Product product = new Product();
	
	@Override
	public void BuildPartA() {
		product.Add("����C");
	}

	@Override
	public void BuildPartB() {
		product.Add("����D");
	}

	@Override
	public Product getProduct() {
		
		return product;
	}

}
