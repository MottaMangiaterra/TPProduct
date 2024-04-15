import com.motta.Category.Model.Repositories.CategoryRepository;
import com.motta.Category.View.CategoryView;
import com.motta.Product.Controller.ProductController;
import com.motta.Product.Model.Repositories.ProductRepository;
import com.motta.Product.View.ProductView;

public class Main {
    public static void main(String[] args) {

        ProductView productView = new ProductView();
        ProductRepository productRepository = new ProductRepository();
        CategoryView categoryView = new CategoryView();
        CategoryRepository categoryRepository = new CategoryRepository();

        ProductController productController = new ProductController(productView, productRepository,
                categoryView, categoryRepository);

        menu(productController);
    }

    public static void menu(ProductController productController){

        for (int i = 0; i<3;i++){

            productController.createProduct();
        }

        productController.readProduct();
        productController.updateProduct();
        productController.deleteProduct();
        productController.readProduct();

    }
}