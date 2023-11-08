package ss8_MVC.service;

import ss8_MVC.model.Product;
import ss8_MVC.respository.IProductRepository;
import ss8_MVC.respository.ProductRepository;

import java.util.Objects;
import java.util.Scanner;

public class ProductService implements  IProductService{
    IProductRepository productRepository = new ProductRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        Product[] products = productRepository.getListProduct();
        for(int i=0; i < products.length; i++){
            if(products[i]!=null){
                System.out.println((1+i)+"."+ products[i].toString());
            }
        }
    }

    @Override
    public void add() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter information: ");
        String information = scanner.nextLine();
        Product product = new Product(id, name, price, information);
        productRepository.addProduct(product);
    }

    @Override
    public void delete() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id to delete: ");
        int delete = Integer.parseInt(scanner.nextLine());
        productRepository.deleteProductById(delete);
    }

    @Override
    public void update() {
        System.out.println("Enter id to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = new Product();
        product.setId(id);
        System.out.println("Set name: ");
        String name = scanner.nextLine();
        System.out.println("Set price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Set information");
        String information = scanner.nextLine();
        product.setName(name);
        product.setPrice(price);
        product.setInformation(information);
        productRepository.updateProduct(product);
    }

    @Override
    public void find() {
        System.out.println("Enter id to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.findProduct(id);
    }
}
