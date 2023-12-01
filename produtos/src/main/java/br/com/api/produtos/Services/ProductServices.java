package br.com.api.produtos.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.produtos.Repository.ProductRepository;
import br.com.api.produtos.model.ProductModel;

@Service
public class ProductServices {
    
    @Autowired
    private ProductRepository pr;

    public Iterable<ProductModel> list() {
        return pr.findAll();
    }

}
