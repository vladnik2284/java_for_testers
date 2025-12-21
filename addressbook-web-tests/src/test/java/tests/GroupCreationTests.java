import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void canCreateGroup() {
        app.openGroupsPage();
        app.createGroup(new GroupData("group name", "group header", "group footer"));
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        app.openGroupsPage();
        app.createGroup(new GroupData());
    }

    @Test
    public void canCreateGroupWithEmptyNameOnly() {
        app.openGroupsPage();
        var emtyGroup = new GroupData();
        var groupWithName = emtyGroup.withName("some name");
        app.createGroup(groupWithName);
    }
}
