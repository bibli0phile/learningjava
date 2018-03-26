package customMath;

import java.text.DecimalFormat;

public class Basic {
  DecimalFormat df = new DecimalFormat("#.##");
  public Basic() {}
  public boolean isEven(int number){
    return number%2==0;
  }
  
  public boolean isOdd(int number) {
    return !isEven(number);
  }
  
  public double getSquare(double number) {
    return number*number;
  }
  
  public double getCube(double number) {
    return  getSquare(number)*number;
  }
  
  public int getGCD(int firstNum, int secondNum) {
    int rem;
    do {
      rem = firstNum%secondNum;
      firstNum=secondNum;
      secondNum=rem;
    }while (rem!=0);
    return firstNum;
  }
  
  public int getLCM(int firstNum, int secondNum) {
    return (firstNum*secondNum)/getGCD(firstNum,secondNum);
  }
  
  public double getSimpleInterest(double principle, double time, double rate) {
    return principle*time*rate/100;
  }
  
  public double getCompoundInterest(double principle, double time, double rate) {
    double compoundInterest = principle*Math.pow((1+rate/100),time)-principle;
    return Double.parseDouble(df.format(compoundInterest));
  }
  
  public double getCelsiusTempFrom(double temp) {
    double celsius = (temp-32)*5/9;
    return Double.parseDouble(df.format(celsius));
  }
  
  public double getFahrenheitTempFrom(double temp) {
    double fahrenheit = (temp*9/5)+32;
    return Double.parseDouble(df.format(fahrenheit));
  }
  
  public int getSumOfOneTo(int number) {
    return number*(number+1)/2;
  }
  
  public int greaterThan(int firstNum, int secondNum){
    return firstNum > secondNum ? firstNum : secondNum;
  }
  
  public int getGreatest(int firstNum, int secondNum, int thirdNum) {
    return greaterThan(greaterThan(firstNum,secondNum),thirdNum);
  }
  
  public double getAverageOf(int firstNum, int secondNum, int thirdNum) {
    return (firstNum+secondNum+thirdNum)/3;
  }
  
  public double getAvgasPercentage(int firstNum, int secondNum, int thirdNum, int specifiedNum) {
    double avg = getAverageOf(firstNum,secondNum,thirdNum);
    return (avg/specifiedNum)*100;
  }
}
