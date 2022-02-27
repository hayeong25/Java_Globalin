package Day1209;

public class MultiClientThread extends Thread {
    private MultiClient mc;
    
    public MultiClientThread(MultiClient mc) {
        this.mc = mc;
    }
    
    public void run() {
        String message = null;
        String[] receivedMsg = null;
        boolean isStop = false;
      
        while(!isStop){
            try {
                message = (String)mc.getOis().readObject();
                receivedMsg = message.split("#");
            } catch(Exception e) {
                e.printStackTrace();
                isStop = true;
            }
            
            System.out.println(receivedMsg[0] + "," + receivedMsg[1]);
            
            if(receivedMsg[1].equals("exit")) {
                if(receivedMsg[0].equals(mc.getId())) {
                    mc.exit();
                }
                else {
                	// jta에 append 되는 경우 스크롤 바가 내려가지 않음. 이를 setCaretPosition() 메소드를 이용해 캐릿의 위치를 jta에 쓰여있는 문자열의 총 길이를 얻어와서 변경함
                	mc.getJta().append(receivedMsg[0] + "님이 종료 하셨습니다." + System.getProperty("line.separator"));
                	mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
                }
            }
            else {
            	// 서버에서 정상적인 메시지가 전송된 경우, jta에 메시지를 계속 이어씀
                mc.getJta().append(receivedMsg[0] + " : " + receivedMsg[1] + System.getProperty("line.separator"));
                mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
            }
        }
    }
}