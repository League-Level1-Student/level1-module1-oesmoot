package _06_vault;

public class SecretAgent {
void findCode(Vault vault) {
	for (int i = 0; i<1000001; i++) {
		boolean code = vault.tryCode(i);
		if (code == true) {
			System.out.println(i);
		}
	}
	
}
}
