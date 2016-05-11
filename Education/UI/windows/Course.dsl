<?xml version="1.0" encoding="UTF-8"?>

<window xmlns:web="http://www.yonyou.com/uapmobile/dsl" id="Course" canvaswidth="768" canvasheight="432" orientation="horizontal" controller="CourseController" namespace="com.yonyou.education">
    <import ref="Course.css" type="css"/>
    <link type="text/css" href="sys/theme.css"/>
    <div id="viewPage0">
        <div id="panel0">
            <input id="imagebutton0" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
            <label id="label0">清华金融EMBA教务系统</label>
            <input id="imagebutton1" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/> 
        </div>
        <div id="panel1">
            <listView id="listviewdefine0" onload="this.loadList()" collapsed="true">
                <div id="panel2">
                    <label id="label1">课程名称</label>
                    <label id="label2">成绩</label>
                    <label id="label4">学分</label>
                    <label id="label3">缺勤(天)</label>
                    <label id="label5">补课</label> 
                </div>
                <div id="panel3">
                    <div id="panel4">
                        <label id="label6" bindfield="course">清华EMBA宏观经济分析</label>
                        <label id="label11" bindfield="professor">课程教授：雪飞</label> 
                    </div>
                    <label id="label7" bindfield="score">91</label>
                    <label id="label8" bindfield="credit">4</label>
                    <label id="label9" bindfield="checkingin">1.5</label>
                    <label id="label10" bindfield="lessons">补课</label> 
                </div> 
            </listView> 
        </div>
        <toolbar id="toolbar0">
            <input imagebuttontype="icontext" id="imagebutton2" value="首页" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton3" value="课程" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="true"/>
            <input imagebuttontype="icontext" id="imagebutton4" value="课件" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton5" value="教授" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton6" value="同学录" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/>
            <input imagebuttontype="icontext" id="imagebutton7" value="个人中心" istogglebutton="false" class="imagebuttonclass" onclick="this.changePage()" type="imagebutton" checked="false"/> 
        </toolbar> 
    </div> 
</window>
