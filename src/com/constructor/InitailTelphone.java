package com.constructor;

public class InitailTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ���޲εĹ��췽�����Դ�������
        Telphone phone = new Telphone();
        //ͨ���вεĹ��췽�����Դ������� ���������е�ʵ������ʼֵ
        Telphone phone2 = new Telphone(5.0f,4.0f,3.0f);
        //phone.screen  = 6.5f;
        phone.setScreen(0.5f);
        System.out.println(phone.getScreen()); 
	}
    /*
     * ��û��ָ�����췽��ʱ,ϵͳ���Զ�����޲εĹ��췽��
     * ����ָ�����췽�����������вΡ������޲εĹ��췽�����������Զ�����޲εĹ��췽��
     * ���췽�������أ���������ͬ�����ǲ�����ͬ�Ķ������������ʱ���Զ����ݲ�ͬ�Ĳ���ѡ����Ӧ�ķ���
     * 
     */
}
