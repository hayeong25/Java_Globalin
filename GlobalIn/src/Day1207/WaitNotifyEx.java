package Day1207;

class ATMEx implements Runnable{
    
	private long depositeMoney = 10000;
    
	@Override
    public void run() {
         synchronized(this){
             for (int i = 0; i < 10; i++) {
                  if (getDepositeMoney() <= 0) {
                	  break;
                  }
                  
                  withDraw(1000);
                  
                  if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000 || getDepositeMoney() == 6000 || getDepositeMoney() == 8000) {
                	  // 현재 스레드가 2000, 4000, 6000, 8000이면 공유객체의 wait()메소드를 호출
                      // 현재 스레드의 락을 해제한 후 다른 스레드의 락을 얻어와서 얻어와서 수행
                	  
                	  try{ // T일 경우
                		  this.wait();
                       } catch (InterruptedException e){
                    	   e.printStackTrace();
                       }
                  }
                  else {
                	  this.notify(); // 10000일 경우 실행x , 실행될 경우 notify -> lock pool
                	  // notify() : Object's Wait Pool에 있는 스레드가 Object's Lock Pool로 이동하게 되고 이 스레드는 다시 Lock을 얻기 위해 시도
                	  // 만약 다른 스레드가 수행하고 있다면 Object's Lock Pool에 대기. 수행 중인 스레드가 공유 객체로 wait() 메소드 호출하면 Object's Lock Pool에 대기 중인 스레드는 Lock을 얻게 됨
                  }
             }
    }
}
    
    public void withDraw(long howMuch){
         if(getDepositeMoney() > 0) {
        	 depositeMoney -= howMuch;
        	 System.out.print(Thread.currentThread().getName() + " , ");
             System.out.printf("잔액 : %,d 원 %n", getDepositeMoney());
         } else {
        	 System.out.print(Thread.currentThread().getName() + " , ");
             System.out.println("잔액이 부족합니다.");
         }
    }
    public long getDepositeMoney(){
         return depositeMoney;
    }
}
public class WaitNotifyEx {
    public static void main(String[] args) {
         ATMEx atm = new ATMEx();
         Thread mother = new Thread(atm, "mother");
         Thread son = new Thread(atm,"son");
         mother.start();
         son.start();
    }
}