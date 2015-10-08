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
package com.windowtester.test.locator.swt;

import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.condition.HasMaximumCondition;
import com.windowtester.runtime.condition.HasMinimumCondition;
import com.windowtester.runtime.swt.condition.HasSelectionCondition;
import com.windowtester.runtime.swt.locator.ProgressBarLocator;
import com.windowtester.test.locator.swt.shells.ProgressBarTestShell;

public class ProgressBarLocatorTest extends AbstractLocatorTest {

	ProgressBarTestShell window;
	
	@Override
	public void uiSetup() {
		window = new ProgressBarTestShell();
		window.open();
	}
	
	@Override
	public void uiTearDown() {
		window.getShell().dispose();
	}
	
	public void testSlider() throws Exception {
		IUIContext ui = getUI();
		ProgressBarLocator progressBarLocator = new ProgressBarLocator();
		ui.assertThat(progressBarLocator.hasMinimum(1));
		ui.assertThat(new HasMinimumCondition(progressBarLocator, 1));
		ui.assertThat(progressBarLocator.hasMaximum(50));
		ui.assertThat(new HasMaximumCondition(progressBarLocator, 50));
		ui.assertThat(progressBarLocator.hasSelection(30));
		ui.assertThat(new HasSelectionCondition(progressBarLocator, 30));
		ui.assertThat(progressBarLocator.isEnabled(true));
		ui.assertThat(progressBarLocator.isVisible(true));

		ui.click(progressBarLocator);
	}
	
}
