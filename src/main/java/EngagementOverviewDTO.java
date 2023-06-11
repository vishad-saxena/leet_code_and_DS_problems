import java.io.Serializable;
import java.util.Arrays;
import java.util.List;


public class EngagementOverviewDTO implements Serializable {
    int campaigns;
    int delivered;
    int deliveredUsers;
    int opened;
    int openedUsers;

    public static enum EngagementOverviewChannel {
        OVERALL,PUSH,EMAIL,INAPP,SMS;
        public static List<EngagementOverviewChannel> getEnumEngagementOverChannel(){
            return Arrays.asList(PUSH,EMAIL,INAPP,SMS);
        }
    }

    public static void main(String[] args) {
        System.out.println(EngagementOverviewChannel.getEnumEngagementOverChannel());
    }
}
