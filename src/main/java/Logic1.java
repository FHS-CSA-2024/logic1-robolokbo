package src.main.java;


public class Logic1
{
    public static void main(String[] args){
        Logic1 logicDriver = new Logic1();
        //All test cases;
        System.out.println(logicDriver.old35(3));
        System.out.println(logicDriver.old35(10));
        System.out.println(logicDriver.old35(15));
        System.out.println(logicDriver.specialEleven(22));
        System.out.println(logicDriver.specialEleven(23));
        System.out.println(logicDriver.specialEleven(24));
        System.out.println(logicDriver.more20(20));
        System.out.println(logicDriver.more20(21));
        System.out.println(logicDriver.more20(42));
        System.out.println(logicDriver.less20(18));
        System.out.println(logicDriver.less20(59));
        System.out.println(logicDriver.less20(20));
        System.out.println(logicDriver.nearTen(12));
        System.out.println(logicDriver.nearTen(17));
        System.out.println(logicDriver.nearTen(19));
        System.out.println(logicDriver.sortaSum(3, 4));
        System.out.println(logicDriver.sortaSum(9, 4));
        System.out.println(logicDriver.sortaSum(10, 11));
        System.out.println(logicDriver.in1To10(5, false));
        System.out.println(logicDriver.in1To10(11, false));
        System.out.println(logicDriver.in1To10(11, true));
        System.out.println(logicDriver.teenSum(3, 4));
        System.out.println(logicDriver.teenSum(10, 13));
        System.out.println(logicDriver.teenSum(13, 2));
        System.out.println(logicDriver.love6(6, 4));
        System.out.println(logicDriver.love6(4, 5));
        System.out.println(logicDriver.love6(1, 5));
        System.out.println(logicDriver.lastDigit(23, 19, 13));
        System.out.println(logicDriver.lastDigit(23, 19, 12));
        System.out.println(logicDriver.lastDigit(23, 19, 3));
        System.out.println(logicDriver.answerCell(false, false, false));
        System.out.println(logicDriver.answerCell(false, false, true));
        System.out.println(logicDriver.answerCell(true, false, false));
        System.out.println(logicDriver.alarmClock(1, false));
        System.out.println(logicDriver.alarmClock(5, false));
        System.out.println(logicDriver.alarmClock(0, false));
        System.out.println(logicDriver.teaParty(6, 8));
        System.out.println(logicDriver.teaParty(3, 8));
        System.out.println(logicDriver.teaParty(20, 6));
        System.out.println(logicDriver.redTicket(2, 2, 2));
        System.out.println(logicDriver.redTicket(2, 2, 1));
        System.out.println(logicDriver.redTicket(0, 0, 0));
        System.out.println(logicDriver.greenTicket(1, 2, 3));
        System.out.println(logicDriver.greenTicket(2, 2, 2));
        System.out.println(logicDriver.greenTicket(1, 1, 2));
        System.out.println(logicDriver.squirrelPlay(70, false));
        System.out.println(logicDriver.squirrelPlay(95, false));
        System.out.println(logicDriver.squirrelPlay(95, true));
        System.out.println(logicDriver.caughtSpeeding(60, false));
        System.out.println(logicDriver.caughtSpeeding(65, false));
        System.out.println(logicDriver.caughtSpeeding(65, true));
        System.out.println(logicDriver.dateFashion(5, 10));
        System.out.println(logicDriver.dateFashion(5, 2));
        System.out.println(logicDriver.dateFashion(5, 5));
        System.out.println(logicDriver.fizzString2(1));
        System.out.println(logicDriver.fizzString2(5));
        System.out.println(logicDriver.fizzString2(3));
        System.out.println(logicDriver.fizzString2(15));
        System.out.println(logicDriver.sodaParty(30, false));
        System.out.println(logicDriver.sodaParty(50, false));
        System.out.println(logicDriver.sodaParty(70, true));
    }

    public Logic1()
    {

    }

    //ONLY EDIT BELOW HERE-------------------------------------------------------------------------

    /*Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
    Use the % "mod" operator


    old35(3) --> true
    old35(10) --> true
    old35(15) --> false */
    public boolean old35(int n) {
        System.out.print(">");
        
        boolean output = false;
        
        if(n%3 == 0 && n%5 == 0){
            output = false;
        }
        else if(n%3 == 0){
            output = true;
        }
        else if(n%5 == 0){
            output = true;
        }
        
        return output;
    }


    /*We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. 
    Return true if the given non-negative number is special. Use the % "mod" operator


    specialEleven(22) --> true
    specialEleven(23) --> true
    specialEleven(24) --> false */
    public boolean specialEleven(int n) {
        if(n%11 == 0 || n%11 == 1){
            return true;
        }
        else {
            return false;
        }
    }


    /*Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

    more20(20) --> false
    more20(21) --> true
    more20(42) --> true */
    public boolean more20(int n) {
        if(n%20 == 1 || n%20 == 2){
            return true;
        }
        else {
            return false;
        }
    }


