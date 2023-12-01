package br.com.api.produtos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class ProductModel {
    

    private Long id;
    private String name;
    private String brand;
    

}
