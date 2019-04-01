package FrontEnd;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

import BackEnd.Zapato;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;




public class DialogoEliminarZapto extends JDialog implements ActionListener 
{

/**
 * Comando para el bot�n Agregar
 */
private static final String AGREGAR = "Agregar";

/**
 * Comando para el bot�n Cancelar
 */
private static final String CANCELAR = "Cancelar";

// -----------------------------------------------------------------
// Atributos de la Interfaz
// -----------------------------------------------------------------

/**
 * Etiqueta Nombre
 */
private JLabel lblId;

/**
 * Campo de texto donde se ingresa la identificaci�n de la caja
 */
private JTextField txtId;

/**
 * Etiqueta Dinero inicial
 */
private JLabel lblDineroInicial;

/**
 * Campo de texto donde se ingresa la cantidad de dinero inicial de la caja
 */
private JTextField txtDineroInicial;

/**
 * Bot�n usado para agregar la caja
 */
private JButton botonAgregar;

/**
 * Bot�n para cancelar
 */
private JButton botonCancelar;

/**
 * Ventana principal de la aplicaci�n
 */
private Principal principal;

/**
 * Grupo para colocar todos los radio buttons donde solo se puede escoger uno
 */
private ButtonGroup grupo;

/**
 * Radio Button para indicar una transacci�n de retiro
 */
private JRadioButton radioRetiro;

/**
 * Radio Button para indicar una transacci�n de consignaci�n
 */
private JRadioButton radioConsignacion;

/**
 * Radio Button para indicar una transacci�n de pago de servicio
 */
private JRadioButton radioServicio;
private JTextField textReft;
private JButton btnNewButton;
private JButton btnNewButton_1;
private JTextField textCodigoProveedor;
private JTextField txtAlmacen;
private JTextField textField;
private JTextField textCategoria;
private JTextField textNumeracion;
private JTextField textPrecioCosto;

// -----------------------------------------------
// M�todos
// -----------------------------------------------

/**
 * Crea el di�logo para agregar una caja
 * @param principal Ventana principal de la aplicaci�n
 */
public DialogoEliminarZapto( Principal pprincipal )
{
    super( pprincipal, true );

    this.principal = pprincipal;
    setTitle( "Eliminar Zapato" );
    grupo = new ButtonGroup( );
    
    btnNewButton = new JButton("Aceptar");
    btnNewButton.setActionCommand( AGREGAR );
    btnNewButton.addActionListener( this );
    JLabel lblReferencia = new JLabel("Referencia");
    lblReferencia.setHorizontalAlignment(SwingConstants.LEFT);
    
    textReft = new JTextField();
    textReft.setColumns(10);
    
    btnNewButton_1 = new JButton("Cancelar");
    btnNewButton_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) 
    	{
    		DialogoEliminarZapto.this.setVisible( false );
            DialogoEliminarZapto.this.dispose( );
    	}
    });
    
    JLabel lblciudadAlmacen = new JLabel("Cod. Proveedor");
    lblciudadAlmacen.setHorizontalAlignment(SwingConstants.LEFT);
    
    textCodigoProveedor = new JTextField();
    textCodigoProveedor.setColumns(10);
    
    JLabel lblAlmacen = new JLabel("Almacen");
    lblAlmacen.setHorizontalAlignment(SwingConstants.LEFT);
    
     JLabel lblCategoria = new JLabel("Categoria");
    lblAlmacen.setHorizontalAlignment(SwingConstants.LEFT);
    
     JLabel lblnumeracion = new JLabel("Numeracion");
    lblnumeracion.setHorizontalAlignment(SwingConstants.LEFT);
    
    JLabel lblpCosto = new JLabel("Precio Costo");
    lblpCosto.setHorizontalAlignment(SwingConstants.LEFT);
    
    txtAlmacen = new JTextField();
    txtAlmacen.setColumns(10);
    
    textField = new JTextField();
    textField.setColumns(10);
    
    textCategoria = new JTextField();
    textCategoria.setColumns(10);
    
        
    textNumeracion = new JTextField();
    textNumeracion.setColumns(10);
    
    
    textPrecioCosto = new JTextField();
    textPrecioCosto.setColumns(10);
    
    
    JLabel lblColor = new JLabel("Color");
    lblColor.setHorizontalAlignment(SwingConstants.LEFT);
    
    
    GroupLayout groupLayout = new GroupLayout(getContentPane());
    groupLayout.setHorizontalGroup(
    	groupLayout.createParallelGroup(Alignment.LEADING)
    		.addGroup(groupLayout.createSequentialGroup()
    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addContainerGap()
    					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
    						.addComponent(textReft, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
    						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(44)
    					.addComponent(lblReferencia)))
                        
                        
                        
                        
                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(32)
    					.addComponent(lblCategoria, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(18)
    					.addComponent(textCategoria, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
                        
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(32)
    					.addComponent(lblpCosto, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(18)
    					.addComponent(textPrecioCosto, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
                        
                        
                        .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(32)
    					.addComponent(lblnumeracion, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(18)
    					.addComponent(textNumeracion, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
                        
    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(32)
    					.addComponent(lblciudadAlmacen, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGap(18)
    					.addComponent(textCodigoProveedor, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
    			.addPreferredGap(ComponentPlacement.UNRELATED)
    			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
    				.addComponent(txtAlmacen, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addComponent(lblAlmacen, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
    					.addGap(34)))
                       
                        
                        
                        
                        
                        
                        
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    					.addGroup(groupLayout.createSequentialGroup()
    						.addComponent(btnNewButton_1)
    						.addContainerGap())
    					.addGroup(groupLayout.createSequentialGroup()
    						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
    						.addContainerGap()))
    				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
    					.addComponent(lblColor, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
    					.addGap(37))))
    );
    groupLayout.setVerticalGroup(
    	groupLayout.createParallelGroup(Alignment.LEADING)
    		.addGroup(groupLayout.createSequentialGroup()
    			.addContainerGap()
    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    				.addComponent(lblciudadAlmacen)
    				.addComponent(lblAlmacen, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
    				.addComponent(lblReferencia)
                                    				.addComponent(lblCategoria)
                                    				.addComponent(lblnumeracion)
                                                                    				.addComponent(lblpCosto)


    				.addComponent(lblColor))
    			.addGap(4)
    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    				.addComponent(textReft, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                               .addComponent(textCategoria, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                               .addComponent(textNumeracion, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                               .addComponent(textPrecioCosto, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)

    				.addComponent(txtAlmacen, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
    				.addComponent(textCodigoProveedor, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
    				.addComponent(textField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
    			.addPreferredGap(ComponentPlacement.RELATED)
    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    				.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
    				.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
    );
    getContentPane().setLayout(groupLayout);
    pack( );
    setLocationRelativeTo( null );
    setDefaultCloseOperation( DISPOSE_ON_CLOSE );

}

/**
 * M�todo que recoge las acciones sobre los objetos que est� escuchando.
 * @param e Evento que se realiz�.
 */
public void actionPerformed( ActionEvent e )
{
  if( e.getActionCommand( ).equals( AGREGAR ) )
    {
    	
    	/**
    	 * try
            {

                String transaccionSeleccionada;
                if( radioRetiro.isSelected( ) )
                    transaccionSeleccionada = Banco.RETIRO;
                else if( radioConsignacion.isSelected( ) )
                    transaccionSeleccionada = Banco.CONSIGNACION;
                else
                    transaccionSeleccionada = Banco.PAGO_SERVICIO;

                int id = Integer.valueOf( txtId.getText( ) ).intValue( );
                int montoInicial = Integer.valueOf( txtDineroInicial.getText( ) ).intValue( );
                principal.agregarCaja( id, transaccionSeleccionada, montoInicial );
                setVisible( false );
                dispose( );
            }
            catch( NumberFormatException e1 )
            {
                JOptionPane.showMessageDialog( this, "Error en el formato de la identificaci�n", "Agregar Caja", JOptionPane.ERROR_MESSAGE );
            }
    	 */
        try
        {
        	
          String referencia = textReft.getText();
          String codigoProveedor = textCodigoProveedor.getText();
          String codigoAlmacen = txtAlmacen.getText();
          String color = textField.getText();
          String categoria = textCategoria.getText();
          String numeracion = textNumeracion.getText();
          int precioCosto = Integer.parseInt(textPrecioCosto.getText());
          
                if(  numeracion.equals("") ||  numeracion.equals(" "))
                {
                numeracion = "0";
                }          



        principal.eliminar(referencia, codigoProveedor,codigoAlmacen, color,categoria,numeracion,precioCosto);
           
            setVisible( false );
            dispose( );
        }
        catch( NumberFormatException e1 )
        {
            JOptionPane.showMessageDialog( this, "Error en el formulario", "Eliminar Zapato", JOptionPane.ERROR_MESSAGE );
        }
    }

}
}
