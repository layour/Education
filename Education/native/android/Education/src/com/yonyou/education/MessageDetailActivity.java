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

public abstract class MessageDetailActivity extends UMWindowActivity {

	protected UMWindow MessageDetail = null;
protected XVerticalLayout viewPage0 = null;
protected XHorizontalLayout panel0 = null;
protected UMImageButton imagebutton0 = null;
protected UMLabel label0 = null;
protected UMImageButton imagebutton1 = null;

	
	protected final static int ID_MESSAGEDETAIL = 1161319929;
protected final static int ID_VIEWPAGE0 = 364931896;
protected final static int ID_PANEL0 = 1503312025;
protected final static int ID_IMAGEBUTTON0 = 1006419343;
protected final static int ID_LABEL0 = 2021394989;
protected final static int ID_IMAGEBUTTON1 = 265925997;

	
	
	@Override
	public String getControllerName() {
		return "MessageDetailController";
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
		  idmap.put("MessageDetail",ID_MESSAGEDETAIL);
  idmap.put("viewPage0",ID_VIEWPAGE0);
  idmap.put("panel0",ID_PANEL0);
  idmap.put("imagebutton0",ID_IMAGEBUTTON0);
  idmap.put("label0",ID_LABEL0);
  idmap.put("imagebutton1",ID_IMAGEBUTTON1);

	}
	
	public void onLoad() {
		ULog.logLC("onLoad", this);
		if(currentPage!=null) {
			currentPage.onLoad();
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
,"padding-right","8"
,"padding-left","8"
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
,"icon-background-image","icon_close.png"
,"font-family","default"
,"valign","center"
,"checked","false"
,"icon-text-spacing","3"
);
panel0.addView(imagebutton1);

return panel0;
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

return viewPage0;
}
public UMWindow getCurrentWindow(final UMActivity context,IBinderGroup binderGroup) {
MessageDetail = (UMWindow)ThirdControl.createControl(new UMWindow(context),ID_MESSAGEDETAIL
,"orientation","horizontal"
,"canvasheight","432"
,"canvaswidth","768"
,"halign","center"
,"height","fill"
,"layout-type","linear"
,"layout","vbox"
,"width","fill"
,"controller","MessageDetailController"
,"valign","TOP"
,"namespace","com.yonyou.education"
);
View viewPage0 = (View) getViewPage0View((UMActivity)context,binderGroup);
MessageDetail.addView(viewPage0);

return (UMWindow)MessageDetail;
}

	
	

}
