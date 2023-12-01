package br.com.api.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

   @PostMapping("/register")
   public ResponseEntity<?> register(@RequestBody ProductModel obj) {
    return ps.registerAlter(obj, "register");
   }

   @PutMapping("/alter")
    public ResponseEntity<?> alter(@RequestBody ProductModel obj) {
    return ps.registerAlter(obj, "alter");
   }


}
