/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

/**
 *
 * @author Tanulo
 */
public class Palindrom {

  
  public boolean isPalindrom (String szoveg){
        boolean pali;
        
        
        szoveg = szoveg.toLowerCase();
        szoveg = szoveg.replaceAll("\\s[?]","");
        //System.out.println("szoveg: "+szoveg);
        /* for átírása while-ra
        int i,j;
        for ( i = 0, j = szoveg.length()-1; i < (szoveg.length()/2) && szoveg.charAt(i)==szoveg.charAt(j) ; i++,j--); 
        pali = (i==szoveg.length()/2);
        return pali; */
        
        int i= 0;
        int j= szoveg.length()-1;
        while ( i < (szoveg.length()/2) && szoveg.charAt(i)==szoveg.charAt(j)){
            i++;
            j--;
        } 
        pali = (i==szoveg.length()/2);
        return pali;
    }

  public Palindrom() {
  }
    
  
}
