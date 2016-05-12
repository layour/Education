<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="MyCenter" canvaswidth="768" canvasheight="432" orientation="horizontal" controller="MyCenterController" namespace="com.yonyou.education">
    <import ref="MyCenter.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <script src="#{path.controller}/com.yonyou.education.PublicFunction.js" type="text/javascript"/>
    <div id="viewPage0">
        <div id="panel0">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
            <label id="label0">清华金融EMBA教务系统</label>
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
        </div>
        <div id="panel1"/>
        <toolbar id="toolbar0">
            <input imagebuttontype="icontext" id="imagebutton2" value="首页" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton3" value="课程" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton4" value="课件" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton5" value="教授" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton6" value="同学录" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton7" value="个人中心" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="true"/> 
        </toolbar> 
    </div> 
</window>
