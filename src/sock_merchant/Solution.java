/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sock_merchant;

import java.util.Arrays;

/**
 *
 * @author sergio
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //int ar[] = new int[0];
        int ar[] = {10,20,20,10,10,30,50,20,20};
        int n= ar.length ;
                
        
        int result = sockMerchant(n, ar);
        
        System.out.println(result);
    }
    
    
    static int sockMerchant(int n, int[] ar){
        int result = 0; // numero de parejas        
                
        if(ar.length <= 1 || (ar.length == 2 && ar[0]!=ar[1]))
        {
            result = 0;
        }
        else
        {               
            Arrays.sort(ar); 
            
            for (int i = 0; i < ar.length-1; i++) {
                System.out.println(i+" - "+ar[i]);
                if(ar[i]==ar[i+1])
                {
                    result++;
                    i++;
                }
            }
        }
        
        return result;
    }
    
}
