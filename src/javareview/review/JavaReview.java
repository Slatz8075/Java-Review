/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.review;

import java.util.Scanner;

/**
 *
 * @author slatz8075
 */
public class JavaReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initian=lize variables
        // type name [ = value ];
        int age = 10;
        double length = 25.73;

        //math ops
        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulus (remainder after division
        age = age + 10;
        length = length * 2;
        age++; // adds 1 to age
        age--; // subtractsfrom age

        //conditions
        if (length > 100) {
            System.out.println("length is bigger than 100");
        } else if (length > 50 && length <= 100) {
            System.out.println("length is between 50 and 100");
        } else {
            System.out.println("length is 50 or over");
        }
        
        //while loops 
        //&& <- AND
        //|| <- OR
        int count = 0;
        while(count < 10){
            //increase count and prnt
            count++;
            System.out.println(count);
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("I:" + i);
        }      
        
        //arrays
        String[] words = new String[5];
        words[0] = "cat";
        
        //input
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < words.length; i++){
            System.out.println("Enter a word");
            words[i] = in.nextLine();
            
            if(words[i].equals("EXIT")){
                break;
            }
            
            int wordLength = words[i].length();
        }
    }
}
