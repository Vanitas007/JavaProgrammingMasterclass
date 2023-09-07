package s12_JavaGenerics.n167_Generics_Challenge;

public interface Mappable {
    void render();

    static double[] stringToLatLon(String location) {

        var split = location.split(",");
        double lat = Double.valueOf(split[0]);
        double lng = Double.valueOf(split[1]);
        return new double[]{lat, lng};
    }
}
