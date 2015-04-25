/*********************** conexion/MySqlDBConexion */
public class MySqlDBConexion {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public static Connection getConexion(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/bd_lpii",
					"root",
					"mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
/*********************** interfaces/DepartamentoDAO */
public interface DepartamentoDAO {
	// la interfaz define los metodos de acceso a datos
	public int insertar(Departamento obj);	
	public List<Departamento> listar();
}
/*********************** dao/MySqlDepartamentoDAO */
public class MySqlDepartamentoDAO implements DepartamentoDAO {
	@Override
	public int insertar(Departamento obj) {
		Connection conn = null;
		PreparedStatement pstm = null;
		int salida = 0;
		try {
			String sql = "INSERT INTO tb_departamento VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
			conn = MySqlDBConexion.getConexion();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, obj.getNumero());
			pstm.setString(2, obj.getEdificio());
			pstm.setDouble(3, obj.getAreatotal());
			pstm.setDouble(4, obj.getAreaconstruida());
			pstm.setInt(5, obj.getHabitaciones());
			pstm.setInt(6, obj.getPiso());
			pstm.setDouble(7, obj.getPrecio());
			salida = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null)
					pstm.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return salida;
	}
	@Override
	public List<Departamento> listar() {
		return null;
	}
}
/*********************** factory/Factory */
import interfaces.DepartamentoDAO;
public abstract class Factory {
	// Constantes de clase
	public static final int TIPO_MYSQL = 1;
	public static final int TIPO_SQLSERVER = 2;
	// Definir el metodo que recibe el DAO a utilizar
	public abstract DepartamentoDAO getDepartamentoDAO();
	// Metodo para obtener la sub fabrica
	public static Factory getFactory(int tipo){
		switch (tipo) {
		case TIPO_MYSQL:
			return new MySqlFactory();
		case TIPO_SQLSERVER:
			return null;
		default:
			return null;
		}
	}
}
/* factory/MySqlFactory */
public class MySqlFactory extends Factory {
	@Override
	public DepartamentoDAO getDepartamentoDAO() {
		// Debe retornar el objeto DAO Concreto:
		return new MySqlDepartamentoDAO();
	}
}
/*********************** service/DepartamentoService */
public class DepartamentoService {
	// Para encapsular todo el acceso al dao factory,
	// se usara una clase intermedia Service
	Factory factory = Factory.getFactory(Factory.TIPO_MYSQL);
	DepartamentoDAO dao = factory.getDepartamentoDAO();
	// definir metodos similares
	public int insertar(Departamento obj) {
		return dao.insertar(obj);
	}
	public List<Departamento> listar() {
		return dao.listar();
	}
}
/*********************** servlet/ServletDepartamento */
public class ServletDepartamento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Definir el service que usará el Servlet
	private DepartamentoService service = new DepartamentoService();

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtener los datos del JSP
		String numero = request.getParameter("numero");
		String edificio = request.getParameter("edificio");
		double areatotal = Double.parseDouble(request.getParameter("areatotal"));
		double areaconstruida = Double.parseDouble(request.getParameter("areaconstruida"));
		int habitaciones = Integer.parseInt(request.getParameter("habitaciones"));
		int piso = Integer.parseInt(request.getParameter("piso"));
		double precio = Double.parseDouble(request.getParameter("precio"));
		// Se crea un objeto
		Departamento obj = new Departamento();
		obj.setNumero(numero);
		obj.setEdificio(edificio);
		obj.setAreatotal(areatotal);
		obj.setAreaconstruida(areaconstruida);
		obj.setHabitaciones(habitaciones);
		obj.setPiso(piso);
		obj.setPrecio(precio);
		// Se invoca al service
		int salida = service.insertar(obj);
		if(salida > 0)
			System.out.println("Se registró");
		else
			System.out.println("No se registró");
		// Redireccion al mismo JSP 
		request.getRequestDispatcher("/registro.jsp").forward(request, response);
	}
}
