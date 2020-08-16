/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classical_Cryprtography;

/**
 *
 * @author IdiBosss
 */
public class Class_alphabet {
    
    public static int [] get_number(String ar[])
    {   int array_size=ar.length;
        int number_array[]=new int [array_size];
      
        for (int i = 0; i < array_size; i++) 
        {
            switch(ar[i].toUpperCase())
            {
                case "A":    number_array[i]= 1; break;
                case "B":    number_array[i]= 2; break;
                case "C":    number_array[i]= 3; break;
                case "D":    number_array[i]= 4; break;
                case "E":    number_array[i]= 5; break;
                case "F":    number_array[i]= 6; break;
                case "G":    number_array[i]= 7; break;
                case "H":    number_array[i]= 8; break;
                case "I":    number_array[i]= 9; break;
                case "J":    number_array[i]= 10; break;
                case "K":    number_array[i]= 11; break;
                case "L":    number_array[i]= 12; break;
                case "M":    number_array[i]= 13; break;
                case "N":    number_array[i]= 14; break;
                case "O":    number_array[i]= 15; break;
                case "P":    number_array[i]= 16; break;
                case "Q":    number_array[i]= 17; break;
                case "R":    number_array[i]= 18; break;
                case "S":    number_array[i]= 19; break;
                case "T":    number_array[i]= 20; break;
                case "U":    number_array[i]= 21; break;
                case "V":    number_array[i]= 22; break;
                case "W":    number_array[i]= 23; break;
                case "X":    number_array[i]= 24; break;
                case "Y":    number_array[i]= 25; break;
                case "Z":    number_array[i]= 26; break;
            }
        }      
    return number_array;    
    }
    
       public static  String [] get_letter(int ar [])
    {   int array_size=ar.length;
        String letter_array[]= new String[array_size];
        
        
        for (int i = 0; i < array_size; i++) 
        {
            switch(ar[i])
            {
                case  1 :    letter_array[i]="A"; break;
                case  2 :    letter_array[i]="B"; break;
                case  3 :    letter_array[i]="C"; break;
                case  4 :    letter_array[i]="D"; break;
                case  5 :    letter_array[i]="E"; break;
                case  6 :    letter_array[i]="F"; break;
                case  7 :    letter_array[i]="G"; break;
                case  8 :    letter_array[i]="H"; break;
                case  9 :    letter_array[i]="I"; break;
                case  10:    letter_array[i]="J"; break;
                case  11:    letter_array[i]="K"; break;
                case  12:    letter_array[i]="L"; break;
                case  13:    letter_array[i]="M"; break;
                case  14:    letter_array[i]="N"; break;
                case  15:    letter_array[i]="O"; break;
                case  16:    letter_array[i]="P"; break;
                case  17:    letter_array[i]="Q"; break;
                case  18:    letter_array[i]="R"; break;
                case  19:    letter_array[i]="S"; break;
                case  20:    letter_array[i]="T"; break;
                case  21:    letter_array[i]="U"; break;
                case  22:    letter_array[i]="V"; break;
                case  23:    letter_array[i]="W"; break;
                case  24:    letter_array[i]="X"; break;
                case  25:    letter_array[i]="Y"; break;
                case  26:    letter_array[i]="Z"; break;
            }
        }      
    
    return letter_array;    
    }
       
}
