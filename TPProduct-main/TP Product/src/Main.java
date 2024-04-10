import com.motta.Product.Controller.ProductController;
import com.motta.Product.Model.Repositories.ProductRepository;
import com.motta.Product.View.ProductView;

public class Main {
    public static void main(String[] args) {

        ProductView productView = new ProductView();
        ProductRepository productRepository = new ProductRepository();

        ProductController productController = new ProductController(productView,productRepository);

        menu(productController);
    }

    public static void menu(ProductController productController){

        for (int i = 0; i<3;i++){

            productController.createProduct();
        }

        productController.createProduct();
        productController.getProductView().listProduct(productController.getProductRepository().getListProducts());
        productController.updateProduct();
        productController.removeProduct();
        productController.readProduct();

    }
}