package com.example.springrest.customer;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerController {

    //handler methods: to handle http requests - GET,POST,PUT,DELETE,
    @RequestMapping
    @ResponseBody
    public String index(HttpServletRequest request) {
        System.out.println(request.getMethod() + " - " + request.getRequestURI());
        return "index";
    }
    //reutrn response;

    @RequestMapping("/v1/single")
    @ResponseBody
    public ResponseEntity<Customer> findCustomerV1() {
        //JAVA object
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Subramanian");
        customer.setCity("Coimbatore");
        //response entity can be used to add extra meta data - if you want to custome headers
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("key", "Abbcccc4522323");
        return new ResponseEntity<Customer>(customer, httpHeaders, HttpStatus.OK);
    }

    //Domain Object directly
    @RequestMapping("/v2/single")
    // @ResponseBody
    public Customer findCustomerV2() {
        //JAVA object
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Subramanian");
        customer.setCity("Coimbatore");
        //Spring takes care of converting DOMAIN model into json by default ,adds http 200 status code
        return customer;
    }

    @RequestMapping("/v3/single")
    @ResponseBody
    public ResponseEntity<Customer> findCustomerV3() {
        //JAVA object
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Subramanian");
        customer.setCity("Coimbatore");
        //response entity can be used to add extra meta data - if you want to custome headers
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("key", "Abbcccc4522323");
        //Builder pattern
        return ResponseEntity
                .status(200)
                .headers(httpHeaders)
                .body(customer);
    }

    //content negotation: produces says that if client ask json or xml it can server
    @RequestMapping(value = "/v4/single", produces = {"application/json", "application/xml"})
    @ResponseBody
    public ResponseEntity<Customer> findCustomerV4() {
        //JAVA object
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Subramanian");
        customer.setCity("Coimbatore");
        //response entity can be used to add extra meta data - if you want to custome headers
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("key", "Abbcccc4522323");
        //Builder pattern
        return ResponseEntity
                .status(200)
                .headers(httpHeaders)
                .body(customer);
    }

    @RequestMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Customer>> findCustomers() {
        //JAVA object
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setName("Subramanian");
        customer1.setCity("Coimbatore");

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setName("Kathik");
        customer2.setCity("Coimbatore");
        List<Customer> customers = Arrays.asList(customer1, customer2);
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }

    //Query params
    //http://localhost:8080/api/customer/byid?id=100
//    @RequestMapping("/byid")
//    public String findById(@RequestParam String id) {
//        return "Customer By " + id;
//    }
//    @RequestMapping(value = "/byid")
//    String findById(@RequestParam("id") String personId) {
//        System.out.println("ID is " + personId);
//         return "Customer By " + personId;
//    }
//with default value
    //http://localhost:8080/api/customer/byid - 100
    //http://localhost:8080/api/customer/byid?id=800
    @RequestMapping(value = "/byid")
    String getDefaultName(@RequestParam(value = "id", defaultValue = "100") String personId) {
        System.out.println(personId);
        return "Customer By " + personId;
    }

    //http://localhost:8080/api/customer/name?person=Subramanian
    //http://localhost:8080/api/customer/name
    @RequestMapping(value = "/name")
    String getName(@RequestParam(value = "person", required = false) String personName) {
        System.out.println(personName);
        return "Required element of request param";
    }

    //http://localhost:8080/api/customer/fetch/3
    @RequestMapping(value = "/fetch/{id}")
    String getDynamicUriValue(@PathVariable String id) {
        System.out.println("ID is " + id);
        return "Dynamic URI parameter fetched" + id;
    }
}
