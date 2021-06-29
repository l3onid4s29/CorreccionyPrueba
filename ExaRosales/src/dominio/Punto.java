
package dominio;

import java.util.Scanner;

public class Punto {
    
    private int x;
    private int y;

public Punto (){
   x=0;
   y=0; 
} 


public void arriba (int n){
    y  +=n;
}

public void abajo (int n){
   y -=n;
}

public void derecha (int n){
    x +=n ;
}

public void izquierda (int n){
    x -= n;
}
public int gety(){
    return(y);
}

public int getx(){
    return(x);
}

public void mostrarCuadrante(int a, int b){
    System.out.println("Para mostrarse el cuadrante los puntos x , y deben ser diferentes de 0");
          int c = 0;
          if(x> 0  && y > 0){
          c =1;
          }else if(x < 0 && y>0){
          c= 2;
          }else if(x<0 && y<0){
          c = 3;
          }else if(x>0 && y<0){
          c = 4;
          }
    System.out.println("El punto se encuentra en el cuadrante:  "+c);
}

}

