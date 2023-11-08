package ss17_IO.bai_tap.qlsp.repository;

import ss17_IO.bai_tap.qlsp.model.Product;

import java.util.List;

public interface IProductRepository {
    public void writeToFile(String path);
    public List<Product> readDataFromFile(String path);
    public void findProduct(int id);
    public void addProduct(Product newProduct);
}
