
import java.util.Scanner;


public class Convert_time {

/**
 * @Abdulrahman 
 */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); 

        convert_time(in.nextLine()); // Ex: in: 7:00 pm --> out: 19:00 || in: 19:00 --> out: 7:00 pm
        
        
    }
    
public static void convert_time(String time) {

String res ="",min;
int hour ;
// AM & PM
if(time.contains("am")||time.contains("pm")){

String[]t = time.split(" ");
hour = Integer.parseInt(t[0].split(":")[0]);
min = t[0].split(":")[1];     
//AM
if(time.contains("am")){
if(hour - 12 >= 0){
hour -= 12;
}
}
//PM
if(time.contains("pm")){
if(hour + 12 < 24){
hour += 12;
}
}

res = hour+":"+min;

}// End of AM & PM
else{
    
hour = Integer.parseInt(time.split(":")[0]);    
min = time.split(":")[1];

if(hour > 11){
hour-=12;    
res = hour+":"+min+" pm";

}
    else{
res = hour+":"+min+" am";
}
}

    System.out.println(res);
}
    
}
