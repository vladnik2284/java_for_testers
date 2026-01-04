package tests;

import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Test;


public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.contacts().createContact(new ContactData(
                "Nikolaev",
                "Vladimir",
                "Tarhova 33",
                "vv@yandex.ru",
                "79387474123"
        ));
    }
}
