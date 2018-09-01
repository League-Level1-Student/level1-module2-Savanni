import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
int code = new Random().nextInt(10000000);
boolean tryCode(int guess){
	if (guess == code){
		return true;
	}
	else {
		return false;
	}
}
}
