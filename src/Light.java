import java.util.ArrayList;
import java.util.List;

public class Light extends Automobile implements AutomobileFilter {
    public Light(String color, double price, double volumeOfEngine) {
        super(color, price, volumeOfEngine);
    }

    private boolean isLight;

    public void setLight(boolean light) {
        isLight = light;
    }

    @Override
    public List<Automobile> filter(List<Automobile> automobiles) {
        List<Automobile> filteredAutomobiles = new ArrayList<>();
        for (Automobile automobile: automobiles) {
            if (automobile.) {
                filteredAutomobiles.add(automobile);
            }
        }
        return filteredAutomobiles;
    }
}
