/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2018-08-02 02:15:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-nozawa/test/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/sample-web2/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-nozawa/test/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/sample-web2/WEB-INF/lib/struts2-core-2.3.32.jar!/META-INF/struts-tags.tld", Long.valueOf(1488769580000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1533088419518L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.32.jar", Long.valueOf(1533088419525L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta http-equiv=\"Content-Style-Type\" content=\"text/css\" />\r\n");
      out.write("<meta http-equiv=\"Content-Script-Type\" content=\"text/javascript\" />\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/style.css\">\r\n");
      out.write("<title>サンプルウェブホーム！</title>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  var img = [\"./images/images.jpg\",\"./images/image2.jpg\",\"./images/image3.jpg\",\"./images/image4.jpg\",\"./images/image5.jpg\"];\r\n");
      out.write("\r\n");
      out.write("  var timer;\r\n");
      out.write("  var count = -1;\r\n");
      out.write("\r\n");
      out.write("  function timerStart() {\r\n");
      out.write("      //画像インデックス\r\n");
      out.write("      count++;\r\n");
      out.write("      //画像数確認\r\n");
      out.write("      if (count == img.length) count = 0;\r\n");
      out.write("      //画像出力\r\n");
      out.write("      document.getElementById(\"dat\").src = img[count];\r\n");
      out.write("      //タイマーを設定\r\n");
      out.write("      timer = setTimeout(\"timerStart()\",2000);\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  function timerStop() {\r\n");
      out.write("      //タイマーをクリア\r\n");
      out.write("      clearInterval(timer);\r\n");
      out.write("  };\r\n");
      out.write("\r\n");
      out.write("  $(function(){\r\n");
      out.write("\t    $(\".inquiry a\").hover(\r\n");
      out.write("\t    function(){\r\n");
      out.write("\t    \t$(this).css(\"color\",\"gray\");\r\n");
      out.write("\t    },\r\n");
      out.write("\t    function(){\r\n");
      out.write("\t    \t$(this).css(\"color\",\"black\");\r\n");
      out.write("\t    });\r\n");
      out.write("\t    });\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"contents\">\r\n");
      out.write("<!-- メインビジュアル -->\r\n");
      out.write("<div id =\"MainArea\">\r\n");
      out.write("<h1>ホーム画面</h1>\r\n");
      out.write("<div class=\"ribbon_box\">\r\n");
      out.write("    <span class=\"ribbon\">★</span>\r\n");
      out.write("    <div>\r\n");
      out.write("       <p>サンプルウェブへようこそ！</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("   <div style=\"display:inline-flex;\">\r\n");
      out.write("        <input type=\"button\" value=\"START\" onClick=\"timerStart()\">\r\n");
      out.write("        <input type=\"button\" value=\"STOP\" onClick=\"timerStop()\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <img src=\"./images/images.jpg\" id=\"dat\" width=\"300\" height=\"300\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- メインナビ -->\r\n");
      out.write("<div id=\"MainNaviArea\">\r\n");
      out.write("<div class=\"4Wrap-clearfix\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"colAinCol4\" >\r\n");
      out.write("<a href=\"ProductListAction\"><img  src=\"./images/food.jpg\"></a>\r\n");
      out.write("<a href=\"ProductListAction\"><img src=\"./images/food2.jpg\"></a>\r\n");
      out.write("<a href=\"ProductListAction\"><img src=\"./images/ice.jpg\"></a>\r\n");
      out.write("<a href=\"ProductListAction\"><img  src=\"./images/study.jpg\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- メインコインテンツ -->\r\n");
      out.write("<div id=\"MainContents\">\r\n");
      out.write("    <div class=\"col2Wrap-clearfix\">\r\n");
      out.write("    <div class=\"colAinCol2\">\r\n");
      out.write("    <h2>LEFT</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"colBinCol2\">\r\n");
      out.write("    <h2>商品関連</h2>\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>本日のお勧め！</li>\r\n");
      out.write("        <li>定番商品</li>\r\n");
      out.write("        <li>ランキング</li>\r\n");
      out.write("        <li></li>\r\n");
      out.write("        <li></li>\r\n");
      out.write("   </ul>\r\n");
      out.write("        ------------------------------------------------------------------\r\n");
      out.write("   <h2>お問合せ</h2>\r\n");
      out.write("   <div class=\"inquiry\">\r\n");
      out.write("   <ul>\r\n");
      out.write("      <li><a href=\"InquiryAction\">商品についてのお問合せ</a></li>\r\n");
      out.write("      <li><a href=\"InquiryAction\">弊社についてのお問合せ</a></li>\r\n");
      out.write("      <li><a href=\"InquiryAction\">その他についてのお問合せ</a></li>\r\n");
      out.write("   </ul>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- ここで何かさびしいのでアニメーションを作りたい。\r\n");
      out.write("と言っても結局jQueryをやろうとしても反応しない。\r\n");
      out.write("この上のscriptはecsiteのプロジェクトから持ってきた物で\r\n");
      out.write("ecsiteでは通常通りsliderで出来ていた。　何故こちらで出来ないのだろうか。 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      if (_jspx_meth_s_005finclude_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005finclude_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:include
    org.apache.struts2.views.jsp.IncludeTag _jspx_th_s_005finclude_005f0 = (org.apache.struts2.views.jsp.IncludeTag) _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.IncludeTag.class);
    _jspx_th_s_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005finclude_005f0.setParent(null);
    // /home.jsp(136,0) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005finclude_005f0.setValue("footer.jsp");
    int _jspx_eval_s_005finclude_005f0 = _jspx_th_s_005finclude_005f0.doStartTag();
    if (_jspx_th_s_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005finclude_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005finclude_005f0);
    return false;
  }
}
