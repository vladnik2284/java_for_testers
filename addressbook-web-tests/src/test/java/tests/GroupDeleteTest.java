package tests;

import model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GroupDeleteTest extends TestBase{

    @Test
    public void canDeleteGroup() {
        if (app.groups().getCount() == 0) {
            app.groups().createGroup(new GroupData("group 1", "group header", "group footer"));
        }
        int groupCount = app.groups().getCount();
        app.groups().deleteGroup();
        int newGroupCount = app.groups().getCount();
        Assertions.assertEquals(groupCount - 1, newGroupCount);
    }

}
