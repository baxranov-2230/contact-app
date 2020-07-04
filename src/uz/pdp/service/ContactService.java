package uz.pdp.service;

import uz.pdp.model.Contact;

import java.util.ArrayList;

public interface ContactService {
    void add();
    void edit();
    void delete();
    ArrayList<Contact> search();
    void print();
}
