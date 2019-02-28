package com.axity.strategy;

import java.util.ArrayList;
import java.util.List;

public class PaypalStrategy implements PaymentStratgy{

    private String emailId;
    private String password;
    List<Integer> registry;

    public PaypalStrategy(String email, String pwd){
        this.emailId = email;
        this.password = pwd;
        this.registry = new ArrayList<>();
    }

    public boolean login(){
        //Se realiza una consulta en la base de datos para poder iniciar sesion
        if(emailId.equals(emailId) && password.equals(password)){
            return  true;
        }
        return false;
    }

    public void registry(int amount){
        registry.add(amount);
    }

    @Override
    public void pay(int amount) {
        if(login()){
            registry(amount);
            System.out.println("Correct Access" + "\n" +
                    amount + " paid using Paypal.\n");
        }
        System.out.println("Access Denied");
    }
}
