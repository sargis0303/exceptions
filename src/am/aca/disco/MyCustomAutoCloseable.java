package am.aca.disco;

public class MyCustomAutoCloseable implements AutoCloseable {

    public void foo () {
        System.out.println("Method is called");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource is closed");
    }
}
