package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClinetV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClinetV4(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV4 {
        if(connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패: " );
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV4 {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }
}
