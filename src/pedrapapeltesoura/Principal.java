
package pedrapapeltesoura;

import java.awt.EventQueue;
import java.awt.Frame;

public class Principal {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFramePedraPapelTesoura jFramePrincipal = new JFramePedraPapelTesoura();
                jFramePrincipal.setVisible(true);
            }
        });
    }
            
    
}
