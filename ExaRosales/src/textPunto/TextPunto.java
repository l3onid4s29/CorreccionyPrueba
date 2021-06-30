
package textPunto;

import dominio.Punto;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class TextPunto {
    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in); 
     Punto Objtablero = new Punto();
      int op,n=0; 
      int m;
      int i =0;
        System.out.println("Ingrese el numero de movimientos que desea hacer");
        m = escaneo.nextInt();
      System.out.println("El movimiento será realizado aleatoriamente, puede ser hacia arriba, abajo,izquierda o derecha");
      do{
          
          
          op = (int) (Math.random()*4+1); 
          if(op<=5 && op>=1 ) { 
          System.out.println("ecriba cuantas posiciones desea mover al objeto");
          n=escaneo.nextInt();
          }
           switch (op){
                case 1: Objtablero.arriba(n);
                break;
                case 2: Objtablero.abajo(n);
                break;
                case 3: Objtablero.derecha(n);
                break;
                case 4 : Objtablero.izquierda(n);
                break;
                case 5 : break;
                
         
                }

          System.out.println("su posición actual es:");      
          System.out.println("("+Objtablero.getx()+","+Objtablero.gety()+")");
          

          Objtablero.mostrarCuadrante(Objtablero.getx(), Objtablero.gety());
          double dT;
          dT = sqrt((Math.pow(Objtablero.getx(),2))+(Math.pow(Objtablero.gety(),2)));
          System.out.println("La distancia total recorrida por el objeto es: "+dT);
          i++;
        }while(i<=m);
    }     
    
    
    
    }

