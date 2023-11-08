package ss17_IO.bai_tap.qlsp.service;

import ss17_IO.bai_tap.qlsp.model.Product;

import java.util.List;

public interface IProductService {
    public void addProduct(Product newProduct);
    public void writeToFile(String path);
    public void findProduct(int id);
    public List<Product> readDataFromFile(String path);


}
