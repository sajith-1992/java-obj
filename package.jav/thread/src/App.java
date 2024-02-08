public class App  {
    public static void main(String[] args) throws Exception {
        
        SampleThread st= new SampleThread();
        Thread t= new Thread(st);
        t.start();

        }
}
