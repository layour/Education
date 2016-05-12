<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="ProfessorDetail" canvaswidth="768" canvasheight="432" orientation="horizontal" controller="ProfessorDetailController" namespace="com.yonyou.education">
    <import ref="ProfessorDetail.css" type="css"/>
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
                <div id="panel4">
                    <image id="image0" scaletype="fitcenter" src="tab_trophy_touch.png"/>
                    <label id="label1">教授</label> 
                </div>
                <div id="panel5">
                    <image id="image1" scaletype="fitcenter" src="myhead.png"/>
                    <label id="label2">杜雪飞</label> 
                </div>
                <div id="panel6">
                    <label id="label3">教授类型：</label>
                    <label id="label4">无类型</label> 
                </div>
                <div id="panel7">
                    <label id="label5">办公电话：</label>
                    <label id="label6">01012345678</label> 
                </div>
                <div id="panel8">
                    <label id="label7">移动电话：</label>
                    <label id="label8">18855555555</label> 
                </div>
                <div id="panel9">
                    <label id="label9">电子邮箱：</label>
                    <label id="label10">123456789@qq.com</label> 
                </div>
                <div id="panel10">
                    <label id="label11">个人主页：</label>
                    <label id="label12">mobile.yyyap.com</label> 
                </div>
                <div id="panel11">
                    <label id="label13">助教：</label>
                    <label id="label14">姚磊</label> 
                </div> 
            </div>
            <div id="panel3">
                <label id="label15">课程表</label>
                <listView id="listviewdefine0" bindfield="source,row" list-type="group" onload="this.loadList()" collapsed="true">
                    <div id="panel12">
                        <label id="label16" bindfield="group">2016-6-12</label>
                    </div>
                    <div id="panel13">
                        <div id="panel14">
                            <label id="label18" bindfield="begin">15:00:00</label>
                            <label id="label19" bindfield="end">15:00:00</label>
                        </div>
                        <label id="label17" bindfield="title">管理经济学</label>
                    </div> 
                </listView> 
            </div> 
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
