
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Manguera extends Thread {
    int cantidad = 0;
    JProgressBar barraProgreso;
    int velocidad = 300;    
    
    
    @Override
    public void run(){
        for( int i = 0; i <= 100; i++){
            cantidad ++;
            try{
                Thread.sleep(velocidad);
                barraProgreso.setValue(cantidad);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
    
}
