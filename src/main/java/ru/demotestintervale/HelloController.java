package ru.demotestintervale;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name",defaultValue = "world")String name){
        return "hello " + name;
    }
    @PutMapping("/puthello")
    public String putHello(){
        return "PutHello";
    }
    @PostMapping("/posthello")
    public String postHello(@RequestParam(name = "name",defaultValue = "world")String name){
        return "hello " + name;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        if (id == 3){
            Product product = new Product(3);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        }else {
            return new  ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

}
