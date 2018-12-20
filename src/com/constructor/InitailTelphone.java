package com.constructor;

public class InitailTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过无参的构造方法可以创建对象
        Telphone phone = new Telphone();
        //通过有参的构造方法可以创建对象 并给对象中的实例赋初始值
        Telphone phone2 = new Telphone(5.0f,4.0f,3.0f);
        //phone.screen  = 6.5f;
        phone.setScreen(0.5f);
        System.out.println(phone.getScreen()); 
	}
    /*
     * 当没有指定构造方法时,系统会自动添加无参的构造方法
     * 当有指定构造方法，无论是有参、还是无参的构造方法，都不会自动添加无参的构造方法
     * 构造方法的重载：方法名相同，但是参数不同的多个方法，调用时会自动根据不同的参数选择相应的方法
     * 
     */
}
