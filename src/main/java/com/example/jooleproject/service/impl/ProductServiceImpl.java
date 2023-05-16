package com.example.jooleproject.service.impl;

import com.example.jooleproject.entity.*;
import com.example.jooleproject.repository.DescriptionRepository;
import com.example.jooleproject.repository.ProductRepository;
import com.example.jooleproject.repository.ProductTypeRepository;
import com.example.jooleproject.repository.TechnicalDetailRepository;
import com.example.jooleproject.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private DescriptionRepository descriptionRepository;
    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Autowired
    private TechnicalDetailRepository technicalDetailRepository;

    @Override
    public String addProduct(Product product) {
        String msg = "add success!";
        try {
            productRepository.save(product);
        }catch (Exception e){
            msg = "add failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public String addProductWithAllInfo(ProductInfo productInfo) {
        String msg = "add success!";
        try {
            Product product = new Product();
            product.setProductBrand(productInfo.getProductBrand());
            product.setCertification(productInfo.getCertification());
            // Description
            Description description = new Description();
            description.setManufacturer(productInfo.getManufacturer());
            description.setSeries(productInfo.getSeries());
            description.setModel(productInfo.getModel());
            description.setProduct(product);
            // ProductType
            ProductType productType = new ProductType();
            productType.setAccessories(productInfo.getAccessories());
            productType.setType(productInfo.getType());
            productType.setApplication(productInfo.getApplication());
            productType.setMountingLocation(productInfo.getMountingLocation());
            productType.setModelYear(productInfo.getModelYear());
            productType.setProduct(product);
            // TechnicalDetail
            TechnicalDetail technicalDetail = new TechnicalDetail();
            technicalDetail.setFanSpeed(productInfo.getFanSpeed());
            technicalDetail.setAirflow(productInfo.getAirflow());
            technicalDetail.setPower(productInfo.getPower());
            technicalDetail.setOperatingVoltage(productInfo.getOperatingVoltage());
            technicalDetail.setProduct(product);

            product.setDescription(description);
            product.setProductType(productType);
            product.setTechnicalDetail(technicalDetail);
            productRepository.save(product);
        }catch (Exception e){
            msg = "add failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public String deleteProduct(int productId) {
        String msg = "delete success!";
        try {
            if (productRepository.findByProductId(productId) == null){
                return "product doesn't exist!";
            }
            productRepository.deleteById(productId);
        }catch (Exception e){
            msg = "delete failed!";
            throw e;
        }
        return msg;
    }

    @Override
    public TechnicalDetail getTechnicalDetailByProductId(int productId) {
        Product product = productRepository.findByProductId(productId);
        if (product == null){
            return null;
        }
        return product.getTechnicalDetail();
    }

    @Override
    public List<Product> searchProductByBrand(String brand) {
        return productRepository.findByProductBrandLike(brand);
    }

    @Override
    public Set<Product> searchProductAdvance(ProductInfo productInfo) {
        List<Product> list1 = descriptionRepository.searchProductAdvanceDescription(productInfo.getManufacturer(), productInfo.getSeries(), productInfo.getModel());
        List<Product> list2 = productTypeRepository.searchProductAdvanceProductType(productInfo.getApplication(), productInfo.getType(), productInfo.getMountingLocation(), productInfo.getAccessories(), productInfo.getModelYear());
        List<Product> list3 = technicalDetailRepository.searchProductAdvanceTechnicalDetail(productInfo.getAirflow(), productInfo.getPower(), productInfo.getOperatingVoltage(), productInfo.getFanSpeed());
        List<Product> list0 = new ArrayList<>();
        list0.addAll(list1);
        list0.retainAll(list2);
        List<Product> list = new ArrayList<>();
        list.addAll(list0);
        list.retainAll(list3);
        Set<Product> set = new HashSet<>();
        for (Product p: list){
            set.add(p);
        }
        return set;
    }


}
