package uz.pdp;

import uz.pdp.model.Contact;
import uz.pdp.service.ContactServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactServiceImpl googleContact = new ContactServiceImpl();
        Scanner scanner = new Scanner(System.in);
        int chance = -1;

        while (chance != 0) {
            System.out.println("000=>Exit, 1=>addContact, 2=>printContact, 3=>editContact, 4=>deleteContact, 5=>searchContact");
            chance = scanner.nextInt();
            switch (chance) {
                case 1:
                    googleContact.add();
                    break;
                case 2:
                    googleContact.print();
                    break;
                case 3:
                    googleContact.edit();
                    break;
                case 4:
                    googleContact.delete();
                    break;
                case 5:
                    googleContact.searchPrint();
                    break;
                default:
                    break;
            }
        }

    }
}
