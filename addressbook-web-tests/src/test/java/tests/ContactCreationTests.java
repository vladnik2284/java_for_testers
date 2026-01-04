package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;


public class ContactCreationTests extends TestBase {

    @Test
    public void canCreateContact() {
        app.groups().createGroup(new GroupData("group name", "group header", "group footer"));
    }
}
