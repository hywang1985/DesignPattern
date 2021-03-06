package adapter.adaper;

import adapter.adaptee.Dog;

/**
 * 适配器模式和装饰者模式都采用组合的方式，不同点在于适配器一定会产生出一个符合客户端需求的接口
 * 即会产生新接口
 * 而装饰者不会产生新的接口，它只是在现有接口对象是对其特定方法进行增强
 * @author hywang
 * */
public class GoldenRetrieverAdapter implements DogAdapter {
	
	private Dog dog; //组合被适配的对象到适配器中
	

	public GoldenRetrieverAdapter(Dog dog) {
		this.dog = dog;
	}


	@Override
	public void meow() { //在适配器中调用被适配对象的方法
		dog.bark();
	}

}
