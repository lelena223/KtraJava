/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Favorite {   
    private String id;
    
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    Scanner sc = new Scanner(System.in);
    
    public void inPut(){
        System.out.print("Nhap id(so thich): ");
        id = sc.nextLine();
        System.out.print("Nhap ten(so thich): ");
        name = sc.nextLine();
    }
    
    public void outPut(){
        System.out.print("ID (so thich): " + id);
        System.out.print("Ten (so thich): " + name);
    }
    
}
