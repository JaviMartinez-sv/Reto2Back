package com.sanvalero.reto2.Services.Models;

import com.sanvalero.reto2.Repositories.Entities.Order;

public class OrderDTO {

    private Long id;
    private String Name; 
    private String Date; 
    private Order.estates State;
    
    public OrderDTO(final String _name, final String _date,  final Order.estates _state){
        
        super();
        this.Name = _name;
        this.Date = _date;  
        this.State = _state;
    }

 

	

    public OrderDTO (OrderDTO order){       
        
        this.Name = order.Name; 
        this.Date = order.Date;
        this.State = order.State;
    }
	

    public OrderDTO() {
	}





	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    

    public Order.estates getState() {
        return State;
    }

    public void setState(Order.estates state) {
        State = state;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Order [Id=" + id + ", Name=" + Name + ", State=" + State + ", Date=" + Date + "]";
    }

    public Order toOrder() {
        return new Order(
            this.id,
            this.Name,
            this.Date,
            this.State
        );
    }

    
    
    
  
}

