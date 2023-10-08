
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOGAR
 */
public class CalculosDeOhms{
    float vol, cor, inten;  
    
    float calcularVoltaje(float cor, float inten){
        this.cor=cor; 
        this.inten=inten;
        vol=cor*inten; 
        return vol; 
    }
    
    float calcularCorriente(float vol, float inten){ 
        this.vol=vol; 
        this.inten=inten; 
        cor=vol/inten; 
        return cor; 
    }
    float calcularIntensidad(float vol, float cor){
        this.vol=vol; 
        this.cor=cor; 
        inten=vol/cor; 
        return inten; 
    }
    
            
}

