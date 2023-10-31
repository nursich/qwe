import java.util.List;

public class Subscriber implements Observer{
    String nickname;

    public Subscriber(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void handleEvent(List<String> videos) {
        System.out.println("Dear " + nickname + "\nWe have several changes in your favorite channels.\n" + videos + "\n------------------------------------------------\n");
    }
}