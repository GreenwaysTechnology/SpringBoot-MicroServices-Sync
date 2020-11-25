package com.example.springrest.customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

    //request -get,post,delete,put

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String list() {
//        return "list";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String save() {
//        return "SAVE";
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public String update() {
//        return "UPDATE";
//    }
//
//    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
//    public String remove() {
//        return "remove";
//    }
    //   @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String list() {
//        return "list";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String save() {
//        return "SAVE";
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT)
//    public String update() {
//        return "UPDATE";
//    }
//
//    @RequestMapping(value = "/remove", method = RequestMethod.DELETE)
//    public String remove() {
//        return "remove";
//    }

    //
    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseEntity<String> list() {
        return ResponseEntity.status(200).body("Hello");
    }

    @PostMapping(value = "/save", produces = {"application/json", "application/xml"}, consumes = {"application/json", "application/xml"})
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        System.out.println(customer);
        return ResponseEntity.status(200).body(customer);
    }

    @PutMapping(value = "/update")
    public String update() {
        return "UPDATE";
    }

    @DeleteMapping(value = "/remove")
    public String remove() {
        return "remove";
    }

}
