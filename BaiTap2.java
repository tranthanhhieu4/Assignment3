
package bailecture4;

import java.util.Scanner;
public class BaiTap2 {
    public static void giaiPhuongTrinhBacHai(double a,double b,double c ){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("phuong trinh vo so nghiem");
                }else{
                    System.out.println("phuong trinh vo nghiem");
                }
            }else {
                double x=-c/b;
                System.out.println("phuong trinh bac nhat co nghiem x="+x);
            }
        }else {
            double delta =b*b-4*a*c;
            if(delta>0){
                double x1=(-b+ Math.sqrt(delta))/(2*a);
                double x2=(-b- Math.sqrt(delta))/(2*a);
                System.out.println("phuong trinh co 2 nghiem phan biet");
                System.out.println("Nghiem x1="+x1);
                System.out.println("Nghiem x2="+x2);
                
            }else if(delta==0){
                double x=-b/(2*a);
                System.out.println("Phuong trinh co nghiem kep="+x);
                
            }else{
                 System.out.println("Phuong khong co nghiem thuc .");

            }
        }
    }
     
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        
       
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        
        
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        giaiPhuongTrinhBacHai(a,b,c);
        
       
   
    }
    }
