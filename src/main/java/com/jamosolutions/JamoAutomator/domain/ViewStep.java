package com.jamosolutions.JamoAutomator.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewStep {
	private Long metaUIElementId = -1L;
	private List<Argument> metaUIArguments = new ArrayList<>();
	private Long iterationOrder;
	private Long order;
	private String imageBase64;
	private String keyString;
	private String parentKeyString;
	private String viewKeyString;
	private String metaUIElementKeyString;
	private UIElement metaUIElement;
	private Long imageWidth;
	private Long imageHeight;
	private List<UIElement> metaUIElements = new ArrayList<>();;
	private String type;
	private List<ViewStep> children = new ArrayList<>();
	// ui stuff
	private boolean leaf = true;
	private String icon = "resources/images/action.png";
	// view step type specific stuff
	private String metaUIMethod;
	private String dataPointName;
	private String logicOperator;
	private String compareOperator;
	private String notOperator;
	private Long synchronisationTimeInterval;
	private String iteratorName;
	private ViewStep iterator;
	private String iteratorKeyString;
	private String cellSelectionType;
	private ViewStep parentCell;
	private String parentCellKeyString;
	private StepSpecification relatedStepSpecification;
	private String relatedStepSpecificationKeyString;
	// currently not used
	private String osUIMethod;
	private Long osUIElementId;
	private List<String> osUIArguments = new ArrayList<>();
	private List<UIElement> osUIElements = new ArrayList<>();
	private UIElementTreeNode metaUIElementTree;
	private String executionEnvironmentKey;
	private Boolean uiUpToDate = false;

	public String getMetaUIMethod() {
		return this.metaUIMethod;
	}

	public void setMetaUIMethod(String method) {
		this.metaUIMethod = method;
	}

	public Long getMetaUIElementId() {
		return this.metaUIElementId;
	}

	public void setMetaUIElementId(Long id) {
		this.metaUIElementId = id;
	}

	public String getOSUIMethod() {
		return this.osUIMethod;
	}

	public void setOSUIMethod(String method) {
		this.osUIMethod = method;
	}

	public List<String> getOSUIArguments() {
		return this.osUIArguments;
	}

	public void setOSUIArguments(List<String> arguments) {
		this.osUIArguments = arguments;
	}

	public Long getOSUIElementId() {
		return this.osUIElementId;
	}

	public void setOSUIElementId(Long id) {
		this.osUIElementId = id;
	}

	public Long getIterationOrder() {
		return iterationOrder;
	}

	public void setIterationOrder(Long iterationOrder) {
		this.iterationOrder = iterationOrder;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public void setImage(String value) {
		imageBase64 = value;
	}

	public String getImage() {
		return imageBase64;
	}

	public String getKeyString() {
		return keyString;
	}

	public void setKeyString(String keyString) {
		this.keyString = keyString;
	}

	public String getParentKeyString() {
		return parentKeyString;
	}

	public void setParentKeyString(String parentKeyString) {
		this.parentKeyString = parentKeyString;
	}

	public String getViewKeyString() {
		return viewKeyString;
	}

	public void setViewKeyString(String viewKeyString) {
		this.viewKeyString = viewKeyString;
	}

	public String getMetaUIElementKeyString() {
		return metaUIElementKeyString;
	}

	public void setMetaUIElementKeyString(String metaUIElementKeyString) {
		this.metaUIElementKeyString = metaUIElementKeyString;
	}

	public UIElement getMetaUIElement() {
		return metaUIElement;
	}

	public void setMetaUIElement(UIElement metaUIElement) {
		this.metaUIElement = metaUIElement;
	}

	public List<UIElement> getOSUIElements() {
		return osUIElements;
	}

	public void setOSUIElements(List<UIElement> elements) {
		osUIElements = elements;
	}

	// @JsonIgnore
	public List<UIElement> getMetaUIElements() {
		return metaUIElements;
	}

	public void setMetaUIElements(List<UIElement> elements) {
		metaUIElements = elements;
	}

	@JsonIgnore
	public void setMetaUIElementTree(UIElementTreeNode metaUIElementTree) {
		this.metaUIElementTree = metaUIElementTree;
	}

	@JsonProperty
	public UIElementTreeNode getMetaUIElementTree() {
		if (metaUIElements.size() == 0) {
			return null;
		}
		Collections.sort(metaUIElements, new Comparator<UIElement>() {
			public int compare(UIElement elem1, UIElement elem2) {
				return elem1.getIdentifier().compareTo(elem2.getIdentifier());
			}
		});
		Map<Long, List<UIElement>> map = new HashMap<>();
		for (UIElement element : metaUIElements) {
			if (map.containsKey(element.getParentId())) {
				map.get(element.getParentId()).add(element);
			} else {
				List<UIElement> list = new ArrayList<UIElement>();
				list.add(element);
				map.put(element.getParentId(), list);
			}
		}
		if (map.get(Long.valueOf(-1)) != null) {
			UIElement parentElement = map.get(Long.valueOf(-1)).get(0);
			UIElementTreeNode tree = new UIElementTreeNode(parentElement);
			processChildren(map, parentElement, tree);
			return tree;
		}
		return null;
	}

	private void processChildren(Map<Long, List<UIElement>> map, UIElement parentElement, UIElementTreeNode tree) {
		List<UIElement> children = map.get(parentElement.getIdentifier());
		if (children != null) {
			for (UIElement child : children) {
				UIElementTreeNode childNode = tree.addChild(child);
				processChildren(map, child, childNode);
			}
		}
	}

	public void setRelatedStepSpecification(StepSpecification stepSpecification) {
		relatedStepSpecification = stepSpecification;
	}

	public StepSpecification getRelatedStepSpecification() {
		return relatedStepSpecification;
	}

	public String getRelatedStepSpecificationKeyString() {
		return relatedStepSpecificationKeyString;
	}

	public void setRelatedStepSpecificationKeyString(String relatedStepSpecificationKeyString) {
		this.relatedStepSpecificationKeyString = relatedStepSpecificationKeyString;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<Argument> getMetaUIArguments() {
		return metaUIArguments;
	}

	public void setMetaUIArguments(List<Argument> metaUIArguments) {
		this.metaUIArguments = metaUIArguments;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDataPointName() {
		return dataPointName;
	}

	public void setDataPointName(String dataPointName) {
		this.dataPointName = dataPointName;
	}

	public List<ViewStep> getChildren() {
		return children;
	}

	public void setChildren(List<ViewStep> children) {
		this.children = children;
	}

	public String getLogicOperator() {
		return logicOperator;
	}

	public void setLogicOperator(String logicOperator) {
		this.logicOperator = logicOperator;
	}

	public String getCompareOperator() {
		return compareOperator;
	}

	public void setCompareOperator(String compareOperator) {
		this.compareOperator = compareOperator;
	}

	public String getNotOperator() {
		return notOperator;
	}

	public void setNotOperator(String notOperator) {
		this.notOperator = notOperator;
	}

	public Long getSynchronisationTimeInterval() {
		return synchronisationTimeInterval;
	}

	public void setSynchronisationTimeInterval(Long synchronisationTimeInterval) {
		this.synchronisationTimeInterval = synchronisationTimeInterval;
	}

	public ViewStep getIterator() {
		return iterator;
	}

	public void setIterator(ViewStep iterator) {
		this.iterator = iterator;
	}

	public String getIteratorKeyString() {
		return iteratorKeyString;
	}

	public void setIteratorKeyString(String iteratorKeyString) {
		this.iteratorKeyString = iteratorKeyString;
	}

	public String getIteratorName() {
		return iteratorName;
	}

	public void setIteratorName(String iteratorName) {
		this.iteratorName = iteratorName;
	}

	public String getCellSelectionType() {
		return cellSelectionType;
	}

	public void setCellSelectionType(String cellSelectionType) {
		this.cellSelectionType = cellSelectionType;
	}

	public ViewStep getParentCell() {
		return parentCell;
	}

	public void setParentCell(ViewStep parentCell) {
		this.parentCell = parentCell;
	}

	public String getParentCellKeyString() {
		return parentCellKeyString;
	}

	public void setParentCellKeyString(String parentCellKeyString) {
		this.parentCellKeyString = parentCellKeyString;
	}

	public Long getImageWidth() {
		return imageWidth;
	}

	public String getExecutionEnvironmentKey() {
		return executionEnvironmentKey;
	}

	public void setExecutionEnvironmentKey(String executionEnvironmentKey) {
		this.executionEnvironmentKey = executionEnvironmentKey;
	}

	public void setImageWidth(Long imageWidth) {
		this.imageWidth = imageWidth;
	}

	public Long getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(Long imageHeight) {
		this.imageHeight = imageHeight;
	}

	public Boolean getUiUpToDate() {
		return uiUpToDate;
	}

	public void setUiUpToDate(Boolean uiUpToDate) {
		this.uiUpToDate = uiUpToDate;
	}
}