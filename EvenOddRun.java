public class EvenOddRun {
    public static void main(String []args){
        EvenThread eth = new EvenThread();
         OddThread oth = new OddThread();

         oth.setPriority(Thread.MIN_PRIORITY);
         eth.setPriority(Thread.MAX_PRIORITY);
        eth.start();
       
        oth.start();
       
    
    
}

class EvenThread extends Thread{
   synchronized public void run(){
        for(int i = 2 ; i<=20 ; i = i+2){
            System.out.println(" Name: "+ getName() + " Prioroty: "+ getPriority()+ " Number:"+ i);

        }
        try{
            Thread.sleep(500);

        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception is raised");
        }

    }

    
}

class OddThread extends Thread{
    synchronized  public void run(){
        for(int i = 1 ; i<=20 ; i = i+2){
           System.out.println(" Name: "+ getName() + " Prioroty: "+ getPriority()+ " Number:"+ i);


        }
        try{
            Thread.sleep(500);

        }
        catch(InterruptedException e){
            System.out.println("Interrupted Exception is raised");
        }

    }
}