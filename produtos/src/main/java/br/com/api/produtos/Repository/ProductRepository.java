package br.com.api.produtos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.produtos.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {


    
}
