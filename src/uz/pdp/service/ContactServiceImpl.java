    package uz.pdp.service;

import uz.pdp.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    //    private Contact[] contacts = new Contact[10];
    List<Contact> contacts = new ArrayList<>();
    private Contact contact;

    Scanner scanner;


    @Override
    public void add() {
        contact = new Contact();
        contact.EnterInfo();
        contacts.add(contact);

    }


    @Override
    public void edit() {
        scanner = new Scanner(System.in);
        for (int i1 = 0; i1 < contacts.size(); i1++) {
            System.out.println((i1 + 1) + " - " + contacts.get(i1).getName());
        }
        int k = scanner.nextInt() - 1;
        contacts.get(k).editContact();
    }

    @Override
    public void delete() {
        scanner = new Scanner(System.in);
        for (int i1 = 0; i1 < contacts.size(); i1++) {
            System.out.println((i1 + 1) + " - " + contacts.get(i1).getName());
        }
        System.out.print("enter delete index: ");
        int k = scanner.nextInt() - 1;
        contacts.remove(k);

    }

    @Override
    public ArrayList<Contact> search() {
        ArrayList<Contact> contacts1 = new ArrayList<>();
        scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i1 = 0; i1 < contacts.size(); i1++) {
            if (contacts.get(i1).getName().contains(str)) {
                contacts1.add(contacts.get(i1));
            }
        }

        return contacts1;
    }

    public void searchPrint() {
        ArrayList<Contact> contacts1 = search();
        for (int i1 = 0; i1 < contacts.size(); i1++) {
                System.out.println("[" + contacts1.get(i1).toString() + "]");
        }
    }

    @Override
    public void print() {
        for (int i1 = 0; i1 < contacts.size(); i1++) {
            System.out.println("[" + contacts.get(i1).toString() + "]");
        }
    }
}
