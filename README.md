#public class Hello {
public static void main(String args［］) {
System.out.println(″欢迎你学习Java语言!″);
}
}


public class SwitchTest{  
public static void main(String[] args){            
for(int i=1;i<=9;i++){     
for(int j=1;j<=i;j++){     
System.out.print(j+"*"+i+"="+(i*j)+"\t");    }     
System.out.println();        }

}




package pm;  
import java.util.Scanner; 
public class SwitchTest {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
   while (true) {
    System.out.println("请输入要转换的温度类型：C 或 F");
    String s = sc.next().trim();
    if ("c".equalsIgnoreCase(s)) {
          System.out.println("请输入要转换摄氏的温度:..");
     double db = sc.nextDouble(); 
    double db2 = (db * 9 / 5) + 32;
     System.out.println("对应的华氏温度：" + db2 + "F");
    } else if ("f".equalsIgnoreCase(s)) {
          System.out.println("请输入要转换华氏的温度:..");
     double db = sc.nextDouble();
     double db2 = (db - 32) * 5 / 9;
     System.out.println("对应的摄氏温度：" + Math.round(db2) + "C");
    }else if("exit".equalsIgnoreCase(s)){
     break;
    }
   }
  }
  }

