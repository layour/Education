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

public abstract class ProfessorActivity extends UMWindowActivity {

	protected UMWindow Professor = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout panel0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label0 = null;
protected UMImageButton imagebutton1 = null;
protected XVerticalLayout panel1 = null;
protected XHorizontalLayout panel2 = null;
protected UMImageButton imagebutton8 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout panel3 = null;
protected UMLabel label2 = null;
protected UMLabel label3 = null;
protected UMLabel label4 = null;
protected UMListViewBase listviewdefine0 = null;
protected XHorizontalLayout panel4 = null;
protected UMLabel label5 = null;
protected UMLabel label6 = null;
protected UMLabel label7 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMImageButton imagebutton2 = null;
protected UMImageButton imagebutton3 = null;
protected UMImageButton imagebutton4 = null;
protected UMImageButton imagebutton5 = null;
protected UMImageButton imagebutton6 = null;
protected UMImageButton imagebutton7 = null;

	
	protected final static int ID_PROFESSOR = 628068970;
protected final static int ID_VIEWPAGE0 = 386402954;
protected final static int ID_PANEL0 = 1585600834;
protected final static int ID_IMAGEBUTTON0 = 1921338343;
protected final static int ID_LABEL0 = 2124013189;
protected final static int ID_IMAGEBUTTON1 = 47116049;
protected final static int ID_PANEL1 = 334903624;
protected final static int ID_PANEL2 = 1012660579;
protected final static int ID_IMAGEBUTTON8 = 902449623;
protected final static int ID_LABEL1 = 2063554698;
protected final static int ID_PANEL3 = 1308561131;
protected final static int ID_LABEL2 = 1792109161;
protected final static int ID_LABEL3 = 210051628;
protected final static int ID_LABEL4 = 1887676153;
protected final static int ID_LISTVIEWDEFINE0 = 1258440688;
protected final static int ID_PANEL4 = 617057547;
protected final static int ID_LABEL5 = 933003308;
protected final static int ID_LABEL6 = 600521659;
protected final static int ID_LABEL7 = 743455141;
protected final static int ID_TOOLBAR0 = 1953607561;
protected final static int ID_IMAGEBUTTON2 = 1612494578;
protected final static int ID_IMAGEBUTTON3 = 1722670082;
protected final static int ID_IMAGEBUTTON4 = 2129052322;
protected final static int ID_IMAGEBUTTON5 = 598508530;
protected final static int ID_IMAGEBUTTON6 = 241061950;
protected final static int ID_IMAGEBUTTON7 = 1872208208;

	
	
	@Override
	public String getControllerName() {
		return "ProfessorController";
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
		  idmap.put("Professor",ID_PROFESSOR);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("imagebutton8",ID_IMAGEBUTTON8);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label2",ID_LABEL2);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label6",ID_LABEL6);
  idmap.put("label7",ID_LABEL7);
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
    UMEventArgs args = new UMEventArgs(ProfessorActivity.this);
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
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL2
,"padding-right","12"
,"padding-left","12"
,"border-bottom-width","1"
,"halign","LEFT"
,"height","60.0"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
imagebutton8 = (UMImageButton)ThirdControl.createControl(new UMImageButton(context),ID_IMAGEBUTTON8
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
,"icon-background-image","tab_trophy_touch.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel2.addView(imagebutton8);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"halign","left"
,"weight","1"
,"width","0"
,"content","教授"
,"height","wrap"
,"color","#696869"
,"heightwrap","23.0"
,"font-size","16"
,"layout-type","hbox"
,"margin-left","5"
,"font-family","default"
,"valign","center"
);
panel2.addView(label1);

return panel2;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL3
,"padding-right","12"
,"padding-left","12"
,"border-bottom-width","1"
,"halign","LEFT"
,"height","36"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","姓名(中/英)"
,"halign","left"
,"height","wrap"
,"weight","3"
,"color","#9B9B9B"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel3.addView(label2);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"content","主讲"
,"halign","left"
,"height","wrap"
,"weight","3"
,"color","#9B9B9B"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel3.addView(label3);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"content","邮箱"
,"halign","left"
,"height","wrap"
,"weight","2"
,"color","#9B9B9B"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","0"
,"font-family","default"
,"valign","center"
);
panel3.addView(label4);

return panel3;
}
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"border-bottom-width","1"
,"padding-left","12"
,"padding-right","12"
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"bindfield","professor"
,"halign","left"
,"weight","3"
,"width","0"
,"content","杜雪飞"
,"height","wrap"
,"color","#696869"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"font-family","default"
,"valign","center"
);
panel4.addView(label5);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"bindfield","course"
,"halign","left"
,"weight","3"
,"width","0"
,"content","管理经济学"
,"height","wrap"
,"color","#696869"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"font-family","default"
,"valign","center"
);
panel4.addView(label6);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"bindfield","email"
,"halign","left"
,"weight","2"
,"width","0"
,"content","123456@qq.com"
,"height","wrap"
,"color","#696869"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"font-family","default"
,"valign","center"
);
panel4.addView(label7);

return panel4;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine0 = (UMListViewBase)ThirdControl.createControl(new UMListViewBase(context),ID_LISTVIEWDEFINE0
,"bindfield","list"
,"halign","center"
,"height","0"
,"weight","1"
,"onload","action:listviewdefine0_onload"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"onitemclick","action:listviewdefine0_onitemclick"
,"valign","TOP"
,"collapsed","true"
);
listviewdefine0.addListItemView("getPanel4View");

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
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel1.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel1.addView(panel3);
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
,"checked","false"
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
,"checked","true"
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
Professor = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PROFESSOR
,"orientation","horizontal"
,"canvasheight","432"
,"canvaswidth","768"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","ProfessorController"
,"valign","TOP"
,"namespace","com.yonyou.education"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
Professor.addView(viewPage0);

return (UMWindow)Professor;
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
  this.getContainer().exec(actionid, "this.professorOnload()",UMActivity.getViewId(control),args);
}
public void actionListviewdefine0_onitemclick(View control, UMEventArgs args) {
    String actionid = "listviewdefine0_onitemclick";
    args.put("language","javascript");
    args.put("containerName","");
  ActionProcessor.exec(this, actionid, args);
  this.getContainer().exec(actionid, "this.onitemclik()",UMActivity.getViewId(control),args);
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
