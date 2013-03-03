package org.tushar.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Loader implements EntryPoint {
	private TextBox lover1 = new TextBox();
	private TextBox lover2 = new TextBox();
	private Button calbtn = new Button("Calculate!");
	
	private DialogBox diag = new DialogBox(false);
	private VerticalPanel diagcontents = new VerticalPanel();
	private HTML msg;// = new HTML("Hello world");
	private Button okbtn = new Button("Ok");
	
	public Loader(){
		diag.setText("Love Calculator");
		diag.setAnimationEnabled(true);
		okbtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				diag.hide();
				diag.clear();
				diagcontents.clear();
			}
		});
		
		calbtn.addClickHandler(new ClickHandler() {	
			@Override
			public void onClick(ClickEvent event) {

				calculateLove();
			}
		});
		
	}

	@Override
	public void onModuleLoad() {
		RootPanel.get("lover1").add(lover1);
		RootPanel.get("lover2").add(lover2);
		RootPanel.get("calbtn").add(calbtn);

	}
	private void calculateLove(){
		float percentage= Lovecal.getPercentage(lover1.getText(), lover2.getText());
		msg = new HTML("<strong>Love Percentage: "+percentage+"</strong> </br>-coded by tushar");
		diagcontents.add(msg);
		diagcontents.add(okbtn);
		diag.add(diagcontents);
		diag.center();
	}

}
