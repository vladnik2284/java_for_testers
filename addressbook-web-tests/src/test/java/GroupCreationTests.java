import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void canCreateGroup() {
        openGroupsPage();
        createGroup(new GroupData("group name", "group header", "group footer"));
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup(new GroupData());
    }

    @Test
    public void canCreateGroupWithEmptyNameOnly() {
        openGroupsPage();
        var emtyGroup = new GroupData();
        var groupWithName = emtyGroup.withName("some name");
        createGroup(groupWithName);
    }
}
