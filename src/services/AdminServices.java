package services;

import admin.Admin;
import enums.Ingredients;

import java.util.Scanner;

public class AdminServices {
    Admin admin;
    Scanner sc;

    public AdminServices(Admin admin) {
        this.admin = new Admin();
        sc=new Scanner(System.in);
    }
    public void authenticate(String name,String password){
        if(admin.getMap().containsKey(name)){
            if(admin.getMap().get(name).equals(password)){
               do {
                    String flag = "y";
                    System.out.println("Do you want to add ingredients! y/n");
                    String s=sc.next();

                        if (s.equals("y")) {
                            System.out.println("Enter type and amount...");
                            Ingredients type=sc.next();
                            float amount=sc.nextFloat();
                            IngredientsAdderService adderService=new IngredientsAdderService();
                            adderService.fill(type,amount);
                        }
                        System.out.println("Do you want audit info! y/n");


                }while();
            }
            else {
                System.out.println("Incorrect password");
                return;
            }
        }
        else{
            System.out.println("Invalid username");
            return;
        }
    }
}
