package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.*;

public final class admin_005fcreateQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          \n");
      out.write("<!DOCTYPE html>\n");

String op = (String)session.getAttribute("op");

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link href=\"css_forum.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Quesiton</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"topdiv\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"25px\" width=\"1400px\"></td>\n");
      out.write("                <td width=\"150px\"></td>\n");
      out.write("                <td width=\"80px\"></td>\n");
      out.write("                <td width=\"80px\" ></td>\n");
      out.write("                <td width=\"80px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=100\"  style=\"text-decoration:none\"><p class=\"a\" style=\"margin-top: 0px\">Logout</p></a></td>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("                </table> \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                \n");
      out.write("                    <td height=\"130px\" width=\"1300px\" style=\"text-align: left\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                                    <tr>\n");
      out.write("                        <td height=\"110px\" width=\"180px\"><a href=\"admin_home.jsp\" class=\"picture\"><img class=\"button\" src=\"picture/home_button.png\"></a></td>\n");
      out.write("                        <td height=\"110px\" width=\"180px\"><a href=\"admin_question.jsp?counter=0\" class=\"picture\"><img class=\"button\" src=\"picture/question.png\"></a></td>\n");
      out.write("                        <td height=\"110px\" width=\"180px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=7\" class=\"picture\"><img class=\"button\" src=\"picture/member.png\"></a></td>\n");
      out.write("                        <td  width=\"180px\" ><a href=\"http://localhost:8084/jspProject/Admincon?index=3&index2=1\" class=\"picture\"><img class=\"button\" src=\"picture/thread.png\"></a></td>\n");
      out.write("                        <td height=\"110px\" width=\"180px\"><a href=\"http://localhost:8084/jspProject/Admincon?index=1\" class=\"picture\"><img class=\"button\" src=\"picture/contact.png\"></a></td>\n");
      out.write("                        \n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                    </td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width=\"1500px\" height=\"180px\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td height=\"30px\" style=\"text-align: right\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"text-align: center\">\n");
      out.write("                    <form action=\"http://localhost:8084/jspProject/Admincon?index=13\" method=\"post\">\n");
      out.write("                        <center>\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"50px\" rowspan=\"3\" style=\"vertical-align: top; padding-top: 30px\">Question</td>\n");
      out.write("                                <td colspan=\"4\"><textarea required  name=\"squestion\" rows=\"6\" cols=\"60\" style=\"resize: none\"></textarea></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"10px\">A</td>\n");
      out.write("                                <td><textarea required  name=\"answera\" rows=\"3\" cols=\"26\" style=\"resize: none\"></textarea></td>\n");
      out.write("                                <td width=\"10px\">C</td>\n");
      out.write("                                <td><textarea required  name=\"answerc\" rows=\"3\" cols=\"26\" style=\"resize: none\"></textarea></td>\n");
      out.write("                            \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td width=\"10px\">B</td>\n");
      out.write("                                <td><textarea required  name=\"answerb\" rows=\"3\" cols=\"26\" style=\"resize: none\"></textarea></td>\n");
      out.write("                                <td width=\"10px\">D</td>\n");
      out.write("                                <td><textarea required  name=\"answerd\" rows=\"3\" cols=\"26\" style=\"resize: none\"></textarea></td>\n");
      out.write("                            \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Answer</td>\n");
      out.write("                                <td colspan=\"4\"><textarea required  name=\"sanswer\" rows=\"1\" cols=\"60\" style=\"resize: none\"></textarea></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                               <td colspan=\"5\" style=\"padding-left: 50px\">\n");
      out.write("                        <center>\n");
      out.write("                            <input type=\"submit\" value=\"Edit\" class=\"button\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class=\"button\" type=\"reset\" value=\"Reset\">\n");
      out.write("                        </center>\n");
      out.write("                            \n");
      out.write("                            </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("           \n");
      out.write("        \n");
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