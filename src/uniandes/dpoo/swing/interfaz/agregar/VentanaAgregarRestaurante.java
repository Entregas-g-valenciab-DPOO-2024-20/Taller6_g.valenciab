package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal;
import uniandes.dpoo.swing.mundo.Restaurante;

@SuppressWarnings("serial")
public class VentanaAgregarRestaurante extends JFrame
{
    /**
     * El panel donde se editan los detalles del restaurante
     */
    private PanelEditarRestaurante panelDetalles;

    /**
     * El panel con los botones para agregar un restaurante o cerrar la ventana
     */
    private PanelBotonesAgregar panelBotones;

    /**
     * El panel para marcar la ubicación del restaurante
     */
    private PanelMapaAgregar panelMapa;

    /**
     * La ventana principal de la aplicación
     */
    private VentanaPrincipal ventanaPrincipal;

    public VentanaAgregarRestaurante( VentanaPrincipal principal )
    {
        this.ventanaPrincipal = principal;
        setLayout( new BorderLayout( ) );

        // Agrega el panel donde va a estar el mapa
        // TODO completar

        // Agrega en el sur un panel para los detalles del restaurante y para los botones
        // TODO completar
        this.ventanaPrincipal = principal;
        setTitle("Agregar Nuevo Restaurante");
        setLayout(new BorderLayout());

        // Agregar el panel del mapa al centro
        panelMapa = new PanelMapaAgregar();
        add(panelMapa, BorderLayout.CENTER);

        // Crear panel para detalles y botones
        JPanel panelSur = new JPanel(new BorderLayout());

        panelDetalles = new PanelEditarRestaurante();
        panelSur.add(panelDetalles, BorderLayout.CENTER);

        panelBotones = new PanelBotonesAgregar(this);
        panelSur.add(panelBotones, BorderLayout.SOUTH);

        add(panelSur, BorderLayout.SOUTH);

        // Termina de configurar la ventana
        pack( );
        setLocationRelativeTo( null );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setResizable( false );
    }

    /**
     * Le pide al panelDetalles los datos del nuevo restaurante y se los envía a la ventana principal para que cree el nuevo restaurante, y luego cierra la ventana.
     */
    public void agregarRestaurante( )
    {
        // TODO completar
    	 String nombre = panelDetalles.getNombre();

         // Obtener la calificación seleccionada
         int calificacion = panelDetalles.getCalificacion();

         // Obtener coordenadas del mapa
         int[] coordenadas = panelMapa.getCoordenadas();
         
         Restaurante nuevoRestaurante = new Restaurante(nombre, calificacion, coordenadas[0], coordenadas[1], false);

    }

    /**
     * Cierra la ventana sin crear un nuevo restaurante
     */
    public void cerrarVentana( )
    {
        dispose( );
    }

}
