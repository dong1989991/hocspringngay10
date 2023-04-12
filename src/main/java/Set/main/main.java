package Set.main;

import java.util.*;

public class main {
    Set<String> thungPhieuDuThuong= new TreeSet<String>();

    public main()
    {

    }
    public boolean themPhieu(String giaTri)
    {
        return this.thungPhieuDuThuong.add(giaTri);
    }
        public boolean xoaPhieu(String giaTri)
        {
            return this.thungPhieuDuThuong.remove(giaTri);
        }
        public  boolean kiemTraPhieuTonTai(String giaTri)
        {
            return this.thungPhieuDuThuong.contains(giaTri);
        }
        public void xoaPhieuAll()
        {
             this.thungPhieuDuThuong.clear();
        }
        public  int laySoLuong()
        {
            return this.thungPhieuDuThuong.size();
        }
        public String rutTham()
        {
            String ketQua="";
            Random rd=new Random();
            int viTri=rd.nextInt(this.thungPhieuDuThuong.size());
            ketQua =  (String) this.thungPhieuDuThuong.toArray()[viTri];
            return  ketQua;
        }
        public  void inAll()
        {
            System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
        }
    public static void main(String[] args) {

        int luachon=0;
        Scanner khoiTao=new Scanner(System.in);
            main rt=new main();
        do{
            System.out.println("___________________________________\nMUNU");
            System.out.println("1. them ma so du thung");
            System.out.println("2. xoa mot ma so du thuong");
            System.out.println("3. kiem tra ma so du thuong co ton tai hay khpng");
            System.out.println("4.xoa all phieu du thuong");
            System.out.println("5 so luon gphieu du thuong");
            System.out.println("6. rut tham");
            System.out.println("7. in ra all phieu");
            System.out.println("0. thoat");
            luachon=khoiTao.nextInt();
            khoiTao.nextLine();
            if(luachon ==1 || luachon==2 || luachon==3)
            {
                System.out.println("nhap ma so du thuong");
                String giaTri=khoiTao.nextLine();
                if(luachon==1)
                {
                    rt.themPhieu(giaTri);
                }else if(luachon==2) rt.xoaPhieu(giaTri);
                else {
                    System.out.println("kq kiem tra:"+rt.kiemTraPhieuTonTai(giaTri));
                }
            }
            else if (luachon==4)
            {
                rt.xoaPhieuAll();
            }else if (luachon==5)
            {
                System.out.println("so luong phieu:"+rt.laySoLuong());
            }
            else if (luachon==6)
            {
                System.out.println("ma so trung thuong la:"+rt.rutTham());
            }
            else  if(luachon==7)
            {
                System.out.println("cac phieu du thuong la:");rt.inAll();
            }

        }
        while (luachon!=0);
    }
}
