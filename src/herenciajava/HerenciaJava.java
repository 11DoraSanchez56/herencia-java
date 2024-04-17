

package herenciajava;


public class HerenciaJava {
    public static void main (String[]args) {
        // crear objeto clase padre 
        Humano adulto=new Humano();
        adulto.setNombre("freddy");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        
        System.out.println();
        //crear objetos clase hija
        Hombre padre=new Hombre();
        padre.setNombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarce();
        
        // crear objeto clase hija -> mujer
        Mujer madre=new Mujer();
        madre.setNombre("Gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
        
        
        
   
        
        
        
        
    }
    
}
