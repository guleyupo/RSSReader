package com.danielvaughan.rssreader.client;


import com.danielvaughan.rssreader.client.components.RssMainPanel;
import com.danielvaughan.rssreader.client.components.RssNavigationPanel;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RSSReader implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Viewport viewport = new Viewport();
		
		final BorderLayout borderLayout = new BorderLayout();
		viewport.setLayout(borderLayout);
		
		BorderLayoutData northData = new BorderLayoutData(LayoutRegion.NORTH,20);
		northData.setCollapsible(false);
		northData.setSplit(false);
		
		HTML headerHtml = new HTML();
		headerHtml.setHTML("<h1>RSS Reader</h1>");
		viewport.add(headerHtml, northData);

		
		
		BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
		centerData.setCollapsible(false);
		
		RssMainPanel mainPanel = new RssMainPanel();
		viewport.add(mainPanel, centerData);

		BorderLayoutData westData = new BorderLayoutData(LayoutRegion.WEST, 200, 150, 300);
		westData.setCollapsible(true);
		westData.setSplit(true);

		RssNavigationPanel navPanel = new RssNavigationPanel();
		viewport.add(navPanel, westData);

		RootPanel.get().add(viewport);
	}
}
