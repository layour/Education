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

public abstract class ProfessorDetailActivity extends UMWindowActivity {

	protected UMWindow ProfessorDetail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout panel0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label0 = null;
protected UMImageButton imagebutton1 = null;
protected XHorizontalLayout panel1 = null;
protected XVerticalLayout panel2 = null;
protected XHorizontalLayout panel4 = null;
protected UMImage image0 = null;
protected UMLabel label1 = null;
protected XHorizontalLayout panel5 = null;
protected UMImage image1 = null;
protected UMLabel label2 = null;
protected XHorizontalLayout panel6 = null;
protected UMLabel label3 = null;
protected UMLabel label4 = null;
protected XHorizontalLayout panel7 = null;
protected UMLabel label5 = null;
protected UMLabel label6 = null;
protected XHorizontalLayout panel8 = null;
protected UMLabel label7 = null;
protected UMLabel label8 = null;
protected XHorizontalLayout panel9 = null;
protected UMLabel label9 = null;
protected UMLabel label10 = null;
protected XHorizontalLayout panel10 = null;
protected UMLabel label11 = null;
protected UMLabel label12 = null;
protected XHorizontalLayout panel11 = null;
protected UMLabel label13 = null;
protected UMLabel label14 = null;
protected XVerticalLayout panel3 = null;
protected UMLabel label15 = null;
protected UMFloatingExpandListView listviewdefine0 = null;
protected XHorizontalLayout panel12 = null;
protected UMLabel label16 = null;
protected XHorizontalLayout panel13 = null;
protected XVerticalLayout panel14 = null;
protected UMLabel label18 = null;
protected UMLabel label19 = null;
protected UMLabel label17 = null;
protected XHorizontalLayout toolbar0 = null;
protected UMImageButton imagebutton2 = null;
protected UMImageButton imagebutton3 = null;
protected UMImageButton imagebutton4 = null;
protected UMImageButton imagebutton5 = null;
protected UMImageButton imagebutton6 = null;
protected UMImageButton imagebutton7 = null;

	
	protected final static int ID_PROFESSORDETAIL = 1836614809;
protected final static int ID_VIEWPAGE0 = 293015604;
protected final static int ID_PANEL0 = 1047325480;
protected final static int ID_IMAGEBUTTON0 = 1227445474;
protected final static int ID_LABEL0 = 1253645792;
protected final static int ID_IMAGEBUTTON1 = 48053629;
protected final static int ID_PANEL1 = 2061685257;
protected final static int ID_PANEL2 = 1161928006;
protected final static int ID_PANEL4 = 908846165;
protected final static int ID_IMAGE0 = 1565040736;
protected final static int ID_LABEL1 = 99601798;
protected final static int ID_PANEL5 = 1767088676;
protected final static int ID_IMAGE1 = 366936686;
protected final static int ID_LABEL2 = 1532515189;
protected final static int ID_PANEL6 = 1685002831;
protected final static int ID_LABEL3 = 1820364586;
protected final static int ID_LABEL4 = 83440850;
protected final static int ID_PANEL7 = 1581951081;
protected final static int ID_LABEL5 = 393148638;
protected final static int ID_LABEL6 = 761611058;
protected final static int ID_PANEL8 = 502868927;
protected final static int ID_LABEL7 = 69440645;
protected final static int ID_LABEL8 = 1958938394;
protected final static int ID_PANEL9 = 1707961093;
protected final static int ID_LABEL9 = 513537606;
protected final static int ID_LABEL10 = 779969011;
protected final static int ID_PANEL10 = 1446811305;
protected final static int ID_LABEL11 = 891543647;
protected final static int ID_LABEL12 = 542221228;
protected final static int ID_PANEL11 = 955155168;
protected final static int ID_LABEL13 = 874953461;
protected final static int ID_LABEL14 = 1427130607;
protected final static int ID_PANEL3 = 1604883351;
protected final static int ID_LABEL15 = 1251779483;
protected final static int ID_LISTVIEWDEFINE0 = 1532375228;
protected final static int ID_PANEL12 = 1605697369;
protected final static int ID_LABEL16 = 107423839;
protected final static int ID_PANEL13 = 34043624;
protected final static int ID_PANEL14 = 415490847;
protected final static int ID_LABEL18 = 566813970;
protected final static int ID_LABEL19 = 1337573962;
protected final static int ID_LABEL17 = 1791040118;
protected final static int ID_TOOLBAR0 = 276496283;
protected final static int ID_IMAGEBUTTON2 = 476776023;
protected final static int ID_IMAGEBUTTON3 = 981382192;
protected final static int ID_IMAGEBUTTON4 = 45468037;
protected final static int ID_IMAGEBUTTON5 = 805362185;
protected final static int ID_IMAGEBUTTON6 = 1553664317;
protected final static int ID_IMAGEBUTTON7 = 242633659;

	
	
