
package bailecture4;


 import java.util.Scanner;
public class BaiTap1 {
    public static String giaiPhuongTrinh(double a ,double b){
        if(a==0){
            if(b==0){
                return "Phuong trinh vo so nghiem";
            }else{
                return "phuong trinh vo nghiem";
            }
        }else {
            double x=-b/a;
            return "phuong trinh co nghiem x="+x;
        }
    
     
}
    

   
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so a=");
        double a = scanner.nextDouble();
        System.out.print("Nhap so b=");
        double b = scanner.nextDouble();
        String ketQua =giaiPhuongTrinh(a,b);
        System.out.println(ketQua);
       
    }
    
}
