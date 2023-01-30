import java.util.ArrayList;
import java.util.List;

public class TransmissionBoxFilter implements AutomobileFilter {
    boolean isAutomatic;

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public List<Automobile> filter(List<Automobile> automobiles) {
        List<Automobile> filteredAutomobiles = new ArrayList<>();
        for (Automobile automobile : automobiles) {
            if (automobile.isAutomatic() == isAutomatic) {
                filteredAutomobiles.add(automobile);
            }
        }
        return filteredAutomobiles;
    }
}
