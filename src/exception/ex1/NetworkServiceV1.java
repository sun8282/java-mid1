package exception.ex1;

import exception.ex0.NetworkClientV0;

public class NetworkServiceV1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
