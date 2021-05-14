package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;

public final class validar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LOGIN</title>\n");
      out.write("        \n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"CSS/General.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

            Connection con = null;
            Statement set = null;
            ResultSet rs = null;
            
            
            String url, user, password, Driver;
            
            
            
            url = "jdbc:mysql://localhost/baseusuarios";
            Driver = "com.mysql.jdbc.Driver";
            user = "root";
            password= "2122loken";
            
            
            try{
                Class.forName(Driver);
                con = DriverManager.getConnection(url, user, password);
                //con = DriverManager.getConnection(url, user, password);
                
                try{
                    String nombreUsu, password2;
                    int resultado=0;
                    
                    
                    nombreUsu = request.getParameter("usuario");
                    password2=request.getParameter("password");
                                   
                    set = con.createStatement();
                    
                    String q = "select * from usuarios where nom_usu='"+nombreUsu+"' and pass_usu='"+password2+"'";
                         
                    
                    rs = set.executeQuery(q);
                  
                    if(nombreUsu.equals("Admin1") &&  password2.equals("12345")){
                            
      out.write("                            \n");
      out.write("                            <div class=\"circle\"></div>\n");
      out.write("                            <h1><span>Bienvenido</span><br/><span>querido</span><br/><span></span><br/><span>heladousuario</span><br/><span>Suerte</span></h1>\n");
      out.write("                            <a href=\"Productoindex.html\" class=\"rainbow-button\" alt=\"INGRESAR\"></a>                                    \n");
      out.write("                            ");

                    }else{
                        
                    
                       if (rs.next()) {
                           
                           resultado=1;
                           
                           if (resultado==1) {
                               
                               
      out.write("\n");
      out.write("                                 <div class=\"circle\"></div>\n");
      out.write("                                 <h1><span>Bienvenido</span><br/><span>querido</span><br/><span></span><br/><span>heladousuario</span><br/><span>Suerte</span></h1>\n");
      out.write("                                 <a href=\"carrito.html\" class=\"rainbow-button\" alt=\"INGRESAR\"></a>\n");
      out.write("                                 ");

                                   
                               }
                               
                        }else{

                                        
      out.write("\n");
      out.write("                                <div class=\"circle\"></div>\n");
      out.write("                                <h1><span>USUARIO</span><br/><span>NO</span><br/><span></span><br/><span>ENCONTRADO</span><br/><span>UPPSS</span></h1>\n");
      out.write("                                <a href=\"index.html\" class=\"rainbow-button\" alt=\"REGRESAR\"></a>\n");
      out.write("                                 ");


                         }


                        }
                        
                    
                }catch(SQLException ed ){

                    System.out.println("Error al registrar en la tabla");
                    System.out.println(ed.getMessage());
                    System.out.println(ed.getStackTrace());
                    
      out.write("\n");
      out.write("                                <div class=\"circle\"></div>\n");
      out.write("                                <h1><span>ERROR</span><br/><span>AL</span><br/><span></span><br/><span>CONECTAR</span><br/><span>LA BD</span></h1>\n");
      out.write("                                <a href=\"index.html\" class=\"rainbow-button\" alt=\"REGRESAR\"></a>\n");
      out.write("                    ");

                }
                set.close();
                
            }catch(Exception e){
                
                System.out.println("Error al conectar con la BD");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                
      out.write("\n");
      out.write("                                 <div class=\"circle\"></div>\n");
      out.write("                                 <h1><span>SITIO</span><br/><span>EN</span><br/><span></span><br/><span>CONSTRUCCION</span><br/><span>XD</span></h1>\n");
      out.write("                                 <a href=\"index.html\" class=\"rainbow-button\" alt=\"REGRESAR\"></a>\n");
      out.write("                ");

            }

        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <!---<a href=\"adminpag.html\" class=\"btn btn-outline-primary\">Regresar al menu principal</a>-->\n");
      out.write("     \n");
      out.write("            <footer class=\"absolut\">\n");
      out.write("            \n");
      out.write("            <p>\n");
      out.write("                Gutiérrez Villalobos José Alfredo  &nbsp     Regalado Zuñiga Leonardo Daniel  &nbsp    Rivera garcia jonathan ulises \n");
      out.write("            </p>    \n");
      out.write("\n");
      out.write("        </footer>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
