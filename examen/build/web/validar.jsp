<%-- 
    Document   : validar
    Created on : 04-may-2021, 19:27:01
    Author     : bailarina77
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <link href="CSS/General.css" rel="stylesheet">
    </head>
    <body>
        
        <%
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
                  
                    if(nombreUsu.equals("AdminUno") &&  password2.equals("12345")){
                            %>                            
                            <div class="circle"></div>
                            <h1><span>Bienvenido</span><br/><span>querido</span><br/><span></span><br/><span>heladousuario</span><br/><span>Suerte</span></h1>
                            <a href="Productoindex.html" class="rainbow-button" alt="INGRESAR"></a>                                    
                            <%
                    }else{
                        
                    
                       if (rs.next()) {
                           
                           resultado=1;
                           
                           if (resultado==1) {
                               
                               %>
                                 <div class="circle"></div>
                                 <h1><span>Bienvenido</span><br/><span>querido</span><br/><span></span><br/><span>heladousuario</span><br/><span>Suerte</span></h1>
                                 <a href="carrito.html" class="rainbow-button" alt="INGRESAR"></a>
                                 <%
                                   
                               }
                               
                        }else{

                                        %>
                                <div class="circle"></div>
                                <h1><span>USUARIO</span><br/><span>NO</span><br/><span></span><br/><span>ENCONTRADO</span><br/><span>UPPSS</span></h1>
                                <a href="index.html" class="rainbow-button" alt="REGRESAR"></a>
                                 <%

                         }


                        }
                        
                    
                }catch(SQLException ed ){

                    System.out.println("Error al registrar en la tabla");
                    System.out.println(ed.getMessage());
                    System.out.println(ed.getStackTrace());
                    %>
                                <div class="circle"></div>
                                <h1><span>ERROR</span><br/><span>AL</span><br/><span></span><br/><span>CONECTAR</span><br/><span>LA BD</span></h1>
                                <a href="index.html" class="rainbow-button" alt="REGRESAR"></a>
                    <%
                }
                set.close();
                
            }catch(Exception e){
                
                System.out.println("Error al conectar con la BD");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                %>
                                 <div class="circle"></div>
                                 <h1><span>SITIO</span><br/><span>EN</span><br/><span></span><br/><span>CONSTRUCCION</span><br/><span>XD</span></h1>
                                 <a href="index.html" class="rainbow-button" alt="REGRESAR"></a>
                <%
            }

        %>
        <br>
        <!---<a href="adminpag.html" class="btn btn-outline-primary">Regresar al menu principal</a>-->
     
            <footer class="absolut">
            
            <p>
                Guti??rrez Villalobos Jos?? Alfredo  &nbsp     Regalado Zu??iga Leonardo Daniel  &nbsp    Rivera garcia jonathan ulises 
            </p>    

        </footer>    
    </body>
</html>


