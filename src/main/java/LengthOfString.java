public class LengthOfString {
    public static void main(String[] args) {
        int count=0;
        String s="getNotificationReportSummaryByWorkflowDatewise";
        char[] arr=s.toCharArray();
        for (int i=0;i<arr.length;i++){
            count++;
        }
        System.out.println(count);
    }
}
