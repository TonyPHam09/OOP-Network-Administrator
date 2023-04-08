package KhoPhuTungXeMay;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        danhsachptxe dsxe = new danhsachptxe();
        int a;

        // chọn menu

        do {
            System.out.println("\n----------MENU----------");
            System.out.println("Hay nhap vao con so tuong ung trong menu:");
            System.out.println("1: Them vao danh sach PT danh cho xe con tay.");
            System.out.println("2: Them vao danh sach PT danh cho xe so.");
            System.out.println("3: Them vao danh sach PT danh cho xe tay ga.");
            System.out.println("4:Xuat thong tin phu tung xe con tay.");
            System.out.println("5:Xuat thong tin phu tung xe so.");
            System.out.println("6:Xuat thong tin phu tung xe tay ga.");
            System.out.println("7:Lam rong danh sach.");
            System.out.println("8:Thong ke so luong phu tung.");
            System.out.println("9:Kiem tra phu tung xe.");
            System.out.println("10:Xuat thong tin danh sach theo gia giam dan.");
            System.out.println("11:Xoa thong tin phu tung.");
            System.out.println("12:Thoat chuong trinh.");
            System.out.print("Chon: ");
            a = input.nextInt();
            // nhập lại menu

            if (a < 1 || a > 12) {
                System.out.println("\n----------ERROR----------");
                System.out.println("Vui long chon trong khoang 1 toi 12!!!!!");

            } else {
                // vào menu
                switch (a) {
                    case 1: {
                        xecontay xecontay = new xecontay();
                        System.out.println("\nHay nhap vao loai phu tung: ");
                        input.nextLine();
                        String Kind = input.nextLine();
                        System.out.println("Hay nhap vao hang san xuat: ");
                        String Brand = input.nextLine();
                        System.out.println("Hay nhap vao ma SP: ");
                        String Code = Brand + "-" + input.nextLine();
                        System.out.println("Hay nhap vao gia san pham: ");
                        Double Price = input.nextDouble();
                        System.out.println("Hay nhap vao ngay nhap kho: ");
                        input.nextLine();
                        String InPutDay = input.nextLine();
                        System.out.println("Hay nhap vao ngay xuat kho: ");
                        String OutPutDay = input.nextLine();
                        xecontay = new xecontay(Kind, Code, Brand, Price, InPutDay, OutPutDay);
                        dsxe.addPT1(xecontay);
                        break;
                    }
                    case 2: {
                        System.out.println("\nHay nhap vao loai phu tung: ");
                        input.nextLine();
                        String Kind = input.nextLine();
                        System.out.println("Hay nhap vao hang san xuat: ");
                        String Brand = input.nextLine();
                        System.out.println("Hay nhap vao ma SP: ");
                        String Code = Brand + "-" + input.nextLine();
                        System.out.println("Hay nhap vao gia san pham: ");
                        Double Price = input.nextDouble();
                        System.out.println("Hay nhap vao ngay nhap kho: ");
                        input.nextLine();
                        String InPutDay = input.nextLine();
                        System.out.println("Hay nhap vao ngay xuat kho: ");
                        String OutPutDay = input.nextLine();
                        xeso xeso = new xeso(Kind, Code, Brand, Price, InPutDay, OutPutDay);
                        dsxe.addPT2(xeso);
                        break;
                    }

                    case 3: {
                        System.out.println("\nHay nhap vao loai phu tung: ");
                        input.nextLine();
                        String Kind = input.nextLine();
                        System.out.println("Hay nhap vao hang san xuat: ");
                        String Brand = input.nextLine();
                        System.out.println("Hay nhap vao ma SP: ");
                        String Code = Brand + "-" + input.nextLine();
                        System.out.println("Hay nhap vao gia san pham: ");
                        Double Price = input.nextDouble();
                        System.out.println("Hay nhap vao ngay nhap kho: ");
                        input.nextLine();
                        String InPutDay = input.nextLine();
                        System.out.println("Hay nhap vao ngay xuat kho: ");
                        String OutPutDay = input.nextLine();
                        xetayga xetayga = new xetayga(Kind, Code, Brand, Price, InPutDay, OutPutDay);
                        dsxe.addPT3(xetayga);
                        break;
                    }
                    case 4: {
                        dsxe.xuatthongtin1();
                        break;
                    }
                    case 5: {
                        dsxe.xuatthongtin2();
                        break;
                    }
                    case 6: {
                        dsxe.xuatthongtin3();
                        break;
                    }
                    case 7: {
                        int empty;
                        System.out.println("\nChon danh sach can lam rong: ");
                        System.out.println("1.Danh sach xe con tay.");
                        System.out.println("2.Danh sach xe so.");
                        System.out.println("3.Danh sach xe tay ga.\n");
                        System.out.print("Chon: ");

                        do {
                            empty = input.nextInt();
                            if (empty < 1 || empty > 3) {
                                System.out.println("\n-----ERROR-----");
                                System.out.println("Phai nhap trong khoang tu 1->3");
                                System.out.println("Chon danh sach can lam rong: ");
                                System.out.println("1.Danh sach xe con tay.");
                                System.out.println("2.Danh sach xe so.");
                                System.out.println("3.Danh sach xe tay ga.\n");
                                System.out.print("Chon: ");

                            } else {
                                switch (empty) {
                                    case 1: {
                                        dsxe.lamrongDanhsach1();
                                        break;
                                    }
                                    case 2: {
                                        dsxe.lamrongDanhsach2();
                                        break;
                                    }
                                    case 3: {
                                        dsxe.lamrongDanhsach3();
                                        break;
                                    }
                                }
                            }
                        } while (empty < 1 || empty > 3);
                        break;
                    }
                    case 8: {
                        int quantity;
                        System.out.println("\nChon thong ke danh sach so luong cua loai phu tung xe: ");
                        System.out.println("1. Danh sach phu tung xe con tay.");
                        System.out.println("2. Danh sach phu tung xe so.");
                        System.out.println("3. Danh sach phu tung xe tay ga.\n");
                        System.out.print("Chon: ");

                        do {
                            quantity = input.nextInt();
                            if (quantity < 1 || quantity > 3) {
                                System.out.println("\n-------ERROR-------");
                                System.out.println("Phai nhap trong khoang tu 1->3");
                                System.out.println("Chon thong ke danh sach so luong cua loai xe: ");
                                System.out.println("1. Danh sach phu tung xe con tay.");
                                System.out.println("2. Danh sach phu tung xe so.");
                                System.out.println("3. Danh sach phu tung xe tay ga.");
                                System.out.print("Chon: ");

                            } else {
                                switch (quantity) {
                                    case 1: {
                                        System.out.println("\nSo luong phu tung xe con tay: " + dsxe.soluongpt1());
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\nSo luong phu tung xe so: " + dsxe.soluongpt2());
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("\nSo luong phu tung xe tay ga: " + dsxe.soluongpt3());
                                        break;
                                    }
                                }
                            }
                        } while (quantity < 1 || quantity > 3);
                        break;
                    }
                    case 9: {
                        int x;
                        System.out.println("\nKiem tra phu tung xe.");
                        System.out.println("1: Kiem tra phu tung xe con tay.");
                        System.out.println("2: Kiem tra phu tung xe so.");
                        System.out.println("3: Kiem tra phu tung xe tay ga.");
                        System.out.print("Chon: ");

                        do {
                            x = input.nextInt();
                            if (x < 1 || x > 3) {
                                System.out.println("\n------ERROR-------");
                                System.out.println("Phai nhap trong khoang tu 1->3");
                                System.out.println("Kiem tra phu tung xe.");
                                System.out.println("1: Kiem tra phu tung xe con tay.");
                                System.out.println("2: Kiem tra phu tung xe so.");
                                System.out.println("3: Kiem tra phu tung xe tay ga.");
                                System.out.print("Chon: ");

                            } else {
                                switch (x) {
                                    case 1: {
                                        System.out.println("\nNhap ma san pham de kiem tra");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xecontay xecontay = new xecontay(codeCheck);
                                        System.out.println("Kiem tra phu tung co trong danh sach: "
                                                + dsxe.kiemTraPhuTungXe1(xecontay));
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("\nNhap ma san pham de kiem tra");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xeso xeso = new xeso(codeCheck);
                                        System.out.println("Kiem tra phu tung co trong danh sach: "
                                                + dsxe.kiemTraPhuTungXe2(xeso));
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("\nNhap ma san pham de kiem tra");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xetayga xetayga = new xetayga(codeCheck);
                                        System.out.println("Kiem tra phu tung co trong danh sach: "
                                                + dsxe.kiemTraPhuTungXe3(xetayga));
                                        break;
                                    }
                                }
                            }

                        } while (x < 1 || x > 3);

                        break;
                    }
                    case 10: {
                        int x;
                        System.out.println("\nXuat thong tin danh sach theo gia giam dan.");
                        System.out.println("1: Danh sach phu tung xe con tay.");
                        System.out.println("2: Danh sach phu tung xe so.");
                        System.out.println("3: Danh sach phu tung xe tay ga.");
                        System.out.print("Chon: ");

                        do {
                            x = input.nextInt();
                            if (x <= 0 || x > 3) {
                                System.out.println("\n----------ERROR----------");
                                System.out.println("Vui long chon trong khoang 1 toi 3!!!!!");
                                System.out.println("Xuat thong tin danh sach theo gia giam dan.");
                                System.out.println("1: Danh sach phu tung xe con tay.");
                                System.out.println("2: Danh sach phu tung xe so.");
                                System.out.println("3: Danh sach phu tung xe tay ga.");
                                System.out.print("Chon: ");

                            }
                        } while (x <= 0 || x > 3);
                        switch (x) {
                            case 1: {
                                dsxe.sapXepTheoPtGiamDan1();
                                dsxe.xuatthongtin1();
                                break;
                            }
                            case 2: {
                                dsxe.sapXepTheoPtGiamDan2();
                                dsxe.xuatthongtin2();
                                break;
                            }
                            case 3: {
                                dsxe.sapXepTheoPtGiamDan3();
                                dsxe.xuatthongtin3();
                                break;
                            }
                        }
                        break;
                    }
                    case 11: {
                        int x;
                        System.out.println("\nXoa thong tin phu tung.");
                        System.out.println("1: Xoa thong tin trong danh sach xe con tay");
                        System.out.println("2: Xoa thong tin trong danh sach xe so");
                        System.out.println("3: Xoa thong tin trong danh sach xe tay ga");
                        System.out.print("Chon: ");

                        do {
                            x = input.nextInt();
                            if (x < 1 || x > 3) {
                                System.out.println("\n-----ERROR-----");
                                System.out.println("Phai nhap trong khoang tu 1->3");
                                System.out.println("Xoa thong tin phu tung.");
                                System.out.println("1: Xoa thong tin trong danh sach xe con tay");
                                System.out.println("2: Xoa thong tin trong danh sach xe so");
                                System.out.println("3: Xoa thong tin trong danh sach xe tay ga");
                                System.out.print("Chon: ");

                            } else {
                                switch (x) {
                                    case 1: {
                                        System.out.println("Nhap ma phu tung cua xe con tay: ");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xecontay xecontay = new xecontay(codeCheck);
                                        System.out
                                                .println("Xoa thong tin phu tung: " + dsxe.xoaThongTin1(xecontay));
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Nhap ma phu tung cua xe so: ");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xeso xeso = new xeso(codeCheck);
                                        System.out.println("Xoa thong tin phu tung : " + dsxe.xoaThongTin2(xeso));
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("Nhap ma phu tung cua xe tay ga ");
                                        input.nextLine();
                                        String codeCheck = input.nextLine();
                                        xetayga xetayga = new xetayga(codeCheck);
                                        System.out.println("Xoa thong tin phu tung : " + dsxe.xoaThongTin3(xetayga));
                                        break;
                                    }
                                }
                            }
                        } while (x < 1 || x > 3);
                        break;
                    }
                    case 12: {
                        System.out.println("Tran trong cam on.");
                        break;
                    }

                }
            }
        } while (a != 12);
        input.close();
    }
}