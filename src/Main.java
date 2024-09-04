import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int count=scanner.nextInt();
        int temp=0;
        int licznik=0;
        if(count<=80){
            for(int i=0;i<count;i++){
                int a =scanner.nextInt();
                temp=a;
                while(temp!=palindrom(temp)){
                    temp=temp+palindrom(temp);
                    licznik++;
                }
                System.out.println(temp+" "+licznik);
                licznik=0;
            }
        }

    }
    public static int palindrom(int number){
        int temp=0;
        while(number>0){
            temp+=number%10;
            number/=10;
            if(number>0){
                temp=temp*10;
            }
        }
        return temp;
    }
}