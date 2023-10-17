package Produto;

public class main {
	public static void main(String[] args) {
	Produto pro = new Produto(1,"Victor",1500.00);
	Sorvete sor = new Sorvete(2,"Mario",25,2);
	Camisa cam = new Camisa(3,"Batista",1500.00,"Verde","Dri-Fit","M");
		
	System.out.println("Produto");
	System.out.println(pro.getId());
	System.out.println(pro.getNome());
	System.out.println(pro.getPreco());
	
	System.out.println("\nSorvete");
	System.out.println(sor.getId());
	System.out.println(sor.getNome());
	System.out.println(sor.getPreco());
	System.out.println(sor.getTempAdequada());
	
	System.out.println("\nCamisa");
	System.out.println(cam.getId());
	System.out.println(cam.getNome());
	System.out.println(cam.getPreco());
	System.out.println(cam.getCor());
	System.out.println(cam.getTecido());
	System.out.println(cam.getTamanho());
	
	
	
	
	

}
}