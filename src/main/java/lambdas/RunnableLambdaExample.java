package lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run old way");
            }
        };

        new Thread(runnable).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run old way");
            }
        });

        Runnable runnableLambda = () -> {
            System.out.println("Run new way");
        };

        new Thread(runnableLambda).start();

        Runnable runnableLambda1 =
                () -> System.out.println("Run new way again");

        new Thread(runnableLambda1).start();

        new Thread(()-> System.out.println("Run new way again"));

    }
}