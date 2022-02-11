public class ReviewDriver {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("hello"));
        System.out.println(Review.sentimentVal("thinkeren"));
        System.out.println(Review.sentimentVal("brian"));
        System.out.println(Review.sentimentVal("money"));


        System.out.println(Review.totalSentiment("SimpleReview.txt"));
    }
}
