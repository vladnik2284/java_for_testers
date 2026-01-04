package tests;

import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Test;


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
}
