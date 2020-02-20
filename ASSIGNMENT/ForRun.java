
package ASSIGNMENT;

class ForRun implements Runnable{  
        public void run(){  
        System.out.println("thread is running...");  
        }  

        public static void main(String args[]){  
        ForRun m1=new ForRun();  
        Thread t1 =new Thread(m1);  
        t1.start();  
         }  
}  
