package com.metropolitan.IT355PZ;

import com.metropolitan.IT355PZ.entity.Product;
import com.metropolitan.IT355PZ.entity.Restaurant;
import com.metropolitan.IT355PZ.repository.ProductRepository;
import com.metropolitan.IT355PZ.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class It355PzApplicationTests {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test
    void findAllTest() {
        Restaurant restaurant = new Restaurant(1, "Viljuskica Rajkova", "Kazandzijsko sokace BB, Nis 18000", "0654038941", "rajkovaviljuskica@gmail.com");
        List<Product> productList = new ArrayList<>();
        Product p1 = new Product(1, "Pohovana piletina obrok", 410, "https://informer.rs/data/images/2020-01-19/307949_food-photography-2358900-960-720_f.jpg", restaurant);
        productList.add(p1);
        Product p2 = new Product(2, "Cesar salata", 410, "https://glossy.espreso.co.rs/data/images/2021/08/03/15/325706_cezarsalatashutterstock-1078415420_ff.jpg", restaurant);
        productList.add(p2);
        Product p3 = new Product(3, "Rizoto Sangaj sa piletinom", 280, "https://glossy.espreso.co.rs/data/images/2021/08/03/15/325706_cezarsalatashutterstock-1078415420_ff.jpg", new Restaurant(2, "Rizoto bar", "Vozda Karadjordja 68, Nis 18000", "0612051449", "rizotosutlijasbar@gmail.com"));
        productList.add(p3);

        Mockito.when(productRepository.findAll()).thenReturn(productList);

        Integer expectedCount = 3;
        System.out.println(productService.findAll());
        Assertions.assertEquals(expectedCount, productService.findAll().size());
        Assertions.assertTrue(productService.findAll().contains(p1));
    }

    @Test
    void saveTest() {
        Restaurant restaurant = new Restaurant(3, "Viljuskica Rajkova", "Kazandzijsko sokace BB, Nis 18000", "0000000000", "rajkovaviljuskica@gmail.com");
        Product p = new Product(4, "Pohovana piletina obrok", 360, "https://informer.rs/data/images/2020-01-19/307949_food-photography-2358900-960-720_f.jpg", restaurant);

        Mockito.when(productRepository.save(p)).thenReturn(p);
        System.out.println(p);
        Assertions.assertEquals(p, productService.save(p));
    }

    @Test
    void updateTest() {
        Restaurant restaurant = new Restaurant(3, "Viljuskica Rajkova", "Kazandzijsko sokace BB, Nis 18000", "0000000000", "rajkovaviljuskica@gmail.com");
        Product p = new Product(4, "Pohovana piletina", 280, "https://stil.kurir.rs/data/images/2019/09/04/12/198233_shutterstock-1045713400_ls.jpg", restaurant);

        Mockito.when(productService.update(p)).thenReturn(p);
        System.out.println(p);

        Assertions.assertEquals(p, productService.update(p));
        Assertions.assertEquals(p.getName(), productService.update(p).getName());
        Assertions.assertEquals(p.getPrice(), productService.update(p).getPrice());
        Assertions.assertEquals(p.getIdRestaurant(), productService.update(p).getIdRestaurant());
    }

    @Test
    public void findByNameTest() {
        String name = "Cesar salata";

        Restaurant restaurant = new Restaurant(1, "Viljuskica Rajkova", "Kazandzijsko sokace BB, Nis 18000", "0654038941", "rajkovaviljuskica@gmail.com");
        Product p2 = new Product(2, "Cesar salata", 410, "https://glossy.espreso.co.rs/data/images/2021/08/03/15/325706_cezarsalatashutterstock-1078415420_ff.jpg", restaurant);

        Mockito.when(productService.findByName(name)).thenReturn(p2);

        Assertions.assertEquals(name, productService.findByName(name).getName());
        Assertions.assertEquals(410, productService.findByName(name).getPrice());
    }

    @Test
    public void deleteByIdTest() {
        Integer idProduct = 4;

        productService.deleteById(idProduct);
        Mockito.verify(productRepository, times(1)).deleteById(idProduct);
    }

}