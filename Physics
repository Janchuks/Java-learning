import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner dati=new Scanner(System.in);
    
    double l,h,strp;
    
    do{
        System.out.println("Ievada augstumu h, cm");
        h=dati.nextDouble();
            if (h<=0) 
            {
            System.out.println("nekorekts augstums");
            }
    }while(h<=0);
    
    if (h>0)
    {
        System.out.println("augstums = "+h+" cm");
    }
    
    do{
        System.out.println("ievada renītes garumu");
        l=dati.nextDouble();
        
        if (l<=0) 
        {
            System.out.println("nekorekts garums");
        }
    
    }while(l<=0);
    
    if(l>0)
    {
        System.out.println("rentes slpums ir "+l+" cm");
    }
    strp= h/l;
    int hl=(int) Math.floor(strp);
    
    System.out.println("slīpuma keoficients ir "+strp);
    }
}

