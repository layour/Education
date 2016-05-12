<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Courseware" canvaswidth="768" canvasheight="432" orientation="horizontal" controller="CoursewareController" namespace="com.yonyou.education">
    <import ref="Courseware.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <script src="#{path.controller}/com.yonyou.education.PublicFunction.js" type="text/javascript"/>
    <div id="viewPage0">
        <div id="panel0">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
            <label id="label0">清华金融EMBA教务系统</label>
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
        </div>
        <div id="panel1">
            <div id="panel5">
                <input id="imagebutton10" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                <label id="label4">课件</label>
                <input id="imagebutton11" imagebuttontype="icon" value="返回" istogglebutton="false" class="imagebuttonclass" onclick="this.loadList()" type="imagebutton" checked="false"/>
            </div>
            <listView id="listviewdefine0" bindfield="list" onload="this.loadList()" onitemclick="this.listItemclick()" collapsed="true">
                <div id="panel2">
                    <input id="imagebutton9" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                    <label id="label1" bindfield="title">清华EMBA01宏观经济分析</label>
                    <input id="imagebutton8" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
                </div>
                <div id="panel3">
                    <div id="panel4">
                        <label id="label2">宏观经济学分析课堂作业</label>
                        <label id="label3">发布日期：2016-05-12 12:12:00</label> 
                    </div>
                    <input id="button0" value="预览" class="textbtnclass" type="button"/>
                    <input id="button1" value="下载" class="textbtnclass" type="button"/> 
                </div> 
            </listView> 
        </div>
        <toolbar id="toolbar0">
            <input imagebuttontype="icontext" id="imagebutton2" value="首页" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton3" value="课程" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton4" value="课件" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="true"/>
            <input imagebuttontype="icontext" id="imagebutton5" value="教授" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton6" value="同学录" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton7" value="个人中心" istogglebutton="true" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/> 
        </toolbar> 
    </div> 
</window>