    /*Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
    So for example 38 and 39 return true, but 40 returns false.


    less20(18) --> true
    less20(59) --> true
    less20(20) --> false */
    public boolean less20(int n) {
        if (n%20 == 18 || n%20 == 19){
            return true;
        }
        else {
            return false;
        }
    }

    /*Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.


    nearTen(12) --> true
    nearTen(17) --> false
    nearTen(19) --> true */
    public boolean nearTen(int num) {
        boolean output = false;
        
        if(num%10 <= 2 || num%10 >= 8){
            output = true;
        }
        else{
            output = false;
        }
        
        return output;
    }


    /*Given 2 ints, a and b, return their sum. 
    However, sums in the range 10..19 inclusive, are forbidden, 
        so in that case just return 20.


    sortaSum(3, 4) --> 7
    sortaSum(9, 4) --> 20
    sortaSum(10, 11) --> 21*/
    public int sortaSum(int a, int b) {
        int output = 0;
        
        output = a + b;
        if(output >= 10 && output <= 19){
            output = 20;
        }
    
        return output;
    }


    /*Given a number n, return true if n is in the range 1..10, inclusive. 
    Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.


    in1To10(5, false) --> true
    in1To10(11, false) --> false
    in1To10(11, true) --> true */
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode == true && (n <= 1 || n >= 10)){
            return true;
        }
        else if(n >= 1 && n <= 10){
            return true;
        }
        else {
            return false;
        }
    }


    /*Given 2 ints, a and b, return their sum. However, "teen" values in the range 
    13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.


    teenSum(3, 4) --> 7
    teenSum(10, 13) --> 19
    teenSum(13, 2) --> 19 */
    public int teenSum(int a, int b) {
        int output = a + b;
        
        if(a >= 13 && a <= 19){
            output = 19;
        }
        else if (b >= 13 && b <= 19){
            output = 19;
        }
        
        return output;
    }


    /*The number 6 is a truly great number. Given two int values, a and b, 
        return true if either one is 6. Or if their sum or difference is 6. 
    Note: the function Math.abs(num) computes the absolute value of a number.


    love6(6, 4) --> true
    love6(4, 5) --> false
    love6(1, 5) --> true */
    public boolean love6(int a, int b) {
        if(a == 6){
            return true;
        }
        else if(b == 6){
            return true;
        }
        else if(a - b == 6){
            return true;
        }
        else if(a + b == 6){
            return true;
        }
        else{
            return false;
        }
    }


    /*Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
    The ints are non-negative. 
        Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


    lastDigit(23, 19, 13) --> true
    lastDigit(23, 19, 12) --> false
    lastDigit(23, 19, 3) --> true */
    public boolean lastDigit(int a, int b, int c) {
        if(a%10 == b%10){
            return true;
        }
        else if(b%10 == c%10){
            return true;
        }
        else if(a%10 == c%10){
            return true;
        }
        else{
            return false;
        }
    }


    /*Your cell phone rings. Return true if you should answer it. 
    Normally you answer, except in the morning you only answer if it is your mom calling. 
    In all cases, if you are asleep, you do not answer.


    answerCell(false, false, false) --> true
    answerCell(false, false, true) --> false
    answerCell(true, false, false) --> false */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isMorning == true && isMom == true){
            return true;
        }
        else if(isMorning == true && isMom == false){
            return false;
        }
        else if(isMorning == false && isMom == true){
            return true;
        }
        else if(isAsleep == false){
            return true;
        }
        else{
            return false;
        }
    }

    /*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, 
        and a boolean indicating if we are on vacation, 
    return a string of the form "7:00" indicating when the alarm clock should ring. 
    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". 
    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".


    alarmClock(1, false) --> "7:00"
    alarmClock(5, false) --> "7:00"
    alarmClock(0, false) --> "10:00" */
    public String alarmClock(int day, boolean vacation) {
        String output = "";
        //0-Sun, 1-Mon, 2-Tue, 3-Wed, 4-Thu, 5-Fri, 6-Sat
        
        if(vacation == true){
            if(day >= 1 || day <= 5){
                output = "10:00";
            }
            else{
                output = "off";
            }
        }
        else if(day >= 1 && day <= 5){
            output = "7:00";
        }
        else if(day == 0 || day == 6){
            output = "10:00";
        }
        
        return output;
    }


    /*We are having a party with amounts of tea and candy. 
    Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. 
    A party is good (1) if both tea and candy are at least 5. 
    However, if either tea or candy is at least double the amount of the other one, the party is great (2). 
    However, in all cases, if either tea or candy is less than 5, the party is always bad (0).


    teaParty(6, 8) --> 1
    teaParty(3, 8) --> 0
    teaParty(20, 6) --> 2 */
    public int teaParty(int tea, int candy) {
        int output = 0;
        
        if(tea < 5 || candy < 5){
            output = 0;
        }
        else if(tea >= candy * 2 || candy >= tea * 2){
            output = 2;
        }
        else if(tea >= 5 && candy >= 5){
            output = 1;
        }
        
        return output;
    }


    /*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. 
    If they are all the value 2, the result is 10. 
    Otherwise if they are all the same, the result is 5. 
    Otherwise so long as both b and c are different from a, the result is 1. 
    Otherwise the result is 0.


    redTicket(2, 2, 2) --> 10
    redTicket(2, 2, 1) --> 0
    redTicket(0, 0, 0) --> 5 */
    public int redTicket(int a, int b, int c) {
        int output = 0;
        
        if(a == 2 && b == 2 && c == 2){
            output = 10;
        }
        else if(a == b && b == c){
            output = 5;
        }
        else if(a != b && a != c){
            output = 1;
        }
        else{
            output = 0;
        }
        
        return output;
    }


    /*You have a green lottery ticket, with ints a, b, and c on it. 
    If the numbers are all different from each other, the result is 0. 
    If all of the numbers are the same, the result is 20. 
    If two of the numbers are the same, the result is 10.


    greenTicket(1, 2, 3) --> 0
    greenTicket(2, 2, 2) --> 20
    greenTicket(1, 1, 2) --> 10 */
    public int greenTicket(int a, int b, int c) {
        int output = 0;
        
        if(a != b && b != c){
            output = 0;
        }
        else if(a == b && b == c){
            output = 20;
        }
        else if(a == b || b == c || a == c){
            output = 10;
        }
        
        return output;
    }


    /*
    The squirrels in Palo Alto spend most of the day playing. 
    In particular, they play if the temperature is between 60 and 90 (inclusive). 
    Unless it is summer, then the upper limit is 100 instead of 90. 
    Given an int temperature and a boolean isSummer, 
        return true if the squirrels play and false otherwise.


    squirrelPlay(70, false) --> true
    squirrelPlay(95, false) --> false
    squirrelPlay(95, true) --> true    */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer == true && temp >= 60 && temp <= 100){
            return true;
        }
        else if(isSummer == false && temp >= 60 && temp <= 90){
            return true;
        }
        else{
            return false;
        }
    }


    /*You are driving a little too fast, and a police officer stops you. 
    Write code to compute the result, 
        encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
    If speed is 60 or less, the result is 0. 
    If speed is between 61 and 80 inclusive, the result is 1. 
    If speed is 81 or more, the result is 2. 
    Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


    caughtSpeeding(60, false) --> 0
    caughtSpeeding(65, false) --> 1
    caughtSpeeding(65, true) --> 0    */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int output = 0;
        
        if(speed >= 61 && speed <= 85 && isBirthday == true){
            output = 0;
        }
        else if(speed >= 86 && isBirthday == true){
            output = 0;
        }
        else if(speed <= 60){
            output = 0;
        }
        else if(speed >= 61 && speed <= 80){
            output = 1;
        }
        else if(speed >= 81){
            output = 2;
        }
        
        return output;
    }


    /*
    You and your date are trying to get a table at a restaurant. 
    The parameter "you" is the stylishness of your clothes, in the range 0..10, 
        and "date" is the stylishness of your date's clothes. 
    The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. 
    If either of you is very stylish, 8 or more, then the result is 2 (yes). 
    With the exception that if either of you has style of 2 or less, then the result is 0 (no). 
        Otherwise the result is 1 (maybe).

    dateFashion(5, 10) --> 2
    dateFashion(5, 2) --> 0
    dateFashion(5, 5) --> 1    */
    public int dateFashion(int you, int date) {
        int output = 0;
        
        if(you >= 8 || date >= 8){
            output = 2;
        }
        else if(you <= 2 || date <= 2){
            output = 0;
        }
        else{
            output = 1;
        }
        
        return output;
    }
    
    
    /*Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!". 
    Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", 
        and if divisible by both 3 and 5, use "FizzBuzz". 
    Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.


    fizzString2(1) --> "1!"
    fizzString2(5) --> "Buzz!"
    fizzString2(3) --> "Fizz!"
    fizzString2(15) --> "FizzBuzz!"*/
    public String fizzString2(int n) {
        String output = "";
        
        if(n%3 == 0 && n%5 == 0){
            output = "FizzBuzz!";
        }
        else if(n%3 == 0){
            output = "Fizz!";
        }
        else if(n%5 == 0){
            output = "Buzz!";
        }
        else{
            output = n + "!";
        }
        
        return output;
    }

    /*When squirrels get together for a party, they like to have sodas. 
    A squirrel party is successful when the number of sodas is between 40 and 60, inclusive. 
    Unless it is the weekend, in which case there is no upper bound on the number of sodas. 
    Return true if the party with the given values is successful, or false otherwise.


    sodaParty(30, false) --> false
    sodaParty(50, false) --> true
    sodaParty(70, true) --> true */
    public boolean sodaParty(int sodas, boolean isWeekend) {
        if(sodas >= 40 && sodas <= 60){
            return true;
        }
        else if(isWeekend == true && sodas >= 40){
            return true; 
        }
        else{
            return false;
        }
    }
}
