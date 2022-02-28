import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

/*Hola Mundo*/
public class Calc {

	protected Shell shlCalculadora;
	private Text text;
	private Label label;
	float valor1;
	float valor2;
	float resultat;
	char op;

	/**
	 * Launch the application.
	 * @param args
	 */
	
	public static void main(String[] args) {
		try {
			Calc window = new Calc();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlCalculadora.open();
		shlCalculadora.layout();
		while (!shlCalculadora.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlCalculadora = new Shell();
		shlCalculadora.setSize(435, 350);
		shlCalculadora.setText("Calculadora");
		
		//LABEL
		label = new Label(shlCalculadora, SWT.NONE);
		label.setBounds(39, 21, 280, 20);
		
		//TEXT
		text = new Text(shlCalculadora, SWT.BORDER);
		text.setBounds(39, 59, 280, 39);
		
		//BOTO 7
		Button btn_7 = new Button(shlCalculadora, SWT.NONE);
		btn_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"7");
			}
		});
		btn_7.setBounds(39, 121, 35, 35);
		btn_7.setText("7");
		
		//BOTO 9
		Button btn_9 = new Button(shlCalculadora, SWT.NONE);
		btn_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"9");
			}
		});
		btn_9.setText("9");
		btn_9.setBounds(179, 121, 35, 35);
		
		//BOTO 5
		Button btn_5 = new Button(shlCalculadora, SWT.NONE);
		btn_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"5");
			}
		});
		btn_5.setText("5");
		btn_5.setBounds(109, 162, 35, 35);
		
		//BOTO 1
		Button btn_1 = new Button(shlCalculadora, SWT.NONE);
		btn_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"1");
			}
		});
		btn_1.setText("1");
		btn_1.setBounds(39, 203, 35, 35);
		
		//BOTO 2
		Button btn_2 = new Button(shlCalculadora, SWT.NONE);
		btn_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"2");
			}
		});
		btn_2.setText("2");
		btn_2.setBounds(109, 203, 35, 35);
		
		//BOTO 3
		Button btn_3 = new Button(shlCalculadora, SWT.NONE);
		btn_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"3");
			}
		});
		btn_3.setText("3");
		btn_3.setBounds(179, 203, 35, 35);
		
		//BOTO 0
		Button btn_0 = new Button(shlCalculadora, SWT.NONE);
		btn_0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"0");
			}
		});
		btn_0.setText("0");
		btn_0.setBounds(39, 244, 35, 35);
		
		//BOTO =
		Button btn_igual = new Button(shlCalculadora, SWT.NONE);
		btn_igual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label.setText(label.getText()+text.getText()); //POSAM VALOR2 A LABEL
				valor2 = Float.parseFloat(text.getText()); //TRANSFORMAM I ASSIGNAM VALOR2
				if (op == '+') //OPERAM I ASSIGNAM A RESULTAT
					resultat = valor1 + valor2;
				else if(op == '*')
					resultat = valor1 * valor2;
				else if(op == '-')
					resultat = valor1 - valor2;
				else if(op == '/')
					resultat = valor1 / valor2;
				
				text.setText(Float.toString(resultat)); //ESCRIVIM RESULTAT A PANTALLA
			}
		});
		btn_igual.setText("=");
		btn_igual.setBounds(109, 244, 105, 35);
		
		//BOTO +
		Button btn_suma = new Button(shlCalculadora, SWT.NONE);
		btn_suma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label.setText(text.getText()+"+"); //FICAM A NES LABEL EL VALOR1 i TIPUS OPERACIO
				valor1 = Float.parseFloat(text.getText()); //TRANSFORMAM I ASSIGNAM VALOR1
				text.setText(""); //BUIDAM PANTALLA
				op = '+'; //ASSIGNAM TIPUS OPERACIO
			}
		});
		btn_suma.setText("+");
		btn_suma.setBounds(257, 121, 61, 35);
		
		//BOTO *
				Button btn_multiplicar = new Button(shlCalculadora, SWT.NONE);
				btn_multiplicar.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						label.setText(text.getText()+"*");
						valor1 = Float.parseFloat(text.getText());
						text.setText("");
						op = '*';
					}
				});
				btn_multiplicar.setText("*");
				btn_multiplicar.setBounds(257, 203, 61, 35);
		
		Button btn_clear = new Button(shlCalculadora, SWT.NONE);
		btn_clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label.setText("");
				text.setText("");
			}
		});
		btn_clear.setBounds(334, 121, 73, 99);
		btn_clear.setText("C");
		
		// BOTÓ -
		Button btn_restar = new Button(shlCalculadora, SWT.NONE);
		btn_restar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label.setText(text.getText()+"-");
				valor1 = Float.parseFloat(text.getText());
				text.setText("");
				op = '-';
			}
		});
		btn_restar.setText("-");
		btn_restar.setBounds(258, 162, 61, 35);
		
		//BOTO /
		Button btn_divisio = new Button(shlCalculadora, SWT.NONE);
		btn_divisio.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				label.setText(text.getText()+"/");
				valor1 = Float.parseFloat(text.getText());
				text.setText("");
				op = '/';
			}
		});
		btn_divisio.setText("/");
		btn_divisio.setBounds(257, 244, 61, 35);

		// NÚMERO 8		
		Button btn_8_1 = new Button(shlCalculadora, SWT.NONE);
		btn_8_1.setText("8");
		btn_8_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"8");
			}
		});
		btn_8_1.setBounds(109, 121, 35, 35);
		
		// NÚMERO 6		
				Button btn_6_1 = new Button(shlCalculadora, SWT.NONE);
				btn_6_1.setText("6");
				btn_6_1.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						text.setText(text.getText()+"6");
					}
				});
				btn_6_1.setBounds(179, 162, 35, 35);
		
		// NÚMERO 4
		Button btn_4 = new Button(shlCalculadora, SWT.NONE);
		btn_4.setText("4");
		btn_4.setBounds(39, 162, 35, 35);
		
		
		btn_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.setText(text.getText()+"4");
		


		
			}
		

		});
	
		

	}
}
