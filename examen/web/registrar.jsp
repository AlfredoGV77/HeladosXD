<%-- 
    Document   : registrar
    Created on : 04-may-2021, 19:41:56
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
        <title>Registro de usuarios</title>
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <script src="js/validar.js"></script>
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
                    String nombreUsu, apellidop, apellidom, direccion, telefono, nombreusuario;
                    int edad;
                    
                    nombreUsu = request.getParameter("nombre");
                    apellidop = request.getParameter("apellidop");
                    apellidom = request.getParameter("apellidom");
                    edad = edad = Integer.parseInt(request.getParameter("edad"));
                    direccion = request.getParameter("direccion");
                    telefono= request.getParameter("telefono");
                    password=request.getParameter("password");
                    
                    nombreusuario = nombreUsu +" "+ apellidop+" " + apellidom;
                    
                    set = con.createStatement();
                    
                    String q = "insert into usuarios(nom_usu, edad_usu, dire_usu, tel_usu,pass_usu)"
                            + "values "
                        + "('"+nombreusuario+"', "+edad+", '"+direccion+"', '"+telefono+"','"+password+"')";
                    
                    
                    int registro = set.executeUpdate(q);
                    
                    %>

                        <div class="circle"></div>
                        <h1><span>REGISTRO</span><br/><span>EXITOSO</span><br/><span>.BIENVENIDO</span><br/><span></span><br/><span></span></h1>
                        <a href="carrito.html" class="rainbow-button" alt="REGRESAR"></a>
                        
                    <%
                }catch(SQLException ed ){

                    System.out.println("Error al registrar en la tabla");
                    System.out.println(ed.getMessage());
                    System.out.println(ed.getStackTrace());
                    %>
                        <h1>Registro no exitoso, error al crear latabla</h1>
                        <div class="circle"></div>
                        <h1><span>Bienvenido</span><br/><span>querido</span><br/><span></span><br/><span>heladousuario</span><br/><span>Suerte</span></h1>
                        <a href="index.html" class="rainbow-button" alt="REGRESAR"></a>                        
                        
                    <%
                }
                set.close();
                
            }catch(Exception e){
                
                System.out.println("Error al conectar con la BD");
                System.out.println(e.getMessage());
                System.out.println(e.getStackTrace());
                %>
                        <h1>Sitio en construccion</h1>
                        <div class="circle"></div>
                        <h1><span>SITIO</span><br/><span>EN</span><br/><span>PLENA</span><br/><span>CONSTRUCCION</span><br/><span>XD</span></h1>
                        <a href="index.html" class="rainbow-button" alt="REGRESAR"></a>
                <%
            }

        %>
        <br>

       
    </body>
</html>
