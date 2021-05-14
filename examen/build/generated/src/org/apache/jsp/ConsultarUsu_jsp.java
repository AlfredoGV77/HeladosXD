package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ConsultarUsu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Consulta de usuarios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"text-center mt-4 mb-4\">\n");
      out.write("                <h1>Estos son los usuarios registrados</h1>\n");
      out.write("            </div>\n");
      out.write("            <hr> \n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-striped table-hover\">\n");
      out.write("            <thead>\n");
      out.write("                    <th align=\"center\">ID</th>\n");
      out.write("                    <th align=\"center\">Nombre Completo</th>\n");
      out.write("                    <th align=\"center\">Edad</th>\n");
      out.write("                    <th align=\"center\">Direccion</th>\n");
      out.write("                    <th align=\"center\">Telefono o celular</th>\n");
      out.write("                    <th align=\"center\">Acciones</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    Connection con = null;
                    Statement set = null;
                    ResultSet rs = null;

                    String url, userName, password, driver;

                    url = "jdbc:mysql://localhost/baseusuarios";
                    userName = "root";
                    password = "2122loken";
                    driver = "com.mysql.jdbc.Driver";
                    
                    try{
                        Class.forName(driver);
                        con = DriverManager.getConnection(url, userName, password);
                        try{
                            String q = "select * from usuarios order by id_usu asc";
                            
                            set = con.createStatement();
                            rs = set.executeQuery(q);
                            while(rs.next()){
                            
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td align=\"center\"> ");
      out.print(rs.getInt("id_usu"));
      out.write(" </td>\n");
      out.write("                                    <td align=\"center\"> ");
      out.print(rs.getString("nom_usu"));
      out.write(" </td>\n");
      out.write("                                    <td align=\"center\"> ");
      out.print(rs.getString("edad_usu"));
      out.write(" </td> \n");
      out.write("                                    <td align=\"center\"> ");
      out.print(rs.getString("dire_usu"));
      out.write(" </td>\n");
      out.write("                                    <td align=\"center\"> ");
      out.print(rs.getString("tel_usu"));
      out.write(" </td>\n");
      out.write("                                    <td align=\"center\"> ");
      out.print(rs.getString("pass_usu"));
      out.write(" </td>\n");
      out.write("                                    <td align=\"center\"> \n");
      out.write("                                     <a class=\"btn btn-outline-primary\" href=\"ModificarUsu.jsp?id=");
      out.print(rs.getInt("id_usu"));
      out.write("\" > Editar </a> \n");
      out.write("                                     <a class=\"btn btn-outline-danger\" href=\"BorrarUsu.jsp?id=");
      out.print(rs.getInt("id_usu"));
      out.write("\" > Borrar </a> \n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>     \n");
      out.write("                                ");

                                 
                            }
                            rs.close();
                            set.close();
                        
                        }catch(SQLException ed){
                            System.out.println("Error al consultar la tabla");
                            System.out.println(ed.getMessage());
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                        <h1>Error el recurso de la consulta no esta disponible, solo juguito contigo</h1>\n");
      out.write("                            ");

                        
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
      out.write("                    \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("                    <a class=\"btn btn-outline-primary\" href=\"adminpag.jsp\"> Regresar crud </a>\n");
      out.write("                    <br>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
