package practice;

public class PaintJob {

    public static int getBucketCount (double width , double height , double areaPerBucket , int extraBuckets) {
        double area = width * height ;
        int bucketsNeeded = (int) Math.ceil(area/areaPerBucket);
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1 ;
        }else if (extraBuckets < 0) {
            return -1 ;
        }else{
            if (bucketsNeeded <= extraBuckets){
                return 0 ;
            }else{
                return bucketsNeeded - extraBuckets ;
            }
        }
    }

    public static int getBucketCount (double width , double height , double areaPerBucket) {
        double area = width * height;
        int bucketNeeded = (int) Math.ceil(area / areaPerBucket);
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return bucketNeeded ;
    }

    public static int getBucketCount (double area , double areaPerBucket) {
        int bucketNeeded = (int) Math.ceil(area / areaPerBucket) ;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1 ;
        }
        return bucketNeeded ;
    }

}
