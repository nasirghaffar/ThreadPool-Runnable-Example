/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cppassignment1;

/**
 *
 * @author admin
 */
class ThreadRunnableClass implements Runnable{
 int instances;
 ThreadRunnableClass(int K){
     instances=K;
     
 }
    @Override
    public void run() {
/*for (int i=0;i<10;i++)
            System.out.print(instances+" ");
        System.out.println();*/
//while(instances>0){
int size=100085;
 int [] largeArray=new int[size];
 for (int i=0 ; i<largeArray.length; i++)
     largeArray[i]= (int) (Math.random()*160300456/104005);
 int highestValue=0;
 for(int i=0;i<largeArray.length;i++){
     if(largeArray[i]>highestValue)
         highestValue=largeArray[i];
 }
 int frequency=0;
 for(int i=0; i<largeArray.length;i++)
     if(largeArray[i]==highestValue)
         frequency++;
 
 System.out.println("Thread"+instances+ " Highes Value is: "+highestValue+" And its occurance is: "+frequency);
//instances--;

//}
    }
    
}

