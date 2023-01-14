/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author DELL
 */
public class Honey extends Person{
    private String id;
    
    private int status;

    public Honey() {
    }

    public Honey(String id, int status) {
        this.id = id;
        this.status = status;
    }

    public Honey(String id, int status, String name, int age, String gender, String phone) {
        super(name, age, gender, phone);
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void inPut(){
        super.inPut();
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap status: ");
        status = sc.nextInt();
        sc.nextLine();
    }
    
    public void outPut(){
        super.outPut();
        System.out.println("ID (ma nguoi yeu): " + id);
        System.out.println("Status (0: dang doi, 1: dang yeu): " + status);
    }
}
