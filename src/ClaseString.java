
public class ClaseString {

	public static void main(String[] args) {
		
		//Declaración de String de diferentes maneras
		String str1=new String("En java, los String son objetos");
		String str2=new String("Se construyen de varias maneras");
		String str3=new String(str2);
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//lenght devuelve la cantidad de caracteres del String
		
		System.out.println(str1.length());
		
		//Devuelve el carácter en el índice i
		
		System.out.println("str1".charAt(3));
		
		//Devuelve la subcadena de carácter de índice al final
		
		System.out.println("Javadesdecero.es".substring(4));
		
		//Devuelve desde i hasta j
		
		System.out.println("Javadesdecero.es".substring(4,9));
		
		//Junta una cadena especifica al final de esta
		
		String s1 = "Java";
		String s2 = "DesdeCero";
		System.out.println(s1.concat(s2));
		
		//Devuelve el indice dentro de la cadena de la primera especificada
		
		String s = "Java desde cero";
		
		System.out.println("ejemplo con str1"+s.indexOf('o'));
		
		//Devuelve el indice dentro de la cadena de la ultima especificada
		
		String d = "Java desde Cero";
		System.out.println(d.lastIndexOf('a'));
		
		//Compara string con obejto especificado
		
		Boolean out = "Java".equals("java");
		System.out.println("Comprobando la igualdad: " + out);
		
		out = "Java".equals("Java");
		System.out.println("Comprobando la igualdad: " + out);
		
		//Compara string con otro string
		
		out = "Java".equalsIgnoreCase("jaVA ");
		System.out.println("Comprobando la igualdad: " + out);
		
		//Compara dos cadenas lexicográficamente
		
		int out1 = s1.compareTo(s2);
		System.out.println("Si s1 = s2: " + out1);
		
		//compara dos cadenas lexicograficamente, ignorando case
		
		out = "Java".equalsIgnoreCase("jaVA ");
		System.out.println("Comprobando la igualdad: " + out);
		
		//Devuelve la palabra en caracteres minusculos
		
		String palabra1 = "Hola";
		System.out.println("Cambiar a minuscula: " + palabra1.toLowerCase());
		
		//Devuelve en mayusculas
		
		String palabra2 = "hola";
		System.out.println("cambiar a mayusculas: " + palabra2.toUpperCase());
		
		//Reemplazar carásteres
		
		String str5 = "Yabanova";
		System.out.println("String original: " + str5);
		String str6 = "Yavanova".replace('Y' ,'J');
		System.out.println("Reemplazar y por j: " + str6);
		
	}
}
