package aula;

import javax.swing.JOptionPane;

public class Main8{
	public static void main(String[] args){
    	int m = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
        if(m%2==0){
			System.out.println(m + " " + "� um n�mero par!");
		}
        else{
			System.out.println(m + " " + "� um n�mero impar!");
        }
    }
}