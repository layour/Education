<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Professor" canvaswidth="768" canvasheight="432" orientation="horizontal" controller="ProfessorController" namespace="com.yonyou.education">
    <import ref="Professor.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <script src="#{path.controller}/com.yonyou.education.PublicFunction.js" type="text/javascript"/>
    <div id="viewPage0">
        <div id="panel0">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
            <label id="label0">清华金融EMBA教务系统</label>
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
        </div>
        <div id="panel1">
            <div id="panel2">
                <input id="imagebutton8" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <label id="label1">教授</label> 
            </div>
            <div id="panel3">
                <label id="label2">姓名(中/英)</label>
                <label id="label3">主讲</label>
                <label id="label4">邮箱</label> 
            </div>
            <listView id="listviewdefine0" bindfield="list" onload="this.professorOnload()" onitemclick="this.onitemclik()" collapsed="true">
                <div id="panel4">
                    <label id="label5" bindfield="professor">杜雪飞</label>
                    <label id="label6" bindfield="course">管理经济学</label>
                    <label id="label7" bindfield="email">123456@qq.com</label>
                </div> 
            </listView> 
        </div>
        <toolbar id="toolbar0">
            <input imagebuttontype="icontext" id="imagebutton2" value="首页" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton3" value="课程" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton4" value="课件" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton5" value="教授" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="true"/>
            <input imagebuttontype="icontext" id="imagebutton6" value="同学录" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton7" value="个人中心" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/> 
        </toolbar> 
    </div> 
</window>
