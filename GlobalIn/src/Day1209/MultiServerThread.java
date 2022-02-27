package Day1209;

import java.net.*;
import java.io.*;

public class MultiServerThread implements Runnable {
   
	private Socket socket;
    private MultiServer ms;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    
    public MultiServerThread(MultiServer ms) {
        this.ms = ms;
    }
    
    public synchronized void run() {
    	boolean isStop = false;
        
        try{
            socket = ms.getSocket(); // MultiServer에서 생성된 socket을 반환
            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
            String message = null;
          
            while(!isStop) {
                message = (String)ois.readObject(); // 클라이언트가 전송한 메시지를 읽음
                String[] str = message.split("#"); // 아이디와 메시지를 #으로 분리하고 str 배열에 저장
                if(str[1].equals("exit")) { // 클라이언트가 보낸 메시지가 "exit"인 경우 현재 스레드를 종료할 수 있도록 isStop 변수를 true로 설정
                    broadCasting(message);
                    isStop = true;
                }
                else {
                    broadCasting(message);
                }
            }
            
            ms.getList().remove(this); // 현재 스레드가 종료되면 MultiServer의 ArrayList에서 제거
            System.out.println(socket.getInetAddress() + "정상적으로 종료하셨습니다");
            System.out.println("list size : " + ms.getList().size());
        } catch(Exception e) { // 비정상적으로 종료된 경우
            ms.getList().remove(this);
            System.out.println(socket.getInetAddress() + "비정상적으로 종료하셨습니다");
            System.out.println("list size : " + ms.getList().size());
        }
    }
    
    public void broadCasting(String message) throws IOException {
        for(MultiServerThread ct : ms.getList()) {
           ct.send(message);
        }
    }
    
    public void send(String message)throws IOException {
        oos.writeObject(message);       
    }
}