package defaults;

public class Client implements Interface1, Interface2, Interface3{

    public void methodA() {
        System.out.println("Inside method A " + Client.class);
    }

    public static void main(String[] args) {
        // class that overrides default implementation takes precedence over any other overridden methods in interfaces

        // 1. class that implements the interface
        //2. sub interface that extends the interface
        Client client = new Client();
        client.methodA();
        client.methodB();
        client.methodC();
    }
}
