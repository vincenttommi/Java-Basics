// do {
//     // code block to be executed
//   }
//   while (condition);
// The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:


public  class doloop{
    public static void main(String[] args){
        int i  = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 30);
    }
}