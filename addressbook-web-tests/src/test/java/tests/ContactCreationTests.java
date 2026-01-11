package tests;

import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;


public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.contacts().createContact(new ContactData(
                "Nikolaev1",
                "Vladimir",
                "Tarhova 33",
                "vv@yandex.ru",
                "79387474123"
        ));
    }

    @Test
    public void canCreateContactWithEmptylastName() {
        app.contacts().createContact(new ContactData());
    }

    @Test
    public void canCreateContactWithEmptylastNameOnly() {
        app.contacts().createContact(new ContactData().withLastName("Last name only"));
    }

    public static List<ContactData> contactProvider() {
        var result = new ArrayList<ContactData>();
        for (var lastName : List.of("", "last Name")) {
            for (var firstName : List.of("", "First Name")) {
                for (var address : List.of("", "Address")) {
                    for (var email : List.of("", "Email")) {
                        for (var phones : List.of("", "Phones)")) {
                            result.add(new ContactData(lastName, firstName, address, email, phones));
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 5; i++){
            result.add(new ContactData(randomString(i * 10), randomString(i * 10), randomString(i * 10), randomString(i * 10), randomString(i * 10)));
        }
        return result;
    }

    @ParameterizedTest
    @MethodSource("contactProvider")
    public void canCreateMultipleContacts(ContactData contact) {
        int contactCount = app.contacts().getCount();
        app.contacts().createContact(contact);
        int newContactCount = app.contacts().getCount();
        Assertions.assertEquals(contactCount + 1, newContactCount);
    }
}
