
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MAli
 */
public class Order {
    
    public int orderID;
    public String customer_name;
    public String c_email;
    public String c_ph;
    public Product[] items;
    public Date order_date;
    public String payment_method;
    public String cardNo;
    
    Order(){
        
    }
    Order(int a,String b, String c,String d,Product[] p,Date e,String f){
        orderID = a;
        customer_name =b;
        c_email = c;
        c_ph =d;
        items = p;
        order_date = e;
        payment_method = f;
        
    }
    Order(int a,String b, String c,String d,Product[] p,Date e,String f,String crd){
        orderID = a;
        customer_name =b;
        c_email = c;
        c_ph =d;
        items = p;
        order_date = e;
        payment_method = f;
        cardNo = crd;
        
    }
    
    
    
    
    
}
