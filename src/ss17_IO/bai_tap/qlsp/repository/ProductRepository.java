package ss17_IO.bai_tap.qlsp.repository;

import ss17_IO.bai_tap.qlsp.model.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> products = new ArrayList<>();
    static {
        Product product1 = new Product(001, "Jean Basic", 350.00);
        Product product2 = new Product(002, "T-Shirt Basic", 200.00);
        products.add(product1);
        products.add(product2);
    }

    @Override
    public void writeToFile(String path) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(products);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> readDataFromFile(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            products = (List<Product>) ois.readObject();
        }catch (Exception e){
        e.printStackTrace();
        }
        return products;
    }

    @Override
    public void findProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id){
                System.out.println(products.get(i));
                break;
            }
        }
    }

    @Override
    public void addProduct(Product newProduct) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i) == null){
                products.add(newProduct);
                break;
            }
        }
    }
}
