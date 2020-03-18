/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencechecker;

import java.util.Scanner;

/**
 *
 * @author kevin yang（杨轩易）
 */
public class SentenceChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] ar = new String[N];
        for (int i = 0; i < N ; i++) {
            ar[i] = sc.next();
        }
        sc.nextLine();
        String full = sc.nextLine();
        String[] words = full.split(" ");
        for (String word : words) {
            boolean findInAr =false;
            for (String w : ar) {
                if (word.equals(w)) {
                    findInAr = true;
                    break;
                }
            }
            if(!findInAr){
                System.out.println("Incorrect");
                return;
            }
        }
        System.out.println("Correct");
    }
}
