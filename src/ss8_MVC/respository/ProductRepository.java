package ss8_MVC.respository;

import ss7_abstract_interface.thuc_hanh.animal_interfaceEdible.fruit.Apple;
import ss8_MVC.model.Product;

import java.util.LinkedList;

public class ProductRepository implements IProductRepository{
    private static Product[] products = new Product[20];
    static {
        products[0] =  new Product(1, "Apple", 50.000, "American");
        products[1] =  new Product(2, "Pear", 40.000, "American");
        products[2] =  new Product(3, "Orange", 10.000, "Japan");

    }

    public Product[] getListProduct() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        for(int i=0; i < products.length; i++ ){
            if(products[i] == null){
                products[i] = product;
                break;
            }
        }
    }

    @Override
    public void deleteProductById(int idDelete) {
        for(int i=0; i<products.length; i++){
            if(products[i].getId() == idDelete ){
                products[i] = null;
                break;
            }
        }
    }

    @Override
    public void updateProduct(Product product) {
        for(int i=0; i<products.length; i++){
            if(products[i] != null && products[i].getId() == product.getId()){
                products[i].setName(product.getName());
                products[i].setInformation(product.getInformation());
                products[i].setPrice(product.getPrice());
                break;
            }
        }
    }

    @Override
    public void findProduct(int id) {
        for(int i=0; i<products.length; i++){
            if( !products[i].equals(null) && products[i].getId() == id){
                System.out.println(products[i]);
                break;
            }
        }
    }
}
