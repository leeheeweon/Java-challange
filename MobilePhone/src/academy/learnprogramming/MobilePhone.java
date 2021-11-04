package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    String myNumber;
    ArrayList<Contact> myContact;

    public MobilePhone(String myNumber, ArrayList<Contact> myContact) {
        this.myNumber = myNumber;
        this.myContact = myContact;
    }

    public static boolean addNewContact(Contcat contcat){
        if (contcat == null){
            return true;
        } else {
            return false;
        }
    }
}
