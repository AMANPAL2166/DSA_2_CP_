package OOPs.Interfaces;

public interface WifiConnectable {
    void connectToWifi(String network);
    static boolean isValidNetwork(String network){
        return !network.isEmpty();
    }
}
