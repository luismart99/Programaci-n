package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ejercicio17_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>i30 N</title>\n");
      out.write("    <link href=\"estilos17.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>Configurador de i30N</h1>\n");
      out.write("    <form method=\"get\" action=\"configurador.jsp\">\n");
      out.write("        <h3>Color del coche</h3>\n");
      out.write("          <div> <select name=\"color\">\n");
      out.write("        <option value=\"black\">Phanton Black</option>\n");
      out.write("        <option value=\"grey\">Micron Grey</option>\n");
      out.write("        <option value=\"blue\" selected=\"selected\">Perfomance Blue</option>\n");
      out.write("        <option value=\"red\">Engine Red</option>\n");
      out.write("        <option value=\"white\">Polar White</option>\n");
      out.write("      </select>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <h3>Interior</h3>\n");
      out.write("      <select name=\"Interior\">\n");
      out.write("        <option value=\"tela\" selected=\"selected\">Tela negra</option>\n");
      out.write("        <option value=\"cuero\">Tela y Cuero Negrol</option>\n");
      out.write("      </select>\n");
      out.write("      <br>\n");
      out.write("      <br>\n");
      out.write("      <input type=\"submit\" value=\"Finalizar\">\n");
      out.write("    </form>");
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
