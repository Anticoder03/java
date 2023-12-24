class Air_ticket{
    int flight_no;
    String date,time,destination;
    public void get_info(){
        System.out.println("Flight number is: " + flight_no);
        System.out.println("Date is: " + date);
        System.out.println("Time is: " + time);
        System.out.println("Destination is: " + destination);
    }
}
class Confirmed extends Air_ticket{
    int ticket_no;
    public void get_con() {
        System.out.println("Your Ticket Is Confirmed.");
        get_info();
        System.out.println("Ticket Number is: " + ticket_no);
    }
    Confirmed(int f_no,int t_no, String d,  String t,  String dest){
        flight_no = f_no;
        ticket_no = t_no;
        date = d;
        time = t;
        destination = dest;
    }
}
class Requested extends Air_ticket{
    String status;
    public void get_req(){
        System.out.println("Your Ticket Is requested.");
        get_info();
        System.out.println("Status is: " + status);
    }
    Requested(int f_no,String stat, String d,  String t,  String dest){
        flight_no = f_no;
        status = stat;
        date = d;
        time = t;
        destination = dest;
    }
}

public class assignment1_2 {
    public static void main(String[] args) {
        Confirmed person1 =new Confirmed(101,201,"12/4/2023", "12:53", "Delhi");
        Requested person2 = new Requested(102,"Pending","13/4/2023","1:23","Patna");
        person1.get_con();
        person2.get_req();
    }
}
