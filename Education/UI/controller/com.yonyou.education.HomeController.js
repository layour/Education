//JavaScript Framework 2.0 Code
try{
Type.registerNamespace('com.yonyou.education.HomeController');
com.yonyou.education.HomeController = function() {
    com.yonyou.education.HomeController.initializeBase(this);
    this.initialize();
}
function com$yonyou$education$HomeController$initialize(){
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
    
function com$yonyou$education$HomeController$evaljs(js){
    eval(js)
}
function com$yonyou$education$HomeController$changePage(sender, args){
	var index = $id("toolbar0").get("selectedIndex");
	com.yonyou.education.PublicFunction.chanagePage(index);
}
function com$yonyou$education$HomeController$loadList(sender, args){
	var json = {
		list : [{
			title : "审批通知",
			time : "2011-09-20 12：00:00"
		},{
			title : "审批通知",
			time : "2011-09-20 12：00:00"
		},{
			title : "审批通知",
			time : "2011-09-20 12：00:00"
		},{
			title : "审批通知",
			time : "2011-09-20 12：00:00"
		}]
	}
	$ctx.push(json);
}
function com$yonyou$education$HomeController$openListDetail(sender, args){
	$view.open({
		"viewid" : "com.yonyou.education.MessageDetail",//目标页面（首字母大写）全名，
		"isKeep" : "true"
	});
}
com.yonyou.education.HomeController.prototype = {
    openListDetail : com$yonyou$education$HomeController$openListDetail,
    loadList : com$yonyou$education$HomeController$loadList,
    changePage : com$yonyou$education$HomeController$changePage,
    initialize : com$yonyou$education$HomeController$initialize,
    evaljs : com$yonyou$education$HomeController$evaljs
};
com.yonyou.education.HomeController.registerClass('com.yonyou.education.HomeController',UMP.UI.Mvc.Controller);
}catch(e){$e(e);}
