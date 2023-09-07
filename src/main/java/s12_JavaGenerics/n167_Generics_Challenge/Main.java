package s12_JavaGenerics.n167_Generics_Challenge;

public class Main {
    public static void main(String[] args) {

        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "98.3287, 12.0973")
        };
        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi", "54.5345, -43.3133", "32.5466, -127.5634"),
                new River("Missouri", "63.3457, -230.5432", "756.1235, -90.5246")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElements(
                new River("Colorado",
                        "43.7565, -532.2432", "4.5743, -8.5242"),
                new River("Delaware",
                        "42.4213, 543.1235", "-723.4245, -543.2432"));
        riverLayer.renderLayer();
    }
}
