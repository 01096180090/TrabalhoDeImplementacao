import java.io.*;
import java.util.*;

public class MostraArquivo {


	public String mostraArq() {
		try {
			PrintWriter arq = new PrintWriter(
					"C:\\Users\\mcamargo\\Downloads\\Aps02 Algoritmos e Programação\\participantes.csv");
			return arq.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		
		

	}
}
