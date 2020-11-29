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
public class Artist {
    
 String Name;
 String Birthplace;
 int Age;
 String [] Category  ;
 Artist (String Name  ,String Birthplace ,int Age ,String []  Category )
 {
    this.Name=Name;
    this.Birthplace=Birthplace;
    this.Age=Age;
    this.Category=Category;
}
}
class Artwork
{
    Artist A;
    int Year;
String Title;
Double Price;
Artwork ( Artist A ,int Year  ,String Title ,Double Price)
{
    this.A=A;
    this.Year=Year;
    this.Title=Title;
    this.Price=Price;
}
}
