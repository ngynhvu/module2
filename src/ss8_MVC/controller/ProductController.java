package ss8_MVC.controller;

import ss8_MVC.service.IProductService;
import ss8_MVC.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void displayMenu() {
        IProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Chọn chức năng :");
            System.out.println("1.Display"+
                    "\n 2.Add"+
                    "\n 3.Edit"+
                    "\n 4.Delete"+
                    "\n 5.Find"+
                    "\n 6.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Chức năng hiển thị");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Chức năng thêm mới");
                    productService.add();
                    break;
                case 3:
                    System.out.println("Chức năng sửa");
                    productService.update();
                    break;
                case 4:
                    System.out.println("Chức năng xoá ");
                    productService.delete();
                    break;
                case 5:
                    System.out.println("Chức năng tìm kím ");
                    productService.find();
                    break;
                default: flag = false;
            }
        }while (flag == true);
    }
}
