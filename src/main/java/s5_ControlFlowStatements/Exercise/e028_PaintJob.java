package s5_ControlFlowStatements.Exercise;

public class e028_PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, 0.75));
    }

    // Pierwsza wersja

//    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
//
//        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
//            return -1;
//        }
//        double wallArea = width * height;
//
//        int numberOfBuckets = (int) (wallArea / areaPerBucket);
//        double neededBuckets = (wallArea % areaPerBucket);
//        if (neededBuckets != 0) {
//            numberOfBuckets++;
//        }
//        numberOfBuckets -= extraBuckets;
//        return numberOfBuckets;
//    }

//    public static int getBucketCount(double width, double height, double areaPerBucket) {
//        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
//            return -1;
//        }
//        double wallArea = width * height;
//
//        int numberOfBuckets = (int) (wallArea / areaPerBucket);
//        double neededBuckets = (wallArea % areaPerBucket);
//        if (neededBuckets != 0) {
//            numberOfBuckets++;
//        }
//        return numberOfBuckets;
//    }

//    public static int getBucketCount(double area, double areaPerBucket) {
//        if (area <= 0 || areaPerBucket <= 0) {
//            return -1;
//        }
//        int numberOfBuckets = (int) (area / areaPerBucket);
//        double neededBuckets = (area % areaPerBucket);
//        if (neededBuckets != 0) {
//            numberOfBuckets++;
//        }
//        return numberOfBuckets;
//    }

    //Refaktor po poznaniu metody Math.ceil()

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        double numberOfBuckets = wallArea / areaPerBucket;
        numberOfBuckets = Math.ceil(numberOfBuckets);
        numberOfBuckets -= extraBuckets;

        return (int) numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;

        double numberOfBuckets = wallArea / areaPerBucket;
        numberOfBuckets = Math.ceil(numberOfBuckets);

        return (int) numberOfBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double numberOfBuckets = area / areaPerBucket;
        numberOfBuckets = Math.ceil(numberOfBuckets);

        return (int) numberOfBuckets;
    }
}
