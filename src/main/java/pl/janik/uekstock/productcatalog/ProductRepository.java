package pl.janik.uekstock.productcatalog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository
        extends JpaRepository<Product, String> {
}
