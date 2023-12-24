//Q.1. Write a java program which initialization earning of an employee. The   program should calculate the income tax to be paid by the employee as per
// the criteria given below:
//Slab rate              IT rate
//Upto Rs. 45,000        Nil
//Upto Rs. 55,000        10% on additional amount
//Upto Rs. 1,00,000      20% on additional amount
//Above Rs. 1,50,000     30% on additional amount
class emp{
    int sal,id,tax;
    String post,name;
    emp(int id, String name,int sal, String post){
        this.id = id;
        this.sal = sal;
        this.name = name;
        this.post = post;
        if (sal <= 45000){
            tax = 0;
        } else if (sal<= 99999 || sal >= 55000) {
            tax = (sal*10)/100;
        } else if (sal <= 14999 ||sal >= 100000) {
            tax = (sal*20)/100;
        } else if (sal >= 150000) {
            tax = (sal*30)/100;
        }
    }

    public int getTax() {
        return tax;
    }
}
public class assignment4_1 {
    public static void main(String[] args) {
        emp junior_programmer = new emp(101,"Ravi",40000, "Junior Programmer");
        emp senior_programmer = new emp(102,"Raj",60000, "Senior Programmer");
        emp HR = new emp(103,"Sunny",120000, "H.R.");
        emp Manager = new emp(104,"Pradeep",160000, "Manager");

        System.out.println("Tax Pay By " + junior_programmer.name + " Is: " + junior_programmer.getTax());
        System.out.println("Tax Pay By " + senior_programmer.name + " Is: " + senior_programmer.getTax());
        System.out.println("Tax Pay By " + HR.name + " Is: " + HR.getTax());
        System.out.println("Tax Pay By " + Manager.name + " Is: " + Manager.getTax());
    }
}
