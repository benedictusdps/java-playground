public class Magic {
    public static void main(String[] args) {
    // myNumber is any integer other than 0
    int myNumber = 20;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    
    // The number printed will always be 3
    System.out.println(stepSix);
    }
}
