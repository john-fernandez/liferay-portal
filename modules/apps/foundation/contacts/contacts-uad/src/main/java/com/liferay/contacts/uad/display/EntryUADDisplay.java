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

package com.liferay.contacts.uad.display;

import com.liferay.contacts.model.Entry;
import com.liferay.contacts.uad.constants.ContactsUADConstants;

import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;

import com.liferay.user.associated.data.display.UADDisplay;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Locale;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(immediate = true, property =  {
	"model.class.name=" + ContactsUADConstants.CLASS_NAME_ENTRY}, service = UADDisplay.class)
public class EntryUADDisplay implements UADDisplay<Entry> {
	public String getApplicationName() {
		return ContactsUADConstants.APPLICATION_NAME;
	}

	public String[] getDisplayFieldNames() {
		return _entryUADDisplayHelper.getDisplayFieldNames();
	}

	@Override
	public String getEditURL(Entry entry,
		LiferayPortletRequest liferayPortletRequest,
		LiferayPortletResponse liferayPortletResponse)
		throws Exception {
		return _entryUADDisplayHelper.getEntryEditURL(entry,
			liferayPortletRequest, liferayPortletResponse);
	}

	public String getKey() {
		return ContactsUADConstants.CLASS_NAME_ENTRY;
	}

	@Override
	public Map<String, Object> getNonanonymizableFieldValues(Entry entry) {
		return _entryUADDisplayHelper.getUADEntityNonanonymizableFieldValues(entry);
	}

	@Override
	public String getTypeName(Locale locale) {
		return "Entry";
	}

	@Reference
	private EntryUADDisplayHelper _entryUADDisplayHelper;
}