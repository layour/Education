<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Home" canvaswidth="768" canvasheight="432" orientation="horizontal" controller="HomeController" namespace="com.yonyou.education">
    <import ref="Home.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <div id="panel0">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
            <label id="label0">清华金融EMBA教务系统</label>
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
        </div>
        <div id="panel1">
            <div id="panel4">
                <image id="image0" scaletype="fitcenter" src="myhead.png"/>
                <label id="label3">杜雪飞</label>
            </div>
            <div id="panel3">
                <input id="imagebutton8" imagebuttontype="text" value="学院新闻" istogglebutton="false" type="imagebutton" checked="false"/>
                <input id="imagebutton9" imagebuttontype="text" value="个人通知" istogglebutton="false" type="imagebutton" checked="false"/>
                <input id="imagebutton10" imagebuttontype="text" value="公共通知" istogglebutton="false" type="imagebutton" checked="false"/>
            </div>
            <div id="panel2">
                <listView id="listviewdefine0" bindfield="list" onload="this.loadList()" onitemclick="this.openListDetail()" collapsed="true">
                    <div id="panel5">
                        <label id="label1" bindfield="title">审批通知</label>
                        <label id="label2" bindfield="time">2011-09-20 12：00:00</label>
                    </div>
                </listView>
            </div> 
        </div>
        <toolbar id="toolbar0">
            <input imagebuttontype="icontext" id="imagebutton2" value="首页" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="true"/>
            <input imagebuttontype="icontext" id="imagebutton3" value="课程" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton4" value="课件" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton5" value="教授" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton6" value="同学录" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton7" value="个人中心" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/> 
        </toolbar> 
    </div> 
</window>
