package com.danielvaughan.rssreader.client.components;

import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.Popup;
import com.extjs.gxt.ui.client.widget.Text;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;

public class LinkFeedPopup extends Popup {
	private final TextField<String> tfUrl = new TextField<String>();

	public LinkFeedPopup() {
		setSize(300, 55);
		setBorders(true);
		setShadow(true);
		setAutoHide(false);
	}
	
	@Override
	protected void onRender(Element parent, int pos) {
		super.onRender(parent, pos);
		final Text txtExplaination = new Text("Enter a feed url");
		final Button btnAdd = new Button("add");
		btnAdd.addSelectionListener(new SelectionListener<ButtonEvent>() {
			public void componentSelected(ButtonEvent ce) {
				addFeed(tfUrl.getValue());
			}
		});
		
		final BorderLayout layout = new BorderLayout();
		setLayout(layout);
		
		final BorderLayoutData northData = new BorderLayoutData(LayoutRegion.NORTH, 20);
		northData.setMargins(new Margins(2));
		add(txtExplaination, northData);

		final BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
		centerData.setMargins(new Margins(2));
		add(tfUrl, centerData);

		final BorderLayoutData eastData = new BorderLayoutData(LayoutRegion.EAST, 50);
		eastData.setMargins(new Margins(2));
		add(btnAdd, eastData);
	}
	
	public void addFeed(String url) {
		Window.alert("We would now attempt to add " + url + " at this point");
	}

}
