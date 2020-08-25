import practice.Dog;

public class Main {

    public static void main(String[] args){

//        char myChar = 'M' ;
//        char mtUniCode = '\u0024';
//        boolean isMustafaHandsome = true ;
//
//        boolean wasMustafaHandsome = isMustafaHandsome ? false : true ;
//        if (wasMustafaHandsome){
//            System.out.println("test!");
//        }
//
//        int ageOfClient = 17 ;
//        boolean isTheClientUnderEighteen = (ageOfClient <= 18) ? true : false ;
//        if (isTheClientUnderEighteen){
//            System.out.println("Client is under 18...");
//        }

//        ScoreCalculator scoreCalculator = new ScoreCalculator();
//        scoreCalculator.calculateFinalScore(6500,200,8);
//        int score = scoreCalculator.calculateFinalScore(6500,200,8);
//        System.out.println("Your final score : " +score);

//        ScoreCalculator scoreCalculator = new ScoreCalculator();
//        int playerPosition = scoreCalculator.calculateHighScorePosition(100);
//        scoreCalculator.displayHighScorePosition("Mustafa" , playerPosition);
//
//        Numbers numbers = new Numbers();
//        numbers.checkNumber(6);
//        numbers.checkNumber(0);
//        numbers.checkNumber(-2);

//        SpeedConverter speedConverter = new SpeedConverter();
//        speedConverter.printConversion(14.59);
//        long result = speedConverter.toMilesPerHour(14.59) ;
//        System.out.println(result);



//        long miles = SpeedConverter.toMilesPerHour(22.44) ;
//        System.out.println(miles);
//        SpeedConverter.printConversion(4.88);

//        MegaBytesConverter.printMegaBytesAndKiloBytes(-1000);

//        boolean barkingBitcNeedsToWakeUp =Dog.shouldWakeUp(false,22);
//        System.out.println(barkingBitcNeedsToWakeUp);

//        boolean a = LeapYear.isLeapYear(1924);
//        System.out.println(a);

//        boolean a = EqualSumChecker.hasEqualSum(0,-1,0);
//        System.out.println(a);

//        boolean a = EqualSumChecker.hasTeen(66,13,99);
//        System.out.println(a);

//        double a = LengthConverter.calcFeetAndInchesToCentimeter(1,11);
//        System.out.println(a);
//
//        double b = LengthConverter.calcFeetAndInchesToCentimeter(12);
//        System.out.println(b);

//        double a = LengthConverter.calcFeetAndInchesToCentimeter(43);
//        System.out.println(a);

//        String a = TimeConverter.getDurationString(62,15);
//        System.out.println(a);
//
//        String b = TimeConverter.getDurationString(14589) ;
//        System.out.println(b);
//
//        double a = AreaCalculator.area(-4,4);
//        System.out.println(a);

//        MinutesToYearsDaysCalculator.printYearsAndDays(561602);
//        Numbers.printEqual(1,2,1);

//        boolean a = PlayingCat.isCatPlaying(false,35);
//        System.out.println(a);



//        SwitchPractice.switchStringExample("A");

//        for (int interestRate = 8 ; interestRate > 1 ; interestRate--){
//            Interest.calculateInterest(10000,interestRate);
//        }

//        PrimeNumbers.countOfPrimeNumbers(1,20);
//        int num = PrimeNumbers.JustCountOfPrimeNumbers(1,7) ;
//        System.out.println(num);


//        Numbers.sumChallenge(1,100);

//        int a =Numbers.sumOdd(1,5);
//        System.out.println(a);


//        int a = DigitSumChallenge.sumDigits(614);
//        System.out.println(a);

//        Boolean a = NumberPalindrome.isPalindrome(11) ;
//        System.out.println(a);

//        List <Integer> a = Numbers.getEachDigit(698555555);
//        System.out.println(a);

//        List<Integer> b = Numbers.getTheDividers(32);
//        System.out.println(b);
//        List<Integer> c = Numbers.getTheDividers(10);
//        System.out.println(c);
//        int a = Numbers.getGreatestCommonDivisor(32,10) ;
//        System.out.println(a);

//        System.out.println(Numbers.isPerfectNumber(28));
//        System.out.println(NumberToWords.getDigitCount(47896));

//        System.out.println(NumberToWords.getDigitCount(001));

//        NumberToWords.numberToWords(123);
//        System.out.println(Numbers.getEachDigit(123));

//        System.out.println(NumberToWords.reverse(1425));
//        NumberToWords.numberToWords(-12600);


//        System.out.println(FlourPacker.canPack(4,0,22));

//        System.out.println(Numbers.getTheDividers(36));

//        System.out.println(PrimeNumbers.getLargestPrime(45));

//        ReadingInputChallenge.readInputValues();

//        ReadingInputChallenge.printMaxAndMinNumbers();

//        InputCalculator.inputThenPrintSumAndAverage();

//        System.out.println(PaintJob.getBucketCount(3.4,1.5)) ;

//        Car porsche = new Car() ;
//        porsche.setModel("911");
//        System.out.println("Mopdel is " +porsche.getModel());

//        SumCalculator calculator = new SumCalculator() ;
//        calculator.setFirstNumber(21);
//        calculator.setSecondNumber(3);
//        System.out.println("add = " + calculator.getAdditionResult());
//        System.out.println("Substract =" + calculator.getSubtractionResult());
//        System.out.println("Multiplication =" + calculator.getMultiplicationResult());
//        System.out.println("Diision = " + calculator.getDivisionResult());

//        Person person = new Person() ;
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("Full name= " +person.getFullName());
//        System.out.println("teen= " +person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("Full name= " +person.getFullName());
//        System.out.println(person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("Full name= " +person.getFullName());

//        BankAccount account = new BankAccount() ;
//        account.setAccountNumber(123456789);
//        account.setBalance(1000);
//        account.setCustomerName("Mustafa Aksu");
//        account.setEmail("maksu@innova.com.tr");
//        account.setPhoneNumber("5426547396");
//        System.out.println("The account " + account.getAccountNumber()+ " belongs to customer " + account.getCustomerName()+
//                " who has the following pesonal information :");
//        System.out.println("*** Email address : " +account.getEmail());
//        System.out.println("*** Phone number : " +account.getPhoneNumber());
//        System.out.println("************************************************");
//        System.out.println("Balance :" +account.getBalance() +" TL");
//        account.depositFund(0);
//        account.withdrawFund(1000);

//        BankAccount account = new BankAccount(12345,950,"Mustafa" , "maksu@innova.com.tr" ,
//                "5426547396") ;
//        System.out.println("The account " + account.getAccountNumber()+ " belongs to customer " + account.getCustomerName()+
//                " who has the following pesonal information :");
//        System.out.println("*** Email address : " +account.getEmail());
//        System.out.println("*** Phone number : " +account.getPhoneNumber());
//        System.out.println("************************************************");
//        System.out.println("Balance :" +account.getBalance() +" TL");
//        account.depositFund(0);
//        account.withdrawFund(1000);

//        BankAccount account = new BankAccount("Mustafa" , "maksu@innova.com.tr","456789") ;
//        System.out.println(account.getAccountNumber());

//        VipCustomer vipCustomer = new VipCustomer("Mustafa" ,"mustafaksu4@gmail.com") ;
//        System.out.println("Customer " + vipCustomer.getName() + " with " + vipCustomer.getEmailAddress() + " has " +vipCustomer.getCreditLimit() + " TL credit limit");
//        VipCustomer vipCustomer2 = new VipCustomer() ;
//        System.out.println("Customer " + vipCustomer2.getName() + " with " + vipCustomer2.getEmailAddress() + " has " +vipCustomer2.getCreditLimit() + " TL credit limit");

//        Wall wall = new Wall() ;
//        System.out.println(wall.getArea());
//        System.out.println(wall.getHeight());
//        System.out.println(wall.getWidth());
//        Wall newWall = new Wall(-1,5) ;
//        System.out.println(newWall.getWidth());
//        System.out.println(newWall.getHeight());
//        System.out.println(newWall.getArea());

//        Point point = new Point(3,4) ;
//        System.out.println(point.distance(1,1));

//        Carpet carpet = new Carpet(1.5) ;
//        Floor floor = new Floor(5.4,4.5) ;
//        CarpetCostCalculator calculator = new CarpetCostCalculator(floor , carpet) ;
//        System.out.println("Total price : " + calculator.getTotalCost());

//        ComplexNumber complexNumber_1 = new ComplexNumber(1.0,1.0) ;
//        ComplexNumber complexNumber_2 = new ComplexNumber(2.5,-1.5) ;
//        complexNumber_1.add(1,1);
//        System.out.println("Complexnumber_1 Real part : " + complexNumber_1.getReal());
//        System.out.println("Complexnumber_1 Imaginary part : " + complexNumber_1.getImaginary());
//        complexNumber_1.subtract(complexNumber_2);
//        System.out.println("Complexnumber_1 Real part : " + complexNumber_1.getReal());
//        System.out.println("Complexnumber_1 Imaginary part : " + complexNumber_1.getImaginary());
//        complexNumber_2.subtract(complexNumber_1);
//        System.out.println("Complexnumber_2 Real part : " +complexNumber_2.getReal());
//        System.out.println("Complexnumber_2 Imaginary part : " +complexNumber_2.getImaginary());

//        Animal animal = new Animal("Animal",1 , 1,5,5) ;
        Dog dog = new Dog("Karabaş" , 8 , 20 , 1 , 2 , 3 , 4 , 5 , 5, "long silky") ;
//        dog.eat();
//        dog.run();
        dog.walk();


















    }
}
