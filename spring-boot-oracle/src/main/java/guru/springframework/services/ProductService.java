package guru.springframework.services;

import guru.springframework.commands.ProductForm;
import guru.springframework.controllers.ProductController;
import guru.springframework.domain.Product;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductService {
    Logger logger = Logger.getLogger(ProductService.class);

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
