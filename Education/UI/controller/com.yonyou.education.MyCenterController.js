//JavaScript Framework 2.0 Code
try {
	Type.registerNamespace('com.yonyou.education.MyCenterController');
	com.yonyou.education.MyCenterController = function() {
		com.yonyou.education.MyCenterController.initializeBase(this);
		this.initialize();
	}
	function com$yonyou$education$MyCenterController$initialize() {
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

	function com$yonyou$education$MyCenterController$evaljs(js) {
		eval(js)
	}

	function com$yonyou$education$MyCenterController$changePage(sender, args) {
		var index = $id("toolbar0").get("selectedIndex");
		com.yonyou.education.PublicFunction.chanagePage(index);
	}

	function mgOnclick(sender, args) {
		$id("imagebutton9").set("background","#F8F8F8");
		$id("imagebutton10").set("background","#ffffff");
		$id("flipperdefine0").set("viewindex", 0);
	}

	function pswOnclick(sender, args) {
		$id("imagebutton10").set("background","#F8F8F8");
		$id("imagebutton9").set("background","#ffffff");
		$id("flipperdefine0").set("viewindex", 1);
	}


	com.yonyou.education.MyCenterController.prototype = {
		changePage : com$yonyou$education$MyCenterController$changePage,
		initialize : com$yonyou$education$MyCenterController$initialize,
		evaljs : com$yonyou$education$MyCenterController$evaljs
	};
	com.yonyou.education.MyCenterController.registerClass('com.yonyou.education.MyCenterController', UMP.UI.Mvc.Controller);
} catch(e) {
	$e(e);
}
