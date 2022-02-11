public class ReviewDriver {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("Hello"));
        System.out.println(Review.sentimentVal("Thinkeren"));
        System.out.println(Review.sentimentVal("Brian"));
        System.out.println(Review.sentimentVal("Money"));


        System.out.println(Review.totalSentiment("SimpleReview.txt"));
    }
}
