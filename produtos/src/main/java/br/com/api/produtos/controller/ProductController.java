package br.com.api.produtos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    

    @GetMapping("/")
    public String rota() {
        return "Api de produtos Funcionando";
    }


}
