//Write a java program that implements the use of this keyword in the following cases:
//
//
//
//
//Can be passed as an argument in the method call.
//
// Can be passed as an argument in the constructor call.
//
// Can be used to return the current class instance from the method.

class Base{
    int id;
    String Name;
//    To invoke current class constructor.
   Base(){
       this(101,"Ashish");
       System.out.println("Id: " + this.id);
       System.out.println("Name: " + this.Name);
   }
    //To resolve ambiguity between instance variables and parameters.To refer current class instance variable.
    Base(int id,String Name){
        this.id  = id;
        this.Name = Name;
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.Name);
    }


//    To invoke current class method (implicitly).
    public int getId() {
        return id;
    }
    public void show_Id(){
        System.out.println(this.getId());
    }
    //To pass the current object as a parameter to another method.
    public void obj_param(Base obj){
       this.id = obj.id;
       this.Name = obj.Name;
        System.out.println("Id :" + this.id);
        System.out.println("Name :" + this.Name);
    }
    //  Passing the current object as an argument in the constructor call
    public Base createCopy() {
        return new Base(this.id, this.Name);
    }
    public Base return_ob(){
       return this;
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        Base object = new Base();
        
    }
}
