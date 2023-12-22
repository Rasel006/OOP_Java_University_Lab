public class LErrorDemo {
    public static void main(String[]args){

        int num = 789;
        int rnum = 0;
        int remainder;

        while (num==0){
            remainder=num/10;
            rnum=rnum+remainder;
            num/=10;
        }
    System.out.println("Final number is:"+rnum);
    
    }
}