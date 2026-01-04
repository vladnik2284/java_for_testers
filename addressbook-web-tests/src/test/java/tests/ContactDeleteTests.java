package tests;

import model.ContactData;
import model.GroupData;
import org.junit.jupiter.api.Test;

import static tests.TestBase.app;

public class ContactDeleteTests extends TestBase {

    @Test
    public void canDeleteContact() {
        if (!app.contacts().isContactPresent()) {
            app.contacts().createContact(new ContactData("Имя", "Фамилия", "Тархова 33", "VVV@yandex.ru","+79639663963"));
        }
        app.contacts().deleteContact();
    }

}
