package com.exventure.training.swaggerproject1.Services;

import com.exventure.training.swaggerproject1.Controller.DTO.CustomerDTO;
import com.exventure.training.swaggerproject1.Repositories.CustomerRepository;
import com.exventure.training.swaggerproject1.Repositories.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(CustomerDTO dto){
        customerRepository.save(new Customer(dto.getName(), dto.getAddress()));
    }

    public void updateCustomer(CustomerDTO dto){
        Customer customer = customerRepository.findById(dto.getCusId()).get();
        customer.setAddress(dto.getAddress());
        customer.setName(dto.getName());
        customerRepository.save(customer);
    }

    public List<CustomerDTO> getAllCustomers(){
        LinkedList<CustomerDTO> dtos=new LinkedList<>();
        for (Customer customer : customerRepository.findAll()) {
            dtos.add(new CustomerDTO(customer.getCusId(), customer.getName(), customer.getAddress()));
        }

        return dtos;
    }

    public CustomerDTO getCustomer(int id){
        Customer customer = customerRepository.findById(id).get();
        return new CustomerDTO(customer.getCusId(), customer.getName(), customer.getAddress());
    }

    public void deleteCustomer(int id){
        customerRepository.deleteById(id);
    }
}
