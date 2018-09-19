
package pedrapapeltesoura;
import javax.swing.JOptionPane;

public class JokenpoAI { 
    public static int x;
    public static String[] escolhas = new String[2];
    public static String escolha;
    public static void main(String[] args) {
        
        choose();
        decideWinner();
    }
    
    public static int randomNum(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNumber = rand.nextInt((max - min) + 1) + min;
        return randomNumber;
    }
    public static void choose() {
        x = randomNum(0, 2);
        switch(x) {
            case 0:
               escolha = "Pedra" ;
               break;
            case 1:
                escolha = "Papel";
                break;
            case 2:
                escolha = "Tesoura";
                break;    
        }
    }
    public static void decideWinner() {   
        escolhas[1] = escolha;
        if(escolhas[0].equals(escolhas[1])) {
            JOptionPane.showMessageDialog(null, "Empate!");
        } else {
            if(escolhas[0].equals("Pedra")) {
                if(escolhas[1].equals("Papel")) {
                    JOptionPane.showMessageDialog(null, "O computador escolheu " + escolhas[1] + ". Você perdeu!");
                } else {
                    JOptionPane.showMessageDialog(null, "O computador escolheu " + escolhas[1] + ". Você ganhou!");
                }
            }
            if(escolhas[0].equals("Papel")) {
                if(escolhas[1].equals("Tesoura")) {
                    JOptionPane.showMessageDialog(null, "O computador escolheu " + escolhas[1] + ". Você perdeu!");
                } else {
                    JOptionPane.showMessageDialog(null, "O computador escolheu " + escolhas[1] + ". Você ganhou!");
                }
            }
            if(escolhas[0].equals("Tesoura")) {
                if(escolhas[1].equals("Pedra")) {
                    JOptionPane.showMessageDialog(null, "O computador escolheu " + escolhas[1] + ". Você perdeu!");
                } else {
                    JOptionPane.showMessageDialog(null, "O computador escolheu " + escolhas[1] + ". Você ganhou!");
                }
            }
        } 
    }
}
