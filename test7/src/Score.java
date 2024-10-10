public class Score {
    double[] score;

    public Score(double[] score) {
        this.score = score;
    }

    public static void main(String[] args) {
        Score arrayScore1 = new Score(new double[] { 85, 86, 87.5, 92.5, 94, 95 });
        try {
            arrayScore1.check();
            System.out.println("最小值为" + arrayScore1.min());
            System.out.println("最大值为" + arrayScore1.max());
            System.out.println("平均分为" + arrayScore1.average());
        } catch (WrongData e) {
            System.out.println(e.getMessage());
        }

        Score arrayScore2 = new Score(new double[] { -20, 102, 88 });
        try {
            arrayScore2.check();
            System.out.println("最小值为" + arrayScore2.min());
            System.out.println("最大值为" + arrayScore2.max());
            System.out.println("平均分为" + arrayScore2.average());
        } catch (WrongData e) {
            System.out.println(e.getMessage());
        }
    }

    public double max() {
        double max = score[0];
        for (double element : score) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public double min() {
        double min = score[0];
        for (double element : score) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double element : score) {
            sum += element;
        }
        return sum / score.length;
    }

    public void check() throws WrongData {
        for (double element : score) {
            if (element < 0 || element > 100) {
                throw new WrongData("分数错误");
            }
        }
    }
}

class WrongData extends Exception {
    public WrongData(String msg) {
        super(msg);
    }
}