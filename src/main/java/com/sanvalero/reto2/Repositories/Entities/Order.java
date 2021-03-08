package com.sanvalero.reto2.Repositories.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "Orderrr")

@Entity(name = "Orderrr")

public class Order {




    public enum estates {
        ACEPTADO,
        CANCELADO,
        ENCURSO,
        ENTREGADO,
        ENVIADO;
    }

    //Autoincremental
    private @Id @GeneratedValue Long id;
    private String Date; 
    private String Name; 
    private estates State;

    



    public Order (final String _date, final String _name, final estates _state){
        this.Date = _date; 
        this.Name = _name; 
        this.State = _state;
    }
	

    public Order (final Long _id, final String _date, final String _name, final estates _state) {    
        super(); 
        this.id = _id;  
        this.Date = _date; 
        this.Name = _name; 
        this.State = _state;
    }
	

    public Order (Order order) {       
        this.Date = order.Date;
        this.Name = order.Name; 
        this.State = order.State;
    }
	
    public Order() {
	}

    

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public estates getState() {
        return State;
    }

    public void setState(estates state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Order [Id=" + id + ", Name=" + Name + ", State=" + State + ", Date=" + Date + "]";
    }

    
}
