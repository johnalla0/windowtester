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
package com.windowtester.runtime.swt.internal.widgets;

import java.util.concurrent.Callable;

import org.eclipse.swt.widgets.ProgressBar;

public class ProgressBarReference extends ControlReference<ProgressBar> {

	public ProgressBarReference(ProgressBar control) {
		super(control);
	}


	/**
	 * Gets the current selection in the progressbar.
	 * 
	 * @return the current selection in the progressbar.
	 */
	public int getSelection() {
		return displayRef.execute(new Callable<Integer>() {
			public Integer call() throws Exception {
				return widget.getSelection();
			}
		});
	}

	/**
	 * Gets the minimum from the progressbar.
	 * 
	 * @return the minimum the progressbar.
	 */
	public int getMinimum() {
		return displayRef.execute(new Callable<Integer>() {
			public Integer call() throws Exception {
				return widget.getMinimum();
			}
		});
	}

	/**
	 * Gets the maximum from the progressbar.
	 * 
	 * @return the maximum the progressbar.
	 */
	public int getMaximum() {
		return displayRef.execute(new Callable<Integer>() {
			public Integer call() throws Exception {
				return widget.getMaximum();
			}
		});
	}

}
