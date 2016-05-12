package com.yonyou.education;

import com.yonyou.uap.um.application.ApplicationContext;
import com.yonyou.uap.um.base.*;
import com.yonyou.uap.um.common.*;
import com.yonyou.uap.um.third.*;
import com.yonyou.uap.um.control.*;
import com.yonyou.uap.um.core.*;
import com.yonyou.uap.um.binder.*;
import com.yonyou.uap.um.runtime.*;
import com.yonyou.uap.um.lexer.*;
import com.yonyou.uap.um.widget.*;
import com.yonyou.uap.um.widget.UmpSlidingLayout.SlidingViewType;
import com.yonyou.uap.um.log.ULog;
import java.util.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.webkit.*;
import android.content.*;
import android.graphics.*;
import android.widget.ImageView.ScaleType;

public abstract class CoursewareActivity extends UMWindowActivity {

	protected UMWindow Courseware = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout panel0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label0 = null;
protected UMImageButton imagebutton1 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout panel5 = null;
protected UMImageButton imagebutton10 = null;
protected UMLabel label4 = null;
protected UMImageButton imagebutton11 = null;
protected UMListViewBase listviewdefine0 = null;
protected XHorizontalLayout panel2 = null;
protected UMImageButton imagebutton9 = null;
protected UMLabel label1 = null;
protected UMImageButton imagebutton8 = null;
protected XHorizontalLayout panel3 = null;
protected XVerticalLayout panel4 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected UMButton button0 = null;
protected UMButton button1 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMImageButton imagebutton2 = null;
protected UMImageButton imagebutton3 = null;
protected UMImageButton imagebutton4 = null;
protected UMImageButton imagebutton5 = null;
protected UMImageButton imagebutton6 = null;
protected UMImageButton imagebutton7 = null;

	
	protected final static int ID_COURSEWARE = 1208634763;
protected final static int ID_VIEWPAGE0 = 528422334;
protected final static int ID_PANEL0 = 453120000;
protected final static int ID_IMAGEBUTTON0 = 1121695148;
protected final static int ID_LABEL0 = 679328747;
protected final static int ID_IMAGEBUTTON1 = 1596063956;
protected final static int ID_PANEL1 = 997190643;
protected final static int ID_PANEL5 = 901765330;
protected final static int ID_IMAGEBUTTON10 = 618458857;
protected final static int ID_LABEL4 = 75424214;
protected final static int ID_IMAGEBUTTON11 = 1485005425;
protected final static int ID_LISTVIEWDEFINE0 = 1867249780;
protected final static int ID_PANEL2 = 1945368340;
protected final static int ID_IMAGEBUTTON9 = 1011111051;
protected final static int ID_LABEL1 = 584554484;
protected final static int ID_IMAGEBUTTON8 = 1639593785;
protected final static int ID_PANEL3 = 1236386975;
protected final static int ID_PANEL4 = 909163711;
protected final static int ID_LABEL2 = 2012253755;
protected final static int ID_LABEL3 = 790022153;
protected final static int ID_BUTTON0 = 472814484;
protected final static int ID_BUTTON1 = 1699575846;
protected final static int ID_TOOLBAR0 = 1163581879;
protected final static int ID_IMAGEBUTTON2 = 287959735;
protected final static int ID_IMAGEBUTTON3 = 191366159;
protected final static int ID_IMAGEBUTTON4 = 2067270287;
protected final static int ID_IMAGEBUTTON5 = 1035270243;
protected final static int ID_IMAGEBUTTON6 = 346381900;
protected final static int ID_IMAGEBUTTON7 = 1786888068;

	
	
	@Override
	public String getControllerName() {
		return "CoursewareController";
	}
	
	@Override
	public String getContextName() {
		return "";
	}

	@Override
	public String getNameSpace() {
		return "com.yonyou.education";
	}

	protected void onCreate(Bundle savedInstanceState) {
		ULog.logLC("onCreate", this);
		super.onCreate(savedInstanceState);
        onInit(savedInstanceState);
        
	}
	
	@Override
	protected void onStart() {
		ULog.logLC("onStart", this);
		
		super.onStart();
	}

