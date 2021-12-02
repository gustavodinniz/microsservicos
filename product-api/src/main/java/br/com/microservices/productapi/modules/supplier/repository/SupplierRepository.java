package br.com.microservices.productapi.modules.supplier.repository;

import br.com.microservices.productapi.modules.supplier.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
