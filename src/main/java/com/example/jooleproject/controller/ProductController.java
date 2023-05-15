package com.example.jooleproject.controller;

import com.example.jooleproject.entity.*;
import com.example.jooleproject.service.IProductService;
import com.example.jooleproject.service.IProjectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProjectProductService iProjectProductService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        String msg="";
        try {
            msg = iProductService.addProduct(product);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @PostMapping("/addProductWithAllInfo")
    public String addProductWithAllInfo(@RequestBody ProductInfo productInfo){
        String msg="";
        try {
            msg = iProductService.addProductWithAllInfo(productInfo);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @DeleteMapping("/deleteProduct")
    public String deleteProduct(@RequestParam int productId){
        String msg="";
        try {
            msg = iProductService.deleteProduct(productId);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @GetMapping("/getTechnicalDetailByProductId")
    public TechnicalDetail getTechnicalDetailByProductId(@RequestParam int productId){
        return iProductService.getTechnicalDetailByProductId(productId);
    }

    @GetMapping("/addProjectProduct")
    public String addProjectProduct(@RequestParam int projectId, @RequestParam int productId){
        String msg="";
        try {
            msg = iProjectProductService.addProjectProduct(projectId, productId);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @DeleteMapping("/deleteProjectProduct")
    public String deleteProjectProduct(@RequestParam int projectId, @RequestParam int productId){
        String msg="";
        try {
            msg = iProjectProductService.deleteProjectProduct(projectId, productId);
        }
        catch (Exception exception){
            msg = "System error, please contact administrator...";
            System.err.println(exception);
        }
        return msg;
    }

    @GetMapping("/getProjectProductByProjectId")
    public List<ProjectProduct> getProjectProductByProjectId(@RequestParam int projectId){
        return iProjectProductService.getProjectProductByProjectId(projectId);
    }

    @GetMapping("/getProductsByProjectId")
    public List<Product> getProductsByProjectId(@RequestParam int projectId){
        return iProjectProductService.getProductsByProjectId(projectId);
    }

    @GetMapping("/searchProductByBrand")
    public List<Product> searchProductByBrand(@RequestParam String brand){
        return iProductService.searchProductByBrand(brand);
    }

    @GetMapping("/searchProductAdvance")
    public Set<Product> searchProductAdvance(@RequestBody ProductInfo productInfo){
        return iProductService.searchProductAdvance(productInfo);
    }
}
