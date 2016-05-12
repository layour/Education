//JavaScript Framework 2.0 Code

//声明一个命名空间
Type.registerNamespace('com.yonyou.education.PublicFunction');

//在此命名空间下声明方法
com.yonyou.education.PublicFunction.isEmptyString = function(param){
	if(param == null || typeof(param) == 'undefined' || param == ''){
		return true;
	}
	return false;
}

//跳转页面
com.yonyou.education.PublicFunction.chanagePage = function(index){
	if(index == "0"){
		$view.open({
			"viewid" : "com.yonyou.education.Home",//目标页面（首字母大写）全名，
			"isKeep" : "false"
		});
	} else if(index == "1"){
		$view.open({
			"viewid" : "com.yonyou.education.Course",//目标页面（首字母大写）全名，
			"isKeep" : "false"
		});
	} else if(index == "2"){
		$view.open({
			"viewid" : "com.yonyou.education.Courseware",//目标页面（首字母大写）全名，
			"isKeep" : "false"
		});
	} else if(index == "3"){
		$view.open({
			"viewid" : "com.yonyou.education.Professor",//目标页面（首字母大写）全名，
			"isKeep" : "false"
		});
	} else if(index == "4"){
		$view.open({
			"viewid" : "com.yonyou.education.Classmates",//目标页面（首字母大写）全名，
			"isKeep" : "false"
		});
	} else if(index == "5"){
		$view.open({
			"viewid" : "com.yonyou.education.MyCenter",//目标页面（首字母大写）全名，
			"isKeep" : "false"
		});
	}
}
