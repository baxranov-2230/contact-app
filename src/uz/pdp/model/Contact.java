package uz.pdp.model;

import java.util.Scanner;

public class Contact {
    private String name;
    private String surname;
    private String company;
    private String position;
    private String email;
    private String phone;

    public Contact() {
    }

    public Contact(String name, String surname, String company, String position, String email, String phone) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.position = position;
        this.email = email;
        this.phone = phone;
    }

    Scanner scanner;

    public void EnterInfo() {
        scanner = new Scanner(System.in);
        System.out.print("Enter name:sss ");
        name = scanner.nextLine();
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter company: ");
        company = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
        System.out.print("Enter email: ");
        email = scanner.nextLine();
        System.out.print("Enter phone: ");
        phone = scanner.nextLine();

    }

    public void editContact() {
        Scanner scanner1 = new Scanner(System.in);
        scanner = new Scanner(System.in);
        int chance = -1;
        while (chance != 0) {
            System.out.println("0=>Exit, 1=>editName, 2=>editSurname, 3=>editCompany, 4=>editPosition, 5=>editEmail, 6=>editPhone");
            chance = scanner1.nextInt();
            switch (chance) {
                case 1:
                    System.out.print("Name = ");
                    String name = scanner.nextLine();
                    setName(name);
                    break;
                case 2:
                    System.out.print("Surname = ");
                    String surname = scanner.nextLine();
                    setSurname(surname);
                    break;
                case 3:
                    System.out.print("Company = ");
                    String company = scanner.nextLine();
                    setCompany(company);
                    break;
                case 4:
                    System.out.print("Position ===== ");
                    String position = scanner.nextLine();
                    setPosition(position);
                    break;
                case 5:
                    System.out.print("Email = ");
                    String email = scanner.nextLine();
                    setEmail(email);
                    break;
                case 6:
                    System.out.print("Phone123 = ");
                    String phone = scanner.nextLine();
                    setPhone(phone);
                    break;
                default:
                    break;
            }
        }
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
