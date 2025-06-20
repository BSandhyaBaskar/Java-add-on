package program;

public class MultiTH extends Thread{
    private String Name;
    MultiTH(String Name){
    	this.Name=Name;
    }
    public void run() {
    	for(int i=1;i<=5;i++) {
    		System.out.println(Name);
    		try {
    			Thread.sleep(500);
    		}catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }
    class Excute{ 	
	public static void main(String[] args) {
		MultiTH m1=new MultiTH("Thread-1");
		MultiTH m2=new MultiTH("Thread-2");
		m1.start();
		m2.start();
	}
}
}
