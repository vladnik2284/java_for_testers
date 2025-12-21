import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupDeleteTest extends TestBase{

    @Test
    public void canDeleteGroup() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup(new GroupData("group 1", "group header", "group footer"));
        }
        deleteGroup();
    }

}
