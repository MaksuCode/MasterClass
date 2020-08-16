package practice;

public class WeightCalculator {

    public double poundToKilogram(double numberOfPounds){
        double convertedKilogram = numberOfPounds * 0.453598237d ;
        System.out.println(numberOfPounds+ " pounds equals to "+convertedKilogram);
        return convertedKilogram ;
    }

}
