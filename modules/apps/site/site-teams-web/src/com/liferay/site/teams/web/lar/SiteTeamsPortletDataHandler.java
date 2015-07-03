/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
 */

package com.liferay.site.teams.web.lar;

import com.liferay.portlet.exportimport.lar.BasePortletDataHandler;
import com.liferay.portlet.exportimport.lar.PortletDataHandler;
import com.liferay.site.teams.web.constants.SiteTeamsPortletKeys;

import org.osgi.service.component.annotations.Component;

/**
 * @author Akos Thurzo
 */
@Component(
	property = {"javax.portlet.name=" + SiteTeamsPortletKeys.SITE_TEAMS_ADMIN},
	service = PortletDataHandler.class
)
public class SiteTeamsPortletDataHandler extends BasePortletDataHandler {

	/*public SiteTeamsPortletDataHandler() {
	}*/

	public static final String NAMESPACE = "team";

}
