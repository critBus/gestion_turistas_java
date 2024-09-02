package Viajes_Turisticos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.objects.NativeString;
import proyecto_vt.Proyecto_VT;
import utiles.NoCellEditableTableModel;
import utiles.UtilesArchivo;
import utiles.UtilesTablas;

/**
 *
 * @author Yanisey
 */
public class Pag1 extends javax.swing.JFrame {

    public static DefaultTableModel modeloViajes;
    private int filaSeleccionadaViajes;
    public static DefaultTableModel modeloCubano;
    public static DefaultTableModel modeloExtranjero;
    private int filaSeleccionadaEC;
    private int filaSeleccionadaVehiculo;
    public static DefaultTableModel modeloPanel;
    public static DefaultTableModel modeloTaxi;
    public static DefaultTableModel modeloAutobus;
//    private Excursion excursion;
//    private Excursion[] listaDeExcursiones;
    private int cantReal;
    DefaultListModel<String> model;

    DefaultTableModel modeloRecaudacionViajes;
    DefaultTableModel modeloViajesAutobus;

    public Pag1() {

        initComponents();
        // Guardar Viajes 
        modeloViajes = new NoCellEditableTableModel();
        modeloViajes.addColumn(" Numero del viaje ");
        modeloViajes.addColumn(" Cantidad de personas ");
        modeloViajes.addColumn(" Vehiculo utilizado ");
        modeloViajes.addColumn(" Precio Basico del viaje ");
        modeloViajes.addColumn(" Nombre del guia ");
        modeloViajes.addColumn(" Hotel o Centro Recreativo ");
        modeloViajes.addColumn(" Turistas ");
        modeloViajes.addColumn(" Excursión ");
        modeloViajes.addColumn(" Combustible ");
        this.TablaDeViaje.setModel(modeloViajes);

        // Guardar Cubano
        modeloCubano = new DefaultTableModel();
        modeloCubano.addColumn(" Nombre ");
        modeloCubano.addColumn(" Carné de identidad ");
        modeloCubano.addColumn(" Sexo ");
        modeloCubano.addColumn(" Precio Basico del autobus ");
        modeloCubano.addColumn(" Direccion ");
        modeloCubano.addColumn(" ¿Ha viajado antes en Transtur? ");
        this.TablaCubano.setModel(modeloCubano);

        // Guardar Extranjeros
        modeloExtranjero = new DefaultTableModel();
        modeloExtranjero.addColumn(" Nombre ");
        modeloExtranjero.addColumn(" Pais de origen ");
        modeloExtranjero.addColumn(" DNI ");
        modeloExtranjero.addColumn(" Sexo ");
        modeloExtranjero.addColumn(" Precio Basico del autobus ");
        modeloExtranjero.addColumn(" Nacionalidad ");
        modeloExtranjero.addColumn(" Numero de pasaporte ");
        modeloExtranjero.addColumn(" ¿Ha viajado antes en Transtur? ");
        this.TablaExtranjero.setModel(modeloExtranjero);

        //GuardarPanel
        modeloPanel = new DefaultTableModel();
        modeloPanel.addColumn(" Chapa ");
        modeloPanel.addColumn(" Capacidad ");
        modeloPanel.addColumn(" Tipo de combustible ");
        modeloPanel.addColumn(" Nombre del chofer ");
        this.TablaPanel.setModel(modeloPanel);

        //GuardarTaxi
        modeloTaxi = new DefaultTableModel();
        modeloTaxi.addColumn(" Chapa ");
        modeloTaxi.addColumn(" Capacidad ");
        modeloTaxi.addColumn(" Tipo de combustible ");
        modeloTaxi.addColumn(" Nombre del chofer ");
        modeloTaxi.addColumn(" Marca ");
        this.TablaTaxi.setModel(modeloTaxi);

        //GuardarAutobus
        modeloAutobus = new DefaultTableModel();
        modeloAutobus.addColumn(" Chapa ");
        modeloAutobus.addColumn(" Capacidad ");
        modeloAutobus.addColumn(" Fecha del próximo mantenimiento ");
        modeloAutobus.addColumn(" Tipo de combustible ");
        modeloAutobus.addColumn(" Cantidad de mantenimientos ");
        modeloAutobus.addColumn(" Nombre del chofer ");
        this.TablaAutobus.setModel(modeloAutobus);

        modeloRecaudacionViajes = new NoCellEditableTableModel();
        modeloRecaudacionViajes.addColumn(" Numero del viaje ");
        modeloRecaudacionViajes.addColumn(" Recaudación ");
        this.TablaOrdenRecaudacion.setModel(modeloRecaudacionViajes);

        modeloViajesAutobus = new NoCellEditableTableModel();
        modeloViajesAutobus.addColumn(" Numero del viaje ");
        modeloViajesAutobus.addColumn(" Vehiculo utilizado ");
        this.TablaDestinosAutobus.setModel(modeloViajesAutobus);

        getEmpresa().getDatosEnTabla().actualizarLasTablas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Content = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        PanelViajes = new javax.swing.JTabbedPane();
        Viaje = new javax.swing.JPanel();
        Viajes = new javax.swing.JLabel();
        NumeroDeViaje = new javax.swing.JLabel();
        IngreseNumeroViaje = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CantidadDePersonaViaje = new javax.swing.JLabel();
        IngreseCantidadDePersonasViaje = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        VehiculoViaje = new javax.swing.JLabel();
        ComboViaje = new javax.swing.JComboBox<>();
        PrecioBasicoViaje = new javax.swing.JLabel();
        IngresePrecioBasicoViaje = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        NombreDelGuiaViaje = new javax.swing.JLabel();
        IngreseNombreGuiaViaje = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        HotelCentroRecreativoViaje = new javax.swing.JLabel();
        IngreseHotelCentroRecreativoViaje = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        ModificarViaje = new javax.swing.JButton();
        GuardarViaje = new javax.swing.JButton();
        VehiculoViaje1 = new javax.swing.JLabel();
        CBSonTuristas = new javax.swing.JCheckBox();
        CBEsUnaExcurcion = new javax.swing.JCheckBox();
        VehiculoViaje2 = new javax.swing.JLabel();
        CBXCombustibleViajes = new javax.swing.JComboBox<>();
        TipoDeCombustibleTaxi1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeViaje = new javax.swing.JTable();
        EditarViajes = new javax.swing.JButton();
        EliminarViajes = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        RecaudacionViajes1 = new javax.swing.JLabel();
        RecaudacionClientesNacionales = new javax.swing.JLabel();
        RecaudacionClientesInternacionales = new javax.swing.JLabel();
        MostarR = new javax.swing.JLabel();
        TCantidadRecaudacionViajes = new javax.swing.JLabel();
        TCantidadRecaudacionClientesNacionales = new javax.swing.JLabel();
        TCantidadRecaudacionClientesExtranjeros = new javax.swing.JLabel();
        BCalcularUtilesViajes = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TCantidadTuristasEnViajes = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        THotelMasPopular = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TVehiculosCondieselEnViajes = new javax.swing.JLabel();
        TVehiculosconGasolinaEnViajes = new javax.swing.JLabel();
        RecaudacionViajes3 = new javax.swing.JLabel();
        TCantidadRecaudacionExcursiones = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        TCantidadTuristasEnExcursiones = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        NombreDelGuiaViaje2 = new javax.swing.JLabel();
        IngreseNombreGuiaUtilesViaje = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        BCalcularCantidadDeViajesGuia = new javax.swing.JButton();
        jSeparator38 = new javax.swing.JSeparator();
        TCantidadDeViajesGuia = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        NumeroDeViaje1 = new javax.swing.JLabel();
        IngreseNumeroViajeBuscarViaje = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        RecaudacionViajes2 = new javax.swing.JLabel();
        TCantidadDePersonasBuscarViaje = new javax.swing.JLabel();
        RecaudacionClientesNacionales1 = new javax.swing.JLabel();
        TVehiculoBuscarViaje = new javax.swing.JLabel();
        RecaudacionClientesInternacionales1 = new javax.swing.JLabel();
        TPrecioBasicoBuscarViaje = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TNombreDeGuiaBuscarViaje = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        THotelOCentroBuscarViaje = new javax.swing.JLabel();
        BBuscarDatosViajes = new javax.swing.JButton();
        jSeparator40 = new javax.swing.JSeparator();
        CBSonTuristasUtilesviajes = new javax.swing.JCheckBox();
        CBEsUnaExcurcionUtilesviajes = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        TCombustibleBuscarViaje = new javax.swing.JLabel();
        ImprimirUtilesViajes = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        NombreDelGuiaViaje3 = new javax.swing.JLabel();
        InputCantidadDePersonasParaCantidadDeViajes = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        BCalcularCantidadDeViajesDeCantidadDeTuristas = new javax.swing.JButton();
        jSeparator42 = new javax.swing.JSeparator();
        TCantidadDeViajesPorCantidadDePersonas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaOrdenRecaudacion = new javax.swing.JTable();
        CalcularOrdenRecaudacion = new javax.swing.JButton();
        ImprimirOrdenRecaudacion1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaDestinosAutobus = new javax.swing.JTable();
        ActualizarTablaDestinosAutobus = new javax.swing.JButton();
        ImprimirTablaDestinosAutobus = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        PanelCubano = new javax.swing.JPanel();
        Cubano = new javax.swing.JLabel();
        NombreCubano = new javax.swing.JLabel();
        IngreseNombreCubano = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        CarneDeIdentidadCubano = new javax.swing.JLabel();
        IngreseCarneDeIdentidadCubano = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        SexoCubano = new javax.swing.JLabel();
        IngreseSexoCubano = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        ComboSexoCubano = new javax.swing.JComboBox<>();
        PrecioBasicoCubano = new javax.swing.JLabel();
        IngresePrecioBasicoCubano = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        DireccionCubano = new javax.swing.JLabel();
        IngreseDireccionCubano = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        HaViajadoAntesCubano = new javax.swing.JLabel();
        ComboHaViajadoAntesCubano = new javax.swing.JComboBox<>();
        IngreseHaViajadoAntesCubano = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        ModificarCubano = new javax.swing.JButton();
        GuardarCuabano = new javax.swing.JButton();
        PanelExtranjero = new javax.swing.JPanel();
        Extranjero = new javax.swing.JLabel();
        NombreExtranjero = new javax.swing.JLabel();
        IngreseNombreExtranjero = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        PaisDeOrigenExtranjero = new javax.swing.JLabel();
        IngresePaisDeOrigenExtranjero = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        DNIExtranjero = new javax.swing.JLabel();
        IngreseDNIExtranjero = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        SexoExtranjero = new javax.swing.JLabel();
        IngreseSexoExtranjero = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        ModificarExtranjero = new javax.swing.JButton();
        PrecioBasicoExtranjero = new javax.swing.JLabel();
        IngresePrecioBasicoExtranjero = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        ComboSexoExtranjero = new javax.swing.JComboBox<>();
        NacionalidadExtranjero = new javax.swing.JLabel();
        IngreseNacionalidadExtranjero = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        NumeroPasaporteExtranjero = new javax.swing.JLabel();
        IngreseNumeroPasaporteExtranjero = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        HaViajadoAntesExtranjero = new javax.swing.JLabel();
        IngreseHaViajadoAntesTransturExtranjero = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        ComboHaViajadoAntesExtranjero = new javax.swing.JComboBox<>();
        GuardarExtranjero = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCubano = new javax.swing.JTable();
        EditarCubano = new javax.swing.JButton();
        EliminarCubano = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaExtranjero = new javax.swing.JTable();
        EditarExtranjero = new javax.swing.JButton();
        EliminarExtranjero = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        PanelPanel = new javax.swing.JPanel();
        Panel = new javax.swing.JLabel();
        ChapaPanel = new javax.swing.JLabel();
        IngreseChapaPanel = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        CapacidadPanel = new javax.swing.JLabel();
        IngreseCapacidadPanel = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        TipoDeCombustiblePanel = new javax.swing.JLabel();
        IngreseTipoDeCombustiblePanel = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        ModificarPanel = new javax.swing.JButton();
        NombreDelChoferPanel = new javax.swing.JLabel();
        IngreseNombreDelChoferPanel = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        GuardarPanel = new javax.swing.JButton();
        PanelTaxi = new javax.swing.JPanel();
        Taxi = new javax.swing.JLabel();
        ChapaTaxi = new javax.swing.JLabel();
        IngreseChapaTaxi = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        CapacidadTaxi = new javax.swing.JLabel();
        IngreseCapacidadTaxi = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        TipoDeCombustibleTaxi = new javax.swing.JLabel();
        IngreseTipoDeCombustibleTaxi = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        ComboTaxi = new javax.swing.JComboBox<>();
        NombreDelChoferTaxi = new javax.swing.JLabel();
        IngreseNombreDelChoferTaxi = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        MarcaTaxi = new javax.swing.JLabel();
        IngreseMarcaTaxi = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        ModificarTaxi = new javax.swing.JButton();
        GuardarTaxi = new javax.swing.JButton();
        PanelAutobus = new javax.swing.JPanel();
        Autobus = new javax.swing.JLabel();
        ChapaAutobus = new javax.swing.JLabel();
        IngreseChapaAutobus = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        CapacidadAutobus = new javax.swing.JLabel();
        IngreseCapacidadAutobus = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        TipoDeCombustibleAutobus = new javax.swing.JLabel();
        IngreseTipoDeCombustibleAutobus = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        ComboAutobus = new javax.swing.JComboBox<>();
        NombreDelChoferAutobus = new javax.swing.JLabel();
        IngreseNombreDelChoferAutobus = new javax.swing.JTextField();
        jSeparator34 = new javax.swing.JSeparator();
        CantidadDeMantenimientos = new javax.swing.JLabel();
        IngreseCantidadDeMantenimientosAutobus = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        FechaDelProximoMantenimiento = new javax.swing.JLabel();
        IngreseFechaDelProximoMantenimientoAutobus = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        ModificarAutobus = new javax.swing.JButton();
        GuardarAutobus = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaPanel = new javax.swing.JTable();
        EditarPanel = new javax.swing.JButton();
        EliminarPanel = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaTaxi = new javax.swing.JTable();
        EditarTaxi = new javax.swing.JButton();
        EliminarTaxi = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaAutobus = new javax.swing.JTable();
        EditarAutobus = new javax.swing.JButton();
        EliminarAutobus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Content.setBackground(new java.awt.Color(255, 255, 255));
        Content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel21MouseMoved(evt);
            }
        });
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel21MouseExited(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Viajes.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel23.setText("Viajes");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel22MouseMoved(evt);
            }
        });
        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel22MouseExited(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel24.setText("Clientes");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Cliente2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel23MouseMoved(evt);
            }
        });
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel23MouseExited(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Auto.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel26.setText("Vehículos");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel24MouseMoved(evt);
            }
        });
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel24MouseExited(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Principal.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel27.setText("Principal");
        jLabel27.setToolTipText("");
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel27)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        Content.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 660));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        Content.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 840, 140));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseMoved(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseExited(evt);
            }
        });

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelPrincipalMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel1.setText("¡Bienvenido a Transtur!");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel2.setText("¿Qué es Transtur?");

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setText("Transtur es una empresa líder en el sector del transporte, compremetida en brindarte soluciones");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel6.setText("brindarte soluciones eficientes y seguras para todos tus viajes. Con años de experiencia, hemos");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel4.setText("desarrollados una plataforma integral que facilita la organización y administración de tus ");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel5.setText("de transporte.");

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel7.setText("¿Qué puedes hacer en nuestra aplicación?");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel8.setText("-Registrar viajes");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel9.setText("-Gestión de clientes");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel10.setText("-Administrar Vehículos");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/nuevo9.png"))); // NOI18N

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(268, 268, 268))))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(348, 348, 348))
        );

        jTabbedPane1.addTab("Principal ", PanelPrincipal);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        PanelViajes.setBackground(new java.awt.Color(255, 255, 255));
        PanelViajes.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                PanelViajesCaretPositionChanged(evt);
            }
        });

        Viaje.setBackground(new java.awt.Color(255, 255, 255));

        Viajes.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        Viajes.setText("Viajes");

        NumeroDeViaje.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NumeroDeViaje.setText("Número del Viaje");

        IngreseNumeroViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNumeroViaje.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNumeroViaje.setText("Ingrese número del viaje");
        IngreseNumeroViaje.setBorder(null);
        IngreseNumeroViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNumeroViajeMousePressed(evt);
            }
        });
        IngreseNumeroViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreseNumeroViajeActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        CantidadDePersonaViaje.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        CantidadDePersonaViaje.setText("Cantidad de Personas");

        IngreseCantidadDePersonasViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseCantidadDePersonasViaje.setForeground(new java.awt.Color(153, 153, 153));
        IngreseCantidadDePersonasViaje.setText("Ingrese Cantidad de personas");
        IngreseCantidadDePersonasViaje.setBorder(null);
        IngreseCantidadDePersonasViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseCantidadDePersonasViajeMousePressed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        VehiculoViaje.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        VehiculoViaje.setText("Vehículo ");

        ComboViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        ComboViaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Taxi", "Autobus", "Panel", "" }));
        ComboViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboViajeActionPerformed(evt);
            }
        });

        PrecioBasicoViaje.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        PrecioBasicoViaje.setText("Precio Básico");

        IngresePrecioBasicoViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngresePrecioBasicoViaje.setForeground(new java.awt.Color(153, 153, 153));
        IngresePrecioBasicoViaje.setText("Ingrese precio básico");
        IngresePrecioBasicoViaje.setBorder(null);
        IngresePrecioBasicoViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresePrecioBasicoViajeMousePressed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        NombreDelGuiaViaje.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreDelGuiaViaje.setText("Nombre del Guía");

        IngreseNombreGuiaViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNombreGuiaViaje.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNombreGuiaViaje.setText("Ingrese nombre del guía");
        IngreseNombreGuiaViaje.setBorder(null);
        IngreseNombreGuiaViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNombreGuiaViajeMousePressed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        HotelCentroRecreativoViaje.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        HotelCentroRecreativoViaje.setText("Hotel o Centro Recreativo");

        IngreseHotelCentroRecreativoViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseHotelCentroRecreativoViaje.setForeground(new java.awt.Color(153, 153, 153));
        IngreseHotelCentroRecreativoViaje.setText("Ingrese Hotel o Centro Recreativo");
        IngreseHotelCentroRecreativoViaje.setBorder(null);
        IngreseHotelCentroRecreativoViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseHotelCentroRecreativoViajeMousePressed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        ModificarViaje.setBackground(new java.awt.Color(0, 153, 255));
        ModificarViaje.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ModificarViaje.setForeground(new java.awt.Color(255, 255, 255));
        ModificarViaje.setText("Modificar");
        ModificarViaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ModificarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarViajeActionPerformed(evt);
            }
        });

        GuardarViaje.setBackground(new java.awt.Color(0, 153, 255));
        GuardarViaje.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        GuardarViaje.setForeground(new java.awt.Color(255, 255, 255));
        GuardarViaje.setText("Guardar");
        GuardarViaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GuardarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarViajeActionPerformed(evt);
            }
        });

        VehiculoViaje1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        VehiculoViaje1.setText("Son Turistas");

        VehiculoViaje2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        VehiculoViaje2.setText("Es una Excursión ");

        CBXCombustibleViajes.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        CBXCombustibleViajes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel" }));
        CBXCombustibleViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXCombustibleViajesActionPerformed(evt);
            }
        });

        TipoDeCombustibleTaxi1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        TipoDeCombustibleTaxi1.setText("Tipo de Combustible");

        javax.swing.GroupLayout ViajeLayout = new javax.swing.GroupLayout(Viaje);
        Viaje.setLayout(ViajeLayout);
        ViajeLayout.setHorizontalGroup(
            ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViajeLayout.createSequentialGroup()
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViajeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ModificarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViajeLayout.createSequentialGroup()
                        .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViajeLayout.createSequentialGroup()
                                .addComponent(VehiculoViaje1)
                                .addGap(18, 18, 18)
                                .addComponent(CBSonTuristas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViajeLayout.createSequentialGroup()
                                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ViajeLayout.createSequentialGroup()
                                        .addComponent(TipoDeCombustibleTaxi1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(CBXCombustibleViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CantidadDePersonaViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IngreseCantidadDePersonasViaje, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IngreseNumeroViaje, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViajeLayout.createSequentialGroup()
                                        .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Viajes, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NumeroDeViaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViajeLayout.createSequentialGroup()
                                        .addComponent(VehiculoViaje)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(80, 80, 80)))
                        .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngresePrecioBasicoViaje)
                            .addComponent(IngreseNombreGuiaViaje)
                            .addComponent(HotelCentroRecreativoViaje, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                            .addComponent(jSeparator6)
                            .addComponent(IngreseHotelCentroRecreativoViaje)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator4)
                            .addGroup(ViajeLayout.createSequentialGroup()
                                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViajeLayout.createSequentialGroup()
                                        .addComponent(VehiculoViaje2)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBEsUnaExcurcion))
                                    .addComponent(PrecioBasicoViaje)
                                    .addComponent(NombreDelGuiaViaje))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        ViajeLayout.setVerticalGroup(
            ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViajeLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Viajes)
                .addGap(10, 10, 10)
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ViajeLayout.createSequentialGroup()
                        .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumeroDeViaje)
                            .addComponent(PrecioBasicoViaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IngreseNumeroViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresePrecioBasicoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CantidadDePersonaViaje))
                    .addComponent(NombreDelGuiaViaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseCantidadDePersonasViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseNombreGuiaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VehiculoViaje)
                    .addComponent(ComboViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HotelCentroRecreativoViaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViajeLayout.createSequentialGroup()
                        .addComponent(IngreseHotelCentroRecreativoViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViajeLayout.createSequentialGroup()
                        .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoDeCombustibleTaxi1)
                            .addComponent(CBXCombustibleViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CBSonTuristas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VehiculoViaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CBEsUnaExcurcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VehiculoViaje2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(ViajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GuardarViaje, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(ModificarViaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        PanelViajes.addTab("Guardar", Viaje);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        TablaDeViaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaDeViaje);

        EditarViajes.setBackground(new java.awt.Color(0, 153, 255));
        EditarViajes.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EditarViajes.setForeground(new java.awt.Color(255, 255, 255));
        EditarViajes.setText("Editar");
        EditarViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditarViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarViajesActionPerformed(evt);
            }
        });

        EliminarViajes.setBackground(new java.awt.Color(0, 153, 255));
        EliminarViajes.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EliminarViajes.setForeground(new java.awt.Color(255, 255, 255));
        EliminarViajes.setText("Eliminar");
        EliminarViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EliminarViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarViajesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        PanelViajes.addTab("TablaViajes", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        RecaudacionViajes1.setText("Recaudacion Viajes");

        RecaudacionClientesNacionales.setText("Recaudacion Clientes Nacionales");

        RecaudacionClientesInternacionales.setText("Recaudacion Clientes Extranjeros");

        TCantidadRecaudacionViajes.setText("---------");

        TCantidadRecaudacionClientesNacionales.setText("---------");

        TCantidadRecaudacionClientesExtranjeros.setText("---------");

        BCalcularUtilesViajes.setBackground(new java.awt.Color(0, 153, 255));
        BCalcularUtilesViajes.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        BCalcularUtilesViajes.setForeground(new java.awt.Color(255, 255, 255));
        BCalcularUtilesViajes.setText("Calcular");
        BCalcularUtilesViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BCalcularUtilesViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCalcularUtilesViajesActionPerformed(evt);
            }
        });

        jLabel12.setText("Total Turistas en Viajes");

        TCantidadTuristasEnViajes.setText("---------");

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Mas Popular ");

        THotelMasPopular.setText("---------");

        jLabel14.setText("Vehículos con Diesel usados");

        jLabel28.setText("Vehículos con Gasolina usados");

        TVehiculosCondieselEnViajes.setText("---------");

        TVehiculosconGasolinaEnViajes.setText("---------");

        RecaudacionViajes3.setText("Recaudacion Excursiones ");

        TCantidadRecaudacionExcursiones.setText("---------");

        jLabel31.setText("Total Turistas en Excursiones ");

        TCantidadTuristasEnExcursiones.setText("---------");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BCalcularUtilesViajes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(MostarR, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecaudacionClientesInternacionales)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(RecaudacionViajes1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RecaudacionClientesNacionales, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel12)
                            .addComponent(RecaudacionViajes3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TCantidadRecaudacionViajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TCantidadTuristasEnViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TCantidadRecaudacionClientesNacionales, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TCantidadRecaudacionClientesExtranjeros, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TCantidadRecaudacionExcursiones, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(398, 398, 398))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TCantidadTuristasEnExcursiones, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(THotelMasPopular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TVehiculosCondieselEnViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TVehiculosconGasolinaEnViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecaudacionViajes3)
                    .addComponent(TCantidadRecaudacionExcursiones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecaudacionViajes1)
                    .addComponent(TCantidadRecaudacionViajes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecaudacionClientesNacionales)
                    .addComponent(TCantidadRecaudacionClientesNacionales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecaudacionClientesInternacionales)
                    .addComponent(TCantidadRecaudacionClientesExtranjeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TCantidadTuristasEnViajes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(TCantidadTuristasEnExcursiones))
                .addGap(2, 2, 2)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(THotelMasPopular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TVehiculosCondieselEnViajes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(TVehiculosconGasolinaEnViajes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BCalcularUtilesViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(MostarR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NombreDelGuiaViaje2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreDelGuiaViaje2.setText("Nombre del Guía");

        IngreseNombreGuiaUtilesViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNombreGuiaUtilesViaje.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNombreGuiaUtilesViaje.setText("Ingrese nombre del guía");
        IngreseNombreGuiaUtilesViaje.setBorder(null);
        IngreseNombreGuiaUtilesViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNombreGuiaUtilesViajeMousePressed(evt);
            }
        });

        jSeparator37.setForeground(new java.awt.Color(0, 0, 0));

        BCalcularCantidadDeViajesGuia.setBackground(new java.awt.Color(0, 153, 255));
        BCalcularCantidadDeViajesGuia.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        BCalcularCantidadDeViajesGuia.setForeground(new java.awt.Color(255, 255, 255));
        BCalcularCantidadDeViajesGuia.setText("Calcular Excursiones ");
        BCalcularCantidadDeViajesGuia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BCalcularCantidadDeViajesGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCalcularCantidadDeViajesGuiaActionPerformed(evt);
            }
        });

        jSeparator38.setForeground(new java.awt.Color(255, 255, 255));

        TCantidadDeViajesGuia.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        TCantidadDeViajesGuia.setText("--------------");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IngreseNombreGuiaUtilesViaje)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NombreDelGuiaViaje2)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator38, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BCalcularCantidadDeViajesGuia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TCantidadDeViajesGuia)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(NombreDelGuiaViaje2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IngreseNombreGuiaUtilesViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCalcularCantidadDeViajesGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TCantidadDeViajesGuia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NumeroDeViaje1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NumeroDeViaje1.setText("Número del Viaje");

        IngreseNumeroViajeBuscarViaje.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNumeroViajeBuscarViaje.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNumeroViajeBuscarViaje.setText("Ingrese número del viaje");
        IngreseNumeroViajeBuscarViaje.setBorder(null);
        IngreseNumeroViajeBuscarViaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNumeroViajeBuscarViajeMousePressed(evt);
            }
        });
        IngreseNumeroViajeBuscarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreseNumeroViajeBuscarViajeActionPerformed(evt);
            }
        });

        jSeparator39.setForeground(new java.awt.Color(0, 0, 0));

        RecaudacionViajes2.setText("Cantidad De Personas");

        TCantidadDePersonasBuscarViaje.setText("---------");

        RecaudacionClientesNacionales1.setText("Vehículo ");

        TVehiculoBuscarViaje.setText("---------");

        RecaudacionClientesInternacionales1.setText("Precio Básico ");

        TPrecioBasicoBuscarViaje.setText("---------");

        jLabel29.setText("Nombre de Guía ");

        TNombreDeGuiaBuscarViaje.setText("---------");

        jLabel30.setText("Hotel o Centro Recreativo ");

        THotelOCentroBuscarViaje.setText("---------");

        BBuscarDatosViajes.setBackground(new java.awt.Color(0, 153, 255));
        BBuscarDatosViajes.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        BBuscarDatosViajes.setForeground(new java.awt.Color(255, 255, 255));
        BBuscarDatosViajes.setText("Buscar");
        BBuscarDatosViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BBuscarDatosViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBuscarDatosViajesActionPerformed(evt);
            }
        });

        jSeparator40.setForeground(new java.awt.Color(255, 255, 255));

        CBSonTuristasUtilesviajes.setText("Son Turistas");
        CBSonTuristasUtilesviajes.setEnabled(false);

        CBEsUnaExcurcionUtilesviajes.setText("Es una Excursión ");
        CBEsUnaExcurcionUtilesviajes.setEnabled(false);

        jLabel32.setText("Combustible");

        TCombustibleBuscarViaje.setText("---------");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(RecaudacionViajes2)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TCantidadDePersonasBuscarViaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(TVehiculoBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(CBSonTuristasUtilesviajes)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecaudacionClientesNacionales1)
                            .addComponent(NumeroDeViaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngreseNumeroViajeBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel32)
                                                .addComponent(jLabel30))
                                            .addGap(31, 31, 31)
                                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(TCombustibleBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(THotelOCentroBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel15Layout.createSequentialGroup()
                                                .addComponent(RecaudacionClientesInternacionales1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TPrecioBasicoBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                                .addGap(178, 178, 178)
                                                .addComponent(TNombreDeGuiaBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBEsUnaExcurcionUtilesviajes, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator40, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BBuscarDatosViajes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(NumeroDeViaje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngreseNumeroViajeBuscarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecaudacionViajes2)
                    .addComponent(TCantidadDePersonasBuscarViaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RecaudacionClientesNacionales1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TVehiculoBuscarViaje)
                                .addComponent(CBSonTuristasUtilesviajes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RecaudacionClientesInternacionales1)
                            .addComponent(TPrecioBasicoBuscarViaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(TNombreDeGuiaBuscarViaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(THotelOCentroBuscarViaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(TCombustibleBuscarViaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BBuscarDatosViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(CBEsUnaExcurcionUtilesviajes)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        ImprimirUtilesViajes.setBackground(new java.awt.Color(0, 153, 255));
        ImprimirUtilesViajes.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ImprimirUtilesViajes.setForeground(new java.awt.Color(255, 255, 255));
        ImprimirUtilesViajes.setText("Imprimir");
        ImprimirUtilesViajes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ImprimirUtilesViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirUtilesViajesActionPerformed(evt);
            }
        });

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NombreDelGuiaViaje3.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreDelGuiaViaje3.setText("Cantidad De Excursiones ");

        InputCantidadDePersonasParaCantidadDeViajes.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        InputCantidadDePersonasParaCantidadDeViajes.setForeground(new java.awt.Color(153, 153, 153));
        InputCantidadDePersonasParaCantidadDeViajes.setText("Ingrese la cantidad de personas");
        InputCantidadDePersonasParaCantidadDeViajes.setBorder(null);
        InputCantidadDePersonasParaCantidadDeViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InputCantidadDePersonasParaCantidadDeViajesMousePressed(evt);
            }
        });

        jSeparator41.setForeground(new java.awt.Color(0, 0, 0));

        BCalcularCantidadDeViajesDeCantidadDeTuristas.setBackground(new java.awt.Color(0, 153, 255));
        BCalcularCantidadDeViajesDeCantidadDeTuristas.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        BCalcularCantidadDeViajesDeCantidadDeTuristas.setForeground(new java.awt.Color(255, 255, 255));
        BCalcularCantidadDeViajesDeCantidadDeTuristas.setText("Calcular Viajes");
        BCalcularCantidadDeViajesDeCantidadDeTuristas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BCalcularCantidadDeViajesDeCantidadDeTuristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCalcularCantidadDeViajesDeCantidadDeTuristasActionPerformed(evt);
            }
        });

        jSeparator42.setForeground(new java.awt.Color(255, 255, 255));

        TCantidadDeViajesPorCantidadDePersonas.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        TCantidadDeViajesPorCantidadDePersonas.setText("--------------");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(InputCantidadDePersonasParaCantidadDeViajes)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(NombreDelGuiaViaje3)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator41, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator42, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BCalcularCantidadDeViajesDeCantidadDeTuristas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TCantidadDeViajesPorCantidadDePersonas)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(NombreDelGuiaViaje3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputCantidadDePersonasParaCantidadDeViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator41, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BCalcularCantidadDeViajesDeCantidadDeTuristas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TCantidadDeViajesPorCantidadDePersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator42, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ImprimirUtilesViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 294, Short.MAX_VALUE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(ImprimirUtilesViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        PanelViajes.addTab("Utiles", jPanel9);

        TablaOrdenRecaudacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaOrdenRecaudacion.setPreferredSize(new java.awt.Dimension(453, 403));
        jScrollPane2.setViewportView(TablaOrdenRecaudacion);

        CalcularOrdenRecaudacion.setBackground(new java.awt.Color(0, 153, 255));
        CalcularOrdenRecaudacion.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        CalcularOrdenRecaudacion.setForeground(new java.awt.Color(255, 255, 255));
        CalcularOrdenRecaudacion.setText("Calcular");
        CalcularOrdenRecaudacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CalcularOrdenRecaudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularOrdenRecaudacionActionPerformed(evt);
            }
        });

        ImprimirOrdenRecaudacion1.setBackground(new java.awt.Color(0, 153, 255));
        ImprimirOrdenRecaudacion1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ImprimirOrdenRecaudacion1.setForeground(new java.awt.Color(255, 255, 255));
        ImprimirOrdenRecaudacion1.setText("Imprimir");
        ImprimirOrdenRecaudacion1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ImprimirOrdenRecaudacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirOrdenRecaudacion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CalcularOrdenRecaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ImprimirOrdenRecaudacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImprimirOrdenRecaudacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcularOrdenRecaudacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        PanelViajes.addTab("Orden Recaudación ", jPanel1);

        TablaDestinosAutobus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaDestinosAutobus.setPreferredSize(new java.awt.Dimension(453, 403));
        jScrollPane8.setViewportView(TablaDestinosAutobus);

        ActualizarTablaDestinosAutobus.setBackground(new java.awt.Color(0, 153, 255));
        ActualizarTablaDestinosAutobus.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ActualizarTablaDestinosAutobus.setForeground(new java.awt.Color(255, 255, 255));
        ActualizarTablaDestinosAutobus.setText("Actualizar Tabla");
        ActualizarTablaDestinosAutobus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ActualizarTablaDestinosAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarTablaDestinosAutobusActionPerformed(evt);
            }
        });

        ImprimirTablaDestinosAutobus.setBackground(new java.awt.Color(0, 153, 255));
        ImprimirTablaDestinosAutobus.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ImprimirTablaDestinosAutobus.setForeground(new java.awt.Color(255, 255, 255));
        ImprimirTablaDestinosAutobus.setText("Imprimir");
        ImprimirTablaDestinosAutobus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ImprimirTablaDestinosAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirTablaDestinosAutobusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ActualizarTablaDestinosAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ImprimirTablaDestinosAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImprimirTablaDestinosAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarTablaDestinosAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        PanelViajes.addTab("Destinos Autobús ", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(PanelViajes)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelViajes)
        );

        jTabbedPane1.addTab("Viajes", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));

        PanelCubano.setBackground(new java.awt.Color(255, 255, 255));

        Cubano.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        Cubano.setText("Cubano");

        NombreCubano.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreCubano.setText("Nombre");

        IngreseNombreCubano.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNombreCubano.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNombreCubano.setText("Ingrese nombre");
        IngreseNombreCubano.setBorder(null);
        IngreseNombreCubano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNombreCubanoMousePressed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        CarneDeIdentidadCubano.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        CarneDeIdentidadCubano.setText("Carné de Identidad");

        IngreseCarneDeIdentidadCubano.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseCarneDeIdentidadCubano.setForeground(new java.awt.Color(153, 153, 153));
        IngreseCarneDeIdentidadCubano.setText("Ingrese carné de identidad");
        IngreseCarneDeIdentidadCubano.setBorder(null);
        IngreseCarneDeIdentidadCubano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseCarneDeIdentidadCubanoMousePressed(evt);
            }
        });

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        SexoCubano.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        SexoCubano.setText("Sexo");

        IngreseSexoCubano.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseSexoCubano.setForeground(new java.awt.Color(153, 153, 153));
        IngreseSexoCubano.setText("Ingrese sexo");
        IngreseSexoCubano.setBorder(null);
        IngreseSexoCubano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseSexoCubanoMousePressed(evt);
            }
        });

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));

        ComboSexoCubano.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ComboSexoCubano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        ComboSexoCubano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSexoCubanoActionPerformed(evt);
            }
        });

        PrecioBasicoCubano.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        PrecioBasicoCubano.setText("Precio Básico");

        IngresePrecioBasicoCubano.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngresePrecioBasicoCubano.setForeground(new java.awt.Color(153, 153, 153));
        IngresePrecioBasicoCubano.setText("Ingrese precio básico");
        IngresePrecioBasicoCubano.setBorder(null);
        IngresePrecioBasicoCubano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresePrecioBasicoCubanoMousePressed(evt);
            }
        });

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));

        DireccionCubano.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        DireccionCubano.setText("Dirección");

        IngreseDireccionCubano.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseDireccionCubano.setForeground(new java.awt.Color(153, 153, 153));
        IngreseDireccionCubano.setText("Ingrese dirección");
        IngreseDireccionCubano.setBorder(null);
        IngreseDireccionCubano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseDireccionCubanoMousePressed(evt);
            }
        });

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));

        HaViajadoAntesCubano.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        HaViajadoAntesCubano.setText("¿Ha viajado antes en Transtur?");

        ComboHaViajadoAntesCubano.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ComboHaViajadoAntesCubano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        ComboHaViajadoAntesCubano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHaViajadoAntesCubanoActionPerformed(evt);
            }
        });

        IngreseHaViajadoAntesCubano.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseHaViajadoAntesCubano.setForeground(new java.awt.Color(153, 153, 153));
        IngreseHaViajadoAntesCubano.setText("Ingrese si ha viajado antes en Transtur");
        IngreseHaViajadoAntesCubano.setBorder(null);
        IngreseHaViajadoAntesCubano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseHaViajadoAntesCubanoMousePressed(evt);
            }
        });

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));

        ModificarCubano.setBackground(new java.awt.Color(0, 153, 255));
        ModificarCubano.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ModificarCubano.setForeground(new java.awt.Color(255, 255, 255));
        ModificarCubano.setText("Modificar");
        ModificarCubano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ModificarCubano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCubanoActionPerformed(evt);
            }
        });

        GuardarCuabano.setBackground(new java.awt.Color(0, 153, 255));
        GuardarCuabano.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        GuardarCuabano.setForeground(new java.awt.Color(255, 255, 255));
        GuardarCuabano.setText("Guardar");
        GuardarCuabano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GuardarCuabano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCuabanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCubanoLayout = new javax.swing.GroupLayout(PanelCubano);
        PanelCubano.setLayout(PanelCubanoLayout);
        PanelCubanoLayout.setHorizontalGroup(
            PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCubanoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCubanoLayout.createSequentialGroup()
                        .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cubano)
                            .addComponent(NombreCubano, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CarneDeIdentidadCubano)
                            .addComponent(IngreseCarneDeIdentidadCubano, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(IngreseSexoCubano)
                            .addGroup(PanelCubanoLayout.createSequentialGroup()
                                .addComponent(SexoCubano)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboSexoCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(IngreseNombreCubano, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(jSeparator8)
                            .addComponent(jSeparator9)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrecioBasicoCubano)
                            .addComponent(DireccionCubano)
                            .addComponent(HaViajadoAntesCubano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IngreseHaViajadoAntesCubano)
                            .addComponent(jSeparator13)
                            .addComponent(jSeparator11)
                            .addComponent(jSeparator12)
                            .addComponent(IngresePrecioBasicoCubano)
                            .addComponent(IngreseDireccionCubano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(ComboHaViajadoAntesCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(PanelCubanoLayout.createSequentialGroup()
                        .addComponent(ModificarCubano, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarCuabano, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        PanelCubanoLayout.setVerticalGroup(
            PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCubanoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Cubano)
                .addGap(10, 10, 10)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreCubano)
                    .addComponent(PrecioBasicoCubano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseNombreCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresePrecioBasicoCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CarneDeIdentidadCubano)
                    .addComponent(DireccionCubano))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseCarneDeIdentidadCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseDireccionCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HaViajadoAntesCubano)
                    .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SexoCubano)
                        .addComponent(ComboSexoCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboHaViajadoAntesCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseSexoCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseHaViajadoAntesCubano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCubanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModificarCubano, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarCuabano, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jTabbedPane3.addTab("GuardarCuabano", PanelCubano);

        PanelExtranjero.setBackground(new java.awt.Color(255, 255, 255));

        Extranjero.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        Extranjero.setText("Extranjero");

        NombreExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreExtranjero.setText("Nombre");

        IngreseNombreExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNombreExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNombreExtranjero.setText("Ingrese nombre");
        IngreseNombreExtranjero.setBorder(null);
        IngreseNombreExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNombreExtranjeroMousePressed(evt);
            }
        });

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));

        PaisDeOrigenExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        PaisDeOrigenExtranjero.setText("País de origen");

        IngresePaisDeOrigenExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngresePaisDeOrigenExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngresePaisDeOrigenExtranjero.setText("Ingrese país de otigen");
        IngresePaisDeOrigenExtranjero.setBorder(null);
        IngresePaisDeOrigenExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresePaisDeOrigenExtranjeroMousePressed(evt);
            }
        });

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));

        DNIExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        DNIExtranjero.setText("DNI");

        IngreseDNIExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseDNIExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngreseDNIExtranjero.setText("Ingrese DNI");
        IngreseDNIExtranjero.setBorder(null);
        IngreseDNIExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseDNIExtranjeroMousePressed(evt);
            }
        });

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));

        SexoExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        SexoExtranjero.setText("Sexo");

        IngreseSexoExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseSexoExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngreseSexoExtranjero.setBorder(null);
        IngreseSexoExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseSexoExtranjeroMousePressed(evt);
            }
        });
        IngreseSexoExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreseSexoExtranjeroActionPerformed(evt);
            }
        });

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));

        ModificarExtranjero.setBackground(new java.awt.Color(0, 153, 255));
        ModificarExtranjero.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ModificarExtranjero.setForeground(new java.awt.Color(255, 255, 255));
        ModificarExtranjero.setText("Modificar");
        ModificarExtranjero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ModificarExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarExtranjeroActionPerformed(evt);
            }
        });

        PrecioBasicoExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        PrecioBasicoExtranjero.setText("Precio Básico");

        IngresePrecioBasicoExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngresePrecioBasicoExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngresePrecioBasicoExtranjero.setText("Ingrese precio básico");
        IngresePrecioBasicoExtranjero.setBorder(null);
        IngresePrecioBasicoExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresePrecioBasicoExtranjeroMousePressed(evt);
            }
        });

        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));

        ComboSexoExtranjero.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ComboSexoExtranjero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        ComboSexoExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSexoExtranjeroActionPerformed(evt);
            }
        });

        NacionalidadExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NacionalidadExtranjero.setText("Nacionaidad");

        IngreseNacionalidadExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNacionalidadExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNacionalidadExtranjero.setText("Ingrese nacionalidad");
        IngreseNacionalidadExtranjero.setBorder(null);
        IngreseNacionalidadExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNacionalidadExtranjeroMousePressed(evt);
            }
        });

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));

        NumeroPasaporteExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NumeroPasaporteExtranjero.setText("Número de Pasaporte");

        IngreseNumeroPasaporteExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNumeroPasaporteExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNumeroPasaporteExtranjero.setText("Ingrese número de pasaporte");
        IngreseNumeroPasaporteExtranjero.setBorder(null);
        IngreseNumeroPasaporteExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNumeroPasaporteExtranjeroMousePressed(evt);
            }
        });

        jSeparator20.setForeground(new java.awt.Color(0, 0, 0));

        HaViajadoAntesExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        HaViajadoAntesExtranjero.setText("¿Ha viajado antes en Transtur?");

        IngreseHaViajadoAntesTransturExtranjero.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseHaViajadoAntesTransturExtranjero.setForeground(new java.awt.Color(153, 153, 153));
        IngreseHaViajadoAntesTransturExtranjero.setBorder(null);
        IngreseHaViajadoAntesTransturExtranjero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseHaViajadoAntesTransturExtranjeroMousePressed(evt);
            }
        });

        jSeparator21.setForeground(new java.awt.Color(0, 0, 0));

        ComboHaViajadoAntesExtranjero.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ComboHaViajadoAntesExtranjero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        ComboHaViajadoAntesExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboHaViajadoAntesExtranjeroActionPerformed(evt);
            }
        });

        GuardarExtranjero.setBackground(new java.awt.Color(0, 153, 255));
        GuardarExtranjero.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        GuardarExtranjero.setForeground(new java.awt.Color(255, 255, 255));
        GuardarExtranjero.setText("Guardar");
        GuardarExtranjero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GuardarExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarExtranjeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelExtranjeroLayout = new javax.swing.GroupLayout(PanelExtranjero);
        PanelExtranjero.setLayout(PanelExtranjeroLayout);
        PanelExtranjeroLayout.setHorizontalGroup(
            PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExtranjeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelExtranjeroLayout.createSequentialGroup()
                        .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Extranjero)
                            .addComponent(NombreExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaisDeOrigenExtranjero)
                            .addComponent(DNIExtranjero)
                            .addGroup(PanelExtranjeroLayout.createSequentialGroup()
                                .addComponent(SexoExtranjero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(ComboSexoExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator14)
                            .addComponent(jSeparator15)
                            .addComponent(jSeparator16)
                            .addComponent(jSeparator17)
                            .addComponent(IngreseSexoExtranjero)
                            .addComponent(IngreseDNIExtranjero)
                            .addComponent(IngresePaisDeOrigenExtranjero)
                            .addComponent(IngreseNombreExtranjero))
                        .addGap(70, 70, 70)
                        .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrecioBasicoExtranjero)
                            .addComponent(jSeparator18)
                            .addComponent(NacionalidadExtranjero)
                            .addComponent(jSeparator19)
                            .addComponent(NumeroPasaporteExtranjero)
                            .addComponent(IngreseNumeroPasaporteExtranjero)
                            .addComponent(jSeparator20)
                            .addComponent(HaViajadoAntesExtranjero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IngreseHaViajadoAntesTransturExtranjero)
                            .addComponent(jSeparator21)
                            .addComponent(IngreseNacionalidadExtranjero)
                            .addComponent(IngresePrecioBasicoExtranjero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboHaViajadoAntesExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelExtranjeroLayout.createSequentialGroup()
                        .addComponent(ModificarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        PanelExtranjeroLayout.setVerticalGroup(
            PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelExtranjeroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Extranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelExtranjeroLayout.createSequentialGroup()
                        .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreExtranjero)
                            .addComponent(PrecioBasicoExtranjero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IngreseNombreExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresePrecioBasicoExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaisDeOrigenExtranjero)
                            .addComponent(NacionalidadExtranjero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IngresePaisDeOrigenExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngreseNacionalidadExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNIExtranjero)
                    .addComponent(NumeroPasaporteExtranjero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseDNIExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseNumeroPasaporteExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexoExtranjero)
                    .addComponent(ComboSexoExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HaViajadoAntesExtranjero)
                    .addComponent(ComboHaViajadoAntesExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseSexoExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseHaViajadoAntesTransturExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelExtranjeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GuardarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModificarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("GuardarExtranjero", PanelExtranjero);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        TablaCubano.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaCubano);

        EditarCubano.setBackground(new java.awt.Color(0, 153, 255));
        EditarCubano.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EditarCubano.setForeground(new java.awt.Color(255, 255, 255));
        EditarCubano.setText("Editar");
        EditarCubano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditarCubano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCubanoActionPerformed(evt);
            }
        });

        EliminarCubano.setBackground(new java.awt.Color(0, 153, 255));
        EliminarCubano.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EliminarCubano.setForeground(new java.awt.Color(255, 255, 255));
        EliminarCubano.setText("Eliminar");
        EliminarCubano.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EliminarCubano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCubanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarCubano, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarCubano, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EliminarCubano, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditarCubano, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("TablaCubano", jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        TablaExtranjero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TablaExtranjero);

        EditarExtranjero.setBackground(new java.awt.Color(0, 153, 255));
        EditarExtranjero.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EditarExtranjero.setForeground(new java.awt.Color(255, 255, 255));
        EditarExtranjero.setText("Editar");
        EditarExtranjero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditarExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarExtranjeroActionPerformed(evt);
            }
        });

        EliminarExtranjero.setBackground(new java.awt.Color(0, 153, 255));
        EliminarExtranjero.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EliminarExtranjero.setForeground(new java.awt.Color(255, 255, 255));
        EliminarExtranjero.setText("Eliminar");
        EliminarExtranjero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EliminarExtranjero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarExtranjeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarExtranjero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jTabbedPane3.addTab("TablaExtranjero", jPanel13);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("Cubano", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

        PanelPanel.setBackground(new java.awt.Color(255, 255, 255));

        Panel.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        Panel.setText("Panel");

        ChapaPanel.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        ChapaPanel.setText("Chapa");

        IngreseChapaPanel.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseChapaPanel.setForeground(new java.awt.Color(153, 153, 153));
        IngreseChapaPanel.setText("Ingrese chapa");
        IngreseChapaPanel.setBorder(null);
        IngreseChapaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseChapaPanelMousePressed(evt);
            }
        });

        jSeparator22.setForeground(new java.awt.Color(0, 0, 0));

        CapacidadPanel.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        CapacidadPanel.setText("Capacidad");

        IngreseCapacidadPanel.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseCapacidadPanel.setForeground(new java.awt.Color(153, 153, 153));
        IngreseCapacidadPanel.setText("Ingrese capacidad");
        IngreseCapacidadPanel.setBorder(null);
        IngreseCapacidadPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseCapacidadPanelMousePressed(evt);
            }
        });

        jSeparator23.setForeground(new java.awt.Color(0, 0, 0));

        TipoDeCombustiblePanel.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        TipoDeCombustiblePanel.setText("Tipo de Combustible");

        IngreseTipoDeCombustiblePanel.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseTipoDeCombustiblePanel.setForeground(new java.awt.Color(153, 153, 153));
        IngreseTipoDeCombustiblePanel.setText("Ingrese tipo de combustible");
        IngreseTipoDeCombustiblePanel.setBorder(null);
        IngreseTipoDeCombustiblePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseTipoDeCombustiblePanelMousePressed(evt);
            }
        });

        jSeparator24.setForeground(new java.awt.Color(0, 0, 0));

        ModificarPanel.setBackground(new java.awt.Color(0, 153, 255));
        ModificarPanel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ModificarPanel.setForeground(new java.awt.Color(255, 255, 255));
        ModificarPanel.setText("Modificar");
        ModificarPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ModificarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPanelActionPerformed(evt);
            }
        });

        NombreDelChoferPanel.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreDelChoferPanel.setText("Nombre del Chofer");

        IngreseNombreDelChoferPanel.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNombreDelChoferPanel.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNombreDelChoferPanel.setText("Ingrese nombre del chofer");
        IngreseNombreDelChoferPanel.setBorder(null);
        IngreseNombreDelChoferPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNombreDelChoferPanelMousePressed(evt);
            }
        });

        jSeparator25.setForeground(new java.awt.Color(0, 0, 0));

        GuardarPanel.setBackground(new java.awt.Color(0, 153, 255));
        GuardarPanel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        GuardarPanel.setForeground(new java.awt.Color(255, 255, 255));
        GuardarPanel.setText("Guardar");
        GuardarPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GuardarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPanelLayout = new javax.swing.GroupLayout(PanelPanel);
        PanelPanel.setLayout(PanelPanelLayout);
        PanelPanelLayout.setHorizontalGroup(
            PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPanelLayout.createSequentialGroup()
                        .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChapaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CapacidadPanel)
                            .addComponent(TipoDeCombustiblePanel)
                            .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator24, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IngreseTipoDeCombustiblePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(jSeparator23, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IngreseCapacidadPanel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IngreseChapaPanel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ModificarPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator22, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPanelLayout.createSequentialGroup()
                                .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NombreDelChoferPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IngreseNombreDelChoferPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(jSeparator25))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPanelLayout.createSequentialGroup()
                                .addComponent(GuardarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(PanelPanelLayout.createSequentialGroup()
                        .addComponent(Panel)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelPanelLayout.setVerticalGroup(
            PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Panel)
                .addGap(25, 25, 25)
                .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChapaPanel)
                    .addComponent(NombreDelChoferPanel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseChapaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseNombreDelChoferPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CapacidadPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngreseCapacidadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TipoDeCombustiblePanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngreseTipoDeCombustiblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ModificarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        jTabbedPane4.addTab("Panel", PanelPanel);

        PanelTaxi.setBackground(new java.awt.Color(255, 255, 255));

        Taxi.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        Taxi.setText("Taxi");

        ChapaTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        ChapaTaxi.setText("Chapa");

        IngreseChapaTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseChapaTaxi.setForeground(new java.awt.Color(153, 153, 153));
        IngreseChapaTaxi.setText("Ingrese chapa");
        IngreseChapaTaxi.setBorder(null);
        IngreseChapaTaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseChapaTaxiMousePressed(evt);
            }
        });

        jSeparator26.setForeground(new java.awt.Color(0, 0, 0));

        CapacidadTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        CapacidadTaxi.setText("Capacidad");

        IngreseCapacidadTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseCapacidadTaxi.setForeground(new java.awt.Color(153, 153, 153));
        IngreseCapacidadTaxi.setText("Ingrese capacidad");
        IngreseCapacidadTaxi.setBorder(null);
        IngreseCapacidadTaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseCapacidadTaxiMousePressed(evt);
            }
        });

        jSeparator27.setForeground(new java.awt.Color(0, 0, 0));

        TipoDeCombustibleTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        TipoDeCombustibleTaxi.setText("Tipo de Combustible");

        IngreseTipoDeCombustibleTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseTipoDeCombustibleTaxi.setForeground(new java.awt.Color(153, 153, 153));
        IngreseTipoDeCombustibleTaxi.setBorder(null);
        IngreseTipoDeCombustibleTaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseTipoDeCombustibleTaxiMousePressed(evt);
            }
        });

        jSeparator28.setForeground(new java.awt.Color(0, 0, 0));

        ComboTaxi.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ComboTaxi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina" }));
        ComboTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTaxiActionPerformed(evt);
            }
        });

        NombreDelChoferTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreDelChoferTaxi.setText("Nombre del Chofer");

        IngreseNombreDelChoferTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNombreDelChoferTaxi.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNombreDelChoferTaxi.setText("Ingrese nombre del chofer");
        IngreseNombreDelChoferTaxi.setBorder(null);
        IngreseNombreDelChoferTaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNombreDelChoferTaxiMousePressed(evt);
            }
        });

        jSeparator29.setForeground(new java.awt.Color(0, 0, 0));

        MarcaTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        MarcaTaxi.setText("Marca");

        IngreseMarcaTaxi.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseMarcaTaxi.setForeground(new java.awt.Color(153, 153, 153));
        IngreseMarcaTaxi.setText("Ingrese marca");
        IngreseMarcaTaxi.setBorder(null);
        IngreseMarcaTaxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseMarcaTaxiMousePressed(evt);
            }
        });

        jSeparator30.setForeground(new java.awt.Color(0, 0, 0));

        ModificarTaxi.setBackground(new java.awt.Color(0, 153, 255));
        ModificarTaxi.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ModificarTaxi.setForeground(new java.awt.Color(255, 255, 255));
        ModificarTaxi.setText("Modificar");
        ModificarTaxi.setBorder(null);
        ModificarTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTaxiActionPerformed(evt);
            }
        });

        GuardarTaxi.setBackground(new java.awt.Color(0, 153, 255));
        GuardarTaxi.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        GuardarTaxi.setForeground(new java.awt.Color(255, 255, 255));
        GuardarTaxi.setText("Guardar");
        GuardarTaxi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GuardarTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTaxiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTaxiLayout = new javax.swing.GroupLayout(PanelTaxi);
        PanelTaxi.setLayout(PanelTaxiLayout);
        PanelTaxiLayout.setHorizontalGroup(
            PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTaxiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTaxiLayout.createSequentialGroup()
                        .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Taxi)
                            .addComponent(ChapaTaxi)
                            .addComponent(CapacidadTaxi)
                            .addComponent(TipoDeCombustibleTaxi, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jSeparator27)
                            .addComponent(jSeparator28)
                            .addComponent(jSeparator26)
                            .addComponent(IngreseChapaTaxi)
                            .addComponent(IngreseCapacidadTaxi)
                            .addComponent(IngreseTipoDeCombustibleTaxi))
                        .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelTaxiLayout.createSequentialGroup()
                                    .addGap(132, 132, 132)
                                    .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NombreDelChoferTaxi)
                                        .addComponent(MarcaTaxi)
                                        .addComponent(IngreseMarcaTaxi, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                        .addComponent(jSeparator30)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTaxiLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IngreseNombreDelChoferTaxi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelTaxiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(PanelTaxiLayout.createSequentialGroup()
                        .addComponent(ModificarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        PanelTaxiLayout.setVerticalGroup(
            PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTaxiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Taxi)
                .addGap(25, 25, 25)
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChapaTaxi)
                    .addComponent(NombreDelChoferTaxi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseChapaTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseNombreDelChoferTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CapacidadTaxi)
                    .addComponent(MarcaTaxi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseCapacidadTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseMarcaTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTaxiLayout.createSequentialGroup()
                        .addGroup(PanelTaxiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoDeCombustibleTaxi)
                            .addComponent(ComboTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IngreseTipoDeCombustibleTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTaxiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GuardarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jTabbedPane4.addTab("Taxi", PanelTaxi);

        PanelAutobus.setBackground(new java.awt.Color(255, 255, 255));

        Autobus.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        Autobus.setText("Autobus");

        ChapaAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        ChapaAutobus.setText("Chapa");

        IngreseChapaAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseChapaAutobus.setForeground(new java.awt.Color(153, 153, 153));
        IngreseChapaAutobus.setText("Ingrese chapa");
        IngreseChapaAutobus.setBorder(null);
        IngreseChapaAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseChapaAutobusMousePressed(evt);
            }
        });

        jSeparator31.setForeground(new java.awt.Color(0, 0, 0));

        CapacidadAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        CapacidadAutobus.setText("Capacidad");

        IngreseCapacidadAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseCapacidadAutobus.setForeground(new java.awt.Color(153, 153, 153));
        IngreseCapacidadAutobus.setText("Ingrese capacidad");
        IngreseCapacidadAutobus.setBorder(null);
        IngreseCapacidadAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseCapacidadAutobusMousePressed(evt);
            }
        });

        jSeparator32.setForeground(new java.awt.Color(0, 0, 0));

        TipoDeCombustibleAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        TipoDeCombustibleAutobus.setText("Tipo de Combustible");

        IngreseTipoDeCombustibleAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseTipoDeCombustibleAutobus.setForeground(new java.awt.Color(153, 153, 153));
        IngreseTipoDeCombustibleAutobus.setText("Ingrese tipo de combustible");
        IngreseTipoDeCombustibleAutobus.setBorder(null);
        IngreseTipoDeCombustibleAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseTipoDeCombustibleAutobusMousePressed(evt);
            }
        });

        jSeparator33.setForeground(new java.awt.Color(0, 0, 0));

        ComboAutobus.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ComboAutobus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diesel" }));
        ComboAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAutobusActionPerformed(evt);
            }
        });

        NombreDelChoferAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        NombreDelChoferAutobus.setText("Nombre del Chofer");

        IngreseNombreDelChoferAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseNombreDelChoferAutobus.setForeground(new java.awt.Color(153, 153, 153));
        IngreseNombreDelChoferAutobus.setText("Ingrese nombre del chofer");
        IngreseNombreDelChoferAutobus.setBorder(null);
        IngreseNombreDelChoferAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseNombreDelChoferAutobusMousePressed(evt);
            }
        });

        jSeparator34.setForeground(new java.awt.Color(0, 0, 0));

        CantidadDeMantenimientos.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        CantidadDeMantenimientos.setText("Cantidad de Mantenimientos");

        IngreseCantidadDeMantenimientosAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseCantidadDeMantenimientosAutobus.setForeground(new java.awt.Color(153, 153, 153));
        IngreseCantidadDeMantenimientosAutobus.setText("Ingrese cantidad de mantenimientos");
        IngreseCantidadDeMantenimientosAutobus.setBorder(null);
        IngreseCantidadDeMantenimientosAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseCantidadDeMantenimientosAutobusMousePressed(evt);
            }
        });

        jSeparator35.setForeground(new java.awt.Color(0, 0, 0));

        FechaDelProximoMantenimiento.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        FechaDelProximoMantenimiento.setText("Fecha del Proximo mantenimiento");

        IngreseFechaDelProximoMantenimientoAutobus.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        IngreseFechaDelProximoMantenimientoAutobus.setForeground(new java.awt.Color(153, 153, 153));
        IngreseFechaDelProximoMantenimientoAutobus.setText("Ingrese fecha del proximo mantenimiento");
        IngreseFechaDelProximoMantenimientoAutobus.setBorder(null);
        IngreseFechaDelProximoMantenimientoAutobus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngreseFechaDelProximoMantenimientoAutobusMousePressed(evt);
            }
        });

        jSeparator36.setForeground(new java.awt.Color(0, 0, 0));

        ModificarAutobus.setBackground(new java.awt.Color(0, 153, 255));
        ModificarAutobus.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        ModificarAutobus.setForeground(new java.awt.Color(255, 255, 255));
        ModificarAutobus.setText("Modificar");
        ModificarAutobus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ModificarAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAutobusActionPerformed(evt);
            }
        });

        GuardarAutobus.setBackground(new java.awt.Color(0, 153, 255));
        GuardarAutobus.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        GuardarAutobus.setForeground(new java.awt.Color(255, 255, 255));
        GuardarAutobus.setText("Guardar");
        GuardarAutobus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        GuardarAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAutobusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAutobusLayout = new javax.swing.GroupLayout(PanelAutobus);
        PanelAutobus.setLayout(PanelAutobusLayout);
        PanelAutobusLayout.setHorizontalGroup(
            PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAutobusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAutobusLayout.createSequentialGroup()
                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAutobusLayout.createSequentialGroup()
                                .addComponent(ModificarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GuardarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAutobusLayout.createSequentialGroup()
                                .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChapaAutobus)
                                    .addGroup(PanelAutobusLayout.createSequentialGroup()
                                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelAutobusLayout.createSequentialGroup()
                                                .addComponent(TipoDeCombustibleAutobus)
                                                .addGap(30, 30, 30)
                                                .addComponent(ComboAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jSeparator32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                                .addComponent(jSeparator31, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(40, 40, 40)
                                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FechaDelProximoMantenimiento)
                                            .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelAutobusLayout.createSequentialGroup()
                                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CapacidadAutobus)
                                            .addComponent(IngreseTipoDeCombustibleAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IngreseChapaAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IngreseCapacidadAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(100, 100, 100)
                                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IngreseFechaDelProximoMantenimientoAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IngreseCantidadDeMantenimientosAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CantidadDeMantenimientos)
                                            .addComponent(IngreseNombreDelChoferAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NombreDelChoferAutobus)
                                            .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 67, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(PanelAutobusLayout.createSequentialGroup()
                        .addComponent(Autobus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelAutobusLayout.setVerticalGroup(
            PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAutobusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Autobus)
                .addGap(25, 25, 25)
                .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChapaAutobus)
                    .addComponent(NombreDelChoferAutobus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngreseChapaAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreseNombreDelChoferAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CapacidadAutobus)
                    .addComponent(CantidadDeMantenimientos))
                .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAutobusLayout.createSequentialGroup()
                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IngreseCapacidadAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngreseCantidadDeMantenimientosAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoDeCombustibleAutobus)
                            .addComponent(ComboAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaDelProximoMantenimiento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IngreseTipoDeCombustibleAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngreseFechaDelProximoMantenimientoAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAutobusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ModificarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAutobusLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GuardarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        jTabbedPane4.addTab("Autobus", PanelAutobus);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        TablaPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(TablaPanel);

        EditarPanel.setBackground(new java.awt.Color(0, 153, 255));
        EditarPanel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EditarPanel.setForeground(new java.awt.Color(255, 255, 255));
        EditarPanel.setText("Editar");
        EditarPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarPanelActionPerformed(evt);
            }
        });

        EliminarPanel.setBackground(new java.awt.Color(0, 153, 255));
        EliminarPanel.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EliminarPanel.setForeground(new java.awt.Color(255, 255, 255));
        EliminarPanel.setText("Eliminar");
        EliminarPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EliminarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jTabbedPane4.addTab("TablaPanel", jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        TablaTaxi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(TablaTaxi);

        EditarTaxi.setBackground(new java.awt.Color(0, 153, 255));
        EditarTaxi.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EditarTaxi.setForeground(new java.awt.Color(255, 255, 255));
        EditarTaxi.setText("Editar");
        EditarTaxi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditarTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarTaxiActionPerformed(evt);
            }
        });

        EliminarTaxi.setBackground(new java.awt.Color(0, 153, 255));
        EliminarTaxi.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EliminarTaxi.setForeground(new java.awt.Color(255, 255, 255));
        EliminarTaxi.setText("Eliminar");
        EliminarTaxi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EliminarTaxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTaxiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarTaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jTabbedPane4.addTab("TablaTaxi", jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        TablaAutobus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(TablaAutobus);

        EditarAutobus.setBackground(new java.awt.Color(0, 153, 255));
        EditarAutobus.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EditarAutobus.setForeground(new java.awt.Color(255, 255, 255));
        EditarAutobus.setText("Editar");
        EditarAutobus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditarAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarAutobusActionPerformed(evt);
            }
        });

        EliminarAutobus.setBackground(new java.awt.Color(0, 153, 255));
        EliminarAutobus.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        EliminarAutobus.setForeground(new java.awt.Color(255, 255, 255));
        EliminarAutobus.setText("Eliminar");
        EliminarAutobus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EliminarAutobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAutobusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EditarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarAutobus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jTabbedPane4.addTab("TablaAutobus", jPanel20);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Panel", jPanel6);

        Content.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 840, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public EmpresaTranstur getEmpresa() {
        return Proyecto_VT.empresa;
    }

    public Excursion getExcursion() {
        return getEmpresa().getExcursion();
    }

    public void setExcursion(Excursion excursion) {
        getEmpresa().setExcursion(excursion);
    }

    public Excursion[] getListaDeExcursiones() {
        return getEmpresa().getListaDeExcursiones();
    }

    public void setListaDeExcursiones(Excursion[] listaDeExcursiones) {
        getEmpresa().setListaDeExcursiones(listaDeExcursiones);
    }

    public void inicializarValores() {
        IngreseNumeroViaje.setText(String.valueOf(getExcursion().getNumeroDelViaje()));
        IngreseCantidadDePersonasViaje.setText(String.valueOf(getExcursion().getCantDePersonas()));
//        IngreseVehiculoViaje.setText(String.valueOf(getExcursion().getCarroUtilizado()));
        IngresePrecioBasicoViaje.setText(String.valueOf(getExcursion().getPrecioBasicoViaje()));
        IngreseNombreGuiaViaje.setText(String.valueOf(getExcursion().getNombreDelGuia()));
        IngreseHotelCentroRecreativoViaje.setText(String.valueOf(getExcursion().getDestino()));

        setListaDeExcursiones(new Excursion[5]);
        getListaDeExcursiones()[0] = getExcursion();
        cantReal++;

    }

    public void duplicarLista() {
        Excursion[] listaTemp = new Excursion[getListaDeExcursiones().length * 2];
        for (int i = 0; i < getListaDeExcursiones().length * 2; i++) {
            listaTemp[i] = getListaDeExcursiones()[i];
        }
        setListaDeExcursiones(listaTemp);

    }


    private void IngreseNumeroViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNumeroViajeMousePressed
        // TODO add your handling code here:
        if (IngreseNumeroViaje.getText().equals(" Numero del viaje ")) {
            IngreseNumeroViaje.setText(" ");
            IngreseNumeroViaje.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseCantidadDePersonasViaje.getText()).isEmpty()) {
            IngreseCantidadDePersonasViaje.setText(" Cantidad de personas ");
            IngreseCantidadDePersonasViaje.setForeground(Color.GRAY);
        }
