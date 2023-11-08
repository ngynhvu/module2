package ss8_MVC.respository;

import ss8_MVC.model.Product;

public interface IProductRepository {
    Product[] getListProduct();
    void addProduct(Product product);
    void deleteProductById(int idDelete);
    void updateProduct(Product product);
    void findProduct(int id);
}
