public class task_str_func1 {
    public static void main(String[] args) {
        String name = new String("Ashish");
        String last_name = "Prajapati";
        String empty_str = "";

        System.out.println("The Length of Ashish is: " + name.length());
        System.out.println("The Length of Ashish is: " + last_name.length());

        System.out.println("The Char At Index 3 in name is: " + name.charAt(3));
        System.out.println("The Char At Index 6 in last_name is: " + last_name.charAt(6));

        System.out.println("concatenation of name and last name is: " + name.concat(last_name));

        System.out.println("Is The Name String Is Empty: " + name.isEmpty());
        System.out.println("Is The Empty_Str Is Empty: " + empty_str.isEmpty());

        System.out.println("name is equal to last name ?" + name.equals(last_name));
        System.out.println("name is equal to Ashish ?" + name.equals("Ashish"));
        //by Changing Case
        System.out.println("name is equal to ashish ?" + name.equals("ashish"));

    }
}