//        if (String.valueOf(IngreseVehiculoViaje.getText()).isEmpty()) {
//            IngreseVehiculoViaje.setText(" Vehiculo utilizado ");
//            IngreseVehiculoViaje.setForeground(Color.GRAY);
//        }
        if (String.valueOf(IngresePrecioBasicoViaje.getText()).isEmpty()) {
            IngresePrecioBasicoViaje.setText(" Precio Basico del viaje ");
            IngresePrecioBasicoViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreGuiaViaje.getText()).isEmpty()) {
            IngreseNombreGuiaViaje.setText(" Nombre del guia ");
            IngreseNombreGuiaViaje.setForeground(Color.GRAY);
        }

        if (String.valueOf(IngreseHotelCentroRecreativoViaje.getText()).isEmpty()) {
            IngreseHotelCentroRecreativoViaje.setText(" Hotel o Centro Recreativo ");
            IngreseHotelCentroRecreativoViaje.setForeground(Color.gray);
        }

    }//GEN-LAST:event_IngreseNumeroViajeMousePressed

    private void IngreseNumeroViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreseNumeroViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreseNumeroViajeActionPerformed

    private void IngreseCantidadDePersonasViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseCantidadDePersonasViajeMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNumeroViaje.getText()).isEmpty()) {
            IngreseNumeroViaje.setText(" Numero del viaje ");
            IngreseNumeroViaje.setForeground(Color.GRAY);
        }
        if (IngreseCantidadDePersonasViaje.getText().equals(" Cantidad de personas ")) {
            IngreseCantidadDePersonasViaje.setText(" ");
            IngreseCantidadDePersonasViaje.setForeground(Color.BLACK);
        }
