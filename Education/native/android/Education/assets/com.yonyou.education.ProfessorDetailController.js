//JavaScript Framework 2.0 Code
try {
	Type.registerNamespace('com.yonyou.education.ProfessorDetailController');
	com.yonyou.education.ProfessorDetailController = function() {
		com.yonyou.education.ProfessorDetailController.initializeBase(this);
		this.initialize();
	}
	function com$yonyou$education$ProfessorDetailController$initialize() {
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

	function com$yonyou$education$ProfessorDetailController$evaljs(js) {
		eval(js)
	}

	function com$yonyou$education$ProfessorDetailController$changePage(sender, args) {
		var index = $id("toolbar0").get("selectedIndex");
		com.yonyou.education.PublicFunction.chanagePage(index);
	}

	function com$yonyou$education$ProfessorDetailController$professorOnload(sender, args) {
		var json = {
			list : [{
				professor : "雪飞",
				course : "清华EMBA宏观经济分析",
				email : "789456123@qq.com"
			}, {
				professor : "雪飞",
				course : "清华EMBA宏观经济分析",
				email : "789456123@qq.com"
			}, {
				professor : "雪飞",
				course : "清华EMBA宏观经济分析",
				email : "789456123@qq.com"
			}, {
				professor : "雪飞",
				course : "清华EMBA宏观经济分析",
				email : "789456123@qq.com"
			}]
		}
		$ctx.push(json);
	}

	function com$yonyou$education$ProfessorDetailController$loadList(sender, args) {
		var json = {
			source : [{
				group : "2016-6-12",
				row : [{
					begin:"15:20:00",
					end:"16:20:00",
					title : "管理经济学"
				}, {
					begin:"15:20:00",
					end:"16:20:00",
					title : "管理经济学"
				}]
			}, {
				group : "2016-6-12",
				row : [{
					begin:"15:20:00",
					end:"16:20:00",
					title : "管理经济学"
				}, {
					begin:"15:20:00",
					end:"16:20:00",
					title : "管理经济学"
				}]
			}]
		}
		$ctx.push(json);
	}


	com.yonyou.education.ProfessorDetailController.prototype = {
		loadList : com$yonyou$education$ProfessorDetailController$loadList,
		professorOnload : com$yonyou$education$ProfessorDetailController$professorOnload,
		changePage : com$yonyou$education$ProfessorDetailController$changePage,
		initialize : com$yonyou$education$ProfessorDetailController$initialize,
		evaljs : com$yonyou$education$ProfessorDetailController$evaljs
	};
	com.yonyou.education.ProfessorDetailController.registerClass('com.yonyou.education.ProfessorDetailController', UMP.UI.Mvc.Controller);
} catch(e) {
	$e(e);
}
