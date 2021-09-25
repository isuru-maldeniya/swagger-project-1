package com.exventure.training.swaggerproject1.Controller.DTO;

public class CustomerDTO {
    private int cusId;
    private String name;
    private String address;

    public CustomerDTO() {
    }

    public CustomerDTO(int cusId, String name, String address) {
        this.cusId = cusId;
        this.name = name;
        this.address = address;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
