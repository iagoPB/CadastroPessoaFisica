package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;


public class InterfaceGrafica extends JFrame {
	
	private JMenuItem menuItemCadastrar = new JMenuItem("Cadastrar");
	private JMenuItem menuItemExcluir = new JMenuItem("Excluir");
	private JMenuItem menuItemPesquisar = new JMenuItem("Pesquisar");
	private JMenuItem menuItemFechar = new JMenuItem("Fechar");
	

	
	private JMenuItem menuItemAtualizar = new JMenuItem("Atualizar");

	
	private JMenu menuArquivo = new JMenu("Arquivo");
	
	private JMenu menuEditar = new JMenu("Editar");
	
	private JMenuBar menuBar = new JMenuBar();
	
	public InterfaceGrafica() {
		super("MENUS");
		
		
		menuArquivo.add(menuItemCadastrar);
		menuItemCadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
	Cad cad = new Cad ();
		}
		});
		
		
		menuArquivo.add(menuItemExcluir);
		menuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Exc exc = new Exc ();
		}
		});
		
		menuArquivo.add(menuItemPesquisar);
		menuItemPesquisar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pesq pesq = new Pesq ();
		}
		});
		menuArquivo.addSeparator();
		menuArquivo.add(menuItemFechar);
		menuItemFechar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
		System.exit(0);
		}
		});
		
		menuEditar.add(menuItemAtualizar);
		menuItemAtualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Atualizar atualizar = new Atualizar ();
		}
		});
		
		menuBar.add(menuArquivo);
		menuArquivo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Arquivo arquivo = new Arquivo ();
		}
		});
		menuBar.add(menuEditar);
		menuEditar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
		Editar editar = new Editar ();
		}
		});
		
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(310,200);
		this.setVisible(true);
		
		
		
		
	}
	
	
	public static void main (String [] args) {
		InterfaceGrafica exemplo = new InterfaceGrafica();
		
	}
	
	

}
