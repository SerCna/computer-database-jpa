
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.35*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq(/*14.27*/routes/*14.33*/.Application.index())),format.raw/*14.53*/("""">
                    Play 2.0 sample application &mdash; Computer database
                </a>
            </h1>
        </header>
        
        <div class="topbar">
            <div class="fill">
                <div class="container" dir="rtl">
                    <a class="brand" href=""""),_display_(Seq(/*23.45*/routes/*23.51*/.Application.index())),format.raw/*23.71*/("""">Forms</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq(/*25.37*/("active".when(nav == "")))),format.raw/*25.63*/("""">
                            <a href=""""),_display_(Seq(/*26.39*/routes/*26.45*/.Application.index())),format.raw/*26.65*/("""">صفحه اصلی</a>
                        </li >
                        <li class=""""),_display_(Seq(/*28.37*/("active".when(nav == "sale")))),format.raw/*28.67*/("""">
                            <a href=""""),_display_(Seq(/*29.39*/routes/*29.45*/.Application.edit(1))),format.raw/*29.65*/("""">خرید ساز</a>
                        </li >
                        <li >
                            <a href=""""),_display_(Seq(/*32.39*/routes/*32.45*/.Application.index())),format.raw/*32.65*/("""">فروش ساز</a>
                        </li>
                        <li >
                            <a href=""""),_display_(Seq(/*35.39*/routes/*35.45*/.Application.index())),format.raw/*35.65*/("""">آموزش</a>
                        </li>
                        <li >
                            <a href=""""),_display_(Seq(/*38.39*/routes/*38.45*/.Application.index())),format.raw/*38.65*/("""">اخبار</a>
                        </li>
                        <li >
                            <a href=""""),_display_(Seq(/*41.39*/routes/*41.45*/.Application.index())),format.raw/*41.65*/("""">درباره ما</a>
                        </li>
                        <li >
                            <a href=""""),_display_(Seq(/*44.39*/routes/*44.45*/.Application.index())),format.raw/*44.65*/("""">تماس با ما</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        
        <section id="main">
            """),_display_(Seq(/*52.14*/content)),format.raw/*52.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(nav:String,content:Html) = apply(nav)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (nav) => (content) => apply(nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 10 12:25:56 IRDT 2015
                    SOURCE: D:/Others/PlayFramework/play-2.0/play-2.0/samples/java/computer-database-jpa/app/views/main.scala.html
                    HASH: d562ad4dc83f7db434edd8f64d28e5a82ff4b969
                    MATRIX: 759->1|864->34|1041->181|1055->187|1120->230|1223->303|1237->309|1293->343|1448->467|1463->473|1505->493|1833->790|1848->796|1890->816|2006->901|2054->927|2126->968|2141->974|2183->994|2297->1077|2349->1107|2421->1148|2436->1154|2478->1174|2623->1288|2638->1294|2680->1314|2824->1427|2839->1433|2881->1453|3022->1563|3037->1569|3079->1589|3220->1699|3235->1705|3277->1725|3422->1839|3437->1845|3479->1865|3690->2045|3719->2052
                    LINES: 27->1|30->1|36->7|36->7|36->7|37->8|37->8|37->8|43->14|43->14|43->14|52->23|52->23|52->23|54->25|54->25|55->26|55->26|55->26|57->28|57->28|58->29|58->29|58->29|61->32|61->32|61->32|64->35|64->35|64->35|67->38|67->38|67->38|70->41|70->41|70->41|73->44|73->44|73->44|81->52|81->52
                    -- GENERATED --
                */
            