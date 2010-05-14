/*******************************************************************************
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.eclipse.project.core.facet;

import org.eclipse.jst.j2ee.project.facet.IJ2EEFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.frameworks.internal.operations.IProjectCreationPropertiesNew;

/**
 * @author Greg Amerson
 */
@SuppressWarnings("restriction")
public interface IPluginProjectDataModelProperties
	extends IJ2EEFacetProjectCreationDataModelProperties, IProjectCreationPropertiesNew {

	public static final String CREATE_PROJECT_OPERATION = "IPluginProjectDataModelProperties.CREATE_PROJECT_OPERATION";

	public static final String EXT_NAME = "IPluginProjectDataModelProperties.EXT_NAME";

	public static final String HOOK_NAME = "IPluginProjectDataModelProperties.HOOK_NAME";

	public static final String LAYOUT_TEMPLATE_NAME = "IPluginProjectDataModelProperties.LAYOUT_TEMPLATE_NAME";

	// public static final String LIFERAY_USE_WORKSPACE_LOCATION =
	// "IPluginProjectDataModelProperties.LIFERAY_USE_WORKSPACE_LOCATION";

	public static final String LIFERAY_ADV_CONFIG = "IPluginProjectDataModelProperties.LIFERAY_ADV_CONFIG";

	public static final String LIFERAY_PLUGIN_LIBRARY_DELEGATE =
		"IPluginProjectDataModelProperties.LIFERAY_PLUGIN_LIBRARY_DELEGATE";
	
	public static final String LIFERAY_SDK_NAME = "IPluginProjectDataModelProperties.LIFERAY_SDK_NAME";
	
	public static final String LIFERAY_USE_CUSTOM_LOCATION =
		"IPluginProjectDataModelProperties.LIFERAY_USE_CUSTOM_LOCATION";
	
	public static final String LIFERAY_USE_SDK_LOCATION = "IPluginProjectDataModelProperties.LIFERAY_USE_SDK_LOCATION";
	
	public static final String PLUGIN_TYPE_EXT = "IPluginProjectDataModelProperties.PLUGIN_TYPE_EXT";

	// public static final String SETUP_PROJECT_FLAG =
	// "IPluginProjectDataModelProperties.SETUP_PROJECT_FLAG";

	public static final String PLUGIN_TYPE_HOOK = "IPluginProjectDataModelProperties.PLUGIN_TYPE_HOOK";
	
	public static final String PLUGIN_TYPE_LAYOUT_TEMPLATE = "IPluginProjectDataModelProperties.PLUGIN_TYPE_TEMPLATE";
	
	public static final String PLUGIN_TYPE_PORTLET = "IPluginProjectDataModelProperties.PLUGIN_TYPE_PORTLET";
	
	public static final String PLUGIN_TYPE_THEME = "IPluginProjectDataModelProperties.PLUGIN_TYPE_THEME";
	
	public static final String PORTLET_NAME = "IPluginProjectDataModelProperties.PORTLET_NAME";

	public static final String THEME_NAME = "IPluginProjectDataModelProperties.THEME_NAME";
}