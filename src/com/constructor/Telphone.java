package com.constructor;

public class Telphone {
  private float screen;
  private float cpu;
  private float mem;
  
  public float getScreen() {
	 return screen;
  }
  
  public float getCpu() {
	return cpu;
}

public void setCpu(float cpu) {
	this.cpu = cpu;
}

public float getMem() {
	return mem;
}

public void setMem(float mem) {
	this.mem = mem;
}

public void setScreen(float newScreen) {
	  screen  = newScreen;
  }
  
  public Telphone() {
	  System.out.println("无参的构造方法执行了");
  }
  
  public Telphone(float newScreen,float newCpu, float newMem) {
	  screen  = newScreen;
	  cpu = newCpu;
	  mem = newMem;
	  
	  System.out.println("有参的构造方法执行了");
	  
  }
  
}
