/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splashscr;

/**
 *
 * @author tk
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loading obr = new Loading();
        obr.setVisible(true);
        
        Login login = new Login();
        
        try{
            
        
            for(int i=0 ; i<=100 ; i++){
                
                Thread.sleep(25);
                obr.jLabel2.setText("STARTING : "+Integer.toString(i)+" %");
                obr.jProgressBar1.setValue(i);
                
                if(i==100){
                    obr.dispose();
                    login.setVisible(true);
                }
            }
        
        }
        catch(Exception e){
            
        }
    }
    
}