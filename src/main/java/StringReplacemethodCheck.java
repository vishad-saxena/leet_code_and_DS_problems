

public class StringReplacemethodCheck {
    public static void main(String[] args) {
        String s="https://{{clientId}}.verloop.io/api/v1/Campaign/{{call}}";
        s=s.replace("{{clientId}}","economicTimes").replace("{{call}}","sendMessage");
        System.out.println(s);
        System.out.println(s.contains("sendMessage"));

    }
}