	@Override
	public String getControllerName() {
		return "ProfessorDetailController";
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
		  idmap.put("ProfessorDetail",ID_PROFESSORDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);
  idmap.put("panel1",ID_PANEL1);
  idmap.put("panel2",ID_PANEL2);
  idmap.put("panel4",ID_PANEL4);
  idmap.put("image0",ID_IMAGE0);
  idmap.put("label1",ID_LABEL1);
  idmap.put("panel5",ID_PANEL5);
  idmap.put("image1",ID_IMAGE1);
  idmap.put("label2",ID_LABEL2);
  idmap.put("panel6",ID_PANEL6);
  idmap.put("label3",ID_LABEL3);
  idmap.put("label4",ID_LABEL4);
  idmap.put("panel7",ID_PANEL7);
  idmap.put("label5",ID_LABEL5);
  idmap.put("label6",ID_LABEL6);
  idmap.put("panel8",ID_PANEL8);
  idmap.put("label7",ID_LABEL7);
  idmap.put("label8",ID_LABEL8);
  idmap.put("panel9",ID_PANEL9);
  idmap.put("label9",ID_LABEL9);
  idmap.put("label10",ID_LABEL10);
  idmap.put("panel10",ID_PANEL10);
  idmap.put("label11",ID_LABEL11);
  idmap.put("label12",ID_LABEL12);
  idmap.put("panel11",ID_PANEL11);
  idmap.put("label13",ID_LABEL13);
  idmap.put("label14",ID_LABEL14);
  idmap.put("panel3",ID_PANEL3);
  idmap.put("label15",ID_LABEL15);
  idmap.put("listviewdefine0",ID_LISTVIEWDEFINE0);
  idmap.put("panel12",ID_PANEL12);
  idmap.put("label16",ID_LABEL16);
  idmap.put("panel13",ID_PANEL13);
  idmap.put("panel14",ID_PANEL14);
  idmap.put("label18",ID_LABEL18);
  idmap.put("label19",ID_LABEL19);
  idmap.put("label17",ID_LABEL17);
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
    UMEventArgs args = new UMEventArgs(ProfessorDetailActivity.this);
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
public View getPanel4View(final UMActivity context,IBinderGroup binderGroup) {
panel4 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL4
,"padding-left","20"
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
image0 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE0
,"height","25"
,"layout-type","hbox"
,"width","25"
,"scaletype","fitcenter"
,"src","tab_trophy_touch.png"
);
panel4.addView(image0);
label1 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL1
,"padding-left","8"
,"halign","center"
,"widthwrap","42.0"
,"width","wrap"
,"content","教授"
,"height","wrap"
,"color","#696869"
,"heightwrap","23.0"
,"font-size","16"
,"layout-type","hbox"
,"font-family","default"
,"valign","center"
);
panel4.addView(label1);

return panel4;
}
public View getPanel5View(final UMActivity context,IBinderGroup binderGroup) {
panel5 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL5
,"halign","LEFT"
,"height","100"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
image1 = (UMImage)ThirdControl.createControl(new UMImage(context),ID_IMAGE1
,"height","88"
,"layout-type","hbox"
,"width","88"
,"margin-left","20"
,"scaletype","fitcenter"
,"src","myhead.png"
);
panel5.addView(image1);
label2 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL2
,"content","杜雪飞"
,"halign","center"
,"height","60"
,"widthwrap","45.0"
,"color","#333333"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","bottom"
);
panel5.addView(label2);

