package View;

import javax.swing.JOptionPane;
import controller.RedesController;
public class Main {

	public static void main(String[] args) {
		int op=0,pos;
		RedesController procController = new RedesController();
		String os = System.getProperty("os.name");
		
	    while(op!=9){
		 op=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1- \n2- \n9-Finalizar"));

		 switch(op){
		   case 1:
			   String Exibir = procController.chamadaIP(os);     
			   System.out.println(Exibir);
		   break;
		   
		  case 2:
			                                            
			
		   break;
			
	    }
	  }
	}

}