	@Override
	protected void onRestart() {
		ULog.logLC("onRestart", this);
		
		super.onRestart();
	}

	@Override
	protected void onResume() {
		ULog.logLC("onResume", this);
		
		super.onResume();
	}

	@Override
	protected void onPause() {
		ULog.logLC("onPause", this);
		
		super.onPause();
	}

	@Override
	protected void onStop() {
		ULog.logLC("onStop", this);
		
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		ULog.logLC("onDestroy", this);
		
		super.onDestroy();
	}
	
	public  void onInit(Bundle savedInstanceState) {
		ULog.logLC("onInit", this);
		UMActivity context = this;
		registerControl();
		this.getContainer();
		
		/*
		 new Thread() {
			 public void run() {
				 UMPDebugClient.startServer();
			 }
		 }.start();
		*/
		String sys_debug = ApplicationContext.getCurrent(this).getValue("sys_debug");
		if (sys_debug != null && sys_debug.equalsIgnoreCase("true")) {
			UMPDebugClient.waitForDebug();
		}

		IBinderGroup binderGroup = this;
		currentPage = getCurrentWindow(context, binderGroup);
super.setContentView(currentPage);

		
	}
	
	private void registerControl() {
		  idmap.put("Courseware",ID_COURSEWARE);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("imagebutton10",ID_IMAGEBUTTON10);
  idmap.put("label4",ID_LABEL4);
  idmap.put("imagebutton11",ID_IMAGEBUTTON11);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("imagebutton9",ID_IMAGEBUTTON9);
  idmap.put("label1",ID_LABEL1);
  idmap.put("imagebutton8",ID_IMAGEBUTTON8);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("button0",ID_BUTTON0);
  idmap.put("button1",ID_BUTTON1);
  idmap.put("toolbar0",ID_TOOLBAR0);
  idmap.put("imagebutton2",ID_IMAGEBUTTON2);
  idmap.put("imagebutton3",ID_IMAGEBUTTON3);
  idmap.put("imagebutton4",ID_IMAGEBUTTON4);
  idmap.put("imagebutton5",ID_IMAGEBUTTON5);
  idmap.put("imagebutton6",ID_IMAGEBUTTON6);
  idmap.put("imagebutton7",ID_IMAGEBUTTON7);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
		}
	
		{ //listviewdefine0 - action:listviewdefine0_onload
    UMEventArgs args = new UMEventArgs(CoursewareActivity.this);
    actionListviewdefine0_onload(listviewdefine0,args);

}

	}
	
	public void onDatabinding() {
		ULog.logLC("onDatabinding", this);
		super.onDatabinding();
		
	}
	
	@Override
	public void onReturn(String methodName, Object returnValue) {
		
	}

	@Override
	public void onAfterInit() {
		ULog.logLC("onAfterInit", this);
		
		onLoad();
	}
	
		@Override
	public Map<String,String> getPlugout(String id) {
		XJSON from = this.getUMContext();
		Map<String,String> r = super.getPlugout(id);
		
		return r;	
	}
	
	
	
	public View getPanel0View(final UMActivity context,IBinderGroup binderGroup) {
panel0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL0
,"padding-left","8"
,"padding-right","8"
,"halign","LEFT"
,"height","44"
,"layout-type","vbox"
,"background","#00a1ea"
,"width","fill"
,"valign","center"
);
imagebutton0 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON0
,"halign","center"
,"width","44"
,"icon-width","44"
,"istogglebutton","false"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icon"
,"icon-height","44"
,"height","44"
,"color","#919191"
,"layout-type","hbox"
,"font-size","10"
,"icon-background-image","icon_home.png"
,"icon-pressed-image","button_image_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel0.addView(imagebutton0);
label0 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL0
,"content","清华金融EMBA教务系统"
,"halign","left"
,"height","20"
,"weight","1"
,"color","#ffffff"
,"layout-type","hbox"
,"font-size","17"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel0.addView(label0);
imagebutton1 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON1
,"halign","center"
,"width","44"
,"icon-width","44"
,"istogglebutton","false"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icon"
,"icon-height","44"
,"height","44"
,"color","#919191"
,"layout-type","hbox"
,"font-size","10"
,"icon-background-image","icon_exit.png"
,"icon-pressed-image","button_image_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel0.addView(imagebutton1);

