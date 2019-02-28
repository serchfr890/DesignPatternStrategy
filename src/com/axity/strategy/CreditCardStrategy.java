package com.axity.strategy;

public class CreditCardStrategy implements PaymentStratgy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public  CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name = nm;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    public boolean validateCreditDebitCard(){
        if(cardNumber.length() == 16 && cvv.length() == 3 && dateOfExpiry.length() == 5){
            //Podria ser el caso de una consulta a base de datos
            return true;
        }
        return false;
    }

    @Override
    public void pay(int amount) {
        if(validateCreditDebitCard()) {
            System.out.println("Correct Validation\n" + amount + " paid with credit/debit car");
        }
        System.out.println("Bad Credit/Debit card data");
    }
}
