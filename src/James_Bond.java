

public class James_Bond {
public int findCode(Vault crypt){
	for (int i = 0; i < 1000; i++) {
		crypt.tryCode(i);
		if (crypt.tryCode(i) == true){
			return i;
			
		}
	}
	return -1;
}
}
