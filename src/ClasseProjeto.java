
public class ClasseProjeto {

	public static void main(String[] args) {
		 
		int n, i = 1;
		n = 0;
		
		//La�o de repeti��o While
		while(i <= 3){
			  n += i;
			 System.out.print(n + " ");
			 i++;
			}
		System.out.println();
		HelloWorld();
		somar();
		
		
		

	}
	//Este m�todo void cont�m uma mensagem
	public static void HelloWorld(){
		String mensagem = "Hello Git Hub!!";
		
		System.out.println(mensagem);
	}
	public static void somar(){
		int n1, n2, som;
		n1 = 2;
		n2 = 5;
		som = 5 + 2;
		
		System.out.println("O resultado �: " + som);
	}

}
