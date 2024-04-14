import java.util.*;
public class XO
{
    public static int win(int[] a){
        if(a[0]==a[1]&&a[1]==a[2]){
            return a[0];
        }
        else if(a[3]==a[4]&&a[4]==a[5]){
            return a[3];
        }
        else if(a[6]==a[7]&&a[7]==a[8]){
            return a[6];
        }
        else if(a[0]==a[3]&&a[3]==a[6]){
            return a[0];
        }
        else if(a[1]==a[4]&&a[4]==a[7]){
            return a[1];
        }
        else if(a[2]==a[5]&&a[5]==a[8]){
            return a[2];
        }
        else if(a[0]==a[4]&&a[4]==a[8]){
            return a[0];
        }
        else if(a[2]==a[4]&&a[4]==a[6]){
            return a[2];
        }else{
            return 0;
        }
        
        
    }
    
    public static void xro(int a){
        if(a==10){
            System.out.print("X");
        }else if(a==11){
            System.out.print("O");
        }else{
            System.out.print(a);
        }
    }
    
    public static void print(int[] a){
        
        System.out.println("\n");
        xro(a[0]);System.out.print(" | "); xro(a[1]);System.out.print(" | "); xro(a[2]);System.out.println();
        xro(a[3]);System.out.print(" | "); xro(a[4]);System.out.print(" | "); xro(a[5]);System.out.println();
        xro(a[6]);System.out.print(" | "); xro(a[7]);System.out.print(" | "); xro(a[8]);System.out.println("\n");
        
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a={1,2,3,4,5,6,7,8,9};
	int s=1;
	System.out.print("  X - O GAME");
	while(s<=9){
	    print(a);
	    if(s%2==1){
	        System.out.print("  X TRUN : ");
	        int o=sc.nextInt();
	        if(o>=1&&o<=9&&a[o-1]==o){
	            a[o-1]=10;
	        }else{
	            System.out.println(" INVALID POSITION ");
	            s--;
	        }
	        
	        
	    }else{
	        System.out.print("  O TRUN : ");
	        int o=sc.nextInt();
	        if(o>=1&&o<=9&&a[o-1]==o){
	            a[o-1]=11;
	        }else{
	            System.out.println(" INVALID POSITION ");
	            s--;
	        }
	    }
	        int w=win(a);
	        if(w==10){
	            print(a);
	            System.out.println("    X WON THE GAME   ");
	            break;
	        }else if(w==11){
	            print(a);
	            System.out.println("    O WON THE GAME   ");
	            break;
	        }else{
	            
	        }
	s++;
	}
	if(s==10){
	    System.out.println("    MATCH DRAW");
	}
	}
}
