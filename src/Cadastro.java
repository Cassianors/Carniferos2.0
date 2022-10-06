
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
  
  public class Cadastro extends JFrame{
  
  private final JLabel lableNome;
  private final JLabel lableLogradouro; 
  private final JLabel lableCidade; 
  private final JLabel lableIdade;

  
  private final JTextField txtNome;
  private final JTextField txtLogradouro;
  private final JTextField txtCidade;
  private final JTextField txtIdade;
  
  private final JComboBox jcbSexos;
  private final JComboBox jcbEstados;
  
  private final JButton botaoCadastrar;
  
  
  
  public Cadastro() { 
	  
	  super();
  
  this.setTitle("Carniferos"); 
  this.setSize(450,500);
  
  this.setLayout(new FlowLayout());
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  
  
  lableNome = new JLabel("Nome"); 
  txtNome = new JTextField();
  txtNome.setPreferredSize(new Dimension(385,25));
  
  lableIdade = new JLabel("Idade");
  txtIdade = new JTextField();
  txtIdade.setPreferredSize(new Dimension(25,25));
  
  String[] Sexos = {"Sexo", "Feminino", "Masculino"};
  jcbSexos = new JComboBox(Sexos);
  String[] Estados = {"Estados", "AC","AL" ,"AP", "AM", "BA", "CE","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO","DF"};
  jcbEstados = new JComboBox(Estados); 
  
  JLabel labelAnimais = new JLabel("Selecione as especies que possui");
  
  JCheckBox cbCaninos = new JCheckBox("Caninos");
  JCheckBox cbFelinos = new JCheckBox("Felinos");
  JCheckBox cbRoedores = new JCheckBox("Roedores");
  
  lableLogradouro = new JLabel("Logradouro");
  txtLogradouro = new JTextField();
  txtLogradouro.setPreferredSize(new Dimension(350,25));
  
  lableCidade = new JLabel("Cidade");
  txtCidade = new JTextField();
  txtCidade.setPreferredSize(new Dimension(100,25));
  
  
  botaoCadastrar= new JButton("Cadastrar");
  
  botaoCadastrar.addActionListener(new ActionListener() {
	  
	  public void actionPerformed(ActionEvent ae) {
  
		  String nome = txtNome.getText();
		  String cidade = txtCidade.getText();
		  int idade = Integer.parseInt(txtIdade.getText());
		  
		 
		  JOptionPane.showMessageDialog(null, "Dados do Cliente"
				  + "\n Nome: "+ nome
				  + "\n Idade: " + idade 
				  + "\n Cidade: " + cidade			
				  + "\n\n As especies que possui são: "
				  + "\n Canino:" + (cbCaninos.isSelected() ?  "Sim" : "Não")
				  + "\n Felino:" + (cbFelinos.isSelected() ? "Sim" : "Não")
				  + "\n Roedor:" + (cbRoedores.isSelected() ? "Sim" : "Não")
				  
				  
				  );
		  JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
		  
	  }
		  
	  });
  
	  this.add(lableNome); 
	  this.add(txtNome);
	  
	  this.add(lableLogradouro);
	  this.add(txtLogradouro);
	  
	  this.add(lableIdade);
	  this.add(txtIdade);
	  
	  this.add(jcbSexos);
	  this.add(jcbEstados);
	 
	  this.add(lableCidade);
	  this.add(txtCidade);
	  
	  this.add(labelAnimais);
	  this.add(cbCaninos);
	  this.add(cbFelinos);
	  this.add(cbRoedores);
	  
	  this.add(botaoCadastrar);
	  
	  this.setVisible(true);
  
  }
  
   }
 