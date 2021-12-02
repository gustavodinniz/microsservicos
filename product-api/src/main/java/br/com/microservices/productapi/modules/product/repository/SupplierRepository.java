package br.com.microservices.productapi.modules.product.repository;

import br.com.microservices.productapi.modules.product.model.Category;
import br.com.microservices.productapi.modules.product.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
