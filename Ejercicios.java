
package taller1;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicios {

    public static void main(String[] args) {
        
        //Lectura Por Consola
            //punto1();
            //punto2();
        //Lectura Por Pantalla
            //punto3();
            //punto4();
            //punto5();
            //punto6();
            //punto7();
            //punto8();
            punto9();
    }
    
    public static void punto1() {  
        Scanner sc = new Scanner(System.in);
        
        int num1,num2,suma,resta,residuo;
        
        System.out.println("Ingrese el primer numero: ");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=sc.nextInt();
        
        suma=num1+num2;
        resta=num1-num2;
        residuo=num1%num2;
        
        System.out.println("La suma entre "+num1+" y "+num2+" es: "+suma);
        System.out.println("La resta entre "+num1+" y "+num2+" es: "+resta);
        System.out.println("El residuo entre "+num1+" y "+num2+" es: "+residuo);
    }
    
    public static void punto2() {        
        Scanner sc=new Scanner(System.in);
        
        String ser;
        
        System.out.println("Ingrese el ser vivo: ");
        ser=sc.nextLine();
        
        if (ser.equalsIgnoreCase("perro")) {
            System.out.println("El "+ser+" pertenece al reino animal.");
        } else {
            if(ser.equalsIgnoreCase("arbol")){
            System.out.println("El "+ser+" pertenece al reino vegetal.");
            } else{
                if(ser.equalsIgnoreCase("seta")){
                System.out.println("La "+ser+" pertenece al reino fungi.");
                } else {
                    if(ser.equalsIgnoreCase("ameba")){
                    System.out.println("La "+ser+" pertenece al reino protista.");
                    } else{
                        if(ser.equalsIgnoreCase("helicobacter")){
                        System.out.println("El "+ser+" pertenece al reino monera.");
                        }
                    }
                }
            }
        }            
    }
    
    public static void punto3() {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 7"));
        
        switch(num){
            case 1:
                JOptionPane.showMessageDialog(null, "DO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "RE");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "MI");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "FA");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "SOL");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "LA");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "SI");
                break;
        }
    }
    
    public static void punto4(){
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
        
        for (int i = 0; i <= num; i++) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    
    public static void punto5() {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
        
        for (int i = 0; i <= num; i=i+3) {
            JOptionPane.showMessageDialog(null, i);
        }
    }
    
    public static void punto6() {
        int num;
        
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        
        if (num%2==0) {
            JOptionPane.showMessageDialog(null, "El numero es PAR");
        } else{
            JOptionPane.showMessageDialog(null, "El numero es IMPAR");
        }
    }
    
    public static void punto7() {
        /*int num,ult,sum,im;        
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));        
        sum=0; 
        ult=sum;
        im=0;
        do {             
            if (sum<=1) {
                JOptionPane.showMessageDialog(null, sum);
                sum++;
            }else{
                sum--;
                im=ult+sum;
                JOptionPane.showMessageDialog(null, im);
                ult=im;
                sum=sum+2;
            }            
        } while (sum<=num); */        
        int x,num1,num2,acum,cont;
        
        x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese hasta que numero desea la secuencia de Fibonacci"));
        
        num1=1;
        num2=0;
        acum=0;
        cont=1;
        
        while (cont<=x) {            
            JOptionPane.showMessageDialog(null,acum);
            acum=num1+num2;
            num1=num2;
            num2=acum;
            cont++;
        }
    }
    
    public static void punto8() {
        Random r = new Random();
        
        int clave=r.nextInt(10);        
        
        int cont=0;        
        do { 
            int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la clave"));
            if (num==clave) {
                JOptionPane.showMessageDialog(null, "Acceso Permitido");
                break;
            }else{            
                if (cont==2) {
                    JOptionPane.showMessageDialog(null, "Clave BLOQUEADA");
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Acceso Denegado");
                    cont++;
                    }
                }
            
        } while (cont<3);              
    }
    
    public static void punto9() {
        
        int sn=0;
        int arroz=0,leche=0,pan=0,gaseosa=0;
        do {            
            sn=Integer.parseInt(JOptionPane.showInputDialog(null, "Desea comprar algo?      1.SI        0.NO"));
            if (sn>1) {
                JOptionPane.showMessageDialog(null, "Error! Ingrese una opcion valida.");
            }
        } while (sn!=0 && sn!=1);
                
        if (sn==1) {
            while (sn==1) {            
                JOptionPane.showMessageDialog(null, "Bienvenido a tu tienda!");
                int numCompra=Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantas compras desea realizar?"));
                
                for (int i = 1; i <= numCompra; i++) {
                    JOptionPane.showMessageDialog(null, "Seleccione su compra numero "+i+":");
                    int compra=Integer.parseInt(JOptionPane.showInputDialog(null, "1.Arroz     2.Leche     3.Pan     4.Gaseosa"));
                    if (compra==1) {
                        arroz++;
                    }if (compra==2) {
                        leche++;                    
                    }if (compra==3) {
                        pan++;                    
                    }if (compra==4) {
                        gaseosa++;                    
                    }
                }
                
                JOptionPane.showMessageDialog(null, "Su compra final es:");
                JOptionPane.showMessageDialog(null, arroz+" unidades de arroz - "+leche+" unidades de leche - "+pan+" unidades de pan - "+gaseosa+" unidades de gaseosa");
                                            
                do {            
                    sn=Integer.parseInt(JOptionPane.showInputDialog(null, "Desea comprar algo mas?      1.SI        0.NO"));
                    if (sn>1) {
                        JOptionPane.showMessageDialog(null, "Error! Ingrese una opcion valida.");
                    }
                }while (sn!=0 && sn!=1);
            }
        } 
        if(sn==0){
            JOptionPane.showMessageDialog(null, "Gracias por tu compra!");
        }                                                 
    }
}

