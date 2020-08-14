package numerology;
import java.util.Scanner;

class AlphToInt
{
    
    String Name;
        
public void StringSum()
{
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Your Full Name :" );
    
    Name = obj.nextLine();
    
    //CREATING ARRAY OF STRING
    // char[] ch = Name.toCharArray();
    
    
    
    
}

public void sum()
{
    //CREATING ARRAY OF STRING
  /*  char[] ch = Name.toCharArray();
    
    //PRINTING ARRRAY
    
    for (char c : ch)
    {
      System.out.println(c);
    }

    int sum = 0 ; //initialize sum
    int ig;
    
    //ITERATE THROUGH ALL ELEMENTS AND ADD THEM TO SUM;
    
    for (ig = 1 ; ig < ch.length; ++ig)
        sum = ch[ig];
    return sum;

*/
    int ig = 0;
    int total = 0;
    
    
    char[] ch = Name.toCharArray();
    
    for(ig = 0 ; ig < ch.length ; ig++)
    {
        if (Name.charAt(ig)== 'a'){
            total += 1;
        }
        
        else if(Name.charAt(ig)== 'b'){
            total += 2;
        }
        
        else if(Name.charAt(ig)== 'c'){
            total += 3;
        }
        
         else if(Name.charAt(ig)== 'd'){
            total += 4;
        }
        
         else if(Name.charAt(ig)== 'e'){
            total += 5;
        }
        
         else if(Name.charAt(ig)== 'f'){
            total += 6;
        }
        
         else if(Name.charAt(ig)== 'g'){
            total += 7;
        }
        
         else if(Name.charAt(ig)== 'h'){
            total += 8;
        }
        
         else if(Name.charAt(ig)== 'i'){
            total += 9;
        }
        
         else if(Name.charAt(ig)== 'j'){
            total += 10;
        }
        
         else if(Name.charAt(ig)== 'k'){
            total += 11;
        }
        
         else if(Name.charAt(ig)== 'l'){
            total += 12;
        }
        
         else if(Name.charAt(ig)== 'm'){
            total += 13;
        }
        
         else if(Name.charAt(ig)== 'n'){
            total += 14;
        }
        
         else if(Name.charAt(ig)== 'o'){
            total += 15;
        }
        
         else if(Name.charAt(ig)== 'p'){
            total += 16;
        }
        
         else if(Name.charAt(ig)== 'q'){
            total += 17;
        }
        
         else if(Name.charAt(ig)== 'r'){
            total += 18;
        }
        
         else if(Name.charAt(ig)== 's'){
            total += 19;
        }
        
         else if(Name.charAt(ig)== 't'){
            total += 20;
        }
        
         else if(Name.charAt(ig)== 'u'){
            total += 21;
        }
        
         else if(Name.charAt(ig)== 'v'){
            total += 22;
        }
        
         else if(Name.charAt(ig)== 'w'){
            total += 23;
        }
        
         else if(Name.charAt(ig)== 'x'){
            total += 24;
        }
        
         else if(Name.charAt(ig)== 'y'){
            total += 25;
        }
        
         else if(Name.charAt(ig)== 'z'){
            total += 26;
        }
        
    }
    
    System.out.println("Your Name Number is " +total);
    
    }
    
}

public class Numerology {

    public static void main(String[] args) {
        System.out.println("*********************************************************************************************************");
        System.out.println("1] THIS SOFTWARE IS CASE SENSETIVE \n2] USE SAMALLCASE LETTERS ONLY \n3] NO NUMERICAL CHARECTER IS ALLOWED ");
        System.out.println("*********************************************************************************************************");
        
        AlphToInt od = new AlphToInt();
        od.StringSum();
        od.sum();
        
              

    }
    
}
