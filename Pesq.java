package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Container;
import java.awt.event.ActionEvent;
	

public class Pesq extends JFrame{
  
	String [] coluna = { "Nome", "Cidade", "Estado", "Sexo", "CPF", "CEP", "Bairro", "RG", "Telefone" ,"Celular" };
	String [][] dados = { {"Eduardo Jorge", "Salvador", "Bahia"} , {"Gustavo Neves", "Caitité", "Bahia"} ,
			{"Tarcísio Araujo", "Mutuípe", "Bahia"} , {"Rafael", "Campinas", "São Paulo"} , {"Osvaldo", "Barueri", "São Paulo"}};
	
	private JTable listestados = new JTable(dados,coluna);
	private JScrollPane scrollpane = new JScrollPane(listestados);
	
	
	public Pesq() {
		super("Pesquisar");
		
		Container paine = this.getContentPane();
		paine.add(scrollpane);
		scrollpane.setBounds(0, 0, 300, 600);
		
		
	this.setLayout(null);
	//this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
	this.setSize(600, 300);
	this.setVisible(true);
	this.setLocationRelativeTo(null);

}
	public static void main (String[]args ) {
		Pesq pq = new Pesq();
	}
	
}