return panel5;
}
public View getPanel6View(final UMActivity context,IBinderGroup binderGroup) {
panel6 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL6
,"padding-left","20"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
label3 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL3
,"content","教授类型："
,"halign","right"
,"height","wrap"
,"color","#333333"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
panel6.addView(label3);
label4 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL4
,"content","无类型"
,"halign","left"
,"height","wrap"
,"widthwrap","45.0"
,"color","#00a1ea"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel6.addView(label4);

return panel6;
}
public View getPanel7View(final UMActivity context,IBinderGroup binderGroup) {
panel7 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL7
,"padding-left","20"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
label5 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL5
,"content","办公电话："
,"halign","right"
,"height","wrap"
,"color","#333333"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
panel7.addView(label5);
label6 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL6
,"content","01012345678"
,"halign","left"
,"height","wrap"
,"widthwrap","88.0"
,"color","#00a1ea"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel7.addView(label6);

return panel7;
}
public View getPanel8View(final UMActivity context,IBinderGroup binderGroup) {
panel8 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL8
,"padding-left","20"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
label7 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL7
,"content","移动电话："
,"halign","right"
,"height","wrap"
,"color","#333333"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
panel8.addView(label7);
label8 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL8
,"content","18855555555"
,"halign","left"
,"height","wrap"
,"widthwrap","88.0"
,"color","#00a1ea"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel8.addView(label8);

return panel8;
}
public View getPanel9View(final UMActivity context,IBinderGroup binderGroup) {
panel9 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL9
,"padding-left","20"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
label9 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL9
,"content","电子邮箱："
,"halign","right"
,"height","wrap"
,"color","#333333"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
panel9.addView(label9);
label10 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL10
,"content","123456789@qq.com"
,"halign","left"
,"height","wrap"
,"widthwrap","137.0"
,"color","#00a1ea"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel9.addView(label10);

return panel9;
}
public View getPanel10View(final UMActivity context,IBinderGroup binderGroup) {
panel10 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL10
,"padding-left","20"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
label11 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL11
,"content","个人主页："
,"halign","right"
,"height","wrap"
,"color","#333333"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
panel10.addView(label11);
label12 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL12
,"content","mobile.yyyap.com"
,"halign","left"
,"height","wrap"
,"widthwrap","122.0"
,"color","#00a1ea"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel10.addView(label12);

return panel10;
}
public View getPanel11View(final UMActivity context,IBinderGroup binderGroup) {
panel11 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL11
,"padding-left","20"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"width","fill"
,"valign","center"
);
label13 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL13
,"content","助教："
,"halign","right"
,"height","wrap"
,"color","#333333"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","80"
,"font-family","default"
,"valign","center"
);
panel11.addView(label13);
label14 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL14
,"content","姚磊"
,"halign","left"
,"height","wrap"
,"widthwrap","30.0"
,"color","#00a1ea"
,"heightwrap","20.0"
,"layout-type","hbox"
,"font-size","14"
,"width","wrap"
,"font-family","default"
,"valign","center"
);
panel11.addView(label14);

return panel11;
}
public View getPanel2View(final UMActivity context,IBinderGroup binderGroup) {
panel2 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL2
,"margin-right","1"
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","hbox"
,"width","0"
,"valign","TOP"
);
View panel4 = (View) getPanel4View((UMActivity)context,binderGroup);
panel2.addView(panel4);
View panel5 = (View) getPanel5View((UMActivity)context,binderGroup);
panel2.addView(panel5);
View panel6 = (View) getPanel6View((UMActivity)context,binderGroup);
panel2.addView(panel6);
View panel7 = (View) getPanel7View((UMActivity)context,binderGroup);
panel2.addView(panel7);
View panel8 = (View) getPanel8View((UMActivity)context,binderGroup);
panel2.addView(panel8);
View panel9 = (View) getPanel9View((UMActivity)context,binderGroup);
panel2.addView(panel9);
View panel10 = (View) getPanel10View((UMActivity)context,binderGroup);
panel2.addView(panel10);
View panel11 = (View) getPanel11View((UMActivity)context,binderGroup);
panel2.addView(panel11);

return panel2;
}
public View getPanel12View(final UMActivity context,IBinderGroup binderGroup) {
panel12 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL12
,"border-bottom-width","1"
,"halign","LEFT"
,"height","30"
,"layout-type","vbox"
,"background","#f7f7f7"
,"width","fill"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
label16 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL16
,"bindfield","group"
,"padding-left","12"
,"halign","center"
,"widthwrap","78.0"
,"width","wrap"
,"content","2016-6-12"
,"height","wrap"
,"color","#333333"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"font-family","default"
,"valign","center"
);
panel12.addView(label16);

