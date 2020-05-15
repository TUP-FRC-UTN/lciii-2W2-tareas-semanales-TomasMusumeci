
package veterianaria;

import java.util.Scanner;
public class Veterianaria {

    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese cantidad de clientes:");
        int cantClientes =sc.nextInt();
        
        Cliente[] c = new Cliente[cantClientes];
        
        for (int i = 0; i < c.length; i++) {
            
            
        System.out.println("Ingrese Nro de cliente: "+(i+1));
        int nrocliente=sc.nextInt();
        System.out.println("Ingrese Nombre de cliente: "+(i+1));
        sc.nextLine();
        String nombreC=sc.nextLine();
        System.out.println("Ingrese Antiguedad: "+(i+1));
        int antig=sc.nextInt();
        System.out.println("Ingrese nombre de Mascota: "+(i+1));
        sc.nextLine();        
        String nombreM=sc.nextLine();
        System.out.println("Ingrese edad de su mascota: "+(i+1));
        int edad=sc.nextInt();
        
       c[i]= new Cliente(nrocliente,antig,edad,nombreC,nombreM);
            
        }
        System.out.println("Cantidad de Clientes" + c.length);
        
        float AcumE =0;
        for (int i = 0; i < c.length; i++) {
            
                    AcumE+=c[i].getEdad();
                    
                             
        }
        float promedioEdad;
        promedioEdad=(float)AcumE/c.length;
        System.out.println("El promedio de edad es:"+promedioEdad);
        
        int cantCmayor5 =0;
        for (int i = 0; i < c.length; i++) {
            
            if(c[i].getEdad()>=5){
            cantCmayor5++;
            }
            
        }
        System.out.println("Los clientes con antiguedad mayor a 5 años son: "+ cantCmayor5);
        
        
        
        
        
        
    }
    
}
