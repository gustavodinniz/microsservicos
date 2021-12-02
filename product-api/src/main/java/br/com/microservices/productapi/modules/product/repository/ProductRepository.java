package br.com.microservices.productapi.modules.product.repository;

import br.com.microservices.productapi.modules.product.model.Category;
import br.com.microservices.productapi.modules.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
