/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art.gallery;

/**
 *
 * @author clt
 */
abstract public class person {
    
   protected String Name;
   protected String Password;
   person(String Name,String Password){
       this.Name=Name;
       this.Password=Password;
   }
    abstract public boolean Login(String Name ,String Password );
}

 class owner extends person {

     @Override
     public boolean Login(String Name ,String Password )
     {
       return true ;
         
     }
     public owner(String Name, String Password)
     {
         super(Name,Password);
     }
     public void Adding_Artwork(Artwork item)
     {
         
     }
     public void Customers_info()
     {
         
         
     }
     
  }
class Customer extends person{
String Address;
double Total_price;
Customer (String Name,String Password,String Address,double Total_price){
    super(Name,Password);
    this.Address=Address;
    this.Total_price=Total_price;
}
    @Override
    public boolean Login(String Name, String Password) {
  return true ; 
    }
    
    public  void Buy_anyitem (int item_price)
    {
        
    }
}

