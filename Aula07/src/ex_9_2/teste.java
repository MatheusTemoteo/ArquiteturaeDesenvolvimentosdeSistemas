package ex_9_2;

public class teste {
	
	public static void main(String[] args){
		
		H handler = new H1();
		H handler1 = new H2();
		H handler2 = new H3();
		H handler3 = new H4();
		H handler4 = new H5();
		H handler5 = new H6();
		H handler6 = new H7();
		H handler7 = new H8();
		H handler8 = new H9();
		H handler9 = new H10();
		H handler10 = new H11();
		H handler11 = new H12();
		H handler12 = new H13();
		H handler13 = new H14();
		H handler14 = new H15();
		
		handler.setH(handler1);
		handler1.setH(handler2);
		handler2.setH(handler3);
		handler3.setH(handler4);
		handler4.setH(handler5);
		handler5.setH(handler6);
		handler6.setH(handler7);
		handler7.setH(handler8);
		handler8.setH(handler9);
		handler9.setH(handler10);
		handler10.setH(handler11);
		handler11.setH(handler12);
		handler12.setH(handler13);
		handler13.setH(handler14);
		
		handler.setLastHandle(System.currentTimeMillis());
		while(handler14.getNumero() != 15) {
			handler.handleRequest(1);			
		}
		
	}

}
