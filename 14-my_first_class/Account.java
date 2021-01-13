import java.util.*;
public class Account{
  private String username;
  private String password;
  //constructor

  public Account(String u, String p){
    this.username = u;
    this.password = p;
  }
  public String getusername(){
    return this.username;
  }
  public String getpassword(){
    return this.password;
  }
  public void displayuser() {
    System.out.println("Username: " + this.username);
  }
  public void hiddenpw(){
    System.out.print("Password: ");
    for(int i = 0; i < this.password.length(); i++){
      System.out.print("*");
    }
    System.out.println("");
  }
  public void displaypw(){
    System.out.println("Password: " + this.password);
  }
    public void setusername(String u){
    this.username = u;
  }
    public void setpassword(String p){
      this.password = p;
    }
}
