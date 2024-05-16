// The default keyword  - specifies some code  if there is no case match
public class defaultkeyword{
    public static void main(String[] args){
        int day  = 7;
        switch(day){
            case 6:
            System.out.println("Today is Thursday");
            break;
            case 7 :
            System.out.println("Today is Friday");
            case 8:
            break;
            default:
            //Note that if the default statement is used as the last statement in a switch block, it does not need a break. 
            System.out.println("Looking forward to the Weekend");
        }

    }
}