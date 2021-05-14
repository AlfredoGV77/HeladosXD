package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.text.*;

public final class ProductoRegistrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro de Productos</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Connection con = null;
            Statement set = null;
            ResultSet rs = null;
            
            String url, userName, password, driver;
            
            url = "jdbc:mysql://localhost/productosPale";
            userName = "root";
            password = "2122loken";
            driver = "com.mysql.jdbc.Driver";
            
            try{
                Class.forName(driver);
                con = DriverManager.getConnection(url, userName, password);
                
                try{
                    String producto, tamaño, tipo;
                    int gramos, precio;
                    
                    
                    producto = request.getParameter("producto");
                    tipo = request.getParameter("tipo");
                    tamaño = request.getParameter("tam");
                    gramos = Integer.parseInt(request.getParameter("gramos"));
                    precio = Integer.parseInt(request.getParameter("precio"));
                    
                    
                    set = con.createStatement();
                    
                    String q = "insert into productos (nom_producto, tipo_producto, tamaño_producto, gramos_producto, precio_producto) "
                            + "values ('"+producto+"', '"+tipo+"', '"+tamaño+"', "+gramos+", "+precio+")";
                    
                    set.executeUpdate(q);
                    
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <h1>Registro Exitoso nwn</h1>\n");
      out.write("                    \n");
      out.write("                    ");

                        set.close();
                        
                
                }catch(SQLException ed){
                    System.out.println("Error al registrar en la tabla");
                    System.out.println(ed.getMessage());
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    <h1>Registro No Exitoso, error al leer la tabla nwn</h1>\n");
      out.write("                    \n");
      out.write("                    ");

                
                }
                con.close();
            
            }catch(Exception e){
                System.out.println("Error al conectar con la bd");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                
      out.write("\n");
      out.write("                    \n");
      out.write("                    <h1>Sitio en construcción</h1>\n");
      out.write("                    \n");
      out.write("                    ");

            
            }
            
            
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <a href=\"index.html\" >Regresar al Menú Principal</a>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
