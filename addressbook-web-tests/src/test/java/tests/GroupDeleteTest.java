package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupDeleteTest extends TestBase{

    @Test
    public void canDeleteGroup() {
        app.openGroupsPage();
        if (!app.isGroupPresent()) {
            app.createGroup(new GroupData("group 1", "group header", "group footer"));
        }
        app.deleteGroup();
    }

}
