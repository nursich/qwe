public class Main {
    public static void main(String[] args) {
        VideoChannel videoChannel = new VideoChannel();

        videoChannel.addVideo("First video");
        videoChannel.addVideo("Second video");

        Observer FirstSubscriber = new Subscriber("Blablablabla");
        Observer SecondSubscriber = new Subscriber("AHHAHAHAHAAHHAHAH");

        videoChannel.addObserver(FirstSubscriber);
        videoChannel.addObserver(SecondSubscriber);

        videoChannel.addVideo("Third video");

        videoChannel.removeVideo("Second video");
    }
}