package com.jamosolutions.JamoAutomator.domain;

import java.util.LinkedList;
import java.util.List;

public class UIElementTreeNode {
	UIElement data;
	List<UIElementTreeNode> children;

	public UIElementTreeNode() {
	}

	public UIElementTreeNode(UIElement data) {
		this.data = data;
		this.children = new LinkedList<>();
	}

	public UIElementTreeNode addChild(UIElement child) {
		UIElementTreeNode childNode = new UIElementTreeNode(child);
		this.children.add(childNode);
		return childNode;
	}

	public UIElement getData() {
		return data;
	}

	public void setData(UIElement data) {
		this.data = data;
	}

	public List<UIElementTreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<UIElementTreeNode> children) {
		this.children = children;
	}
}