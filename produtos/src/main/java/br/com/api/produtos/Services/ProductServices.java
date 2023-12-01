package br.com.api.produtos.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.Repository.ProductRepository;
import br.com.api.produtos.model.ProductModel;
import br.com.api.produtos.model.ResponseModel;

@Service
public class ProductServices {
    
    @Autowired
    private ProductRepository pr;

    @Autowired
    private ResponseModel rm;
    public Iterable<ProductModel> list() {
        return pr.findAll();
    }

    public ResponseEntity<?> registerAlter(ProductModel obj, String action){
         if(obj.getName().equals("")) {
            rm.setMessage("O nome do produto é obrigatório");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
            
         } else if(obj.getBrand().equals("") ) {
            rm.setMessage("O nome da marca é obrigatório");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
         } else {
            if(action.equals("register")) {
                  return new ResponseEntity<ProductModel>(pr.save(obj), HttpStatus.CREATED);
            }else {
                return new ResponseEntity<ProductModel>(pr.save(obj), HttpStatus.OK);

            }
         }

    }

}
