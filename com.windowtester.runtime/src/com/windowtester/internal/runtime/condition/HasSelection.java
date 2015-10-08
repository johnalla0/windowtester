/*******************************************************************************
 *  Copyright (c) 2015 Phillip Jensen
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Phillip Jensen - initial API and implementation
 *******************************************************************************/

package com.windowtester.internal.runtime.condition;

import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.WidgetSearchException;
import com.windowtester.runtime.locator.ILocator;

/**
 * A specialized {@link ILocator} providing a convenience method to extract the selection 
 * from the underlying object. See {@link HasSelectionCondition} for typical usage.
 */
public interface HasSelection {
	/**
	 * Resolve the locator to a single object and answer the selection associated with it.
	 * 
	 * @param ui the UI context in which to find the widgets
	 * @return the selection associated with that object
	 */
	int getSelection(IUIContext ui) throws WidgetSearchException;
}
