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
        <div id="panel1">
            <div id="panel2">
                <div id="panel4">
                    <input id="imagebutton8" imagebuttontype="icon" istogglebutton="false" class="imagebuttonclass" type="imagebutton" checked="false"/>
                    <label id="label1">个人信息</label> 
                </div>
                <input id="imagebutton9" imagebuttontype="text" value="基本信息" istogglebutton="false" onclick="mgOnclick()" type="imagebutton" checked="false"/>
                <input id="imagebutton10" imagebuttontype="text" value="修改密码" istogglebutton="false" onclick="pswOnclick()" type="imagebutton" checked="false"/> 
            </div>
            <div id="panel3">
                <flipper id="flipperdefine0" isScroll="false" viewindex="0">
                    <div id="panel5">
                        <div id="panel7">
                            <label id="label2">姓名：</label>
                            <label id="label3">杜雪飞</label> 
                        </div>
                        <div id="panel8">
                            <label id="label4">手机：</label>
                            <label id="label5">18866666666</label> 
                        </div>
                        <div id="panel9">
                            <label id="label6">电话：</label>
                            <label id="label7">0107894563</label> 
                        </div>
                        <div id="panel10">
                            <label id="label8">邮箱：</label>
                            <label id="label9">123456789@qq.com</label> 
                        </div> 
                    </div>
                    <div id="panel6">
                        <div id="panel11">
                            <label id="label10">账号：</label>
                            <label id="label11">qwert</label> 
                        </div>
                        <div id="panel12">
                            <label id="label12">原密码：</label>
                            <label id="label13">123456</label> 
                        </div>
                        <div id="panel13">
                            <label id="label14">新密码：</label>
                            <label id="label15">123456</label> 
                        </div>
                        <div id="panel14">
                            <label id="label16">确认：</label>
                            <label id="label17">123456</label> 
                        </div> 
                    </div> 
                </flipper> 
            </div> 
        </div>
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
