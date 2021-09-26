package com.exventure.training.swaggerproject1.Controller;

import com.exventure.training.swaggerproject1.Controller.DTO.CustomerDTO;
import com.exventure.training.swaggerproject1.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/addcustomer")
    public void addCustomer(@RequestBody CustomerDTO dto){
        customerService.addCustomer(dto);
    }

    @PutMapping(value = "/updatecustmer")
    public void updatedCustomer(@RequestBody CustomerDTO dto){customerService.updateCustomer(dto);}

    @GetMapping(value = "/getallcustomee")
    public List<CustomerDTO> getALllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/getcustomer/{id}")
    public CustomerDTO getCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteCustomer(@PathVariable int id){ customerService.deleteCustomer(id);}
}