return panel0;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"border-bottom-width","1"
,"padding-left","12"
,"padding-right","12"
,"halign","LEFT"
,"height","60.0"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
imagebutton10 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON10
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icon"
,"icon-height","25"
,"height","44"
,"color","#919191"
,"layout-type","hbox"
,"font-size","10"
,"icon-background-image","tab_channel_touch.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel5.addView(imagebutton10);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"halign","left"
,"weight","1"
,"width","0"
,"content","课件"
,"height","wrap"
,"color","#696869"
,"heightwrap","23.0"
,"font-size","16"
,"layout-type","hbox"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
panel5.addView(label4);
imagebutton11 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON11
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icon"
,"icon-height","25"
,"height","44"
,"color","#919191"
,"layout-type","hbox"
,"font-size","10"
,"icon-background-image","tab_exit.png"
,"value","返回"
,"icon-pressed-image","button_image_touch"
,"onclick","action:imagebutton11_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel5.addView(imagebutton11);

return panel5;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","12"
,"padding-left","12"
,"border-bottom-width","1"
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
imagebutton9 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON9
,"halign","center"
,"width","44"
,"icon-width","25"
,"istogglebutton","false"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icon"
,"icon-height","25"
,"height","44"
,"color","#919191"
,"layout-type","hbox"
,"font-size","10"
,"icon-background-image","tool_folder_touch.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel2.addView(imagebutton9);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"bindfield","title"
,"halign","left"
,"weight","1"
,"width","0"
,"content","清华EMBA01宏观经济分析"
,"height","wrap"
,"color","#696869"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
panel2.addView(label1);
imagebutton8 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON8
,"halign","center"
,"width","44"
,"icon-width","32"
,"istogglebutton","false"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icon"
,"icon-height","32"
,"height","44"
,"color","#919191"
,"layout-type","hbox"
,"font-size","10"
,"icon-background-image","icon_enter.png"
,"icon-pressed-image","button_image_touch"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel2.addView(imagebutton8);

return panel2;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL4
,"halign","center"
,"height","45"
,"weight","1"
,"layout-type","hbox"
,"width","0"
,"margin-left","49"
,"valign","TOP"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","宏观经济学分析课堂作业"
,"halign","left"
,"height","0"
,"weight","1"
,"color","#696869"
,"layout-type","vbox"
,"font-size","14"
,"width","fill"
,"font-family","default"
,"valign","center"
);
panel4.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"content","发布日期：2016-05-12 12:12:00"
,"halign","left"
,"height","0"
,"weight","1"
,"color","#9B9B9B"
,"layout-type","vbox"
,"font-size","12"
,"width","fill"
,"font-family","default"
,"valign","center"
);
panel4.addView(label3);

return panel4;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","12"
,"padding-left","12"
,"border-bottom-width","1"
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel3.addView(panel4);
button0 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON0
,"halign","center"
,"border-radius","5"
,"width","44"
,"font-pressed-color","#459dfe"
,"margin-right","10"
,"height","26"
,"color","#ffffff"
,"layout-type","hbox"
,"font-size","14"
,"background","#00a1ea"
,"value","预览"
,"font-family","default"
,"valign","center"
);
panel3.addView(button0);
button1 = (UMButton)ThirdControl.createControl(new UMButton(context),ID_BUTTON1
,"halign","center"
,"border-radius","5"
,"width","44"
,"font-pressed-color","#459dfe"
,"height","26"
,"color","#ffffff"
,"font-size","14"
,"background","#00a1ea"
,"layout-type","hbox"
,"value","下载"
,"font-family","default"
,"valign","center"
);
panel3.addView(button1);

return panel3;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","list"
,"halign","center"
,"height","fill"
,"onload","action:listviewdefine0_onload"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"onitemclick","action:listviewdefine0_onitemclick"
,"valign","TOP"
,"collapsed","true"
);
listviewdefine0.addListItemView("getPanel2View");
listviewdefine0.addListItemView("getPanel3View");

return listviewdefine0;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL1
,"halign","center"
,"height","0"
,"weight","1"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"valign","TOP"
);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup);
panel1.addView(panel5);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup);
panel1.addView(listviewdefine0);

