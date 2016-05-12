//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.education.CoursewareController');
com.yonyou.education.CoursewareController = function() {
    com.yonyou.education.CoursewareController.initializeBase(this);
    this.initialize();
}
function com$yonyou$education$CoursewareController$initialize(){
    //you can programing by $ctx API
    //get the context data through $ctx.get()
    //set the context data through $ctx.push(json)
    //set the field of the context through $ctx.put(fieldName, fieldValue)
    //get the parameter of the context through $ctx.param(parameterName)
    //Demo Code:
    //    var str = $ctx.getString();      //获取当前Context对应的字符串
    //    alert($ctx.getString())          //alert当前Context对应的字符串
    //    var json = $ctx.getJSONObject(); //获取当前Context，返回值为json
    //    json["x"] = "a";        //为当前json增加字段
    //    json["y"] = [];           //为当前json增加数组
    //    $ctx.push(json);            //设置context，并自动调用数据绑定
    //    
    //    put方法需手动调用databind()
    //    var x = $ctx.get("x");    //获取x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.put("x", "b");     //设置x字段值
    //    $ctx.databind();            //调用数据绑定才能将修改的字段绑定到控件上
    //    var p1 = $param.getString("p1");   //获取参数p2的值，返回一个字符串
    //    var p2 = $param.getJSONObject("p2");   //获取参数p3的值，返回一个JSON对象
    //    var p3 = $param.getJSONArray("p3");   //获取参数p1的值，返回一个数组
    
    //your initialize code below...
    
}
    
function com$yonyou$education$CoursewareController$evaljs(js){
    eval(js)
}
function com$yonyou$education$CoursewareController$changePage(sender, args){
	var index = $id("toolbar0").get("selectedIndex");
	com.yonyou.education.PublicFunction.chanagePage(index);
}
function com$yonyou$education$CoursewareController$loadList(sender, args){
	var json = {
		list : [{
			title : "清华EMBA01宏观经济分析"
		},{
			title : "清华EMBA01宏观经济分析"
		},{
			title : "清华EMBA01宏观经济分析"
		},{
			title : "清华EMBA01宏观经济分析"
		},{
			title : "清华EMBA01宏观经济分析"
		}]
	}
	$ctx.push(json);
}
function com$yonyou$education$CoursewareController$listItemclick(sender, args){
	var json = {
		list : [{
			title : "宏观经济分析课堂作业",
			time : "发布日期：2016-05-12 12:00:00",
			ListViewSelector : 1
		},{
			title : "宏观经济分析课堂作业",
			time : "发布日期：2016-05-12 12:00:00",
			ListViewSelector : 1
		},{
			title : "宏观经济分析课堂作业",
			time : "发布日期：2016-05-12 12:00:00",
			ListViewSelector : 1
		},{
			title : "宏观经济分析课堂作业",
			time : "发布日期：2016-05-12 12:00:00",
			ListViewSelector : 1
		},{
			title : "宏观经济分析课堂作业",
			time : "发布日期：2016-05-12 12:00:00",
			ListViewSelector : 1
		}]
	}
	$ctx.push(json);
}
com.yonyou.education.CoursewareController.prototype = {
    listItemclick : com$yonyou$education$CoursewareController$listItemclick,
    loadList : com$yonyou$education$CoursewareController$loadList,
    changePage : com$yonyou$education$CoursewareController$changePage,
    initialize : com$yonyou$education$CoursewareController$initialize,
    evaljs : com$yonyou$education$CoursewareController$evaljs
};
com.yonyou.education.CoursewareController.registerClass('com.yonyou.education.CoursewareController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
