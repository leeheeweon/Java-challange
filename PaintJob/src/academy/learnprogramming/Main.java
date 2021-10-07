package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        getBucketCount(-3.4,2.1,1.5,2);
//        getBucketCount(3.4,2.1,1.5,2);
//        getBucketCount(2.75,3.25,2.5,1);

//        getBucketCount(-3.4,2.1,1.5);
//        getBucketCount(3.4,2.1,1.5);
//        getBucketCount(7.25,4.3,2.35);
        getBucketCount(2.25,2.0,0.0);

//        getBucketCount(3.4, 1.5);
//        getBucketCount(6.26, 2.2);
//        getBucketCount(3.26, 0.75);

    }


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double bucket = Math.ceil(area / areaPerBucket);
        int bucketCount = (int) (bucket - (double) extraBuckets);

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;
        double bucket = Math.ceil(area / areaPerBucket);
        int bucketCount = (int) (bucket);

        return bucketCount;
    }

    public static int getBucketCount(double areaPerBucket, double extraBuckets) {
        if (areaPerBucket <= 0 || extraBuckets <= 0) {
            return -1;
        }

        double bucket = Math.ceil(areaPerBucket / extraBuckets);
        int bucketCount = (int) (bucket);

        return bucketCount;
    }

}
