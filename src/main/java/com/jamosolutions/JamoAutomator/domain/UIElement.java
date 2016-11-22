package com.jamosolutions.JamoAutomator.domain;

import java.util.ArrayList;
import java.util.List;

public class UIElement extends BaseEntity {
	private Long parentId;
	private Long identifier;
	private String type;
	private Integer zIndex;
	private List<UIAttribute> attributes = new ArrayList<>();
	private UIElement parentListCell;

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Long identifier) {
		this.identifier = identifier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getzIndex() {
		return zIndex;
	}

	public void setzIndex(Integer zIndex) {
		this.zIndex = zIndex;
	}

	public List<UIAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<UIAttribute> attributes) {
		this.attributes = attributes;
	}

	public UIElement getParentListCell() {
		return parentListCell;
	}

	public void setParentListCell(UIElement parentListCell) {
		this.parentListCell = parentListCell;
	}
}
