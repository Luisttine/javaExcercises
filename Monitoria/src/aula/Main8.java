package aula;

import javax.swing.JOptionPane;

public class Main8{
	public static void main(String[] args){
    	int m = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        if(m%2==0){
			System.out.println(m + " " + "é um número par!");
		}
        else{
			System.out.println(m + " " + "é um número impar!");
        }
    }
}