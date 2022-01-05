package com.example.cswfinal.Controller;

import com.example.cswfinal.Response.BaseResponse;
import com.example.cswfinal.Response.ProductDTO;
import com.example.cswfinal.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/getallproduct")
    private ResponseEntity getAllProducts()
    {
        BaseResponse res = new BaseResponse();
        res.data = productService.getAllProduct();
        return ResponseEntity.ok(res);
    }

    @PostMapping("/addProduct")
    private ResponseEntity addProduct(@RequestBody ProductDTO productDTO)
    {
        BaseResponse res = new BaseResponse();
        res.data = productService.addProduct(productDTO);
        return ResponseEntity.ok(res);
    }

    @PutMapping("/sellProduct/{id}/{quantity}")
    private ResponseEntity sellProduct(@PathVariable int id , @PathVariable int quantity)
    {
        BaseResponse res = new BaseResponse();
        res.data = productService.sellProduct(id , quantity);
        return ResponseEntity.ok(res);
    }

}
