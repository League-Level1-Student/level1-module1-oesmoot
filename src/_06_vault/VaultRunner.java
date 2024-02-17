package _06_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	
public static void main(String[] args) {
	Vault vault = new Vault();
	//String sGuess = JOptionPane.showInputDialog("guess a code!");
	//int guess = Integer.parseInt(sGuess);
	//boolean code = vault.tryCode(guess);
	//System.out.println(code);
	SecretAgent agent = new SecretAgent();
	agent.findCode(vault);
	
}
}
