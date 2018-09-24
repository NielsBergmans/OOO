package ui;

import domain.Shop;

import javax.swing.*;

public class Launcher {

    public static void main(String[] args) {
        Shop shop = new Shop();

        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                addProduct(shop);
            } else if (choice == 2) {
                showProduct(shop);
            } else if (choice == 3) {
                showPrice(shop);
            }
        }
    }

    public static void addProduct(Shop shop){
        String title = JOptionPane.showInputDialog("Enter the title:");
        String id = JOptionPane.showInputDialog("Enter the id:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");

        shop.addProduct(title,id,type);
    }

    public static void showProduct(Shop shop){
        String id = JOptionPane.showInputDialog("Enter the id:");
        String title = shop.getProductTitle(id);

        JOptionPane.showMessageDialog(null, title);
    }

    public static void showPrice(Shop shop){
        String id = JOptionPane.showInputDialog("Enter the id:");
        int nrOfDays = Integer.parseInt(JOptionPane.showInputDialog("Number of days"));
        double price = shop.getPrize(id,nrOfDays);

        JOptionPane.showMessageDialog(null, price);
    }
}
