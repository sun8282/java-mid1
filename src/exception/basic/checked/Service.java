package exception.basic.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        client.call();
    }
}
