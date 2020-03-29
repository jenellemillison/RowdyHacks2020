package com.example.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkStock
{
    public int inventoryCheck(String store, String item) throws FileNotFoundException {
        int itemInv=-1;
        File file = new File(store+".txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            if(item.equals(scan.next()))
            {
                itemInv = scan.nextInt();
                return itemInv;
            }
            else
            {
                scan.nextInt();
            }
        }
        return itemInv;
    }
     public String inventoryCheck(String item) throws FileNotFoundException {
        String itemInv = null;
        File file = new File("Inventory.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            if(item.equals(scan.next()))
            {
                itemInv = scan.next();
                return itemInv;
            }
            else
            {
                scan.next();
            }
        }
        return itemInv;
    }
    public String findStore(int zipCode) throws FileNotFoundException {
        String store = "";
        File file = new File("storeList.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            if(scan.nextInt()==zipCode)
            {
                store = scan.next();
                return store;
            }
            else
            {
                scan.next();
            }
        }
        return "Store not found please try another zip code.";
    }
    public static void main(String[] args)
    {

    }
}
