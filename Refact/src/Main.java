public class Main {
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(80, 1.52);
        System.out.println(humanBMI.getResult());
    }
}

class HumanBMI {
    public double weight;
    public double height;
    private static double bmi;

    public HumanBMI(double weight, double height) {
        if (height == 0) {
            throw new IllegalArgumentException("Height cannot be zero.");
        }
        this.weight = weight;
        this.height = height;
        bmi = this.weight / (this.height * this.height);
    }

    public double takeW() {
        return weight;
    }

    public void putW(double weight) {
        this.weight = weight;
        bmi = this.weight / (this.height * this.height);
    }

    public double takeH() {
        return height;
    }

    public void putH(double height) {
        if (height == 0) {
            throw new IllegalArgumentException("Height cannot be zero.");
        }
        this.height = height;
        bmi = this.weight / (this.height * this.height);
    }

    public static double takeImt() {
        return bmi;
    }

    public static String getResult() {
        String string = "Problem";
        if (bmi >= 18.5 && bmi < 25) {
            string = "Norm";
        }
        if (bmi >= 25 && bmi < 30) {
            string = "Warning!";
        }
        if (bmi >= 30) {
            string = "Fat";
        }
        if (bmi < 18.5) {
            string = "Deficit";
        }
        return string;
    }
}
