
public class Vectorespyi {
public static void main(String[] args) {
	int vector[]; int vectorcopia[];
	vector = new int[100];
	vectorcopia = new int[100];
	int auxiliar=1;
	int par;
	int j=99;
	
	for(int inicio = 0;inicio < vector.length; inicio++) {
		par=auxiliar*2;
		vector[inicio]=par;
		auxiliar++;}
	
	for (int inicio = 0; inicio < vector.length; inicio++) {
		vectorcopia[inicio]=vector[j];
		j--;
		System.out.println("Numero"+ vectorcopia[inicio]+"Posicion"+ inicio);
		}
	}
}
