package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview harryPotterAndMagicStone = new MovieReview();
        harryPotterAndMagicStone.title = "해리포터와 마법사의 돌";
        harryPotterAndMagicStone.review = "너무 재밌어요. 인생 영화입니다.";

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "추천합니다.";

        System.out.println("제목: " + harryPotterAndMagicStone.title + "m 리뷰: " + harryPotterAndMagicStone.review);
        System.out.println("제목: " + inception.title + ", 리뷰: " + inception.review);
    }
}