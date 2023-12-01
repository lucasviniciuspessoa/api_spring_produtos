package br.com.api.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.Services.ProductServices;
import br.com.api.produtos.model.ProductModel;

@RestController

public class ProductController {
    
    @Autowired ProductServices ps;

    @GetMapping("/list")
    public Iterable<ProductModel>list() {
        return ps.list();
    }

    @GetMapping("/")
    public String rota() {
        return "Api de produtos Funcionando";
    }


}
