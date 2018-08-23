/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica1.fernandotorrespantoja;

/**
 *
 * @author Alumno
 */
public class CustomerDriver  {
    public static void main(String[] args){
        Customer cus1 = new Customer();
        Customer cus2 = new Customer("Cristiano Ronaldo");
        Customer cus3 = new Customer("Lionel Messi","31");
        Customer cus4 = new Customer("Harry Kane", "24", "Tottenham");
        Customer cus5 = new Customer("Antoine Griezmann","27","Atlético de Madrid","Francia");
        Customer cus6 = new Customer("Kylian Mbappe","19","PSG","Francia","175");
        
        System.out.println(cus1.toString());
        System.out.println(cus2.toString());
        System.out.println(cus3.toString());
        System.out.println(cus4.toString());
        System.out.println(cus5.toString());
        System.out.println(cus6.toString());
        
    }
    
}
