//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.education.CourseController');
com.yonyou.education.CourseController = function() {
    com.yonyou.education.CourseController.initializeBase(this);
    this.initialize();
}
function com$yonyou$education$CourseController$initialize(){
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
    
function com$yonyou$education$CourseController$evaljs(js){
    eval(js)
}
function com$yonyou$education$CourseController$changePage(sender, args){
	var index = $id("toolbar0").get("selectedIndex");
	com.yonyou.education.PublicFunction.chanagePage(index);
}
function com$yonyou$education$CourseController$loadList(sender, args){
	var json = {
		list : [{
			ListViewSelector : "0"
		},{
			course : "清华EMBA宏观经济分析",
			professor : "课程教授：雪飞",
			score : "89",
			credit : "6",
			checkingin : "0.5",
			lessons : "补课",
			ListViewSelector : "1"
		},{
			course : "清华EMBA宏观经济分析",
			professor : "课程教授：雪飞",
			score : "89",
			credit : "6",
			checkingin : "0.5",
			lessons : "补课",
			ListViewSelector : "1"
		},{
			course : "清华EMBA宏观经济分析",
			professor : "课程教授：雪飞",
			score : "89",
			credit : "6",
			checkingin : "0.5",
			lessons : "补课",
			ListViewSelector : "1"
		},{
			course : "清华EMBA宏观经济分析",
			professor : "课程教授：雪飞",
			score : "89",
			credit : "6",
			checkingin : "0.5",
			lessons : "补课",
			ListViewSelector : "1"
		}]
	}
	$ctx.push(json);
}
com.yonyou.education.CourseController.prototype = {
    loadList : com$yonyou$education$CourseController$loadList,
    changePage : com$yonyou$education$CourseController$changePage,
    initialize : com$yonyou$education$CourseController$initialize,
    evaljs : com$yonyou$education$CourseController$evaljs
};
com.yonyou.education.CourseController.registerClass('com.yonyou.education.CourseController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