//        if (String.valueOf(IngreseVehiculoViaje.getText()).isEmpty()) {
//            IngreseVehiculoViaje.setText(" Vehiculo utilizado ");
//            IngreseVehiculoViaje.setForeground(Color.GRAY);
//        }
        if (String.valueOf(IngresePrecioBasicoViaje.getText()).isEmpty()) {
            IngresePrecioBasicoViaje.setText(" Precio Basico del viaje ");
            IngresePrecioBasicoViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreGuiaViaje.getText()).isEmpty()) {
            IngreseNombreGuiaViaje.setText(" Nombre del guia ");
            IngreseNombreGuiaViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHotelCentroRecreativoViaje.getText()).isEmpty()) {
            IngreseHotelCentroRecreativoViaje.setText(" Hotel o Centro Recreativo ");
            IngreseHotelCentroRecreativoViaje.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseCantidadDePersonasViajeMousePressed

    private void ComboViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboViajeActionPerformed
        // TODO add your handling code here:
//        String mensaje = " ";
//        mensaje = mensaje + ComboViaje.getSelectedItem().toString();
//        IngreseVehiculoViaje.setText(mensaje);
    }//GEN-LAST:event_ComboViajeActionPerformed

    private void IngresePrecioBasicoViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePrecioBasicoViajeMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNumeroViaje.getText()).isEmpty()) {
            IngreseNumeroViaje.setText(" Numero del viaje ");
            IngreseNumeroViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCantidadDePersonasViaje.getText()).isEmpty()) {
            IngreseCantidadDePersonasViaje.setText(" Cantidad de personas ");
            IngreseCantidadDePersonasViaje.setForeground(Color.GRAY);
        }
