
package herenciajava;


public class Humano{
           private String nombre;
    
    public void comer(String nombre){ 
       System.out.println(nombre+" esta comiendo desde la clase Humano"); 
   }
     public void dormir(){
        System.out.println(nombre+" Esta durmiendo desde la clase Humano ");
   }
       public String getNombre(){
           return nombre;
           
   }
     public void setNombre(String nombre){
         this.nombre=nombre;
     }
}     