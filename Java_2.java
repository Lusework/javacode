package com.amaker.test;

import java.util.Random;

public class Java_2 {
	
	

    public static void main(String[] args)
    
    {
            Random random = new Random();
            float   p    = random.nextFloat();
            int      n     =  Math.round(10*p); 
            long    f = 1;
            int  i = 1;
            
            do{
                       f =f* i;
                       i++;
                       
                       
                        }while(i<=n);
                        
                        System.out.println(n+"!= "+f);
            
    }
}   