//        if (String.valueOf(IngreseVehiculoViaje.getText()).isEmpty()) {
//            IngreseVehiculoViaje.setText(" Vehiculo utilizado ");
//            IngreseVehiculoViaje.setForeground(Color.GRAY);
//        }
        if (IngresePrecioBasicoViaje.getText().equals(" Precio Basico del viaje ")) {
            IngresePrecioBasicoViaje.setText(" ");
            IngresePrecioBasicoViaje.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseNombreGuiaViaje.getText()).isEmpty()) {
            IngreseNombreGuiaViaje.setText(" Nombre del guia ");
            IngreseNombreGuiaViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHotelCentroRecreativoViaje.getText()).isEmpty()) {
            IngreseHotelCentroRecreativoViaje.setText(" Hotel o Centro Recreativo ");
            IngreseHotelCentroRecreativoViaje.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngresePrecioBasicoViajeMousePressed

    private void IngreseNombreGuiaViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNombreGuiaViajeMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNumeroViaje.getText()).isEmpty()) {
            IngreseNumeroViaje.setText(" Numero del viaje ");
            IngreseNumeroViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCantidadDePersonasViaje.getText()).isEmpty()) {
            IngreseCantidadDePersonasViaje.setText(" Cantidad de personas ");
            IngreseCantidadDePersonasViaje.setForeground(Color.GRAY);
        }
//        if (String.valueOf(IngreseVehiculoViaje.getText()).isEmpty()) {
//            IngreseVehiculoViaje.setText(" Vehiculo utilizado ");
//            IngreseVehiculoViaje.setForeground(Color.GRAY);
//        }
        if (String.valueOf(IngresePrecioBasicoViaje.getText()).isEmpty()) {
            IngresePrecioBasicoViaje.setText(" Precio Basico del viaje ");
            IngresePrecioBasicoViaje.setForeground(Color.GRAY);
        }
        if (IngreseNombreGuiaViaje.getText().equals(" Nombre del guia ")) {
            IngreseNombreGuiaViaje.setText(" ");
            IngreseNombreGuiaViaje.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseHotelCentroRecreativoViaje.getText()).isEmpty()) {
            IngreseHotelCentroRecreativoViaje.setText(" Hotel o Centro Recreativo ");
            IngreseHotelCentroRecreativoViaje.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseNombreGuiaViajeMousePressed

    private void IngreseHotelCentroRecreativoViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseHotelCentroRecreativoViajeMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNumeroViaje.getText()).isEmpty()) {
            IngreseNumeroViaje.setText(" Numero del viaje ");
            IngreseNumeroViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCantidadDePersonasViaje.getText()).isEmpty()) {
            IngreseCantidadDePersonasViaje.setText(" Cantidad de personas ");
            IngreseCantidadDePersonasViaje.setForeground(Color.GRAY);
        }
