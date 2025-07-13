public class ThreadRunFive {
    public static void main(String []args){
        
        MyThread th = new MyThread();
        MyThread th1 = new MyThread();

        th.start();
        th1.start();
    }
}
class MyThread extends Thread{
    public void run(){
        for(int i = 0 ; i< 5 ; i++){
            System.out.println("Thread is Running" + i + " " + Thread.currentThread().getName());

        }
        try{
            Thread.sleep(5);
        }
        catch(InterruptedException e){
            System.out.println("Not Sure");
        }
        
    }

}
