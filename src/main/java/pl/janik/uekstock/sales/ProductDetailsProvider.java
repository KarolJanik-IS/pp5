package pl.janik.uekstock.sales;

import pl.janik.uekstock.productcatalog.Product;

public interface ProductDetailsProvider {
    ProductDetails getProductDetails(String productId);
}
