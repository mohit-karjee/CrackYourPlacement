package CrackYourPlacement;

public class cardPoint {
    public int maxScore(int[] cardPoints, int k) {
        int sum = cardPoints[0];

        for (int i = 1; i < k; i++) {
            sum += cardPoints[i];
        }

        int maxScore = sum;
        int j = cardPoints.length - 1;

        for (int i = k - 1; i >= 0; i--) {
            sum += cardPoints[j] - cardPoints[i];
            maxScore = Math.max(maxScore, sum);
            j--;
        }

        return maxScore;
    }

    public static void main(String[] args) {
        cardPoint solution=new cardPoint();
                int[] cardsPoints={1,2,3,4,5,6,1};
                int k =3;
                int sum=solution.maxScore(cardsPoints,k);
        System.out.println(sum);

    }
}

