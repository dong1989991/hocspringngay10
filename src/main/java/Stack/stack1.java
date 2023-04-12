package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Scanner khoiTao=new Scanner(System.in);
        Stack<String> stackChuoi=new Stack<String>();
        System.out.println("nhap chuoi:");
        String chuoi= khoiTao.nextLine();
        for (int i=0;i<chuoi.length();i++)
        {
            stackChuoi.push(chuoi.charAt(i)+"");
        }
        System.out.println("chuoi dao nguoc");
        for(int i=0;i<chuoi.length();i++)
            System.out.print(stackChuoi.pop()+" ");
    }
}