return panel12;
}
public View getPanel14View(final UMActivity context,IBinderGroup binderGroup) {
panel14 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL14
,"halign","center"
,"height","fill"
,"layout-type","hbox"
,"width","120.0"
,"valign","CENTER"
);
label18 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL18
,"bindfield","begin"
,"halign","center"
,"widthwrap","48.0"
,"width","wrap"
,"content","15:00:00"
,"height","wrap"
,"color","#9B9B9B"
,"heightwrap","18.0"
,"font-size","12"
,"layout-type","vbox"
,"font-family","default"
,"valign","center"
);
panel14.addView(label18);
label19 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL19
,"bindfield","end"
,"halign","center"
,"widthwrap","48.0"
,"width","wrap"
,"content","15:00:00"
,"height","wrap"
,"color","#9B9B9B"
,"heightwrap","18.0"
,"font-size","12"
,"layout-type","vbox"
,"font-family","default"
,"valign","center"
);
panel14.addView(label19);

return panel14;
}
public View getPanel13View(final UMActivity context,IBinderGroup binderGroup) {
panel13 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL13
,"border-bottom-width","1"
,"halign","LEFT"
,"height","50"
,"layout-type","vbox"
,"background","#FFFFFF"
,"width","fill"
,"margin-left","15"
,"valign","center"
,"border-bottom-color","#C7C7C7"
);
View panel14 = (View) getPanel14View((UMActivity)context,binderGroup);
panel13.addView(panel14);
label17 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL17
,"bindfield","title"
,"halign","center"
,"widthwrap","75.0"
,"width","wrap"
,"content","管理经济学"
,"height","wrap"
,"color","#696869"
,"heightwrap","20.0"
,"font-size","14"
,"layout-type","hbox"
,"font-family","default"
,"valign","center"
);
panel13.addView(label17);

return panel13;
}
public View getListviewdefine0View(final UMActivity context,IBinderGroup binderGroup) {
listviewdefine0 = (UMFloatingExpandListView)ThirdControl.createControl(new UMFloatingExpandListView(context),ID_LISTVIEWDEFINE0
,"bindfield","source,row"
,"halign","center"
,"list-type","group"
,"height","fill"
,"onload","action:listviewdefine0_onload"
,"layout-type","vbox"
,"layout","vbox"
,"width","fill"
,"valign","TOP"
,"collapsed","true"
);
listviewdefine0.addListItemView("getPanel12View");
listviewdefine0.addListItemView("getPanel13View");

return listviewdefine0;
}
public View getPanel3View(final UMActivity context,IBinderGroup binderGroup) {
panel3 = (XVerticalLayout)ThirdControl.createControl(new XVerticalLayout(context),ID_PANEL3
,"halign","center"
,"height","fill"
,"weight","1"
,"layout-type","hbox"
,"width","0"
,"margin-left","1"
,"valign","TOP"
);
label15 = (UMLabel)ThirdControl.createControl(new UMLabel(context),ID_LABEL15
,"content","课程表"
,"halign","left"
,"height","30"
,"color","#333333"
,"layout-type","vbox"
,"font-size","14"
,"width","fill"
,"margin-left","12"
,"font-family","default"
,"valign","center"
);
panel3.addView(label15);
View listviewdefine0 = (View) getListviewdefine0View((UMActivity)context,binderGroup);
panel3.addView(listviewdefine0);

return panel3;
}
public View getPanel1View(final UMActivity context,IBinderGroup binderGroup) {
panel1 = (XHorizontalLayout)ThirdControl.createControl(new XHorizontalLayout(context),ID_PANEL1
,"halign","CENTER"
,"height","0"
,"weight","1"
,"layout-type","vbox"
,"background","#ffffff"
,"width","fill"
,"valign","top"
);
View panel2 = (View) getPanel2View((UMActivity)context,binderGroup);
panel1.addView(panel2);
View panel3 = (View) getPanel3View((UMActivity)context,binderGroup);
panel1.addView(panel3);

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
ProfessorDetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_PROFESSORDETAIL
,"orientation","horizontal"
,"canvasheight","432"
,"canvaswidth","768"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","ProfessorDetailController"
,"valign","TOP"
,"namespace","com.yonyou.education"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
ProfessorDetail.addView(viewPage0);

return (UMWindow)ProfessorDetail;
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
  this.getContainer().exec(actionid, "this.loadList()",UMActivity.getViewId(control),args);
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
