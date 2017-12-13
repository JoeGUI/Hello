public class Csz {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int num = (int) (Math.random() * 1000);
   int m=0;
      for(int i=9;i>=0;i--){
   System.out.println("please input your number! ");
   m=s.nextInt();
   if(m>num){
    System.out.println("Too large!");
         }else
 if(m<num){
    System.out.println("Too small!");
       }else{
    System.out.println("You are right!");
    break;   }   if(i>0){    System.out.println("还有"+i+"次机会！");
   }
   }
   if( m!=num){
    System.out.println("下次再来吧！");