//        if (String.valueOf(IngreseVehiculoViaje.getText()).isEmpty()) {
//            IngreseVehiculoViaje.setText(" Vehiculo utilizado ");
//            IngreseVehiculoViaje.setForeground(Color.GRAY);
//        }
        if (String.valueOf(IngresePrecioBasicoViaje.getText()).isEmpty()) {
            IngresePrecioBasicoViaje.setText(" Precio Basico del viaje ");
            IngresePrecioBasicoViaje.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreGuiaViaje.getText()).isEmpty()) {
            IngreseNombreGuiaViaje.setText(" Nombre del guia ");
            IngreseNombreGuiaViaje.setForeground(Color.GRAY);
        }
        if (IngreseHotelCentroRecreativoViaje.getText().equals(" Hotel o Centro Recreativo ")) {
            IngreseHotelCentroRecreativoViaje.setText(" ");
            IngreseHotelCentroRecreativoViaje.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_IngreseHotelCentroRecreativoViajeMousePressed

    private void ModificarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarViajeActionPerformed
        // TODO add your handling code here:
        modeloViajes.setValueAt(IngreseNumeroViaje.getText().trim(), filaSeleccionadaViajes, 0);
        modeloViajes.setValueAt(IngreseCantidadDePersonasViaje.getText().trim(), filaSeleccionadaViajes, 1);
        modeloViajes.setValueAt(ComboViaje.getSelectedItem().toString(), filaSeleccionadaViajes, 2);
        modeloViajes.setValueAt(IngresePrecioBasicoViaje.getText().trim(), filaSeleccionadaViajes, 3);
        modeloViajes.setValueAt(IngreseNombreGuiaViaje.getText().trim(), filaSeleccionadaViajes, 4);
        modeloViajes.setValueAt(IngreseHotelCentroRecreativoViaje.getText().trim(), filaSeleccionadaViajes, 5);
        modeloViajes.setValueAt(CBSonTuristas.isSelected() ? "si" : "no", filaSeleccionadaViajes, 6);
        modeloViajes.setValueAt(CBEsUnaExcurcion.isSelected() ? "si" : "no", filaSeleccionadaViajes, 7);
        modeloViajes.setValueAt(CBXCombustibleViajes.getSelectedItem().toString(), filaSeleccionadaViajes, 8);
    }//GEN-LAST:event_ModificarViajeActionPerformed

    private void GuardarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarViajeActionPerformed
        int numeroDelViaje;
        double precioBasico;
        int cantidadDePersonas;

        String[] info = new String[9];
        {

            //Numero del viaje
            try {
                numeroDelViaje = Integer.parseInt(IngreseNumeroViaje.getText());
                if (numeroDelViaje < 0) {

                    JOptionPane.showMessageDialog(this, "El número del viaje debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El número del viaje debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            info[0] = IngreseNumeroViaje.getText();

            //Cantidad de Personas
            try {
                cantidadDePersonas = Integer.parseInt(IngreseCantidadDePersonasViaje.getText());
                if (cantidadDePersonas < 0) {

                    JOptionPane.showMessageDialog(this, "La cantidad de personas debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "La cantidad de personas debe ser segun la capacida del vehiculo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            info[1] = IngreseCantidadDePersonasViaje.getText();
            info[2] = ComboViaje.getSelectedItem().toString();

            //Precio Basico del Viaje
            try {
                precioBasico = Double.parseDouble(IngresePrecioBasicoViaje.getText());
                if (precioBasico < 0) {
                    JOptionPane.showMessageDialog(this, "El precio básico debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El precio básico debe ser númerico.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            info[3] = IngresePrecioBasicoViaje.getText();
            info[4] = IngreseNombreGuiaViaje.getText();
            info[5] = IngreseHotelCentroRecreativoViaje.getText();
            info[6] = CBSonTuristas.isSelected() ? "si" : "no";
            info[7] = CBEsUnaExcurcion.isSelected() ? "si" : "no";
            info[8] = CBXCombustibleViajes.getSelectedItem().toString();
            modeloViajes.addRow(info);

            IngreseNumeroViaje.setText(" ");
            IngreseCantidadDePersonasViaje.setText(" ");
//            IngreseVehiculoViaje.setText(" ");
            IngresePrecioBasicoViaje.setText(" ");
            IngreseNombreGuiaViaje.setText(" ");
            IngreseHotelCentroRecreativoViaje.setText(" ");

            JOptionPane.showMessageDialog(this, "Ha ingresado correctamente");
        }

    }//GEN-LAST:event_GuardarViajeActionPerformed

    private void EditarViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarViajesActionPerformed
        // TODO add your handling code here:
        // Editar
        int fila = TablaDeViaje.getSelectedRow();
        if (fila >= 0 || fila == -1) {
            IngreseNumeroViaje.setText(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 0).toString());
            IngreseCantidadDePersonasViaje.setText(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 1).toString());
            ComboViaje.setSelectedIndex(getIndiceComboboxVehiculoViajes(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 2).toString()));
//            ComboViaje.setSelectedItem();
//            IngreseVehiculoViaje.setText(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 2).toString());
            IngresePrecioBasicoViaje.setText(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 3).toString());
            IngreseNombreGuiaViaje.setText(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 4).toString());
            IngreseHotelCentroRecreativoViaje.setText(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 5).toString());
            CBSonTuristas.setSelected(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 6).toString().equals("si"));
            CBEsUnaExcurcion.setSelected(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 7).toString().equals("si"));
            CBXCombustibleViajes.setSelectedIndex(getIndiceComboboxCombustible(modeloViajes.getValueAt(TablaDeViaje.getSelectedRow(), 8).toString()));
            filaSeleccionadaViajes = TablaDeViaje.getSelectedRow();
        } else {

            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EditarViajesActionPerformed

    private void EliminarViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarViajesActionPerformed
        // TODO add your handling code here:
        // Eliminar
        int fila = TablaDeViaje.getSelectedRow();
        if (fila >= 0) {
            modeloViajes.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EliminarViajesActionPerformed

    private void IngreseNombreCubanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNombreCubanoMousePressed
        // TODO add your handling code here:
        if (IngreseNombreCubano.getText().equals(" Nombre ")) {
            IngreseNombreCubano.setText(" ");
            IngreseNombreCubano.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseCarneDeIdentidadCubano.getText()).isEmpty()) {
            IngreseCarneDeIdentidadCubano.setText(" Carné de identidad ");
            IngreseCarneDeIdentidadCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseSexoCubano.getText()).isEmpty()) {
            IngreseSexoCubano.setText(" Sexo ");
            IngreseSexoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoCubano.getText()).isEmpty()) {
            IngresePrecioBasicoCubano.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDireccionCubano.getText()).isEmpty()) {
            IngreseDireccionCubano.setText(" Dirección ");
            IngreseDireccionCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesCubano.getText()).isEmpty()) {
            IngreseHaViajadoAntesCubano.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesCubano.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseNombreCubanoMousePressed

    private void IngreseCarneDeIdentidadCubanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseCarneDeIdentidadCubanoMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreCubano.getText()).isEmpty()) {
            IngreseNombreCubano.setText(" Nombre ");
            IngreseNombreCubano.setForeground(Color.GRAY);
        }
        if (IngreseCarneDeIdentidadCubano.getText().equals(" Carné de identidad ")) {
            IngreseCarneDeIdentidadCubano.setText(" ");
            IngreseCarneDeIdentidadCubano.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseSexoCubano.getText()).isEmpty()) {
            IngreseSexoCubano.setText(" Sexo ");
            IngreseSexoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoCubano.getText()).isEmpty()) {
            IngresePrecioBasicoCubano.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDireccionCubano.getText()).isEmpty()) {
            IngreseDireccionCubano.setText(" Dirección ");
            IngreseDireccionCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesCubano.getText()).isEmpty()) {
            IngreseHaViajadoAntesCubano.setText(" ¿Ha viajado antes en Transtur ");
            IngreseHaViajadoAntesCubano.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_IngreseCarneDeIdentidadCubanoMousePressed

    private void IngreseSexoCubanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseSexoCubanoMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreCubano.getText()).isEmpty()) {
            IngreseNombreCubano.setText(" Ingrese nombre ");
            IngreseNombreCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCarneDeIdentidadCubano.getText()).isEmpty()) {
            IngreseCarneDeIdentidadCubano.setText(" Carné de identidad ");
            IngreseCarneDeIdentidadCubano.setForeground(Color.GRAY);
        }
        if (IngreseSexoCubano.getText().equals(" Sexo ")) {
            IngreseSexoCubano.setText(" ");
            IngreseSexoCubano.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngresePrecioBasicoCubano.getText()).isEmpty()) {
            IngresePrecioBasicoCubano.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDireccionCubano.getText()).isEmpty()) {
            IngreseDireccionCubano.setText(" Dirección ");
            IngreseDireccionCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesCubano.getText()).isEmpty()) {
            IngreseHaViajadoAntesCubano.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesCubano.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseSexoCubanoMousePressed

    private void ComboSexoCubanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSexoCubanoActionPerformed
        // TODO add your handling code here:
        String mensajeComboS = " ";
        mensajeComboS = mensajeComboS + ComboSexoCubano.getSelectedItem().toString();
        IngreseSexoCubano.setText(mensajeComboS);

    }//GEN-LAST:event_ComboSexoCubanoActionPerformed

    private void IngresePrecioBasicoCubanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePrecioBasicoCubanoMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreCubano.getText()).isEmpty()) {
            IngreseNombreCubano.setText(" Ingrese nombre ");
            IngreseNombreCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCarneDeIdentidadCubano.getText()).isEmpty()) {
            IngreseCarneDeIdentidadCubano.setText(" Carné de identidad ");
            IngreseCarneDeIdentidadCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseSexoCubano.getText()).isEmpty()) {
            IngreseSexoCubano.setText(" Sexo ");
            IngreseSexoCubano.setForeground(Color.GRAY);
        }
        if (IngresePrecioBasicoCubano.getText().equals(" Precio Basico del autobus ")) {
            IngresePrecioBasicoCubano.setText(" ");
            IngresePrecioBasicoCubano.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseDireccionCubano.getText()).isEmpty()) {
            IngreseDireccionCubano.setText(" Dirección ");
            IngreseDireccionCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesCubano.getText()).isEmpty()) {
            IngreseHaViajadoAntesCubano.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesCubano.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_IngresePrecioBasicoCubanoMousePressed

    private void IngreseDireccionCubanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseDireccionCubanoMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreCubano.getText()).isEmpty()) {
            IngreseNombreCubano.setText(" Ingrese nombre ");
            IngreseNombreCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCarneDeIdentidadCubano.getText()).isEmpty()) {
            IngreseCarneDeIdentidadCubano.setText(" Carné de identidad ");
            IngreseCarneDeIdentidadCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseSexoCubano.getText()).isEmpty()) {
            IngreseSexoCubano.setText(" Sexo ");
            IngreseSexoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoCubano.getText()).isEmpty()) {
            IngresePrecioBasicoCubano.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoCubano.setForeground(Color.GRAY);
        }
        if (IngreseDireccionCubano.getText().equals(" Dirección ")) {
            IngreseDireccionCubano.setText(" ");
            IngreseDireccionCubano.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseHaViajadoAntesCubano.getText()).isEmpty()) {
            IngreseHaViajadoAntesCubano.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesCubano.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseDireccionCubanoMousePressed

    private void ComboHaViajadoAntesCubanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHaViajadoAntesCubanoActionPerformed
        // TODO add your handling code here:
        String mensajeComboV = " ";
        mensajeComboV = mensajeComboV + ComboHaViajadoAntesCubano.getSelectedItem().toString();
        IngreseHaViajadoAntesCubano.setText(mensajeComboV);
    }//GEN-LAST:event_ComboHaViajadoAntesCubanoActionPerformed

    private void IngreseHaViajadoAntesCubanoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseHaViajadoAntesCubanoMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreCubano.getText()).isEmpty()) {
            IngreseNombreCubano.setText(" Ingrese nombre ");
            IngreseNombreCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCarneDeIdentidadCubano.getText()).isEmpty()) {
            IngreseCarneDeIdentidadCubano.setText(" Carné de identidad ");
            IngreseCarneDeIdentidadCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseSexoCubano.getText()).isEmpty()) {
            IngreseSexoCubano.setText(" Sexo ");
            IngreseSexoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoCubano.getText()).isEmpty()) {
            IngresePrecioBasicoCubano.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoCubano.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDireccionCubano.getText()).isEmpty()) {
            IngreseDireccionCubano.setText(" Dirección ");
            IngreseDireccionCubano.setForeground(Color.GRAY);
        }
        if (IngreseHaViajadoAntesCubano.getText().equals(" ¿Ha viajado antes en Transtur? ")) {
            IngreseHaViajadoAntesCubano.setText(" ");
            IngreseHaViajadoAntesCubano.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_IngreseHaViajadoAntesCubanoMousePressed

    private void ModificarCubanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCubanoActionPerformed
        // TODO add your handling code here:
        modeloCubano.setValueAt(IngreseNombreCubano.getText().trim(), filaSeleccionadaEC, 0);
        modeloCubano.setValueAt(IngreseCarneDeIdentidadCubano.getText().trim(), filaSeleccionadaEC, 1);
        modeloCubano.setValueAt(IngreseSexoCubano.getText().trim(), filaSeleccionadaEC, 2);
        modeloCubano.setValueAt(IngresePrecioBasicoCubano.getText().trim(), filaSeleccionadaEC, 3);
        modeloCubano.setValueAt(IngreseDireccionCubano.getText().trim(), filaSeleccionadaEC, 4);
        modeloCubano.setValueAt(IngreseHaViajadoAntesCubano.getText().trim(), filaSeleccionadaEC, 5);
    }//GEN-LAST:event_ModificarCubanoActionPerformed

    private void GuardarCuabanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCuabanoActionPerformed
        // TODO add your handling code here:
        double precioBasicoCubano;

        String[] info = new String[6];
        info[0] = IngreseNombreCubano.getText();
        info[1] = IngreseCarneDeIdentidadCubano.getText();
        info[2] = IngreseSexoCubano.getText();

        //Precio Basico del Cuabano
        try {
            precioBasicoCubano = Double.parseDouble(IngresePrecioBasicoCubano.getText());
            if (precioBasicoCubano < 0) {
                JOptionPane.showMessageDialog(this, "El precio básico debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio básico debe ser númerico.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        info[4] = IngresePrecioBasicoCubano.getText();
        info[5] = IngreseDireccionCubano.getText();
        info[3] = IngreseHaViajadoAntesCubano.getText();
        modeloCubano.addRow(info);

        IngreseNombreCubano.setText(" ");
        IngreseCarneDeIdentidadCubano.setText(" ");
        IngreseSexoCubano.setText(" ");
        IngresePrecioBasicoCubano.setText(" ");
        IngreseDireccionCubano.setText(" ");
        IngreseHaViajadoAntesCubano.setText(" ");

        JOptionPane.showMessageDialog(this, "Ha ingresado correctamente");
    }//GEN-LAST:event_GuardarCuabanoActionPerformed

    private void IngreseNombreExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNombreExtranjeroMousePressed
        // TODO add your handling code here:
        if (IngreseNombreExtranjero.getText().equals(" Nombre ")) {
            IngreseNombreExtranjero.setText(" ");
            IngreseNombreExtranjero.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngresePaisDeOrigenExtranjero.getText()).isEmpty()) {
            IngresePaisDeOrigenExtranjero.setText(" Pais de origen ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDNIExtranjero.getText()).isEmpty()) {
            IngreseDNIExtranjero.setText(" DNI ");
            IngreseDNIExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseSexoExtranjero).equals("")) {
            IngreseSexoExtranjero.setText(" Sexo ");
            IngreseSexoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoExtranjero.getText()).isEmpty()) {
            IngresePrecioBasicoExtranjero.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNacionalidadExtranjero.getText()).isEmpty()) {
            IngreseNacionalidadExtranjero.setText(" Nacionalidad ");
            IngreseNacionalidadExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNumeroPasaporteExtranjero.getText()).isEmpty()) {
            IngreseNumeroPasaporteExtranjero.setText(" Numero de pasaporte ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesTransturExtranjero.getText()).isEmpty()) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseNombreExtranjeroMousePressed

    private void IngresePaisDeOrigenExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePaisDeOrigenExtranjeroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreExtranjero.getText()).isEmpty()) {
            IngreseNombreExtranjero.setText(" Nombre ");
            IngreseNombreExtranjero.setForeground(Color.GRAY);
        }
        if (IngresePaisDeOrigenExtranjero.getText().equals(" Pais de origen ")) {
            IngresePaisDeOrigenExtranjero.setText(" ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseDNIExtranjero.getText()).isEmpty()) {
            IngreseDNIExtranjero.setText(" DNI ");
            IngreseDNIExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseSexoExtranjero.getText()).isEmpty()) {
            IngreseSexoExtranjero.setText(" Sexo ");
            IngreseSexoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoExtranjero.getText()).isEmpty()) {
            IngresePrecioBasicoExtranjero.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNacionalidadExtranjero.getText()).isEmpty()) {
            IngreseNacionalidadExtranjero.setText(" Nacionalidad ");
            IngreseNacionalidadExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNumeroPasaporteExtranjero.getText()).isEmpty()) {
            IngreseNumeroPasaporteExtranjero.setText(" Numero de pasaporte ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesTransturExtranjero.getText()).isEmpty()) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngresePaisDeOrigenExtranjeroMousePressed

    private void IngreseDNIExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseDNIExtranjeroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreExtranjero.getText()).isEmpty()) {
            IngreseNombreExtranjero.setText("Nombre");
            IngreseNombreExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePaisDeOrigenExtranjero.getText()).isEmpty()) {
            IngresePaisDeOrigenExtranjero.setText(" Pais de origen ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.GRAY);
        }
        if (IngreseDNIExtranjero.getText().equals(" DNI ")) {
            IngreseDNIExtranjero.setText(" ");
            IngreseDNIExtranjero.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseSexoExtranjero.getText()).isEmpty()) {
            IngreseSexoExtranjero.setText(" Sexo ");
            IngreseSexoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoExtranjero.getText()).isEmpty()) {
            IngresePrecioBasicoExtranjero.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNacionalidadExtranjero.getText()).isEmpty()) {
            IngreseNacionalidadExtranjero.setText(" Nacionalidad ");
            IngreseNacionalidadExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNumeroPasaporteExtranjero.getText()).isEmpty()) {
            IngreseNumeroPasaporteExtranjero.setText(" Numero de pasaporte ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesTransturExtranjero.getText()).isEmpty()) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseDNIExtranjeroMousePressed

    private void IngreseSexoExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseSexoExtranjeroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreExtranjero.getText()).isEmpty()) {
            IngreseNombreExtranjero.setText(" Nombre ");
            IngreseNombreExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePaisDeOrigenExtranjero.getText()).isEmpty()) {
            IngresePaisDeOrigenExtranjero.setText(" Pais de origen ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDNIExtranjero.getText()).isEmpty()) {
            IngreseDNIExtranjero.setText(" DNI ");
            IngreseDNIExtranjero.setForeground(Color.GRAY);
        }
        if (IngreseSexoExtranjero.getText().equals(" Sexo ")) {
            IngreseSexoExtranjero.setText(" ");
            IngreseSexoExtranjero.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngresePrecioBasicoExtranjero.getText()).isEmpty()) {
            IngresePrecioBasicoExtranjero.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNacionalidadExtranjero.getText()).isEmpty()) {
            IngreseNacionalidadExtranjero.setText(" Nacionalidad ");
            IngreseNacionalidadExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNumeroPasaporteExtranjero.getText()).isEmpty()) {
            IngreseNumeroPasaporteExtranjero.setText(" Numero de pasaporte ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesTransturExtranjero.getText()).isEmpty()) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseSexoExtranjeroMousePressed

    private void IngreseSexoExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreseSexoExtranjeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreseSexoExtranjeroActionPerformed

    private void ModificarExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarExtranjeroActionPerformed
        // TODO add your handling code here:
        modeloExtranjero.setValueAt(IngreseNombreExtranjero.getText().trim(), filaSeleccionadaEC, 0);
        modeloExtranjero.setValueAt(IngresePaisDeOrigenExtranjero.getText().trim(), filaSeleccionadaEC, 1);
        modeloExtranjero.setValueAt(IngreseDNIExtranjero.getText().trim(), filaSeleccionadaEC, 2);
        modeloExtranjero.setValueAt(IngreseSexoExtranjero.getText().trim(), filaSeleccionadaEC, 3);
        modeloExtranjero.setValueAt(IngresePrecioBasicoExtranjero.getText().trim(), filaSeleccionadaEC, 4);
        modeloExtranjero.setValueAt(IngreseNacionalidadExtranjero.getText().trim(), filaSeleccionadaEC, 5);
        modeloExtranjero.setValueAt(IngreseNumeroPasaporteExtranjero.getText().trim(), filaSeleccionadaEC, 6);
        modeloExtranjero.setValueAt(IngreseHaViajadoAntesTransturExtranjero.getText().trim(), filaSeleccionadaEC, 7);
    }//GEN-LAST:event_ModificarExtranjeroActionPerformed

    private void IngresePrecioBasicoExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresePrecioBasicoExtranjeroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreExtranjero.getText()).isEmpty()) {
            IngreseNombreExtranjero.setText(" Nombre ");
            IngreseNombreExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePaisDeOrigenExtranjero.getText()).isEmpty()) {
            IngresePaisDeOrigenExtranjero.setText(" Pais de origen ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDNIExtranjero.getText()).isEmpty()) {
            IngreseDNIExtranjero.setText(" DNI ");
            IngreseDNIExtranjero.setForeground(Color.GRAY);
        }

        if (String.valueOf(IngreseSexoExtranjero.getText()).isEmpty()) {
            IngreseSexoExtranjero.setText(" Sexo ");
            IngreseSexoExtranjero.setForeground(Color.GRAY);
        }
        if (IngresePrecioBasicoExtranjero.getText().equals(" Precio Basico del autobus ")) {
            IngresePrecioBasicoExtranjero.setText(" ");
            IngresePrecioBasicoExtranjero.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseNacionalidadExtranjero.getText()).isEmpty()) {
            IngreseNacionalidadExtranjero.setText(" Nacionalidad ");
            IngreseNacionalidadExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNumeroPasaporteExtranjero.getText()).isEmpty()) {
            IngreseNumeroPasaporteExtranjero.setText(" Numero de pasaporte ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesTransturExtranjero.getText()).isEmpty()) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngresePrecioBasicoExtranjeroMousePressed

    private void ComboSexoExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSexoExtranjeroActionPerformed
        // TODO add your handling code here:
        String mensajeComboSE = " ";
        mensajeComboSE = mensajeComboSE + ComboSexoExtranjero.getSelectedItem().toString();
        IngreseSexoExtranjero.setText(mensajeComboSE);

    }//GEN-LAST:event_ComboSexoExtranjeroActionPerformed

    private void IngreseNacionalidadExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNacionalidadExtranjeroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreExtranjero.getText()).isEmpty()) {
            IngreseNombreExtranjero.setText(" Nombre ");
            IngreseNombreExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePaisDeOrigenExtranjero.getText()).isEmpty()) {
            IngresePaisDeOrigenExtranjero.setText(" Pais de origen ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDNIExtranjero.getText()).isEmpty()) {
            IngreseDNIExtranjero.setText(" DNI ");
            IngreseDNIExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseSexoExtranjero.getText()).isEmpty()) {
            IngreseSexoExtranjero.setText(" Sexo ");
            IngreseSexoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoExtranjero.getText()).isEmpty()) {
            IngresePrecioBasicoExtranjero.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoExtranjero.setForeground(Color.GRAY);
        }
        if (IngreseNacionalidadExtranjero.getText().equals(" Nacionalidad ")) {
            IngreseNacionalidadExtranjero.setText(" ");
            IngreseNacionalidadExtranjero.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseNumeroPasaporteExtranjero.getText()).isEmpty()) {
            IngreseNumeroPasaporteExtranjero.setText(" Numero de pasaporte ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseHaViajadoAntesTransturExtranjero.getText()).isEmpty()) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseNacionalidadExtranjeroMousePressed

    private void IngreseNumeroPasaporteExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNumeroPasaporteExtranjeroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreExtranjero.getText()).isEmpty()) {
            IngreseNombreExtranjero.setText(" Nombre ");
            IngreseNombreExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePaisDeOrigenExtranjero.getText()).isEmpty()) {
            IngresePaisDeOrigenExtranjero.setText(" Pais de origen ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDNIExtranjero.getText()).isEmpty()) {
            IngreseDNIExtranjero.setText(" DNI ");
            IngreseDNIExtranjero.setForeground(Color.GRAY);
        }

        if (String.valueOf(IngreseSexoExtranjero.getText()).isEmpty()) {
            IngreseSexoExtranjero.setText(" Sexo ");
            IngreseSexoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoExtranjero.getText()).isEmpty()) {
            IngresePrecioBasicoExtranjero.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNacionalidadExtranjero.getText()).isEmpty()) {
            IngreseNacionalidadExtranjero.setText(" Nacionalidad ");
            IngreseNacionalidadExtranjero.setForeground(Color.GRAY);
        }
        if (IngreseNumeroPasaporteExtranjero.getText().equals(" Numero de pasaporte ")) {
            IngreseNumeroPasaporteExtranjero.setText(" ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseHaViajadoAntesTransturExtranjero.getText()).isEmpty()) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ¿Ha viajado antes en Transtur? ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseNumeroPasaporteExtranjeroMousePressed

    private void IngreseHaViajadoAntesTransturExtranjeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseHaViajadoAntesTransturExtranjeroMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseNombreExtranjero.getText()).isEmpty()) {
            IngreseNombreExtranjero.setText(" Nombre ");
            IngreseNombreExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePaisDeOrigenExtranjero.getText()).isEmpty()) {
            IngresePaisDeOrigenExtranjero.setText(" Pais de origen ");
            IngresePaisDeOrigenExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseDNIExtranjero.getText()).isEmpty()) {
            IngreseDNIExtranjero.setText(" DNI ");
            IngreseDNIExtranjero.setForeground(Color.GRAY);
        }

        if (String.valueOf(IngreseSexoExtranjero.getText()).isEmpty()) {
            IngreseSexoExtranjero.setText(" Sexo ");
            IngreseSexoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngresePrecioBasicoExtranjero.getText()).isEmpty()) {
            IngresePrecioBasicoExtranjero.setText(" Precio Basico del autobus ");
            IngresePrecioBasicoExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNacionalidadExtranjero.getText()).isEmpty()) {
            IngreseNacionalidadExtranjero.setText(" Nacionalidad ");
            IngreseNacionalidadExtranjero.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNumeroPasaporteExtranjero.getText()).isEmpty()) {
            IngreseNumeroPasaporteExtranjero.setText(" Numero de pasaporte ");
            IngreseNumeroPasaporteExtranjero.setForeground(Color.GRAY);
        }
        if (IngreseHaViajadoAntesTransturExtranjero.getText().equals(" ¿Ha viajado antes en Transtur? ")) {
            IngreseHaViajadoAntesTransturExtranjero.setText(" ");
            IngreseHaViajadoAntesTransturExtranjero.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_IngreseHaViajadoAntesTransturExtranjeroMousePressed

    private void ComboHaViajadoAntesExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboHaViajadoAntesExtranjeroActionPerformed
        // TODO add your handling code here:
        String mensajeComboVE = " ";
        mensajeComboVE = mensajeComboVE + ComboHaViajadoAntesExtranjero.getSelectedItem().toString();
        IngreseHaViajadoAntesTransturExtranjero.setText(mensajeComboVE);

    }//GEN-LAST:event_ComboHaViajadoAntesExtranjeroActionPerformed

    private void GuardarExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarExtranjeroActionPerformed
        // TODO add your handling code here:
        double precioBasicoExtranjero;

        String[] info = new String[8];
        info[0] = IngreseNombreExtranjero.getText();
        info[1] = IngresePaisDeOrigenExtranjero.getText();
        info[2] = IngreseDNIExtranjero.getText();
        info[3] = IngreseSexoExtranjero.getText();

        //Precio Basico del Extranjero
        try {
            precioBasicoExtranjero = Double.parseDouble(IngresePrecioBasicoExtranjero.getText());
            if (precioBasicoExtranjero < 0) {
                JOptionPane.showMessageDialog(this, "El precio básico debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio básico debe ser númerico.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        info[4] = IngresePrecioBasicoExtranjero.getText();
        info[5] = IngreseNacionalidadExtranjero.getText();
        info[6] = IngreseNumeroPasaporteExtranjero.getText();
        info[7] = IngreseHaViajadoAntesTransturExtranjero.getText();
        modeloExtranjero.addRow(info);

        IngreseNombreExtranjero.setText(" ");
        IngresePaisDeOrigenExtranjero.setText(" ");
        IngreseDNIExtranjero.setText(" ");
        IngreseSexoExtranjero.setText(" ");
        IngresePrecioBasicoExtranjero.setText(" ");
        IngreseNacionalidadExtranjero.setText(" ");
        IngreseNumeroPasaporteExtranjero.setText(" ");
        IngreseHaViajadoAntesTransturExtranjero.setText(" ");

        JOptionPane.showMessageDialog(this, "Ha ingresado correctamente");
    }//GEN-LAST:event_GuardarExtranjeroActionPerformed

    private void EditarCubanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCubanoActionPerformed
        // TODO add your handling code here:
        int fila = TablaCubano.getSelectedRow();
        if (fila >= 0 || fila == -1) {
            IngreseNombreCubano.setText(modeloCubano.getValueAt(TablaCubano.getSelectedRow(), 0).toString());
            IngreseCarneDeIdentidadCubano.setText(modeloCubano.getValueAt(TablaCubano.getSelectedRow(), 1).toString());
            IngreseSexoCubano.setText(modeloCubano.getValueAt(TablaCubano.getSelectedRow(), 2).toString());
            IngresePrecioBasicoCubano.setText(modeloCubano.getValueAt(TablaCubano.getSelectedRow(), 3).toString());
            IngreseDireccionCubano.setText(modeloCubano.getValueAt(TablaCubano.getSelectedRow(), 4).toString());
            IngreseHaViajadoAntesCubano.setText(modeloCubano.getValueAt(TablaCubano.getSelectedRow(), 5).toString());
        } else {
            filaSeleccionadaEC = TablaCubano.getSelectedRow();
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }

    }//GEN-LAST:event_EditarCubanoActionPerformed

    private void EliminarCubanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCubanoActionPerformed
        // TODO add your handling code here:
        int fila = TablaCubano.getSelectedRow();
        if (fila >= 0) {
            modeloCubano.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EliminarCubanoActionPerformed

    private void EditarExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarExtranjeroActionPerformed
        // TODO add your handling code here:
        int fila = TablaExtranjero.getSelectedRow();
        if (fila >= 0 || fila == -1) {
            IngreseNombreExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 0).toString());
            IngresePaisDeOrigenExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 1).toString());
            IngreseDNIExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 2).toString());
            IngreseSexoExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 3).toString());
            IngresePrecioBasicoExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 4).toString());
            IngreseNacionalidadExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 5).toString());
            IngreseNumeroPasaporteExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 6).toString());
            IngreseHaViajadoAntesTransturExtranjero.setText(modeloExtranjero.getValueAt(TablaExtranjero.getSelectedRow(), 7).toString());
        } else {
            filaSeleccionadaEC = TablaExtranjero.getSelectedRow();
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EditarExtranjeroActionPerformed

    private void EliminarExtranjeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarExtranjeroActionPerformed
        // TODO add your handling code here:
        int fila = TablaExtranjero.getSelectedRow();
        if (fila >= 0) {
            modeloExtranjero.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EliminarExtranjeroActionPerformed

    private void IngreseChapaPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseChapaPanelMousePressed
        // TODO add your handling code here:
        if (IngreseChapaPanel.getText().equals(" Chapa ")) {
            IngreseChapaPanel.setText(" ");
            IngreseChapaPanel.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseCapacidadPanel.getText()).isEmpty()) {
            IngreseCapacidadPanel.setText(" Capacidad ");
            IngreseCapacidadPanel.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustiblePanel.getText()).isEmpty()) {
            IngreseTipoDeCombustiblePanel.setText(" Tipo de combustible ");
            IngreseTipoDeCombustiblePanel.setForeground(Color.GRAY);
        }

        if (String.valueOf(IngreseNombreDelChoferPanel.getText()).isEmpty()) {
            IngreseNombreDelChoferPanel.setText(" Nombre del chofer ");
            IngreseNombreDelChoferPanel.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseChapaPanelMousePressed

    private void IngreseCapacidadPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseCapacidadPanelMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaPanel.getText()).isEmpty()) {
            IngreseChapaPanel.setText(" Chapa ");
            IngreseChapaPanel.setForeground(Color.GRAY);
        }
        if (IngreseCapacidadPanel.getText().equals(" Capacidad ")) {
            IngreseCapacidadPanel.setText(" ");
            IngreseCapacidadPanel.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseTipoDeCombustiblePanel.getText()).isEmpty()) {
            IngreseTipoDeCombustiblePanel.setText(" Tipo de combustible ");
            IngreseTipoDeCombustiblePanel.setForeground(Color.GRAY);
        }

        if (String.valueOf(IngreseNombreDelChoferPanel.getText()).isEmpty()) {
            IngreseNombreDelChoferPanel.setText(" Nombre del chofer ");
            IngreseNombreDelChoferPanel.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseCapacidadPanelMousePressed

    private void IngreseTipoDeCombustiblePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseTipoDeCombustiblePanelMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaPanel.getText()).isEmpty()) {
            IngreseChapaPanel.setText(" Chapa ");
            IngreseChapaPanel.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadPanel.getText()).isEmpty()) {
            IngreseCapacidadPanel.setText(" Capacidad ");
            IngreseCapacidadPanel.setForeground(Color.GRAY);
        }
        if (IngreseTipoDeCombustiblePanel.getText().equals(" Tipo de combustible ")) {
            IngreseTipoDeCombustiblePanel.setText(" ");
            IngreseTipoDeCombustiblePanel.setForeground(Color.BLACK);
        }

        if (String.valueOf(IngreseNombreDelChoferPanel.getText()).isEmpty()) {
            IngreseNombreDelChoferPanel.setText(" Nombre del chofer ");
            IngreseNombreDelChoferPanel.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseTipoDeCombustiblePanelMousePressed

    private void ModificarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPanelActionPerformed
        // TODO add your handling code here:
        modeloPanel.setValueAt(IngreseChapaPanel.getText().trim(), filaSeleccionadaVehiculo, 0);
        modeloPanel.setValueAt(IngreseCapacidadPanel.getText().trim(), filaSeleccionadaVehiculo, 1);
        modeloPanel.setValueAt(IngreseTipoDeCombustiblePanel.getText().trim(), filaSeleccionadaVehiculo, 2);
        modeloPanel.setValueAt(IngreseNombreDelChoferPanel.getText().trim(), filaSeleccionadaVehiculo, 3);

    }//GEN-LAST:event_ModificarPanelActionPerformed

    private void IngreseNombreDelChoferPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNombreDelChoferPanelMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaPanel.getText()).isEmpty()) {
            IngreseChapaPanel.setText(" Chapa ");
            IngreseChapaPanel.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadPanel.getText()).isEmpty()) {
            IngreseCapacidadPanel.setText(" Capacidad ");
            IngreseCapacidadPanel.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustiblePanel.getText()).isEmpty()) {
            IngreseTipoDeCombustiblePanel.setText(" Tipo de combustible ");
            IngreseTipoDeCombustiblePanel.setForeground(Color.GRAY);
        }
        if (IngreseNombreDelChoferPanel.getText().equals(" Nombre del chofer ")) {
            IngreseNombreDelChoferPanel.setText(" ");
            IngreseNombreDelChoferPanel.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_IngreseNombreDelChoferPanelMousePressed

    private void GuardarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPanelActionPerformed
        // TODO add your handling code here:
        int capacidad;

        String[] info = new String[4];
        info[0] = IngreseChapaPanel.getText();

        //Capacidad Panel
        try {
            capacidad = Integer.parseInt(IngreseCapacidadPanel.getText());
            if (capacidad < 0) {

                JOptionPane.showMessageDialog(this, "La capacidad del panel debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La capacidad del panel debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        info[1] = IngreseCapacidadPanel.getText();
        info[2] = IngreseTipoDeCombustiblePanel.getText();
        info[3] = IngreseNombreDelChoferPanel.getText();
        modeloPanel.addRow(info);

        IngreseChapaPanel.setText(" ");
        IngreseCapacidadPanel.setText(" ");
        IngreseTipoDeCombustiblePanel.setText(" ");
        IngreseNombreDelChoferPanel.setText(" ");

        JOptionPane.showMessageDialog(this, "Ha ingresado correctamente");
    }//GEN-LAST:event_GuardarPanelActionPerformed

    private void IngreseChapaTaxiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseChapaTaxiMousePressed
        // TODO add your handling code here:
        if (IngreseChapaTaxi.getText().equals(" Chapa ")) {
            IngreseChapaTaxi.setText(" ");
            IngreseChapaPanel.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseCapacidadTaxi.getText()).isEmpty()) {
            IngreseCapacidadTaxi.setText(" Capacidad ");
            IngreseCapacidadTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustibleTaxi.getText()).isEmpty()) {
            IngreseTipoDeCombustibleTaxi.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreDelChoferTaxi.getText()).isEmpty()) {
            IngreseNombreDelChoferTaxi.setText(" Nombre del chofer ");
            IngreseNombreDelChoferTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseMarcaTaxi.getText()).isEmpty()) {
            IngreseMarcaTaxi.setText(" Marca ");
            IngreseMarcaTaxi.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseChapaTaxiMousePressed

    private void IngreseCapacidadTaxiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseCapacidadTaxiMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaTaxi.getText()).isEmpty()) {
            IngreseChapaTaxi.setText(" Chapa ");
            IngreseChapaPanel.setForeground(Color.GRAY);
        }
        if (IngreseCapacidadTaxi.getText().equals(" Capacidad ")) {
            IngreseCapacidadTaxi.setText(" ");
            IngreseCapacidadTaxi.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseTipoDeCombustibleTaxi.getText()).isEmpty()) {
            IngreseTipoDeCombustibleTaxi.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreDelChoferTaxi.getText()).isEmpty()) {
            IngreseNombreDelChoferTaxi.setText(" Nombre del chofer ");
            IngreseNombreDelChoferTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseMarcaTaxi.getText()).isEmpty()) {
            IngreseMarcaTaxi.setText(" Marca ");
            IngreseMarcaTaxi.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_IngreseCapacidadTaxiMousePressed

    private void IngreseTipoDeCombustibleTaxiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseTipoDeCombustibleTaxiMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaTaxi.getText()).isEmpty()) {
            IngreseChapaTaxi.setText(" Chapa ");
            IngreseChapaPanel.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadTaxi.getText()).isEmpty()) {
            IngreseCapacidadTaxi.setText(" Capacidad ");
            IngreseCapacidadTaxi.setForeground(Color.GRAY);
        }
        if (IngreseTipoDeCombustibleTaxi.getText().equals(" Tipo de combustible ")) {
            IngreseTipoDeCombustibleTaxi.setText(" ");
            IngreseTipoDeCombustibleTaxi.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseNombreDelChoferTaxi.getText()).isEmpty()) {
            IngreseNombreDelChoferTaxi.setText(" Nombre del chofer ");
            IngreseNombreDelChoferTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseMarcaTaxi.getText()).isEmpty()) {
            IngreseMarcaTaxi.setText(" Marca ");
            IngreseMarcaTaxi.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseTipoDeCombustibleTaxiMousePressed

    private void ComboTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTaxiActionPerformed
        // TODO add your handling code here:
        String mensaje = " ";
        mensaje = mensaje + ComboTaxi.getSelectedItem().toString();
        IngreseTipoDeCombustibleTaxi.setText(mensaje);
    }//GEN-LAST:event_ComboTaxiActionPerformed

    private void IngreseNombreDelChoferTaxiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNombreDelChoferTaxiMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaTaxi.getText()).isEmpty()) {
            IngreseChapaTaxi.setText(" Chapa ");
            IngreseChapaPanel.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadTaxi.getText()).isEmpty()) {
            IngreseCapacidadTaxi.setText(" Capacidad ");
            IngreseCapacidadTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustibleTaxi.getText()).isEmpty()) {
            IngreseTipoDeCombustibleTaxi.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleTaxi.setForeground(Color.GRAY);
        }
        if (IngreseNombreDelChoferTaxi.getText().equals(" Nombre del chofer ")) {
            IngreseNombreDelChoferTaxi.setText(" ");
            IngreseNombreDelChoferTaxi.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseMarcaTaxi.getText()).isEmpty()) {
            IngreseMarcaTaxi.setText(" Marca ");
            IngreseMarcaTaxi.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseNombreDelChoferTaxiMousePressed

    private void IngreseMarcaTaxiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseMarcaTaxiMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaTaxi.getText()).isEmpty()) {
            IngreseChapaTaxi.setText(" Chapa ");
            IngreseChapaPanel.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadTaxi.getText()).isEmpty()) {
            IngreseCapacidadTaxi.setText(" Capacidad ");
            IngreseCapacidadTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustibleTaxi.getText()).isEmpty()) {
            IngreseTipoDeCombustibleTaxi.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleTaxi.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreDelChoferTaxi.getText()).isEmpty()) {
            IngreseNombreDelChoferTaxi.setText(" Nombre del chofer ");
            IngreseNombreDelChoferTaxi.setForeground(Color.GRAY);
        }
        if (IngreseMarcaTaxi.getText().equals(" Marca ")) {
            IngreseMarcaTaxi.setText(" ");
            IngreseMarcaTaxi.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_IngreseMarcaTaxiMousePressed

    private void ModificarTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTaxiActionPerformed
        // TODO add your handling code here:
        modeloTaxi.setValueAt(IngreseChapaTaxi.getText().trim(), filaSeleccionadaVehiculo, 0);
        modeloTaxi.setValueAt(IngreseCapacidadTaxi.getText().trim(), filaSeleccionadaVehiculo, 1);
        modeloTaxi.setValueAt(IngreseTipoDeCombustibleTaxi.getText().trim(), filaSeleccionadaVehiculo, 2);
        modeloTaxi.setValueAt(IngreseNombreDelChoferTaxi.getText().trim(), filaSeleccionadaVehiculo, 3);
        modeloTaxi.setValueAt(IngreseMarcaTaxi.getText().trim(), filaSeleccionadaVehiculo, 4);

    }//GEN-LAST:event_ModificarTaxiActionPerformed

    private void GuardarTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTaxiActionPerformed
        // TODO add your handling code here:
        int capacidadTaxi;

        String[] info = new String[5];
        info[0] = IngreseChapaTaxi.getText();

        //Capacidad Taxi
        try {
            capacidadTaxi = Integer.parseInt(IngreseCapacidadTaxi.getText());
            if (capacidadTaxi < 0) {

                JOptionPane.showMessageDialog(this, "La capacidad del taxi debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La capacidad del taxi debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        info[1] = IngreseCapacidadTaxi.getText();
        info[2] = IngreseTipoDeCombustibleTaxi.getText();
        info[3] = IngreseNombreDelChoferTaxi.getText();
        info[4] = IngreseMarcaTaxi.getText();

        modeloTaxi.addRow(info);

        IngreseChapaTaxi.setText(" ");
        IngreseCapacidadTaxi.setText(" ");
        IngreseTipoDeCombustibleTaxi.setText(" ");
        IngreseNombreDelChoferTaxi.setText(" ");
        IngreseMarcaTaxi.setText(" ");

        JOptionPane.showMessageDialog(this, "Ha ingresado correctamente");
    }//GEN-LAST:event_GuardarTaxiActionPerformed

    private void IngreseChapaAutobusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseChapaAutobusMousePressed
        // TODO add your handling code here:
        if (IngreseChapaAutobus.getText().equals(" Chapa ")) {
            IngreseChapaAutobus.setText(" ");
            IngreseChapaAutobus.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseCapacidadAutobus.getText()).isEmpty()) {
            IngreseCapacidadAutobus.setText(" Capacidad ");
            IngreseCapacidadAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustibleAutobus.getText()).isEmpty()) {
            IngreseTipoDeCombustibleAutobus.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreDelChoferAutobus.getText()).isEmpty()) {
            IngreseNombreDelChoferAutobus.setText(" Nombre del chofer ");
            IngreseNombreDelChoferAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCantidadDeMantenimientosAutobus.getText()).isEmpty()) {
            IngreseCantidadDeMantenimientosAutobus.setText(" Cantidad de mantenimientos ");
            IngreseCantidadDeMantenimientosAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseFechaDelProximoMantenimientoAutobus.getText()).isEmpty()) {
            IngreseFechaDelProximoMantenimientoAutobus.setText(" Fecha del próximo mantenimiento ");
            IngreseFechaDelProximoMantenimientoAutobus.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseChapaAutobusMousePressed

    private void IngreseCapacidadAutobusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseCapacidadAutobusMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaAutobus.getText()).isEmpty()) {
            IngreseChapaAutobus.setText(" Chapa ");
            IngreseChapaAutobus.setForeground(Color.GRAY);
        }
        if (IngreseCapacidadAutobus.getText().equals(" Capacidad ")) {
            IngreseCapacidadAutobus.setText(" ");
            IngreseCapacidadAutobus.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseTipoDeCombustibleAutobus.getText()).isEmpty()) {
            IngreseTipoDeCombustibleAutobus.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreDelChoferAutobus.getText()).isEmpty()) {
            IngreseNombreDelChoferAutobus.setText(" Nombre del chofer ");
            IngreseNombreDelChoferAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCantidadDeMantenimientosAutobus.getText()).isEmpty()) {
            IngreseCantidadDeMantenimientosAutobus.setText(" Cantidad de mantenimientos ");
            IngreseCantidadDeMantenimientosAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseFechaDelProximoMantenimientoAutobus.getText()).isEmpty()) {
            IngreseFechaDelProximoMantenimientoAutobus.setText(" Fecha del próximo mantenimiento ");
            IngreseFechaDelProximoMantenimientoAutobus.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_IngreseCapacidadAutobusMousePressed

    private void IngreseTipoDeCombustibleAutobusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseTipoDeCombustibleAutobusMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaAutobus.getText()).isEmpty()) {
            IngreseChapaAutobus.setText(" Chapa ");
            IngreseChapaAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadAutobus.getText()).isEmpty()) {
            IngreseCapacidadAutobus.setText(" Capacidad ");
            IngreseCapacidadAutobus.setForeground(Color.GRAY);
        }
        if (IngreseTipoDeCombustibleAutobus.getText().equals(" Tipo de combustible ")) {
            IngreseTipoDeCombustibleAutobus.setText(" ");
            IngreseTipoDeCombustibleAutobus.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseNombreDelChoferAutobus.getText()).isEmpty()) {
            IngreseNombreDelChoferAutobus.setText(" Nombre del chofer ");
            IngreseNombreDelChoferAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCantidadDeMantenimientosAutobus.getText()).isEmpty()) {
            IngreseCantidadDeMantenimientosAutobus.setText(" Cantidad de mantenimientos ");
            IngreseCantidadDeMantenimientosAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseFechaDelProximoMantenimientoAutobus.getText()).isEmpty()) {
            IngreseFechaDelProximoMantenimientoAutobus.setText(" Fecha del próximo mantenimiento ");
            IngreseFechaDelProximoMantenimientoAutobus.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseTipoDeCombustibleAutobusMousePressed

    private void ComboAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAutobusActionPerformed
        // TODO add your handling code here:
        String mensajeA = " ";
        mensajeA = mensajeA + ComboAutobus.getSelectedItem().toString();
        IngreseTipoDeCombustibleAutobus.setText(mensajeA);
    }//GEN-LAST:event_ComboAutobusActionPerformed

    private void IngreseNombreDelChoferAutobusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNombreDelChoferAutobusMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaAutobus.getText()).isEmpty()) {
            IngreseChapaAutobus.setText(" Chapa ");
            IngreseChapaAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadAutobus.getText()).isEmpty()) {
            IngreseCapacidadAutobus.setText(" Capacidad ");
            IngreseCapacidadAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustibleAutobus.getText()).isEmpty()) {
            IngreseTipoDeCombustibleAutobus.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleAutobus.setForeground(Color.GRAY);
        }
        if (IngreseNombreDelChoferAutobus.getText().equals(" Nombre del chofer ")) {
            IngreseNombreDelChoferAutobus.setText(" ");
            IngreseNombreDelChoferAutobus.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseCantidadDeMantenimientosAutobus.getText()).isEmpty()) {
            IngreseCantidadDeMantenimientosAutobus.setText(" Cantidad de mantenimientos ");
            IngreseCantidadDeMantenimientosAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseFechaDelProximoMantenimientoAutobus.getText()).isEmpty()) {
            IngreseFechaDelProximoMantenimientoAutobus.setText(" Fecha del próximo mantenimiento ");
            IngreseFechaDelProximoMantenimientoAutobus.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseNombreDelChoferAutobusMousePressed

    private void IngreseCantidadDeMantenimientosAutobusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseCantidadDeMantenimientosAutobusMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaAutobus.getText()).isEmpty()) {
            IngreseChapaAutobus.setText(" Chapa ");
            IngreseChapaAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadAutobus.getText()).isEmpty()) {
            IngreseCapacidadAutobus.setText(" Capacidad ");
            IngreseCapacidadAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustibleAutobus.getText()).isEmpty()) {
            IngreseTipoDeCombustibleAutobus.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreDelChoferAutobus.getText()).isEmpty()) {
            IngreseNombreDelChoferAutobus.setText(" Nombre del chofer ");
            IngreseNombreDelChoferAutobus.setForeground(Color.GRAY);
        }
        if (IngreseCantidadDeMantenimientosAutobus.getText().equals(" Cantidad de mantenimientos ")) {
            IngreseCantidadDeMantenimientosAutobus.setText(" ");
            IngreseCantidadDeMantenimientosAutobus.setForeground(Color.BLACK);
        }
        if (String.valueOf(IngreseFechaDelProximoMantenimientoAutobus.getText()).isEmpty()) {
            IngreseFechaDelProximoMantenimientoAutobus.setText(" Fecha del próximo mantenimiento ");
            IngreseFechaDelProximoMantenimientoAutobus.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_IngreseCantidadDeMantenimientosAutobusMousePressed

    private void IngreseFechaDelProximoMantenimientoAutobusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseFechaDelProximoMantenimientoAutobusMousePressed
        // TODO add your handling code here:
        if (String.valueOf(IngreseChapaAutobus.getText()).isEmpty()) {
            IngreseChapaAutobus.setText(" Chapa ");
            IngreseChapaAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCapacidadAutobus.getText()).isEmpty()) {
            IngreseCapacidadAutobus.setText(" Capacidad ");
            IngreseCapacidadAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseTipoDeCombustibleAutobus.getText()).isEmpty()) {
            IngreseTipoDeCombustibleAutobus.setText(" Tipo de combustible ");
            IngreseTipoDeCombustibleAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseNombreDelChoferAutobus.getText()).isEmpty()) {
            IngreseNombreDelChoferAutobus.setText(" Nombre del chofer ");
            IngreseNombreDelChoferAutobus.setForeground(Color.GRAY);
        }
        if (String.valueOf(IngreseCantidadDeMantenimientosAutobus.getText()).isEmpty()) {
            IngreseCantidadDeMantenimientosAutobus.setText(" Cantidad de mantenimientos ");
            IngreseCantidadDeMantenimientosAutobus.setForeground(Color.GRAY);
        }
        if (IngreseFechaDelProximoMantenimientoAutobus.getText().equals(" Fecha del próximo mantenimiento ")) {
            IngreseFechaDelProximoMantenimientoAutobus.setText(" ");
            IngreseFechaDelProximoMantenimientoAutobus.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_IngreseFechaDelProximoMantenimientoAutobusMousePressed

    private void ModificarAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAutobusActionPerformed
        // TODO add your handling code here:
        modeloAutobus.setValueAt(IngreseChapaAutobus.getText().trim(), filaSeleccionadaVehiculo, 0);
        modeloAutobus.setValueAt(IngreseCapacidadAutobus.getText().trim(), filaSeleccionadaVehiculo, 1);
        modeloAutobus.setValueAt(IngreseTipoDeCombustibleAutobus.getText().trim(), filaSeleccionadaVehiculo, 2);
        modeloAutobus.setValueAt(IngreseNombreDelChoferAutobus.getText().trim(), filaSeleccionadaVehiculo, 3);
        modeloAutobus.setValueAt(IngreseCantidadDeMantenimientosAutobus.getText().trim(), filaSeleccionadaVehiculo, 4);
        modeloAutobus.setValueAt(IngreseFechaDelProximoMantenimientoAutobus.getText().trim(), filaSeleccionadaVehiculo, 5);

    }//GEN-LAST:event_ModificarAutobusActionPerformed

    private void GuardarAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAutobusActionPerformed
        // TODO add your handling code here:
        int capacidadAutobus;

        String[] info = new String[6];
        info[0] = IngreseChapaAutobus.getText();

        //Capacidad Autobus
        try {
            capacidadAutobus = Integer.parseInt(IngreseCapacidadAutobus.getText());
            if (capacidadAutobus < 0) {

                JOptionPane.showMessageDialog(this, "La capacidad del autobus debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La capacidad del autobus debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        info[1] = IngreseCapacidadAutobus.getText();
        info[2] = IngreseTipoDeCombustibleAutobus.getText();
        info[3] = IngreseNombreDelChoferAutobus.getText();
        info[4] = IngreseCantidadDeMantenimientosAutobus.getText();
        info[5] = IngreseFechaDelProximoMantenimientoAutobus.getText();

        modeloAutobus.addRow(info);

        IngreseChapaAutobus.setText(" ");
        IngreseCapacidadAutobus.setText(" ");
        IngreseTipoDeCombustibleAutobus.setText(" ");
        IngreseNombreDelChoferAutobus.setText(" ");
        IngreseCantidadDeMantenimientosAutobus.setText(" ");
        IngreseFechaDelProximoMantenimientoAutobus.setText(" ");

        JOptionPane.showMessageDialog(this, "Ha ingresado correctamente");
    }//GEN-LAST:event_GuardarAutobusActionPerformed

    private void EditarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarPanelActionPerformed
        // TODO add your handling code here:
        int fila = TablaPanel.getSelectedRow();
        if (fila >= 0 || fila == -1) {
            IngreseChapaPanel.setText(modeloPanel.getValueAt(TablaPanel.getSelectedRow(), 0).toString());
            IngreseCapacidadPanel.setText(modeloPanel.getValueAt(TablaPanel.getSelectedRow(), 1).toString());
            IngreseTipoDeCombustiblePanel.setText(modeloPanel.getValueAt(TablaPanel.getSelectedRow(), 2).toString());
            IngreseNombreDelChoferPanel.setText(modeloPanel.getValueAt(TablaPanel.getSelectedRow(), 3).toString());

        } else {
            filaSeleccionadaVehiculo = TablaPanel.getSelectedRow();
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EditarPanelActionPerformed

    private void EliminarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPanelActionPerformed
        // TODO add your handling code here:
        int fila = TablaPanel.getSelectedRow();
        if (fila >= 0) {
            modeloPanel.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EliminarPanelActionPerformed

    private void EditarTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarTaxiActionPerformed
        // TODO add your handling code here:
        int fila = TablaTaxi.getSelectedRow();
        if (fila >= 0 || fila == -1) {
            IngreseChapaTaxi.setText(modeloTaxi.getValueAt(TablaTaxi.getSelectedRow(), 0).toString());
            IngreseCapacidadTaxi.setText(modeloTaxi.getValueAt(TablaTaxi.getSelectedRow(), 1).toString());
            IngreseTipoDeCombustibleTaxi.setText(modeloTaxi.getValueAt(TablaTaxi.getSelectedRow(), 2).toString());
            IngreseNombreDelChoferTaxi.setText(modeloTaxi.getValueAt(TablaTaxi.getSelectedRow(), 3).toString());
            IngreseMarcaTaxi.setText(modeloTaxi.getValueAt(TablaTaxi.getSelectedRow(), 4).toString());

        } else {
            filaSeleccionadaVehiculo = TablaTaxi.getSelectedRow();
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EditarTaxiActionPerformed

    private void EliminarTaxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTaxiActionPerformed
        // TODO add your handling code here:
        int fila = TablaTaxi.getSelectedRow();
        if (fila >= 0) {
            modeloTaxi.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EliminarTaxiActionPerformed

    private void EditarAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarAutobusActionPerformed
        // TODO add your handling code here:
        int fila = TablaAutobus.getSelectedRow();
        if (fila >= 0 || fila == -1) {
            IngreseChapaAutobus.setText(modeloAutobus.getValueAt(TablaAutobus.getSelectedRow(), 0).toString());
            IngreseCapacidadAutobus.setText(modeloAutobus.getValueAt(TablaAutobus.getSelectedRow(), 1).toString());
            IngreseTipoDeCombustibleAutobus.setText(modeloAutobus.getValueAt(TablaAutobus.getSelectedRow(), 2).toString());
            IngreseNombreDelChoferAutobus.setText(modeloAutobus.getValueAt(TablaAutobus.getSelectedRow(), 3).toString());
            IngreseCantidadDeMantenimientosAutobus.setText(modeloAutobus.getValueAt(TablaAutobus.getSelectedRow(), 4).toString());
            IngreseFechaDelProximoMantenimientoAutobus.setText(modeloAutobus.getValueAt(TablaAutobus.getSelectedRow(), 5).toString());
        } else {
            filaSeleccionadaVehiculo = TablaAutobus.getSelectedRow();
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EditarAutobusActionPerformed

    private void EliminarAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAutobusActionPerformed
        // TODO add your handling code here:
        int fila = TablaAutobus.getSelectedRow();
        if (fila >= 0) {
            modeloAutobus.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, " Seleccionar fila ");
        }
    }//GEN-LAST:event_EliminarAutobusActionPerformed

    private void PanelPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPrincipalMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_PanelPrincipalMouseClicked

    private void jTabbedPane1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseMoved

    }//GEN-LAST:event_jTabbedPane1MouseMoved

    private void jTabbedPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseExited

    }//GEN-LAST:event_jTabbedPane1MouseExited

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jPanel24MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseMoved
        jPanel24.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel24MouseMoved

    private void jPanel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseExited
        jPanel24.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel24MouseExited

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel21MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseMoved
        jPanel21.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel21MouseMoved

    private void jPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseExited
        jPanel21.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel21MouseExited

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel22MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseMoved
        jPanel22.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel22MouseMoved

    private void jPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseExited
        jPanel22.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel22MouseExited

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel23MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseMoved
        jPanel23.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel23MouseMoved

    private void jPanel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseExited
        jPanel23.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_jPanel23MouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de cerrar la aplicación", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            return;
        }
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void CalcularOrdenRecaudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularOrdenRecaudacionActionPerformed
        try {
            int columna_costo_por_turista = 3;
            int colmuna_cantidad_de_turistas = 1;
            int columna_es_excurcion = 7;
            String[][] datos_tabla_viajes = UtilesTablas.obtenerDatosDeTabla(modeloViajes);
            ArrayList<String[]> excurciones = new ArrayList();
            for (int i = 0; i < datos_tabla_viajes.length; i++) {
                int cantidad_de_turistas = Integer.parseInt(datos_tabla_viajes[i][colmuna_cantidad_de_turistas]);
                double costo_por_turista = Double.parseDouble(datos_tabla_viajes[i][columna_costo_por_turista]);

                String es_excurcion_str = datos_tabla_viajes[i][columna_es_excurcion];
                boolean es_excurcion = es_excurcion_str.equals("si");

                if (es_excurcion) {
                    String[] excurcion = new String[2];
                    excurcion[0] = datos_tabla_viajes[i][0];
                    excurcion[1] = (cantidad_de_turistas * costo_por_turista) + "";
                    excurciones.add(excurcion);
                }

            }

            String[][] datos_tabla_recaudacion =excurciones.toArray(new String[0][]); //new String[excurciones.size()][2];
            Arrays.sort(datos_tabla_recaudacion, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return new Double(o1[1]).compareTo(new Double(o2[1]));
                }
            });

            UtilesTablas.actualizarTabla(modeloRecaudacionViajes, datos_tabla_recaudacion);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Existe un dato no numerico", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_CalcularOrdenRecaudacionActionPerformed

    private void PanelViajesCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_PanelViajesCaretPositionChanged


    }//GEN-LAST:event_PanelViajesCaretPositionChanged

    private void ImprimirOrdenRecaudacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirOrdenRecaudacion1ActionPerformed
        UtilesTablas.crearTXTconContenidoDeTabla(modeloRecaudacionViajes, "Recaudación de Excursiones");
    }//GEN-LAST:event_ImprimirOrdenRecaudacion1ActionPerformed

    private void ActualizarTablaDestinosAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarTablaDestinosAutobusActionPerformed
        int columna_tipo_vehiculo = 2;
        String tipo_buscado = "Autobus";
        String[][] datos_tabla_viajes = UtilesTablas.obtenerDatosDeTabla(modeloViajes);
        ArrayList<String[]> contenido_para_tabla_tipo = new ArrayList<>();

        for (int i = 0; i < datos_tabla_viajes.length; i++) {
            String tipo_de_esta_columna = datos_tabla_viajes[i][columna_tipo_vehiculo].trim();
            if (tipo_de_esta_columna.equals(tipo_buscado)) {
                String[] fila = new String[2];
                fila[0] = datos_tabla_viajes[i][0];
                fila[1] = tipo_buscado;
                contenido_para_tabla_tipo.add(fila);
            }
        }
        String[][] datos_tabla_tipo = contenido_para_tabla_tipo.toArray(new String[contenido_para_tabla_tipo.size()][2]);

        UtilesTablas.actualizarTabla(modeloViajesAutobus, datos_tabla_tipo);
    }//GEN-LAST:event_ActualizarTablaDestinosAutobusActionPerformed

    private void ImprimirTablaDestinosAutobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirTablaDestinosAutobusActionPerformed
        UtilesTablas.crearTXTconContenidoDeTabla(modeloViajesAutobus, "Viajes en Autobús");
    }//GEN-LAST:event_ImprimirTablaDestinosAutobusActionPerformed

    private void BCalcularUtilesViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCalcularUtilesViajesActionPerformed
        String[][] datosTablaViajes = UtilesTablas.obtenerDatosDeTabla(modeloViajes);
        int columna_cantidad_de_personas = 1;
        int columna_costo_por_turista = 3;
        int columna_son_turistas = 6;
        int columna_es_excurcion = 7;
        int columna_hotel_o_centro = 5;
        int columna_combustible = 8;

        int suma_cantidad_de_turistas = 0;
        int suma_cantidad_de_cubanos = 0;
        int suma_cantidad_de_excurciones = 0;
        int suma_cantidad_de_viajes = 0;
        int columna_vehiculo = 2;
        double suma_total_de_dinero_excurciones = 0;
        double suma_total_de_dinero_viajes = 0;
        double suma_total_de_dinero_turistas = 0;
        double suma_total_de_dinero_cubanos = 0;
        int suma_cantidad_de_turistas_excurciones = 0;
        int suma_cantidad_de_turistas_viajes = 0;
        int suma_diesel = 0;
        int suma_gasolina = 0;
        HashMap<String, Integer> centro_cantidad_extranjeros_en_excurciones = new HashMap<>();
        for (int i = 0; i < datosTablaViajes.length; i++) {
            String[] fila = datosTablaViajes[i];

            String costo_por_persona_str = fila[columna_costo_por_turista];
            if (!comprobarNumero(costo_por_persona_str)) {
                JOptionPane.showMessageDialog(this, "Existe un dato que no es un numero entero en los costos basicos", "Error", JOptionPane.ERROR_MESSAGE);
                setDatosVacioUtilesViajes();
                return;
            }
            double costo_por_persona = Double.parseDouble(costo_por_persona_str);

            String cantidad_de_personas_str = fila[columna_cantidad_de_personas];
            if (!comprobarNumero(cantidad_de_personas_str)) {
                JOptionPane.showMessageDialog(this, "Existe un dato que no es un numero entero en la cantidad de personas", "Error", JOptionPane.ERROR_MESSAGE);
                setDatosVacioUtilesViajes();
                return;
            }
            int cantidad_de_personas = Integer.parseInt(cantidad_de_personas_str);

            String son_turistas_str = fila[columna_son_turistas];
            String es_excurcion_str = fila[columna_es_excurcion];
            boolean son_turistas = son_turistas_str.equals("si");
            boolean es_excurcion = es_excurcion_str.equals("si");
            String combustible = fila[columna_combustible];

            String hotel_o_centro = fila[columna_hotel_o_centro];
            String vehiculo = fila[columna_vehiculo];

            double dinero_recaudado = cantidad_de_personas * costo_por_persona;

            if (son_turistas) {
                suma_cantidad_de_turistas += cantidad_de_personas;
                suma_total_de_dinero_turistas += dinero_recaudado;
            } else {
                suma_cantidad_de_cubanos += cantidad_de_personas;
                suma_total_de_dinero_cubanos += dinero_recaudado;
            }
            if (es_excurcion) {
                suma_cantidad_de_excurciones++;
                suma_total_de_dinero_excurciones += dinero_recaudado;
                if (son_turistas) {
                    suma_cantidad_de_turistas_excurciones++;
                    if (centro_cantidad_extranjeros_en_excurciones.containsKey(hotel_o_centro)) {
                        int cantidad_anterior = centro_cantidad_extranjeros_en_excurciones.get(hotel_o_centro);
                        centro_cantidad_extranjeros_en_excurciones.put(hotel_o_centro, cantidad_anterior + cantidad_de_personas);
                    } else {
                        centro_cantidad_extranjeros_en_excurciones.put(hotel_o_centro, cantidad_de_personas);
                    }
                }
            } else {
                suma_cantidad_de_viajes++;
                suma_total_de_dinero_viajes += dinero_recaudado;
                if (son_turistas) {
                    suma_cantidad_de_turistas_viajes++;
                }
            }

            if (combustible.equals("Diesel")) {
                suma_diesel++;
            }
            if (combustible.equals("Gasolina")) {
                suma_gasolina++;
            }

        }
        TCantidadRecaudacionExcursiones.setText(suma_total_de_dinero_excurciones + "");
        TCantidadRecaudacionViajes.setText(suma_total_de_dinero_viajes + "");
        TCantidadRecaudacionClientesNacionales.setText(suma_total_de_dinero_cubanos + "");
        TCantidadRecaudacionClientesExtranjeros.setText(suma_total_de_dinero_turistas + "");
        TCantidadTuristasEnViajes.setText(suma_cantidad_de_turistas_viajes + "");
        TCantidadTuristasEnExcursiones.setText(suma_cantidad_de_turistas_excurciones + "");

        String centro_popular = centro_cantidad_extranjeros_en_excurciones.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        THotelMasPopular.setText(centro_popular != null ? centro_popular : "----");

        TVehiculosCondieselEnViajes.setText(suma_diesel + "");
        TVehiculosconGasolinaEnViajes.setText(suma_gasolina + "");
    }//GEN-LAST:event_BCalcularUtilesViajesActionPerformed

    private void IngreseNombreGuiaUtilesViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNombreGuiaUtilesViajeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreseNombreGuiaUtilesViajeMousePressed

    private void BCalcularCantidadDeViajesGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCalcularCantidadDeViajesGuiaActionPerformed
        String nombre_guia_esperado = IngreseNombreGuiaUtilesViaje.getText();
        if (nombre_guia_esperado.isEmpty()) {
            TCantidadDeViajesGuia.setText("-------");
            JOptionPane.showMessageDialog(this, "No debe estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String[][] datosTablaViajes = UtilesTablas.obtenerDatosDeTabla(modeloViajes);
        int columna_nombre_del_guia = 4;
        int columna_es_excurcion = 7;

        int cantidad_excurciones_guia = 0;
        boolean se_encontro = false;
        for (int i = 0; i < datosTablaViajes.length; i++) {
            String[] fila = datosTablaViajes[i];
            String nombre_del_guia = fila[columna_nombre_del_guia];
            String es_excurcion_str = fila[columna_es_excurcion];
            boolean es_excurcion = es_excurcion_str.equals("si");
            if (es_excurcion && nombre_del_guia.trim().equals(nombre_guia_esperado.trim())) {
                cantidad_excurciones_guia++;
            }

        }
        TCantidadDeViajesGuia.setText(cantidad_excurciones_guia + "");
    }//GEN-LAST:event_BCalcularCantidadDeViajesGuiaActionPerformed

    private void IngreseNumeroViajeBuscarViajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngreseNumeroViajeBuscarViajeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreseNumeroViajeBuscarViajeMousePressed

    private void IngreseNumeroViajeBuscarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreseNumeroViajeBuscarViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngreseNumeroViajeBuscarViajeActionPerformed

    private void BBuscarDatosViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBuscarDatosViajesActionPerformed
        String numeroDeViajeABuscar = IngreseNumeroViajeBuscarViaje.getText();
        if (numeroDeViajeABuscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No debe estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
//        int numeroDelViaje = 1;
//        try {
//            numeroDelViaje = Integer.parseInt(numeroDeViajeABuscar);
//            if (numeroDelViaje < 0) {
//                JOptionPane.showMessageDialog(this, "El número del viaje debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//        } catch (HeadlessException | NumberFormatException e) {
//            JOptionPane.showMessageDialog(this, "El número del viaje debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }
        String[][] datosTablaViajes = UtilesTablas.obtenerDatosDeTabla(modeloViajes);
        int columna_numero_de_viaje = 0;
        int columna_cantidad_de_personas = 1;
        int columna_nombre_del_guia = 4;
        int columna_vehiculo = 2;
        int columna_costo_basico = 3;
        int columna_hotel_o_centro = 5;
        int columna_son_turistas = 6;
        int columna_es_excurcion = 7;
        int columna_combustible = 8;
        boolean se_encontro = false;
        for (int i = 0; i < datosTablaViajes.length; i++) {
            String[] fila = datosTablaViajes[i];
            String numeroDeViaje = fila[columna_numero_de_viaje];
            if (numeroDeViaje.equals(numeroDeViajeABuscar)) {
                se_encontro = true;
                String cantidad_de_personas = fila[columna_cantidad_de_personas];
                String nombre_del_guia = fila[columna_nombre_del_guia];
                String vehiculo = fila[columna_vehiculo];
                String costo_basico = fila[columna_costo_basico];
                String hotel_o_centro = fila[columna_hotel_o_centro];
                String combustible = fila[columna_combustible];
                String son_turistas_str = fila[columna_son_turistas];
                String es_excurcion_str = fila[columna_es_excurcion];
                boolean son_turistas = son_turistas_str.equals("si");
                boolean es_excurcion = es_excurcion_str.equals("si");
                System.out.println(son_turistas);
                System.out.println(es_excurcion);
                TCantidadDePersonasBuscarViaje.setText(cantidad_de_personas);
                TVehiculoBuscarViaje.setText(vehiculo);
                TPrecioBasicoBuscarViaje.setText(costo_basico);
                TNombreDeGuiaBuscarViaje.setText(nombre_del_guia);
                TCantidadDePersonasBuscarViaje.setText(cantidad_de_personas);
                THotelOCentroBuscarViaje.setText(hotel_o_centro);
                CBSonTuristasUtilesviajes.setSelected(son_turistas);
                CBEsUnaExcurcionUtilesviajes.setSelected(es_excurcion);
                TCombustibleBuscarViaje.setText(combustible + "");
            }
        }

        if (!se_encontro) {
            String texto_vacio = "---------";
            TCantidadDePersonasBuscarViaje.setText(texto_vacio);
            TVehiculoBuscarViaje.setText(texto_vacio);
            TPrecioBasicoBuscarViaje.setText(texto_vacio);
            TNombreDeGuiaBuscarViaje.setText(texto_vacio);
            TCantidadDePersonasBuscarViaje.setText(texto_vacio);
            THotelOCentroBuscarViaje.setText(texto_vacio);
            CBSonTuristasUtilesviajes.setSelected(false);
            CBEsUnaExcurcionUtilesviajes.setSelected(false);
            JOptionPane.showMessageDialog(this, "No se encontró el viaje buscado.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_BBuscarDatosViajesActionPerformed

    private void ImprimirUtilesViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirUtilesViajesActionPerformed

        ArrayList<String> lineas = new ArrayList<>();
        lineas.add("++++++++++++++++  Estadisticas ++++++++++++++++++++++");
        lineas.add("Recaudacion Excursiones :" + TCantidadRecaudacionExcursiones.getText());
        lineas.add("Recaudacion Viajes :" + TCantidadRecaudacionViajes.getText());
        lineas.add("Recaudacion Clientes Nacionales :" + TCantidadRecaudacionClientesNacionales.getText());
        lineas.add("Recaudacion Clientes Extranjeros :" + TCantidadRecaudacionClientesExtranjeros.getText());
        lineas.add("Total Turistas en Viajes :" + TCantidadTuristasEnViajes.getText());
        lineas.add("Total Turistas en Excursiones  :" + TCantidadTuristasEnExcursiones.getText());
        lineas.add("Mas Popular  :" + THotelMasPopular.getText());
        lineas.add("Vehículos con Diesel usados :" + TVehiculosCondieselEnViajes.getText());
        lineas.add("Vehículos con Gasolina usados :" + TVehiculosconGasolinaEnViajes.getText());
        lineas.add("");
        lineas.add("");
        lineas.add("");
        lineas.add("++++++++++++++++  Nota Encontrada ++++++++++++++++++++++");
        lineas.add("Número del Viaje :" + IngreseNumeroViajeBuscarViaje.getText());
        lineas.add("Cantidad De Personas :" + TCantidadDePersonasBuscarViaje.getText());
        lineas.add("Vehículo :" + TVehiculoBuscarViaje.getText());
        lineas.add("Precio Básico :" + TPrecioBasicoBuscarViaje.getText());
        lineas.add("Nombre de Guía :" + TNombreDeGuiaBuscarViaje.getText());
        lineas.add("Hotel o Centro Recreativo :" + THotelOCentroBuscarViaje.getText());
        lineas.add("Combustible :" + TCombustibleBuscarViaje.getText());
        lineas.add("Son Turistas :" + CBSonTuristasUtilesviajes.isSelected());
        lineas.add("Es una Excursión :" + CBEsUnaExcurcionUtilesviajes.getText());
        lineas.add("");
        lineas.add("");
        lineas.add("");
        lineas.add("++++++++++++++++  Guia Excurciones ++++++++++++++++++++++");
        lineas.add("Nombre del Guía :" + IngreseNombreGuiaUtilesViaje.getText());
        lineas.add("Excurciones :" + TCantidadDeViajesGuia.getText());
        lineas.add("");
        lineas.add("");
        lineas.add("");
        lineas.add("++++++++++++++++  Excurciones Sobresalientes ++++++++++++++++++++++");
        lineas.add("cantidad de personas esperada :" + InputCantidadDePersonasParaCantidadDeViajes.getText());
        lineas.add("Cantidad De Excursiones  :" + TCantidadDeViajesPorCantidadDePersonas.getText());

        UtilesArchivo.crearTXT("Reporte Utiles Viajes", lineas.toArray(new String[0]));


    }//GEN-LAST:event_ImprimirUtilesViajesActionPerformed

    private void InputCantidadDePersonasParaCantidadDeViajesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InputCantidadDePersonasParaCantidadDeViajesMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCantidadDePersonasParaCantidadDeViajesMousePressed

    private void BCalcularCantidadDeViajesDeCantidadDeTuristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCalcularCantidadDeViajesDeCantidadDeTuristasActionPerformed
        String cantidad_de_personas_str = InputCantidadDePersonasParaCantidadDeViajes.getText();
        if (cantidad_de_personas_str.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No debe estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            setDatosVacioCalcularCantidadPorEncimaDeTuristas();
            return;
        }
        int cantidad_de_personas_esperada = 1;
        try {
            cantidad_de_personas_esperada = Integer.parseInt(cantidad_de_personas_str);
            if (cantidad_de_personas_esperada < 0) {
                JOptionPane.showMessageDialog(this, "La cantidad de turistas debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
                setDatosVacioCalcularCantidadPorEncimaDeTuristas();
                return;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La cantidad de turistas debe ser un número positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            setDatosVacioCalcularCantidadPorEncimaDeTuristas();
            return;
        }

        String[][] datosTablaViajes = UtilesTablas.obtenerDatosDeTabla(modeloViajes);
        int columna_cantidad_de_personas = 1;
        int columna_es_excurcion = 7;
        int suma = 0;
        for (int i = 0; i < datosTablaViajes.length; i++) {
            String[] fila = datosTablaViajes[i];
            String cantidad_de_personas_en_tabla_str = fila[columna_cantidad_de_personas];
            if (!comprobarNumero(cantidad_de_personas_en_tabla_str)) {
                JOptionPane.showMessageDialog(this, "Existe un dato que no es un numero entero en la cantidad de personas", "Error", JOptionPane.ERROR_MESSAGE);
                setDatosVacioCalcularCantidadPorEncimaDeTuristas();
                return;
            }
            int cantidad_de_personas = Integer.parseInt(cantidad_de_personas_en_tabla_str);

            String es_excurcion_str = fila[columna_es_excurcion];
            boolean es_excurcion = es_excurcion_str.equals("si");

            if (es_excurcion && cantidad_de_personas > cantidad_de_personas_esperada) {
                suma++;
            }

        }
        TCantidadDeViajesPorCantidadDePersonas.setText(suma + "");
    }//GEN-LAST:event_BCalcularCantidadDeViajesDeCantidadDeTuristasActionPerformed

    private void CBXCombustibleViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXCombustibleViajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXCombustibleViajesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarTablaDestinosAutobus;
    private javax.swing.JLabel Autobus;
    private javax.swing.JButton BBuscarDatosViajes;
    private javax.swing.JButton BCalcularCantidadDeViajesDeCantidadDeTuristas;
    private javax.swing.JButton BCalcularCantidadDeViajesGuia;
    private javax.swing.JButton BCalcularUtilesViajes;
    private javax.swing.JCheckBox CBEsUnaExcurcion;
    private javax.swing.JCheckBox CBEsUnaExcurcionUtilesviajes;
    private javax.swing.JCheckBox CBSonTuristas;
    private javax.swing.JCheckBox CBSonTuristasUtilesviajes;
    private javax.swing.JComboBox<String> CBXCombustibleViajes;
    private javax.swing.JButton CalcularOrdenRecaudacion;
    private javax.swing.JLabel CantidadDeMantenimientos;
    private javax.swing.JLabel CantidadDePersonaViaje;
    private javax.swing.JLabel CapacidadAutobus;
    private javax.swing.JLabel CapacidadPanel;
    private javax.swing.JLabel CapacidadTaxi;
    private javax.swing.JLabel CarneDeIdentidadCubano;
    private javax.swing.JLabel ChapaAutobus;
    private javax.swing.JLabel ChapaPanel;
    private javax.swing.JLabel ChapaTaxi;
    private javax.swing.JComboBox<String> ComboAutobus;
    private javax.swing.JComboBox<String> ComboHaViajadoAntesCubano;
    private javax.swing.JComboBox<String> ComboHaViajadoAntesExtranjero;
    private javax.swing.JComboBox<String> ComboSexoCubano;
    private javax.swing.JComboBox<String> ComboSexoExtranjero;
    private javax.swing.JComboBox<String> ComboTaxi;
    private javax.swing.JComboBox<String> ComboViaje;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel Cubano;
    private javax.swing.JLabel DNIExtranjero;
    private javax.swing.JLabel DireccionCubano;
    private javax.swing.JButton EditarAutobus;
    private javax.swing.JButton EditarCubano;
    private javax.swing.JButton EditarExtranjero;
    private javax.swing.JButton EditarPanel;
    private javax.swing.JButton EditarTaxi;
    private javax.swing.JButton EditarViajes;
    private javax.swing.JButton EliminarAutobus;
    private javax.swing.JButton EliminarCubano;
    private javax.swing.JButton EliminarExtranjero;
    private javax.swing.JButton EliminarPanel;
    private javax.swing.JButton EliminarTaxi;
    private javax.swing.JButton EliminarViajes;
    private javax.swing.JLabel Extranjero;
    private javax.swing.JLabel FechaDelProximoMantenimiento;
    private javax.swing.JButton GuardarAutobus;
    private javax.swing.JButton GuardarCuabano;
    private javax.swing.JButton GuardarExtranjero;
    private javax.swing.JButton GuardarPanel;
    private javax.swing.JButton GuardarTaxi;
    private javax.swing.JButton GuardarViaje;
    private javax.swing.JLabel HaViajadoAntesCubano;
    private javax.swing.JLabel HaViajadoAntesExtranjero;
    private javax.swing.JLabel HotelCentroRecreativoViaje;
    private javax.swing.JButton ImprimirOrdenRecaudacion1;
    private javax.swing.JButton ImprimirTablaDestinosAutobus;
    private javax.swing.JButton ImprimirUtilesViajes;
    private javax.swing.JTextField IngreseCantidadDeMantenimientosAutobus;
    private javax.swing.JTextField IngreseCantidadDePersonasViaje;
    private javax.swing.JTextField IngreseCapacidadAutobus;
    private javax.swing.JTextField IngreseCapacidadPanel;
    private javax.swing.JTextField IngreseCapacidadTaxi;
    private javax.swing.JTextField IngreseCarneDeIdentidadCubano;
    private javax.swing.JTextField IngreseChapaAutobus;
    private javax.swing.JTextField IngreseChapaPanel;
    private javax.swing.JTextField IngreseChapaTaxi;
    private javax.swing.JTextField IngreseDNIExtranjero;
    private javax.swing.JTextField IngreseDireccionCubano;
    private javax.swing.JTextField IngreseFechaDelProximoMantenimientoAutobus;
    private javax.swing.JTextField IngreseHaViajadoAntesCubano;
    private javax.swing.JTextField IngreseHaViajadoAntesTransturExtranjero;
    private javax.swing.JTextField IngreseHotelCentroRecreativoViaje;
    private javax.swing.JTextField IngreseMarcaTaxi;
    private javax.swing.JTextField IngreseNacionalidadExtranjero;
    private javax.swing.JTextField IngreseNombreCubano;
    private javax.swing.JTextField IngreseNombreDelChoferAutobus;
    private javax.swing.JTextField IngreseNombreDelChoferPanel;
    private javax.swing.JTextField IngreseNombreDelChoferTaxi;
    private javax.swing.JTextField IngreseNombreExtranjero;
    private javax.swing.JTextField IngreseNombreGuiaUtilesViaje;
    private javax.swing.JTextField IngreseNombreGuiaViaje;
    private javax.swing.JTextField IngreseNumeroPasaporteExtranjero;
    private javax.swing.JTextField IngreseNumeroViaje;
    private javax.swing.JTextField IngreseNumeroViajeBuscarViaje;
    private javax.swing.JTextField IngresePaisDeOrigenExtranjero;
    private javax.swing.JTextField IngresePrecioBasicoCubano;
    private javax.swing.JTextField IngresePrecioBasicoExtranjero;
    private javax.swing.JTextField IngresePrecioBasicoViaje;
    private javax.swing.JTextField IngreseSexoCubano;
    private javax.swing.JTextField IngreseSexoExtranjero;
    private javax.swing.JTextField IngreseTipoDeCombustibleAutobus;
    private javax.swing.JTextField IngreseTipoDeCombustiblePanel;
    private javax.swing.JTextField IngreseTipoDeCombustibleTaxi;
    private javax.swing.JTextField InputCantidadDePersonasParaCantidadDeViajes;
    private javax.swing.JLabel MarcaTaxi;
    private javax.swing.JButton ModificarAutobus;
    private javax.swing.JButton ModificarCubano;
    private javax.swing.JButton ModificarExtranjero;
    private javax.swing.JButton ModificarPanel;
    private javax.swing.JButton ModificarTaxi;
    private javax.swing.JButton ModificarViaje;
    private javax.swing.JLabel MostarR;
    private javax.swing.JLabel NacionalidadExtranjero;
    private javax.swing.JLabel NombreCubano;
    private javax.swing.JLabel NombreDelChoferAutobus;
    private javax.swing.JLabel NombreDelChoferPanel;
    private javax.swing.JLabel NombreDelChoferTaxi;
    private javax.swing.JLabel NombreDelGuiaViaje;
    private javax.swing.JLabel NombreDelGuiaViaje2;
    private javax.swing.JLabel NombreDelGuiaViaje3;
    private javax.swing.JLabel NombreExtranjero;
    private javax.swing.JLabel NumeroDeViaje;
    private javax.swing.JLabel NumeroDeViaje1;
    private javax.swing.JLabel NumeroPasaporteExtranjero;
    private javax.swing.JLabel PaisDeOrigenExtranjero;
    private javax.swing.JLabel Panel;
    private javax.swing.JPanel PanelAutobus;
    private javax.swing.JPanel PanelCubano;
    private javax.swing.JPanel PanelExtranjero;
    private javax.swing.JPanel PanelPanel;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTaxi;
    private javax.swing.JTabbedPane PanelViajes;
    private javax.swing.JLabel PrecioBasicoCubano;
    private javax.swing.JLabel PrecioBasicoExtranjero;
    private javax.swing.JLabel PrecioBasicoViaje;
    private javax.swing.JLabel RecaudacionClientesInternacionales;
    private javax.swing.JLabel RecaudacionClientesInternacionales1;
    private javax.swing.JLabel RecaudacionClientesNacionales;
    private javax.swing.JLabel RecaudacionClientesNacionales1;
    private javax.swing.JLabel RecaudacionViajes1;
    private javax.swing.JLabel RecaudacionViajes2;
    private javax.swing.JLabel RecaudacionViajes3;
    private javax.swing.JLabel SexoCubano;
    private javax.swing.JLabel SexoExtranjero;
    private javax.swing.JLabel TCantidadDePersonasBuscarViaje;
    private javax.swing.JLabel TCantidadDeViajesGuia;
    private javax.swing.JLabel TCantidadDeViajesPorCantidadDePersonas;
    private javax.swing.JLabel TCantidadRecaudacionClientesExtranjeros;
    private javax.swing.JLabel TCantidadRecaudacionClientesNacionales;
    private javax.swing.JLabel TCantidadRecaudacionExcursiones;
    private javax.swing.JLabel TCantidadRecaudacionViajes;
    private javax.swing.JLabel TCantidadTuristasEnExcursiones;
    private javax.swing.JLabel TCantidadTuristasEnViajes;
    private javax.swing.JLabel TCombustibleBuscarViaje;
    private javax.swing.JLabel THotelMasPopular;
    private javax.swing.JLabel THotelOCentroBuscarViaje;
    private javax.swing.JLabel TNombreDeGuiaBuscarViaje;
    private javax.swing.JLabel TPrecioBasicoBuscarViaje;
    private javax.swing.JLabel TVehiculoBuscarViaje;
    private javax.swing.JLabel TVehiculosCondieselEnViajes;
    private javax.swing.JLabel TVehiculosconGasolinaEnViajes;
    private javax.swing.JTable TablaAutobus;
    private javax.swing.JTable TablaCubano;
    private javax.swing.JTable TablaDeViaje;
    private javax.swing.JTable TablaDestinosAutobus;
    private javax.swing.JTable TablaExtranjero;
    private javax.swing.JTable TablaOrdenRecaudacion;
    private javax.swing.JTable TablaPanel;
    private javax.swing.JTable TablaTaxi;
    private javax.swing.JLabel Taxi;
    private javax.swing.JLabel TipoDeCombustibleAutobus;
    private javax.swing.JLabel TipoDeCombustiblePanel;
    private javax.swing.JLabel TipoDeCombustibleTaxi;
    private javax.swing.JLabel TipoDeCombustibleTaxi1;
    private javax.swing.JLabel VehiculoViaje;
    private javax.swing.JLabel VehiculoViaje1;
    private javax.swing.JLabel VehiculoViaje2;
    private javax.swing.JPanel Viaje;
    private javax.swing.JLabel Viajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        Cubano cubano1 = new Cubano("Ana", "F", true, 250, "123456789", "Calle 123, La Habana");
        Extranjero extranjero = new Extranjero("Emma", "F", true, 500, "Brasil", "Brasileña", "253796450", "BE125676");
        Cubano cubano2 = new Cubano("Emily", "F", true, 270, "329371852", "Calle 12, Matanza");
        ArrayList<Persona> cubanos = new ArrayList<>();
        cubanos.add(cubano1);
        cubanos.add(cubano2);
        Viajes viajes1 = new Viajes(1, 2, "Taxi", 100.0, "Juan", cubanos);
        ArrayList<Persona> extranjeros = new ArrayList<>();
        extranjeros.add(extranjero);
        Viajes viajes2 = new Viajes(2, 3, "Panel", 300.0, "Juan", extranjeros);
        ArrayList<Viajes> viajes_lista = new ArrayList<>();
        viajes_lista.add(viajes1);
        viajes_lista.add(viajes2);
        EmpresaTranstur empresa = new EmpresaTranstur(viajes_lista);
        Pag1 pag1 = new Pag1();
        pag1.setVisible(true);

    }

    private int buscarElemento(String elemento) {
        for (int i = 0; i < model.getSize(); i++) {
            String elementoPos = model.get(i);
            String[] listaPos = elementoPos.split(" ");
            String[] listaElementos = elemento.split(" ");
            if (listaPos[0].compareTo(listaElementos[0]) == 0) {
                return 1;
            }
            if (listaPos[1].toLowerCase().compareTo(listaElementos[1].toLowerCase(Locale.ITALY)) == 0) {
                return 2;
            }
        }
        return 0;

    }

    public void setDatosVacioUtilesViajes() {
        String datos_vacio = "--------";
        TCantidadRecaudacionViajes.setText(datos_vacio);
        TCantidadRecaudacionClientesNacionales.setText(datos_vacio);
        TCantidadRecaudacionClientesExtranjeros.setText(datos_vacio);
        TCantidadTuristasEnViajes.setText(datos_vacio);
        THotelMasPopular.setText(datos_vacio);
        TVehiculosCondieselEnViajes.setText(datos_vacio);
        TVehiculosconGasolinaEnViajes.setText(datos_vacio);

    }

    public void setDatosVacioCalcularCantidadPorEncimaDeTuristas() {
        TCantidadDeViajesPorCantidadDePersonas.setText("--------");
    }

    public boolean comprobarNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (HeadlessException | NumberFormatException e) {
            //JOptionPane.showMessageDialog(this, "Existe un dato que no es numérico", "Error", JOptionPane.ERROR_MESSAGE);

        }
        return false;
    }

    public boolean comprobarNumeroDouble(String numero) {
        try {
            Double.parseDouble(numero);
            return true;
        } catch (HeadlessException | NumberFormatException e) {
            //JOptionPane.showMessageDialog(this, "Existe un dato que no es numérico", "Error", JOptionPane.ERROR_MESSAGE);

        }
        return false;
    }

    public int getIndiceComboboxVehiculoViajes(String nombre) {
        for (int i = 0; i < ComboViaje.getItemCount(); i++) {
            String item = ComboViaje.getItemAt(i).toString();
            if (item.trim().equals(nombre.trim())) {
                return i;
            }
        }
        return 0;
    }

    public int getIndiceComboboxCombustible(String nombre) {
        for (int i = 0; i < CBXCombustibleViajes.getItemCount(); i++) {
            String item = CBXCombustibleViajes.getItemAt(i).toString();
            if (item.trim().equals(nombre.trim())) {
                return i;
            }
        }
        return 0;
    }

}
