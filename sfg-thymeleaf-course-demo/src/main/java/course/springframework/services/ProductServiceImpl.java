package course.springframework.services;

import java.util.List;

import course.springframework.model.Product;
import course.springframework.model.ProductCategory;
import course.springframework.model.Author;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProductServiceImpl implements ProductService {
    public ProductServiceImpl(){
        loadProducts();
    }
    List<Product> products = new ArrayList<Product>();

    @Override
    public Product getProduct(int id) {
        for(Product p: products) {
            if(p.getId() == id)
            return p;
        }
        
        return null;
    }

    @Override
    public List<Product> listProducts() {
        // TODO Auto-generated method stub
        return null;
    }

    private void loadProducts(){
        Author jt = new Author();
        jt.setFirstName("Danny");
        jt.setLastName("Rivas");
        jt.setId(2);
        jt.setImage(null);
        

        ProductCategory springIntroCat = new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Spring Introduction");

        ProductCategory springCoreCat = new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Spring Core");

        ProductCategory springBootCat = new ProductCategory();
        springBootCat.setId(3);
        springBootCat.setCategory("Spring Boot");

        ProductCategory thymeleafCat = new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("Thymeleaf");

        ProductCategory geapCat = new ProductCategory();
        geapCat.setId(5);
        geapCat.setCategory("G.E.A.P");

        

        Product springIntro = new Product();
        springIntro.setId(1);
        springIntro.setCourseName(null);
        springIntro.setCourseSubtitle(null);
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription("APRENDE MUCHACHO");
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("SpringIntroThumb.png");
        springIntro.getProductCategories().add(springIntroCat);
        springIntro.getProductCategories().add(springBootCat);
        products.add(springIntro);


        Product springCoreUltimate = new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCourseName("Spring Core Ultimate");
        springCoreUltimate.setCourseSubtitle(null);
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription("APRENDE MUCHACHO");
        springCoreUltimate.setPrice(new BigDecimal("199"));
        springCoreUltimate.setImageUrl("SpringIntroThumb.png");
        springCoreUltimate.getProductCategories().add(springCoreCat);
        springCoreUltimate.getProductCategories().add(springBootCat);
        products.add(springCoreUltimate);

        Product thymeleaf = new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle(null);
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription("APRENDE MUCHACHO");
        thymeleaf.setPrice(new BigDecimal("259"));
        thymeleaf.setImageUrl("SpringIntroThumb.png");
        thymeleaf.getProductCategories().add(thymeleafCat);
        products.add(thymeleaf);

        Product springCore = new Product();
        springCore.setId(4);
        springCore.setCourseName("Spring Core");
        springCore.setCourseSubtitle(null);
        springCore.setAuthor(jt);
        springCore.setCourseDescription("APRENDE MUCHACHO");
        springCore.setPrice(new BigDecimal("70"));
        springCore.setImageUrl("SpringIntroThumb.png");
        springCore.getProductCategories().add(springCoreCat);
        springCore.getProductCategories().add(springBootCat);
        products.add(springCore);

        Product springCoreAdv = new Product();
        springCore.setId(5);
        springCore.setCourseName("Spring Core Advanced");
        springCore.setCourseSubtitle(null);
        springCore.setAuthor(jt);
        springCore.setCourseDescription("APRENDE MUCHACHO");
        springCore.setPrice(new BigDecimal("85"));
        springCore.setImageUrl("SpringIntroThumb.png");
        springCore.getProductCategories().add(springCoreCat);
        springCore.getProductCategories().add(springBootCat);
        products.add(springCoreAdv);
        
        Product springCoreDevOps = new Product();
        springCoreDevOps.setId(6);
        springCoreDevOps.setCourseName("Spring Core DevOps");
        springCoreDevOps.setCourseSubtitle(null);
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription("APRENDE MUCHACHO");
        springCoreDevOps.setPrice(new BigDecimal("240"));
        springCoreDevOps.setImageUrl("SpringIntroThumb.png");
        springCoreDevOps.getProductCategories().add(springCoreCat);
        springCoreDevOps.getProductCategories().add(springBootCat);
        products.add(springCoreDevOps);


        

    }

    
}
