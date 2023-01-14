/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class runMain {
    ArrayList<Honey> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static runMain run = new runMain();
    Honey honey = new Honey();
    public static void main(String[] args) {
        int n;
        do{
            System.out.println("*****MENU*****");
            System.out.println("1. Add honey");
            System.out.println("2. Show all honey");
            System.out.println("3. Delete honey by id");
            System.out.println("4. Edit honey by id");
            System.out.println("5. Add favorite by honey id");
            System.out.println("6. Sort honey by name");
            System.out.println("7. Exit");
            System.out.println("Nhap lua chon: ");
            n = sc.nextInt();
            switch(n){
                case 1:
                    run.addHoney();
                    break;
                case 2:
                    run.showAllHoneys();
                    break;
                case 3:
                    System.out.print("Nhap id can xoa: ");
                    String id1 = sc.nextLine();
                    run.deleteHoney(id1);
                    break;
                case 4:
                    System.out.print("Nhap id can sua: ");
                    String id2 = sc.nextLine();
                    run.editHoney(id2);
                    break;
                case 5:
                    System.out.print("Nhap id can them so thich: ");
                    String id3 = sc.nextLine();
                    run.addFavorite(id3);
                    break;
                case 6:
                    run.sortHoney();
                    break;
                case 7:
                    System.out.println("Exit.");
                    return;
                    
            }
        }while(true);
    }
    public void addHoney(){
        Honey honey = new Honey();
        honey.inPut();
        if(list.isEmpty()){
            list.add(honey);
        }else{
            for(int i=0;i<list.size()-1;i++){
                for(int j=i;j<list.size();j++){
                    if(list.get(i).getId().compareTo(list.get(j).getId())==0){
                        list.add(honey);
                    }
                }
            }
        }
        
    }
    
    public void showAllHoneys(){
        if(list.isEmpty()){
            System.out.println("Khong co honey nao.");
        } else {
            for(int i=0;i<list.size();i++){
                honey.outPut();
            }
        }
    }
    
    public void deleteHoney(String id){
        if(list.isEmpty()){
            System.out.println("Khong co honey nao.");
        } else {
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId().compareTo(id)==0){
                    list.remove(i);
                }
            }
        }
    }
    
    public void editHoney(String id){
        Honey honey = new Honey();
        if(list.isEmpty()){
            System.out.println("Khong co honey nao.");
        } else {
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId().compareTo(id)==0){
                    list.remove(i);
                    honey.inPut();
                    list.add(honey);
                }
            }
        }
    }
    
    public void addFavorite(String id){
        if(list.isEmpty()){
            System.out.println("Khong co honey nao.");
        } else {
            for(int i=0;i<list.size();i++){
                if(list.get(i).getId().compareTo(id)==0){
                    Favorite favorite = new Favorite();
                    favorite.inPut();
                }
            }
        }
    }
    
    public void sortHoney(){
        if(list.isEmpty()){
            System.out.println("Khong co honey nao.");
        } else {
            for(int i=0;i<list.size()-1;i++){
                for(int j=i+1;j<list.size();j++){
                    
                }
            }
        }
    }
    
}
