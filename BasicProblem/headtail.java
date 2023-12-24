package BasicProblem;

import java.util.Random;

public class headtail {
public static void main(String[] args) {
	int  head=0;
    int  tail=0;
    Random rm=new Random();
    int flip=1000;
    double per_head,per_tail;
     
     for (int i = 0; i <=flip; i++) {
    	   
         if(rm.nextBoolean())
        {
        	 head++;
        	 
        }
         else
         {
        	 tail++;
    }
	}
      if(head>tail)
      {
    	  per_head=(head/(double)flip)*100;  
    	  System.out.println("coin tosed="+flip+" "+"Head is more="+head+" "+"in persentage="+per_head);
      }
      else
      {
    	  
    	  per_tail=(tail/(double)flip)*100;
    	  System.out.println("coin tosed="+flip+" "+"Tail is more="+tail+" "+"in persentage="+per_tail);
      }
    
}
}
