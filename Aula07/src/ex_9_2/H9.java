package ex_9_2;

public class H9 implements H {
	
	//se precisar mudar os ConcreteHandlers, recomendo deletar os de 2 a 15 e clonar o 1
	
	private long lastHandle = 0;
	private int num = 9;
	private H h;
	
	@Override
	public int getNumero(){
		return num;
		}
	
	@Override
	public void setH(H h) {
		this.h = h;		
	}
	
	public void setLastHandle(long l) {
		this.lastHandle = l;
	}

	@Override
	public void handleRequest(int n) {
		if((System.currentTimeMillis() - lastHandle) < 200) {
			lastHandle = System.currentTimeMillis();
			System.out.println("Process and saving number... by Handler " + getNumero());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if(h != null) {
			System.out.println("Handler " + getNumero() + " forwards request to handler " + h.getNumero());
			if(h.getLastHandle() == 0)
				h.setLastHandle(System.currentTimeMillis());
			h.handleRequest(n );
		} else {
			System.out.println("Invalid number");
		}
	}

	@Override
	public long getLastHandle() {
		return lastHandle;
	}



}