return panel1;
}
public View getToolbar0View(final UMActivity context,IBinderGroup binderGroup) {
toolbar0 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_TOOLBAR0
,"padding-right","50"
,"padding-left","50"
,"halign","CENTER"
,"height","49"
,"layout-type","vbox"
,"background","#F5F5F5"
,"width","fill"
,"valign","top"
);
imagebutton2 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON2
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icontext"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tab_home.png"
,"value","首页"
,"icon-pressed-image","tab_home_touch.png"
,"onclick","action:imagebutton2_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","0"
);
toolbar0.addView(imagebutton2);
imagebutton3 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON3
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icontext"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tool_edit.png"
,"value","课程"
,"icon-pressed-image","tool_edit_touch.png"
,"onclick","action:imagebutton3_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","0"
);
toolbar0.addView(imagebutton3);
imagebutton4 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON4
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icontext"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tab_channel.png"
,"value","课件"
,"icon-pressed-image","tab_channel_touch.png"
,"onclick","action:imagebutton4_onclick"
,"font-family","default"
,"valign","center"
,"checked","true"
,"icon-text-spacing","0"
);
toolbar0.addView(imagebutton4);
imagebutton5 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON5
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icontext"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tab_trophy.png"
,"value","教授"
,"icon-pressed-image","tab_trophy_touch.png"
,"onclick","action:imagebutton5_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","0"
);
toolbar0.addView(imagebutton5);
imagebutton6 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON6
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icontext"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tab_subscription.png"
,"value","同学录"
,"icon-pressed-image","tab_subscription_touch.png"
,"onclick","action:imagebutton6_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","0"
);
toolbar0.addView(imagebutton6);
imagebutton7 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON7
,"halign","center"
,"weight","1"
,"width","0"
,"icon-width","25"
,"istogglebutton","true"
,"font-pressed-color","#00a1ea"
,"imagebuttontype","icontext"
,"icon-height","25"
,"height","fill"
,"color","#919191"
,"layout-type","hbox"
,"font-size","12"
,"icon-background-image","tab_concact.png"
,"value","个人中心"
,"icon-pressed-image","tab_concact_touch.png"
,"onclick","action:imagebutton7_onclick"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","0"
);
toolbar0.addView(imagebutton7);

return toolbar0;
}
public View getViewPage0View(final UMActivity context,IBinderGroup binderGroup) {
viewPage0 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_VIEWPAGE0
,"halign","center"
,"height","fill"
,"layout-type","vbox"
,"background","#F7F8F8"
,"width","fill"
,"valign","TOP"
);
View panel0 = (View) getPanel0View((UMActivity)context,binderGroup);
viewPage0.addView(panel0);
View panel1 = (View) getPanel1View((UMActivity)context,binderGroup);
viewPage0.addView(panel1);
View toolbar0 = (View) getToolbar0View((UMActivity)context,binderGroup);
viewPage0.addView(toolbar0);

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
Courseware = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_COURSEWARE
,"orientation","horizontal"
,"canvasheight","432"
,"canvaswidth","768"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","CoursewareController"
,"valign","TOP"
,"namespace","com.yonyou.education"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Courseware.addView(viewPage0);

return (UMWindow)Courseware;
}

	
	public void actionImagebutton5_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton5_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.changePage()",UMActivity.getViewId(control),args);
}
public void actionImagebutton6_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton6_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.changePage()",UMActivity.getViewId(control),args);
}
public void actionImagebutton7_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton7_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.changePage()",UMActivity.getViewId(control),args);
}
public void actionImagebutton11_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton11_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.loadList()",UMActivity.getViewId(control),args);
}
public void actionImagebutton4_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton4_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.changePage()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onload(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onload";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.loadList()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onitemclick(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onitemclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.listItemclick()",UMActivity.getViewId(control),args);
}
public void actionImagebutton3_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton3_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.changePage()",UMActivity.getViewId(control),args);
}
public void actionImagebutton2_onclick(View control, UMEventArgs args) {
    String actionid = "imagebutton2_onclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.changePage()",UMActivity.getViewId(control),args);
}


}
