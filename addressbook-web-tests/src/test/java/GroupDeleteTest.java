import org.junit.jupiter.api.Test;

public class GroupDeleteTest extends TestBase{

    @Test
    public void canDeleteGroup() {
        openGroupsPage();
        if (!isGroupPresent()) {
            createGroup("group 1", "group header", "group footer");
        }
        deleteGroup();
    }

}
